package com.company;
import java.util.*;
public class cwp_ch15_02_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
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

        /* addAll():- Appends all of theelements in the specified collection to the end of this list,
        in the order that they are returned by the specified collection's /iterator.
       */

        l1.addAll(l2);

        /*
       contains(Object o):- Return True if this list contains the specified element
         */

        System.out.println(l1.contains(7));
/*
    indexOf(Object o):- Returns the index of the first occurence of the specified element in this list
    or -1 if the list does not contain the element.
 */
        System.out.println(l1.indexOf(2));
 /*
 lastIndexOf(Object o):- Returns the index of the last occurence of the specified element in this list
    or -1 if the list does not contain the element.
  */
        System.out.println(l1.lastIndexOf(12));

        l1.set(1,123);//

     //   l1.clear(); // Remove all of the elements from the list

        for(int i=0;i<l1.size();i++){
            // get(int index):- Returns the element at the specified position in this list.
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}

