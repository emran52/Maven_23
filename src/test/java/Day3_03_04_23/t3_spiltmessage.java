package Day3_03_04_23;

public class t3_spiltmessage {

    public static void main(String[] args) {

        //declare a single string variable
        String Message = "My name is john";
        //print out only john from the above string
        String[] arrayMessage = Message.split(" ");
        System.out.println("Result: " + arrayMessage[3]);
    }//end of main
} // end of class
