class Circle{
    private int radius;
    private float area;
    private float perimeter;

    public void setRadius(int r){
        this.radius = r;
    }

    public void checkArea(float a){
       area = 3.14f*radius*radius;
       if(area == a){
           System.out.println("Correct Area");
       }
       else{
           System.out.println("Wrong Area");
       }
    }

    public void checkPerimeter(float p){
      perimeter = 2*3.14f*radius;
      if(perimeter == p){
          System.out.println("Correct Perimeter");
      }
      else{
          System.out.println("Wrong Perimeter");
      }
    }
}

public class Main {
    public static void main(String[] args) {

        Circle kush = new Circle();

        kush.setRadius(3);
        kush.checkArea(28.26f);
        kush.checkPerimeter(18.84f);


    }
}