import java.util.Scanner;
public class Q8 {
    public static boolean is_pallindrome(String str){
        int left=0;int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            else{
            left++;
            right--;}
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String a=sc.nextLine();
        if(is_pallindrome(a))
            System.out.println(a+" is pallindrome");

        else
            System.out.println(a+" is not pallindrome");
    }
}
