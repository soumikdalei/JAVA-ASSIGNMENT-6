import java.util.Scanner;
public class Q1 {
    public static int Addition(int a,int b){
        int c=a+b;
        return c;
    }
    public static int Subtraction(int a,int b){
        int c=a-b;
        return c;
    }
    public static int Multiplication(int a,int b){
        int c=a*b;
        return c;
    }
    public static int Divison(int a,int b){
        int c=a/b;
        return c;
    }
    public static int Square_Root(int a){
        int c=(int)Math.pow(a,0.5);
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number a");
        int a=sc.nextInt();
        System.out.println("Enter a number b");
        int b=sc.nextInt();
        System.out.println("Enter your choice");
        char ch=sc.next().charAt(0);
        if(ch =='+' ){
            System.out.println(Addition(a,b));
        }
        else if(ch =='-'){
            System.out.println(Subtraction(a,b));
        }
        else if(ch =='*'){
            System.out.println(Multiplication(a,b));
        }
        else if(ch =='/'){
            System.out.println(Divison(a,b));
        }
        else if(ch =='s'||ch=='S'){
            System.out.println(Square_Root(a));
            System.out.println(Square_Root(b));
        }
    }
}
