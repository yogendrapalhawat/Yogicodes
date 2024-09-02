import java.util.*;
public class sortedarray{
    public static Boolean (int a[]){
        int c=0;
        int b=a[0];
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(a[i]>a[j+1]){
                    c++;
                }
            }

        }
        if(c>0){
            return true;
        }
        return false;
        
    }
   
    public static void main(String [] args){
        int a[]={3,5,8,7,1,2,9,9};
        
        
    
        
    }
}