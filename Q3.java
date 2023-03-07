import java.util.Scanner;
public class Q3 {
    public static int reverse(int number){
        int d=0;int sum=0;
        for(int i=0;i<=number;i++){
            d=number%10;
            sum=sum*10+d;
            number=number/10;
        }
        return sum;
    }
    public static boolean isPalindrome(int number){
        int d=0;int sum=0;int n=number;
        for (int i=0;i<=number;i++){
            d=number%10;
            sum=sum*10+d;
            number=number/10;
        }
        if(n==sum)
            return true;
        else
            return false;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println(reverse(n));
        if (isPalindrome(n)){
            System.out.println(n+" is a pallindrome number " );
        }
        else{
            System.out.println(n+" is not a pallindrome number ");
        }

    }
}
