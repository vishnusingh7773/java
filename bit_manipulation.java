import java.util.*;

// 1. GET BIT
/*

import java.util.*;

public class bit_manipulation{

    public static void main(String[]args){

    int n=5;
    int pos=2;
    int Bitmask = 1<<pos;
    

     if((Bitmask & n)== 0){

        System.out.print("number is zero");
     }
        
     else{

        System.out.print("number is one ");

     }   


    }
}

*/











// 2.   SET BIT

/*
public class bit_manipulation{

   public static void main(String args[]){
       int n=5;
       int pos=1;
       int bitMask=1<<pos;

       int newNumber = bitMask | n;
       System.out.print(newNumber);


   }
}
*/








// CLEAR BIT ]

public class bit_manipulation{

   public static void main(String args[]){

   Scanner var=new Scanner(System.in);
   int oper=var.nextInt();

       int n=5;
       int pos=1;

       int bitMask=1<<pos;
       
       if(oper ==1){
         
         int newNumber =bitMask | n;
         System.out.print(newNumber);
       }

       else{

         int newBitmask = ~(bitMask);
         int newNumber = newBitmask & n;

         System.out.print(newNumber);
       }



   }
}
