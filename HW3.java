import java.util.Scanner;
public class HW3 {
    static void Middle(String s){
        int d=s.length();
        int mid =d/2;
        if(d%2==0){
            System.out.println("The middle character is "+s.charAt(mid));
        }
        else{
            System.out.println("The middle character is "+s.charAt(mid));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        Middle(s);



    }
}
