package day14_StringClass;

public class StringManipulations {

    public static void main(String[] args) {

        String str = "I Like to J learn Java. I Like to watch bthe movie Jumanji";

        int a1 = str.indexOf("J");  // returns the index num of first matching one'

        System.out.println(a1);

        int a2     =  str.indexOf("Jum");
        System.out.println(a2);

        int a3 = str.indexOf(" I") + 1  ; // second I' index number
        System.out.println(a3);

        String s = "I like Java, and I like reading";

        int b1 =   s.lastIndexOf("I");
        System.out.println(b1);

        int b2= s.lastIndexOf("l");
        System.out.println(b2);








    }

}
