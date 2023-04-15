package Day2_02_26_23;

public class T4_WhileLoop_LinearArray {

    public static void main(String[] args) {
        //crate a linear array of countries
        String[] countries = new String[]{"USA", "Canada", "Bangladesh", "Argentina"};
        //create a liner array of areaCode
        int[] areaCode = new int[]{111, 222, 333, 444};

        //create while loop
        int i = 0;
        while (i < countries.length) {
            System.out.println("Country is " + countries[i] + " area code is " + areaCode[i]);

            i = i + 1;
        }//end of loop
    }//end of main
}//end of class
