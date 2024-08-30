class Box {
    int length;
    int width;
    int height;

    Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box volume() {
        int vol = this.length * this.width * this.height;
        System.out.println("Volume: " + vol);
        return this;
    }

    int area() {
        int area = 2 * (this.length * this.width + this.width * this.height + this.height * this.length);
        System.out.println("Surface Area: " + area);
        return area;
    }
}

public class ca {
    public static void main(String[] args) {
        Box Box1 = new Box(2, 3, 5);
        Box Box2 = new Box(4, 5, 6);
        Box Box3 = new Box(1, 2, 3);

        Box2.area();
        Box2.volume().area();
    }
}
