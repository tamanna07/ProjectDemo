package ClasssObject;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UsedLinkedLIST {
    public static void main(String[] args) {

        List<String> list = new LinkedList<String>();

        list.add("NY");
        list.add("NJ");
        list.add("NH");
        list.add("NC");
        list.add("FL");

        Iterator it = list.iterator();

        while ( it.hasNext()){

            System.out.println(it.hasNext());
        }

        list.remove("NJ");
        System.out.println("after removing one node");
        Iterator it2 = list.iterator();
         while(it2.hasNext())
         {

         }



    }







}
