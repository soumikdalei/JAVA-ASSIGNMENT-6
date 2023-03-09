import java.util.Scanner;
public class Q9 {
    public static boolean password(String str){
    for(int i=0;i<=str.length();i++){
        int d=(str.charAt(i);
        if(!(d>=48 &&d<=57)&&(d>=65&&d<=90)&&(d>=97&&d<=122)){
               return false;
        }
    }
    return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Password");
        String s=sc.nextLine();
        if(password(s)){
            System.out.println(s+" is valid password");
        }
        else {
            System.out.println(s+" is not valid password");

        }

    }
}
