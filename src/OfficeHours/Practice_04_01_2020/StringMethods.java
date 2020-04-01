package OfficeHours.Practice_04_01_2020;

public class StringMethods {

    public static void main(String[] args) {

        // charAt(indexNumber):returns the char at then given index, char primitive

        //             12345
        String str1 = "Java ";
            //index:   01234

        char ch1 =  str1.charAt(3);

        System.out.println(ch1);

        char ch2 = str1.charAt(4);

        System.out.println(ch2);

        System.out.println("=============================================");
        //length(): returns the total number of chars, int

        String str2 = "Cybertek School";

        int total =  str2.length();

        System.out.println(total);

        int maxIndex = str2.length()-1; // last index number

        char ch3 = str2.charAt( maxIndex );
        System.out.println(ch3);

        System.out.println("=============================================");

        //concat(str): concatenation, returns new String ,  + also does concatenation
        String str3 = "Cybertek";
               str3 = str3.concat(" School"); // "Cybertek School"

        System.out.println(str3);

        String str4 = "Java";
                str4 =    str4.concat(" is fun");  // "Java is fun"

        System.out.println(str4);

        System.out.println("=============================================");

        //toLowerCase() & toUpperCase(): change the case of the strings to upper or lower  cases

       String str5 = "";






    }


}
