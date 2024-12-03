import java.util.*;



// OUR :10 PRINT A BUTTERFLY PATTERN
// *      *
// **    **
// ***  ***
// ********
// ********
// ***  *** 
// **    **
// *      * 


/*

public class advancepattern{

    public static void main(String[]args){
    
   Scanner var=new Scanner(System.in);

   System.out.print("enter the value of n :");

    int n=var.nextInt();

    for(int i=1 ;i<=n; i++){

      for(int j=1;j<=i;j++){
       
    System.out.print("*");

      }

    for(int k=((n-i)*2); 0<k ;k--){
     
    System.out.print(" ");
    
    }

    for(int l=1;l<=i;l++){

        System.out.print("*");
    }
     
     System.out.println();




       }



     
    for (int i=n ; 0<i;i--){
   
     for(int j=1;j<=i; j++){

        System.out.print("*");
     }
     
     for (int k=(n-i)*2 ; 0<k; k--){
        System.out.print(" ");

     }

     for(int l=1; l<=i; l++){

        System.out.print("*");
     }

    System.out.println();


    }

    }
}
*/





// OUE.11 PRINT A PATTERN 
//     *****
//    *****
//   *****
//  *****

/*
public class advancepattern{

    public static void main(String[]args){
     

     Scanner var=new Scanner(System.in);
     
     System.out.print("enter the value of n :");
        int n=var.nextInt();

        for (int i=1; i<=n; i++){

            for (int j=(n-i); 0<=j; j--){

                System.out.print(" ");
            }


            for (int l=1;l<=n; l++){

                System.out.print("*");
            }
             System.out.println();

        }
         
    }
}

*/









// OUE ;12 PRIN A NUMBER PYAMID

//     1
//    2 2
//   3 3 3 
//  4 4 4 4

/*
public class advancepattern{

    public static void main(String[]args){
  
    System.out.print("enter the value of n (rows)=");

    Scanner var=new Scanner(System.in);

    int n=var.nextInt();

   for(int i=1;i<=n;i++){
    
    for(int j=(n-i);0<j ; j--){


        System.out.print(" ");
    }

     for(int j=1;j<=i;j++){

        System.out.print(i);
        System.out.print(" ");
     }
     System.out.println();

   }


    }
}

*/










// OUE.13  PRINT A PALONDROMIC PATTERN
//      1
//    2 1 2
//  3 2 1 2 3
//4 3 2 1 2 3 4   

/*
public class advancepattern{

    public static void main(String[]args){
    
    System.out.print("enter the value of n= ");

    Scanner var=new Scanner(System.in);

    int n=var.nextInt();
    

        for(int i=1;i<=n;i++){    
  
          for(int j=(n-i);0<=j;j--){

            System.out.print(" ");
          }    

          for(int k=i;0<k;k--){

            System.out.print(k);
           
          }
           for (int l=2; l<=i;l++){

            System.out.print(l);


           }
         

         

          System.out.println();









        }

    }
}

*/















// OUE.14  PRINT A PATTERN

//     *
//    ***
//   *****
//   *****
//    ***
//     *


 public class advancepattern{

    public static void main(String[]args){
     

     Scanner var=new Scanner(System.in);

     System.out.println("enter the value of n = ");

     int n=var.nextInt();

     

    

        for(int i=1;i<=n;i++){
      
      for(int j=1;j<=(n-i);j++){
      
      System.out.print(" ");

      }
      
      for(int k=1;k<=i+(i-1);k++){

        System.out.print("*");
      } 

      System.out.println();

        }


        
        for(int i=n;1<=i;i--){
      
      for(int j=1;j<=(n-i);j++){
      
      System.out.print(" ");

      }
      
      for(int k=1;k<=i+(i-1);k++){

        System.out.print("*");
      } 

      System.out.println();

        }
    }

    }
