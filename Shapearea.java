package area.shape;

public class Shapearea {

    public static void main(String[] args) {
        double a1=area(34.23);
        double a2=area(34);
        double a3=area(12);
        System.out.println("Area of circle is : "+a1);
        System.out.println("Area of square is : "+a2);
        System.out.println("Area of rectangle is : "+a3);


    }

    public static double area(double a ,double b){

        double c=a*b;
        return c;

    }
    public static double area(int d1){

        double e=d1*d1;
        return e;

    }
    public static double area(double r1){

        final double pi=3.14;
        double k=pi*r1*r1;
        return k;

    }

}
