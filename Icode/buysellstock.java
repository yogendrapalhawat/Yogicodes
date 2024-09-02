public class buysellstock {
    public static int buy(int b[]){
        int mp=0;
        int bp=Integer.MAX_VALUE;
        for(int i=0;i<b.length;i++){
            if(bp<b[i]){
                int p=b[i]-bp;
                mp=Math.max(p,mp);
            }
            else{
                bp=b[i];
            }
        }
        return  mp;
    }
    public static void main(String args[]){
        int b[]={7,1,5,3,6,4};
        System.out.println(buy(b));
        
  
}
    
}
