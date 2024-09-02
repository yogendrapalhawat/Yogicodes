import java.util.*;
public class sum{
    public static int  maxsubarraysum(int array[]){
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            int cs=0;
            for(int p=i;p<array.length;p++){
                cs+=array[p];
                if(maxsum<cs){
                    maxsum=cs;
                }

            }

            
        
        }
    
    return maxsum;
        

    }

    public static void main(String[] args){
        int array[]={16,-2,-13,4,-5};
        System.out.print(maxsubarraysum(array));
      
    }
    
}