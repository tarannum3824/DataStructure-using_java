//programe to add,delete and dispaly the element in arraylist
import java.util.*;
class Arraylist1{
    public static void main(String [] args){
        ArrayList<String> al =new ArrayList<String>();
        System.out.println("Iitial size of arraylist:" + al.size());
        //adding the elemenst in arraylist
        al.add("A");
        al.add("E");
        al.add("I");
        al.add("O");
        al.add("U");
        al.add("A1");
        al.add("A2");
        al.add("A3");
        System.out.println("Size of arraylist after adding elements:" + al.size());
        System.out.println("arraylist elements:" + al );
        //deleting elements from arraylist
        al.remove(7); //using index number
        al.remove("A1"); //using elements value
        System.out.println("Size of arraylist after removing elements:" + al.size());
        System.out.println("arraylist  elements after removing" + al );
    }
}