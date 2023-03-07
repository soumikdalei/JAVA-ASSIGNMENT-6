import java.util.Scanner;
public class HW2 {
    static int volume(int s){
        int volume=s*s*s;
        return volume;
    }
    static double volume(double r){
        double volume=(4/3)*Math.PI*r*r*r;
        return volume;
    }
    static int volume(int l,int b,int h){
        int volume=l*b*h;
        return volume;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter all values");
        int s=sc.nextInt();
        int l=sc.nextInt();
        int b=sc.nextInt();
        int h=sc.nextInt();
        double r=sc.nextDouble();
        System.out.println("Volume of a cube"+volume(s));
        System.out.println("Volume of a cuboid "+volume(l,b,h));
        System.out.println("Volume of a Sphere "+volume(r));
    }


}
