

object caesar_Cipher extends App{

 val alphabet = "ABCDEFGHIJKLMNOQRSTUVWXYZ";
//encryption function
      def encrypt():Unit = {
        val shift= (scala.io.StdIn.readLine("Shift : ").toInt + alphabet.size) % alphabet.size
        val plainText =  scala.io.StdIn.readLine("Text : ")

          val text = plainText.map((ch:Char)=>{

      // get the index of the character in the list 
           val character = alphabet.indexOf(ch.toUpper)
           if(character == -1){
                ch
           }else{
               alphabet((character + shift)%alphabet.size)
           }

          });

             printf("\nCipher Text : %s\n", text);
      }

//decryption function
          def decrypt():Unit = {

           val shift= (scala.io.StdIn.readLine("Shift : ").toInt + alphabet.size) % alphabet.size
             val cipherText =  scala.io.StdIn.readLine("Text : ")

            val decrypt = cipherText.map((c:Char) => {
             val cha = alphabet.indexOf(c.toUpper);
               if(cha  == -1){
               c
           }else{
               alphabet((cha  - shift)%alphabet.size)
           }
        });
  
               printf("\nPlain Text : %s\n", decrypt);
          }


          def cipher():Unit= {
             println("\nChoose a function\n 1. Encryption\n2.Decryption\n");

            val num = scala.io.StdIn.readLine("num: ").toInt
           
             

              if (num == 1){
                encrypt();
              }else if(num == 2){
                decrypt();
              }
               
          } 
    
          cipher();
          
 }





