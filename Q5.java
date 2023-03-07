import java.util.Scanner;
public class Q5 {
    public static double area(int n, double side){
        double area= (int) (n*side*side/(4*((int)Math.tan(Math.PI/n))));
        return area;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter a number ");
        int n=sc.nextInt();
        System.out.println("Enter side");
        double d=sc.nextDouble();
        System.out.println(area(n,d));

    }
}
