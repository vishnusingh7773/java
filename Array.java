import java.util.*;


/*
public class Array {
    public static void main(String[]args){


        int[] marks =new int[3];    //dirst way to defining array 
        
        marks[0]= 97;
        marks[1]= 99;
        marks[2]= 90;



        // int[] array={97,99,90};     //second option for definig array  
      
        

        for(int i=0;0<3; i++){
            System.out.println(marks[i]);

        }
    }
}

*/














// 2. THE SIZE OF ARRAY IS INPUT BY USER
/*
public class Array {
    public static void main(String[]args){
    
     System.out.println("enter the  size of array"); 
     Scanner var= new Scanner(System.in);
    int size=var.nextInt();


     int[] marks =new int[size]; //ARRAY DECLARTION   

    
     System.out.println("enter the value of array's element");

     for(int i=0; i<size;i++){    //LOOP USE FOR INPUT 

        marks[i]=var.nextInt();
     }
    

     for(int j=0;0<size; j++)      // FOR OUTPUT LOOP  
         {       
            
            System.out.println(marks[j]);

         }

 

    }
}

*/













// OUE. TAKE A ARRAY AS INPUT FROM THE USER .SEARCH FOR GIVEN NUMBER X AND PRINT THE INDEX AT IT OCCUR
//  WE CAN CHEAK LENGTH OF ARRAY BY ( ARRAYNAME. )

public class Array{

    public static void main(String[]args){
        Scanner var =new Scanner(System.in);

        
        System.out.print("enter the size of array ");
         int size=var.nextInt();
         

        int[] search=new int[size];

        for(int i=0;i<size;i++){
         
         search[i]=var.nextInt();
            
        }  

        System.out.print("enter the value of x: ");
        int x= var.nextInt();



        for(int j=0; 0<search.length ;j++){     //we can cheak lenght of array by this method (arrayname.length )
            
        if(x==search[j]){

         System.out.println("x found at index at :" + j);

        }


        }


    }
}









//  FIND DUPLICATE NUMBER INT ARRAY 

/* 
import java.util.*;


public class excise{

    public static void main(String[]args){

        int[] arr= {1,2,3,3,4,4,7}; //ARRAY DECLARATION

          int oth=0;
          for(int i=0 ; i<arr.length; i++){
          
           for(int j=i+1; j<arr.length; j++){

               if(arr[i]==arr[j]){

                System.out.print(arr[i]);
                oth++;
               }
             
        }


    }

    if(oth==0){
        System.out.print("-1");
    }


}


}             
  */             
