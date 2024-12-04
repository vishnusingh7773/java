// RECURSION


import java.util.*;


// PRINT NUMBER FROM 5 TO 1
/*


    public class recursion{

    
   public static void printsum(int n ){
      
      if(n==0){ 
          return ;  }

      System.out.println(n);

      printsum(n-1);  // condition of function call 

    }
 

    public static void main(String[]args){
    

   
    int n=5;

 
    printsum(n);


    }
}

*/










// OUE : PRInT nUMBER FROM 1 TO 5 
/*

    public class recursion{

    
   public static void printsum(int n ){
      
      if(n==6){ 
          return ;  }

      System.out.println(n);

      printsum(n+1);  // condition of function call 

    }
 

    public static void main(String[]args){
    

   
    int n=1;

 
    printsum(n);


    }
}
*/













// OUE.3 PRInT OF SUM NATURAL NUMBER OF n ;
/*
public class recursion{

  public static void printsum(int n , int i , int sum ){
    
    if (i==n){
      sum=sum+i;    // if we are don't use this then i will not count in sum and int the output i will not count 
        System.out.print(sum);
        return ;

    }

    sum=sum+i;
    printsum(n, i+1, sum);
   

   

  }

public static void main (String[]args){
    
    Scanner var =new Scanner(System.in);
    System.out.print("enter the value of n ");
    int n=var.nextInt();

    int i=1;
    int sum=0;


    printsum(n,i,sum);


}
}
*/





// OUE 3.2 PRINT SUM OF N NATURAL NUMBER N (SEOND METHOD );
/*



public class recursion{

  public static void printsum(int n, int sum ){

  if(n==0){
    sum=sum+n;

    System.out.print(sum);
    return ;
    

  }
  
  sum=sum+n;

  printsum(n-1 , sum );

  }

  public static void main(String[]args){

  int n=5 ;
  int  sum=0;

  printsum(n,sum );



  }
}

*/

  











// OUE .4 PRINT FACTORIAL OF NUMBER N 
/*


public class recursion{

  public static void printsum(int n, int fact ){

  if(n==0){
    

    System.out.print(fact);
    return ;
    
  }
  


  fact=fact*n;

  printsum(n-1 , fact );

  }

  

  public static void main(String[]args){

  int n=6;
  int  fact=1;

  printsum(n,fact );



  }
}

*/


 

























//  OUE.5 FIBONACCHI SEQUENCE TILL Nth TERM 
/*

public class recursion{

  public static void fibo(int a, int b, int n ){
  
  if(n==0){
    return;

  }


  int c=a+b;
  System.out.println(c);

  fibo(a,b, n-1);

  }

  public static void main (String[]args){

    int a=0, b=1;

    System.out.println(a);
    System.out.println(b); 

    int n=7;
    
    fibo(a,b,n-2);

   

  }
}

*/
















// OUE.6 PRINT X^N 

/*
public class recursion{

  public static int calpower(int x , int n ){

    if(x==0){
      return 1;

    }


    if(n==0){
      return 1 ;

    }

   int xpoweenm1=calpower(x,n-1);
   int xpown=x*xpoweenm1;

   return xpown ;


  }

  public static  void main(String[]args){

    int x=2;
    int n=4;

    int ans= calpower(x,n);

    System.out.println(ans);

  }
}

*/









// TOWER OF HANOI 

/*
public class recursion{

    public static void Towerofhanoi(int n , String src, String helper , String dest){


      if(n==1){
       System.out.println("trensfer disk"+ n +"form"+ src +"to"+ dest);
       return;

      }

      Towerofhanoi(n-1,src,dest,helper);

      System.out.println("transfer disk"+n+"from"+ src +"to "+ "dest");
      
      Towerofhanoi(n-1,helper,src,dest);

    }

  public static void main(String[]argas){
    int n=2;


    Towerofhanoi(n,"s","h","d");

  }
}

*/







//REVERSE A STRING BY RECURSION 
/*
public class recursion{
   
   public static void printrev(String str, int idx){

    if(idx==0){
      System.out.println(str.charAt(idx));
      return;

    }
     
    System.out.print(str.charAt(idx));
    printrev(str , idx-1);
   }



  public static void main(String[]args){
    String str= "hgnis unhsiv";

    printrev(str , str.length()-1);
    


  }
}
*/






// CHEAK IF AN ARRAY IS SORTED (STRICTL INCREASING )

/*
public class recursion{

  public static boolean inSorted(int arr[],int idx){

    if(idx==arr.length-1){
      return true;

    }
    if(arr[idx] < arr[idx+1]){
      return inSorted(arr, idx+1);

    }

    else {
      return false;

    }
  }

  public static void main(String args[]){
    int arr[]={1,3,5};
    System.out.println(inSorted(arr,0));


  }
}
*/







// Move all 'x' to the end of the string 

/*
public class recursion{

  public static void moveALLX(String str,int idx , int count ,String newString){

    if(idx==str.length()){

      for(int i=0;i<count; i++){
        newString+='x';
        
      }
      System.out.println(newString);
      return;

    }
   
    char currCHAR=str.charAt(idx);
    if(currCHAR=='x'){
      count++;
      moveALLX(str,idx+1,count,newString);
    }

    else{
      newString += currCHAR;
      moveALLX(str,idx+1,count,newString);
    }
  }



  public static void main(String args[]){
    String str="axbcxxd";
    moveALLX(str,0,0,"");


  }
}

*/













// REMOVE DUPLICATE FROM STRING 
