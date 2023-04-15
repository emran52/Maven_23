package Day2_02_26_23;

import java.util.ArrayList;

public class T2_ArrayList {

    public static void main(String[] args) {

        //create an ArrayList of countries
        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("India");
        countries.add("Bangladesh");
        countries.add("Pakistan");

        //get the count of the list
        System.out.println("Countries list: " + countries.size());
        //Print only USA India Bangladesh
        System.out.println("Countries are " + countries.get(0) + ", " + countries.get(1) + ", " + countries.get(2));

        countries.add("Russia");
        //get the count of the list
        System.out.println("New Countries list: " + countries.size());
        System.out.println("New added country: " + countries.get(4));

        //create an Integer arrayList of area code
        ArrayList <Integer> areaCode = new ArrayList<>();
        areaCode.add(777);
        areaCode.add(222);
        areaCode.add(333);
        //get the count of the list
        System.out.println("Area code list: " + areaCode.size());


    }//end of main
}//end of class
