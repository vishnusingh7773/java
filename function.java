//FUNCTION : BASICALY A FUNCTION IS A BOLCK OF CODE THAT PERFORM A SPECIFIC TASK 
import java.util.*;



// PRINT NAME BY USING FUNCTION 
/*
public class function {

public static void PrintName(String name ){

    System.out.print(name);
    return ;
}


    public static void main(String[]args){
    System.out.print("enter your name =");
    Scanner var=new Scanner(System.in);

    String name =var.nextLine();
      
      PrintName(name);



    }
}
*/











//  ADD TWO NUMBER AND RETURN SUM OF THAT NUMBERS BY USING FUNCTION
/*
public class function{
   
   public static int  calculateSum(int n,int m){
    int add=n+m;
    return add ;

   }


    public static void main(String[]args){
     
     Scanner var= new Scanner(System.in);

     int n=var.nextInt();
     int m=var.nextInt();

    int sum=calculateSum(n,m);

    System.out.print(sum);
   
    }

}

*/












// MULTIPLY  OF  TWO NUMBER AND RETURN THE PRODUCT 

/*
public class function{

   public static int MULTI(int n,int m){

    
    return  n*m;

   }


  public static void main(String[]args){
    
    Scanner var=new Scanner(System.in);
    System.out.print("enter first number=");
    int n=var.nextInt();

    System.out.print("enter second number=");
    int m=var.nextInt();
    
    int pr=MULTI(n, m);
    System.out.print("product is= "+ pr);

  }
}
*/





 


//  PRINT FACTORAIL BY USING FUNCTION

public class function{


 public static void factorial(int n){
   
   if (n<0){

    System.out.print("negative number ");
    //  return ; we can use  return here  for exit of this function then no need for else 
   }

     else
        {
         int fact=1;
        for (int i=n;0<i;i--){

            fact =fact*i;
        }
     
     System.out.print(fact);
     
  
    }
 }


  public static void main(String[]args){
   
   Scanner var=new Scanner(System.in);
   System.out.print("enter the value of n");

   int n=var.nextInt();

   factorial(n);

  }
}