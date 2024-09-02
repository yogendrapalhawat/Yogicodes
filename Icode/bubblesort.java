public class bubblesort {
    public static void bubble(int a[]){
        for(int t=0;t<a.length;t++){
        for(int i=0;i<a.length-1-t;i++){
            if(a[i]>a[i+1]){
            int temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
            }}

        }
    }
    public static void main(String args[]){
        int a[]={5,4,3,2,1};
        bubble(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
       
  
}
    
}
