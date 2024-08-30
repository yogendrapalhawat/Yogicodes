class box{
    int length;
    int width;
    int height;
    box(int length,int width,int height){
        this.length=length;
        this.width=width;
        this.height=height;
    }
    box volume(){
        int vol=this.length*this.width*this.height;
        System.out.println("volume :"+vol);
        return this;

    }
    box area(){
        int area=2*(this.length*this.width+this.width*this.height+this.height*this.length);
        System.out.print("area :"+area);
        return this;
    }
}
public class Main { public static void main(String[] args) {
    box Box1=new box(2,3,5);
    box Box2=new box(4,5,6);
    box Box3=new box(1,2,3);
    Box2.volume().area();


    }
}