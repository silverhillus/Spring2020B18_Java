package day14_StringClass;

public class practice {

    public static void main(String[] args) {
        String gmail = "cybertekschool@gmail.com";

        String userinputGmail = "CybertekSchool@gmail.com";

       boolean result =  gmail.equalsIgnoreCase( userinputGmail );  // true

        if(result){
            System.out.println("Logged in");
        }


    }


}
