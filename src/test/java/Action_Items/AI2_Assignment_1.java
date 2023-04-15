package Action_Items;

public class AI2_Assignment_1 {
    public static void main(String[] args) {

        /*
        -using else if conditional statements create a integer variable with grade as the name with a some value.
        -using that some variable I want to change the variable each time with the following conditions (90 to 100)
        -integer should be labeled as grade
        -print grade as A
        -when grade range is from 90 to 100 print grade a
        -when grade range is from 80 to less than 90 print grade as b
        -when grade range is from 70 to less than 80 print grade as c.
        -when grade range is from 60 to 70 print grade as grade d
        -Anything below 60 is an f
         */
        int grade =75;

        if (grade >= 90 && grade <= 100) {
            System.out.println("Grade A");
        } else if (grade >= 80 && grade <= 90) {
            System.out.println("Grade B");
        } else if (grade >= 70 && grade <= 80) {
            System.out.println("Grade C");
        }  else if (grade >= 60 && grade <= 70) {
            System.out.println("Grade D");
        } else  {
            System.out.println("Grade F");
    } //end of multiple conditional
    }//end of main
}//end of class
