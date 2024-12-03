import java.util.*;

//1.  BUBBLE SHORTING 
//  OUESTION . SORTING IN ASSENDING ORDER 
/*

public class sorting{

    public static  void printarray(int arr[]){  //here is make a function that will print a element after shorting 

    
    for(int i=0; i<arr.length;i++){
        System.out.print(arr[i]+" ");

    }

    }



    public static void main(String[]args){
    Scanner var=new Scanner(System.in);
        System.out.print("enter the size of an array ");
        int size=var.nextInt();



        int[] arr=new int[size];

        for(int i=0; i<size ;i++){

            arr[i]=var.nextInt();


        }

 


        for (int i=0;i<arr.length-1; i++){  // here is used arr.length-1 because the last element of array will automatically sort 

            for(int j=0;j<arr.length-i-1 ;j++){

               if(arr[j]>arr[j+1]){
                int temp =arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;

               }
            }


        }

       printarray(arr);        //funtion call



          

      
    }
}

*/















// 2. SALECTION SORT 
/*

public class sorting{

    public static  void printarray(int arr[]){
    
    for(int i=0; i<arr.length;i++){
        System.out.print(arr[i]+" ");

    }

    }



    public static void main(String[]args){
    Scanner var=new Scanner(System.in);
        System.out.print("enter the size of an array ");
        int size=var.nextInt();



        int[] arr=new int[size];

        System.out.print("enter the element of array");

        for(int i=0; i<size ;i++){   //loop for insert the element value in array

            arr[i]=var.nextInt();


        }

 


        for (int i=0; i<arr.length-1;i++){

            int smallest =i;
             
             for(int j=i+1 ; j<arr.length; j++){

                if (arr[smallest]>arr[j]){
                    smallest=j;
                }
             }

             int temp=arr[smallest];
             arr[smallest]=arr[i];
             arr[i]=temp;





        }

       printarray(arr);


          

      
    }
}
*/















// 3. INSERTION SORT 


class sorting {
   public static void printArray(int arr[]) {
       for(int i=0; i<arr.length; i++) {
           System.out.print(arr[i]+" ");
       }
       System.out.println();
   }


   public static void main(String args[]) {

    Scanner var=new Scanner(System.in);
    int[] arr= new int[5];
    //    int arr[] = {7, 8, 1, 3, 2};

    for(int i=0; i<arr.length; i++){

        arr[i]=var.nextInt();


    }


       //insertion sort
       for(int i=1; i<arr.length; i++) {
           int current = arr[i];
           int j = i - 1;
               while(j >= 0 && arr[j] > current) {
                   //Keep swapping
                   arr[j+1] = arr[j];
                   j--;
               }
           arr[j+1] = current;
       }
       printArray(arr);
   }
}









































