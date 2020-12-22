package com.company;
import java.util.*;


//public class Main {
//
//    public static void main(String[] args) {
//	// write your code here
//    }
//
//}
public class Main {
    public static void main(String[] args) {
        ArrayList mix = new ArrayList();
        mix.add(0,"Hari");
        mix.add(1, 2);
        mix.add(1, 5);
        printMixList(mix);
    }

    public static void printMixList(ArrayList elements) {
        for (Object o : elements) {
            System.out.println(o);
        }
    }
}
