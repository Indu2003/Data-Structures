import java.util.*;
public class binarysearch {
    public static void main(String[] args){
        int ar[] = {5,4,1,2,3};
        int key=2;
        int head=0;
        int tail=ar.length-1;
        int mid=head+tail/2;
        if(key==mid){
                System.out.println("the required value found at the mid value");
         }
         else if(mid>key){
            head=mid+1;
            tail=ar.length-1;
         }
         else{
            head=0;
            tail=mid-1;
         }
            

    }
}
    

