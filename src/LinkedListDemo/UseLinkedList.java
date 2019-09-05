package LinkedListDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseLinkedList {

//
    public static void main(String[] args) {

        List<String> obj1 = new LinkedList <String> ();

        obj1.add(" Rifat");

        obj1.add(" fahim");
        obj1.add(" Rifa");
        obj1.add("Ri");


        System.out.println(obj1);
        obj1.remove(" Rifa");
        System.out.println(obj1.get(2));

//        Iterator it = obj1.iterator();
//
//        while ( it.hasNext()){
//            System.out.println(it.next());
//        }
//
//        System.out.println("**************");
       // obj1.remove(" Rifa");

//        Iterator it2 = obj1.iterator();
//
//        while ( it2.hasNext()){
//
//            System.out.println(it2.next());
//        }

    }






}
