//code for finding greatest number in the array
//only array supports character values-it converts internally using ascii values

import java.util.*;

public class arrayex2 {
    public static void main(String[] args){
        int ar[] = {1, 2, 3, 4, 5,-1,'h'};
        int max_no=ar[0];
        for (int i = 1; i < ar.length; i++) {
            if(ar[i]>max_no){
                max_no=ar[i];
            }
         }
         System.out.println("The greatest number in the array is: " + max_no);
        }
    }



