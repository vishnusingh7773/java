import java.util.ArrayList;
import java.util.Collections;


public class Arraylists{

    public static void main(String[]args){
    
    ArrayList<Integer> list=new ArrayList<>();


    // ADD ELEMENT
    list.add(0);
    list.add(1);
    list.add(4);
    list.add(3);
    list.add(9);


    System.out.println("add element in list "+list);



    // GET ELEMENT 
    System.out.println("get element from list "+list.get(0));

 

    // ADD ELEMENT IN BETWEEN 
    list.add(0,3);
    System.out.println("add element between list "+list);




    // SET ELEMENT 
    list.set(0,5);
    System.out.println("set element in list "+list);





    // DELETE ELEMENT 
    list.remove(0);
    System.out.println("delete element from list "+list);




    //  KNOWN SIZE OF ARRAYLIST
    System.out.println(list.size());
     


   // SORTING
     Collections.sort(list);
    System.out.println(list);
    



    }
}


