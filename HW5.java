import java.util.Scanner;
public class HW5 {
    public static void consecutive(int a,int b,int c){
        if(b==(a-1)&&c==(a-2)){
        System.out.println("Consecutive");
    }
    else if((b==(a+1)&&(c==(a+2)))){
        System.out.println("Consecutive");
    }
    else System.out.println("Not consecutive");

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        consecutive(a,b,c);

    }
}
