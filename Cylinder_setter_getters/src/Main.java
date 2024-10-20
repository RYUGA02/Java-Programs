import java.lang.Math;
class Cylinder{
    int radius;
    int height;

    public void setter(int r, int h){
        this.radius = r;
        this.height = h;
    }


    public void getter(){
        System.out.println("The radius of cylinder is "+radius);
        System.out.println("The height of cylinder is "+height);
    }

    public double surfaceArea(){
        double sArea = ((2*Math.PI*radius*radius)) + ((2*Math.PI*radius*height));
        return sArea;
    }

    public double volumeArea(){
        double volumeArea = (Math.PI*radius*radius*height);
        return volumeArea;

    }
}
public class Main {
    public static void main(String[] args) {

        Cylinder obj = new Cylinder();

        obj.setter(2,3);
        obj.getter();
        System.out.println("The surface area of cylinder is "+ obj.surfaceArea());
        System.out.println("The volume of the cylinder is "+ obj.volumeArea());
    }
}