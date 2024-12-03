import java.util.*;


/*
    
public class stringbuilders{


      public static void main(String[]args){

      StringBuilder var=new StringBuilder("vishnu singh "); //declaration of stringbuilder
      System.out.println(var);



    // 1. SET CHAR AT INDEX 
    // WITH HELP OF setChsrAt(index,'char') WE CAN REPLACING OF ANY CHARCTER ON A PARTICULER INDEX
      var.setCharAt(0,'n');
      System.out.println(var);








    
    //2. INSERT CHARCTER IN A STRING 
    // WITH HELP OF insert(INDEX, 'CHAR') WE CAN INSERT A CHAR AT A PATICULER INDEX AFTER THAT THE THOSE CHARTACTER ARE PRESENT ALREADY THERE THAT ALL SWIFT AGAIN INDEDX

    var.insert(0,'s');
    System.out.println(var);


     


    // 3. APPEND IN A STRING 
    //  WITH HELP OF append("char") FUNCTION WE CAN ADD A CHARCTER AT THE LAST END OF STRING 

     var.append("chouhan");
     System.out.println(var);







    // 4. DELETING CHARCTER IN STRING
    // WITH HELP OF delete(stert index,end index) THIS FUNCTION WE ARE DELETE CHARCTER FROM A STRING 

    var.delete(2,5);
    System.out.println(var);

    



     
      }
  
  } 

*/












//   REVERSE  A STRING BY REAL WAY 
/*

public class stringbuilders{

    public static void main(String[]args){

    Scanner vars=new Scanner(System.in);
    System.out.print("enter a string ");

    String input =vars.nextLine();

    StringBuilder var = new StringBuilder(input);
    

    System.out.println("your string is= "+var);

    for(int i=0;i<var.length()/2;i++){

        int font =i;
        int back= var.length()-1-i;


        char frontchar=var.charAt(font);
        char backchar=var.charAt(back);

        var.setCharAt(font,backchar);
        var.setCharAt(back,frontchar);

    }

    System.out.print("the reverse of string is ="+var);



    }
}

*/








// REVERSE A STRING BY EASY WAY 


public class stringbuilders{

    public static void main(String[]args){


   System.out.print("enter a string  ");
   Scanner var=new Scanner(System.in);
   String input =var.nextLine();


 
    StringBuilder name=new StringBuilder(input);

    
    System.out.println("your string is = "+name);


    System.out.print("the reverse of string is = ");
    for(int i=name.length()-1 ; 0<=i; i--){
      
      
       System.out.print(name.charAt(i));

          }

    

    }
}



 




