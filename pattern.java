import java.util.*;

// OUE.1 PRINT A PATTERN WITH HELP OF FOR LOOP 

// ***
// ***
// ***

/*
public class pattern{

    public static void main(String[]args){


   Scanner var=new Scanner(System.in);
  
   System.out.print("enter the value of n");//here the n is equal to no. of line 

   int n= var.nextInt() ;

   for(int i=1; i<=n ;i++){
    for (int j=1; j<=n; j++){



    System.out.print("*");

    System.out.print(" "); // (optional) use for space in between the *  (icon)

    }
    System.out.println();

   }


   }
}

*/










// 2.OUE. PRINT HALF PYRAMID WITH HELP OF FOR LOOP

// *
// **
// *** 
// ****

/*
public class pattern{

    public static void main(String[]args){
   
   Scanner var=new Scanner(System.in);
  

   System.out.print("enter the value of n (n= no.of raw &coloum)=");
   
    int n = var.nextInt();

    for(int i=1; i<=n; i++){

        for (int j=1;j<=i;j++){

            System.out.print("*");
            System.out.print(" "); // use for space between icons 
            

        }
        System.out.println();
    }      

   

    }
}
*/









// QUE.3 : PRINT A REVERSE PERAMID PATTERN WITH HELP OF FOR LOOP

// ****
// ***
// **
// *
/*
public class pattern{

    public static  void main(String[]args){

   int n=4;

   for (int i=n; 1<=n ; n--){

    for(int j=1; j<=n;j++){

        System.out.print("*");
    }

    System.out.println();
    
   }



    }
}


*/












// OUE.4 PRINT A PATTERN PERAMID 180 DEGREE ROTATE
//     *
//    **
//   ***
//  ****

/*
public class pattern{
    public static void main(String[]args){
    
Scanner var=new Scanner(System.in);


System.out.print("enter the value of n");

  int n=var.nextInt();

  for(int i=1; i<=n;i++){

    for(int j=1 ;j<=n-i;j++){

        System.out.print(" ");
       }
    

    for(int k=1; k<=i;k++){
        System.out.print("*");
    }

   
   System.out.println();
   }
   


}

}

*/









// OUE.5 PRINT A HOLE RECTANGULAR PATTERN WITH HELP OF FOR LOOP 
// * * * * 
// *     *
// *     *
// * * * * 

/*


public class pattern{
    public static void main(String[]args){
   
    System.out.println("entet the value of n (raws)");
    Scanner var=new Scanner(System.in);

    int n= var.nextInt();

    System.out.println("entet the value of n (coloum)");
    int m= var.nextInt();

    for(int i=1;i<=n;i++)
    {
        for(int j=1; j<=m;j++){

            if(i==1 || j==1 || i==n || j==m){

                


 
                System.out.print("*");
            }

            else
            System.out.print(" ");

            
        }

        System.out.println();
    }
   
  
    }
}
 */








// OUE.6 PRINT A PATTERN 
// 1
// 12
// 123
// 1234


/*
public class pattern{

      public static void main(String[]args){
  

  System.out.print("enter the value of n ");

  Scanner var=new Scanner(System.in);
    int n= var.nextInt();

    for (int i=1; i<=n;i++){

        for(int j=1; j<=i ;j++){

            System.out.print(j);
        }
        System.out.println();
    }
 
    }
}
*/







// OUE.7 PRINT A PATTERN
// 123
// 12
// 1

/*
public class pattern{

    public static void main( String[]args){

    Scanner var=new Scanner(System.in);

        System.out.print("enter the value of n");
    
        int n=var.nextInt();

        for (int i=n; 1<=i;i--){
         
         for (int j=1; j<=i; j++ ){

            System.out.print(j);
         }
         System.out.println();
   

        }
    }
}

*/









// OUR.8 PRINT A PATTERN
// 1
// 2 3
// 4 5 6 
// 7 8 9 10 



/*
public class pattern{

    public static void main(String[]args){

     Scanner var=new Scanner(System.in);

     System.out.print("enter the value of n "); 2

     int n=var.nextInt();


     System.out.print("enter a number for print count from there ");
     int m=var.nextInt();

        


      for (int i=1;i<=n;i++){
        
        for(int j=1; j<=i ;j++){

            System.out.print(m +" ");
            m++;
        }
        System.out.println();
      }

    }
}
*/ 









// OUE .9 PRINT A PATTERN 
// 1
// 0 1
// 0 1 0
// 1 0 1 0


/*
public class pattern{

    public static void main(String[]args){
      
      Scanner var=new Scanner(System.in);

      System.out.print("entet the value of n=");
       int n=var.nextInt();


        for (int i=1 ; i<=5 ; i++){

            for (int j=1;j<=i;j++){

                if ((i+j)%2==0)

                 System.out.print(1+" ");
                     
   

                else
                System.out.print(0+" ");
            }

            System.out.println();
        }
    }
}

*/