import java.util.Scanner;



/*
public class strings{

    public static void main(String[]args){

     Scanner var=new Scanner(System.in);
        
     System.out.print("what is your name =");
     String name=var.nextLine(); 

        System.out.print("your name is = "+name);



    }
}

*/
























/*

// CONCATENATION : concatenation is the process of joining two or more strings together


public class strings{

    public static void main(String[]args){

    Scanner var=new Scanner(System.in);

    System.out.print("enter yout first name ");
    String firstname=var.nextLine();
    
    System.out.print("enter yout  name ");
    String secondname=var.nextLine();

    String fullname=firstname+secondname;  //concatenation

    System.out.println("your fullname is= "+fullname);
    System.out.println("and the lenght of this string  is= " + fullname.length());  // by this (.length()) function we can find the lenght of String
    

   

   System.out.println("the all element of this string is  ");
    for(int i=0; i<fullname.length(); i++){

        System.out.println(fullname.charAt(i));  // BY THIS (.charAt()) function we are just print all of  string's elements  
                                                 // and here (i) is a indexing of these particuler point 
    }


    }


}


*/































// STRING COMPARTION
// FIND GREATER STRING BETWEEN TWO STRING 

/*

public class strings{

    public static void main(String[]arg){

    Scanner var=new Scanner(System.in);
  
    System.out.print("enter the name1=");
    String name1=var.nextLine();

    System.out.print("enter the name2=");
    String name2=var.nextLine();




    // by the .compareto functio we can compare the two strings size
    // there are three type nof reseult 
    // 1. string1==string2 then this function return 0
    // 2. string 1>stirng2 then this function return a (+) positive number random]
    // 3. string 1<string 2 then this function return (-) nagative number 




        if (name1.compareTo(name2)==0)

        {
            System.out.print("The string are equal");

        }


        else if (name1.compareTo(name2)>0){

            System.out.print("name1 isn greater");

        }


        else{
            
            System.out.print("name 2 is greater");


        }





    }
}
*/

















// SUBSTRING : SOME OR SMALL PART OF A STIRNG THAT WE CAN FIND WITH HELP OF SUBSTRING FUNCTION 

public class strings {

    public static void main(String[] args) {
        String name = "vishnusinghchouhan";
   
        String shortname=name.substring(0,4 );

        //  substring(big index , end index);


        String shorte=name.substring(0, name.length()); 

       System.out.println(shortname);
       System.out.println(shorte);
    
   
   
   
   
   
   
    }
}







   


