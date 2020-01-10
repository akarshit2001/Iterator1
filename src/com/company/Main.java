package com.company;
import  java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        Iterator itr = list.iterator();

        //System.out.println(itr.hasNext());
        //System.out.println(itr.next());
        while (itr.hasNext()) {
            int i = (int) itr.next();
            //System.out.println(itr.remove());
            if (i %2 ==0) {
                itr.remove();
            }

        }
        System.out.println(list);
        itr.remove();
        System.out.println(list);
    }

}