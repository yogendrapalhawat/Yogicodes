public class selectionsoer {
    public static void selectionsort(int a[]){
        for(int i=0;i<a.length;i++){
            int minpos=i;
            for(int j=i+1;j<a.length;j++){
                if(a[minpos]>a[j]){
                    minpos=j;
                }
                int temp=a[i];
                a[i]=a[minpos];
                a[minpos]=temp;
            }
        }
    }
    public static void main(String args[]){
        int a[]={3,2,4,5,1};
        selectionsort(a);
       for(int ele:a){
        System.out.println(ele);

       }
      }
        
  
}
    

