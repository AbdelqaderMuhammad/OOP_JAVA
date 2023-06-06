package data_structure;


/*
    - fixed size
    - mutable
*/

import java.util.Arrays;

public class _arrays {
    public static void main(String[] args) {
//        String str_arr[] = new String [3];
//        String [] str_arr = {"Ali", "Mariam"};
        String [] str_arr = new String [3];

        str_arr[0] = "Ahmed";
        str_arr[1] = "Abdelqader";
        str_arr[2] = "Muhammad";
        for (String ex :
                str_arr) {
            System.out.println(ex);
        }
        System.out.println(Arrays.toString(str_arr));
        str_arr[12] = "Any";

    }
}
