package com.company;
import java.util.*;


public class cwp_ch15_03_linkedlist {
        public static void main(String[] args) {
            LinkedList<Integer> l1 = new LinkedList<>();
            LinkedList<Integer> l2 = new LinkedList<>();
            l2.add(12);
            l2.add(15);
            l2.add(13);

            l1.add(2);
            l1.add(8);
            l1.add(5);
            l1.add(4);
            l1.add(3);
            l1.add(0,3);
            l1.add(0,7);

            l1.addAll(l2);

            l1.addLast(676);
            l1.addFirst(727);  // linkedlist method.



            System.out.println(l1.contains(7));

            System.out.println(l1.indexOf(2));

            System.out.println(l1.lastIndexOf(12));

            l1.set(1,123);//

            //   l1.clear(); // Remove all of the elements from the list

            for(int i=0;i<l1.size();i++){
                System.out.print(l1.get(i));
                System.out.print(", ");
            }
        }
    }


