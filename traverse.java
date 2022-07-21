package learningCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class traverse {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("umesh");
        names.add("ekta");
        names.add("vandana");
        names.add("pooja");
        names.add("vandana");
        //System.out.println(names);

        // for each loop

        for(String str:names) {
            System.out.print(str + "\t" + str.length() + "\t");
            StringBuffer br = new StringBuffer(str);
            System.out.println(br.reverse());
        }

            System.out.println("..................................................................");

            //traversing using iterator

            Iterator<String> itr = names.iterator();

            while (itr.hasNext())
            {
                String next = itr.next();
                System.out.println(next);


            }
            System.out.println("------------------------------------------------------------");
            // backward traversal : listiterator

            ListIterator<String> lit = names.listIterator(names.size());
            while (lit.hasPrevious())
            {
                String previous = lit.previous();
                System.out.println(previous);
            }

        // for each method

        System.out.println("------------------------------------------------------------");

         names.forEach(e->{
             System.out.println(e);
         });

         // treeset sorting traversal
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        TreeSet <String>trrr = new TreeSet<>();
        trrr.addAll(names);
        trrr.forEach(e->{
            System.out.println(e);
        });


        }
    }

