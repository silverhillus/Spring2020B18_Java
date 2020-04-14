package day22_Arrays_Loops;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

     for(int i = arr.length -1 ; i >= 0; i--  ){
           int eachNum = arr[i];
         System.out.println(eachNum);
     }

        System.out.println("===================================");
            //[5, 4, 3, 2, 1]


    }

}
