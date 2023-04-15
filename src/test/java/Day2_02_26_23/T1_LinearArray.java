package Day2_02_26_23;

public class T1_LinearArray {

    public static void main(String[] args) {

        //create a list of cities in linear array
        //array count starts from 0 index
        String[] cities = new String[]{"Brooklyn","Queens","Manhattan","Bronx","Staten Island"};
        //get the count of the list of cities
        System.out.println("Cities count "+ cities.length);
        //Print out Brooklyn & Bronx from the list
        System.out.println("My cities are " + cities[0] + ", " + cities[3]);

//create a list of zipcode
        int[] zipCode = new int[]{11218,22222,33333,55555};
        //get the count of the list of zipcode
        System.out.println("Zipcode count " + zipCode.length);
        //print out 11218 & 33333 from the list
        System.out.println("My zipcodes are " + zipCode[0] + ", " + zipCode[2]);


    }//end of main
}//end of class
