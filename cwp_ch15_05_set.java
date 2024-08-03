package com.company;
import java.util.*;
public class cwp_ch15_05_set {
    public static void main(String[] args){
        HashSet<Integer> hs = new HashSet<>(6,0.5f);
        hs.add(6);
        hs.add(8);
        hs.add(13);
        hs.add(11);
        hs.add(11);//This element will be ignored

        System.out.println(hs);
        System.out.println("myHAshSet before removing any element: " + hs);

//        Removing element from the HsashSet

/*       hs.remove(13);
        System.out.println("myHAshSet after removing a element: " + hs);
*/

// Checking if the HashSetis empty or not
        /*
        System.out.println(hs.isEmpty());
        HashSet<Integer> hs1 = new HashSet<>();
        System.out.println(hs1.isEmpty());
        */
  //    Removing all Elements from HashSet
        /*
  hs.clear();
        System.out.println("myHashSet after " + hs);

         */

        // Printing the size of the HashSet:
        System.out.println("The size of myHashSet is:- " + hs.size());
    }
}
