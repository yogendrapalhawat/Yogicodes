import java.util.*;

public class darray {
    public static void main(String[] args) {
        int a[] = {3, 5, 8, 7, 9};
        int b[] = new int[5];
        
        // Copy elements from array 'a' to array 'b'
        System.arraycopy(a, 0, b, 0, a.length);
        
        // Print the copied array
        for (int ele : b) {
            System.out.println(ele);
        }
    }
}
