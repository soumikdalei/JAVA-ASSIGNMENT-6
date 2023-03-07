import java.util.Scanner;
public class Q10 {
     static double area(double b,double h){
       double  area =0.5*b*h;
        return area;
    }
      static int area(int s){
       int  area =s*s;
       return area;
    }
     static float area(float r ){
       float area=((float)Math.PI)*r*r;
       return area;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double b=sc.nextDouble();double h=sc.nextDouble();
        int s=sc.nextInt();
        float r=sc.nextFloat();
        System.out.println(area(b,h));
        System.out.println(area(s));
        System.out.println(area(r));
    }
}
