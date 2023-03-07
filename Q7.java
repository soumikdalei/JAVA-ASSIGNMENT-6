import java.util.Scanner;
public class Q7 {
    public static int count(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'E' || ch == 'B' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
                count++;
            }
        }
return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        System.out.println(count(s));
    }
}
