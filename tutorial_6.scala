object caesar_Cipher extends App {

    

         val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

      //read the number of shifts enter by the user
       val caesarShift= (scala.io.StdIn.readLine("Shift : ").toInt + alphabet.size) % alphabet.size
       //read the plain text
       val plainText =  scala.io.StdIn.readLine("Text : ")
       
       //map function used to map the letter into  ciphered letter
        val text = plainText.map((ch:Char)=>{

      // get the index of the character in the list 
           val character = alphabet.indexOf(ch.toUpper)
           if(character == -1){
            ch
           }else{
               alphabet((character +caesarShift)%alphabet.size)
           }



        });

//decryption 
/* map each character to  check if it is in the alphabet decrease 
the key value to get the original  text */

        val decrypt =  text.map((c:Char) => {
             val cha = alphabet.indexOf(c);
               if(cha  == -1){
               c
           }else{
               alphabet((cha  - caesarShift)%alphabet.size)
           }
        });
     
         printf("\nCipher Text : %s\n", text);
         printf("\nCipher Text : %s\n", decrypt);

    }
