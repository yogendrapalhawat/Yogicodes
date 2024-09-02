import java.util.*;
public class yogii{
    public static int secmax(int a[]){
        int mx=a[0];
        int smx=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>mx){
                smx=mx;
                mx=a[i];
            }
            else if(a[i]>smx && a[i]!=mx){
                smx=a[i];
            }
        }
        return smx;
    }
   
    public static void main(String [] args){
        int a[]={3,5,8,7,1,2,9,9};
        
        System.out.print(secmax(a));
        
    }
}