package learningCollection;

import java.util.*;

public class Start {
    public static void main(String args[])
    {
        System.out.println("hii welcome to collection framework");

        /*creating collection
        1) type safe : same ype of elements
        2) un type safe : different types of elements can be added

         */

        ArrayList<String> names = new ArrayList<>();
        names.add("umesh");
        names.add("ekta");
        names.add("vandana");
        names.add("pooja");
        names.add("vandana");
        System.out.println(names);

        names.remove(0);
        System.out.println(names);
        System.out.println("size of array is = "+ names.size());
        System.out.println(names.contains("ekta"));
        System.out.println(names.isEmpty());

        Stack marks = new Stack();
        marks.push("umesh");
        marks.push("placed");
        marks.push("poja");
        System.out.println(marks);
        marks.pop();
        System.out.println(marks);


        names.set(2,"Rahul");
        names.add(2,"Mohan");
        System.out.println(names);



//        System.out.println(names.get(0));
        // System.out.println(names.get(1));


/*
        LinkedList list = new LinkedList();
        list.add("sachin");
        list.add(100);
        list.add(101.1);
        list.add(true);


        System.out.println(list);*/

        Vector<String> vector = new Vector<>();
        vector.addAll(names);
        System.out.println(vector);

        System.out.println("..................................................................");

        HashSet<Double> nms = new HashSet<>();
        nms.add(14.23);
        nms.add(12.34);
        nms.add(234.45);
        nms.add(236.45);
        System.out.println(nms);


        TreeSet<Double> trr = new TreeSet<>();
        trr.addAll(nms);
        System.out.println(trr);


    }

}
