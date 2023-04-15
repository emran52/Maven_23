package Day3_03_04_23;

import java.util.ArrayList;

public class t3_whileloop_conditional {
    public static void main(String[] args) {
        /*
        iterate through list of fruit using Arraylist
        but only print when fruit is grape pr apple.
         */

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("strawberry");
        fruits.add("grape");

        for (int i = 0; i < fruits.size(); i++) {
            /*
            if(fruits.get(i) == "Apple") {
                System.out.println("Fruit: Apple");
            } else if(fruits.get(i) == "Grape") {
                System.out.println("Fruit: Grape");
            }//end of conditions
            */

            //using the OR operator
            if (fruits.get(i) == "Apple" || fruits.get(i) == "Grape") {
                System.out.println("Fruit:" + fruits.get(i));
            }//end of conditions
        } //end of loop

    } // end of main
}//end of class
