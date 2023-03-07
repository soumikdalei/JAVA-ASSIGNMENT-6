import java.util.Scanner;
public class Q2 {
    public static int getPentagonalNumber(int n){
        int d=(n*((3*n)-1))/2;
        return d;
    }
    public static void main(String[] args) {
        int a=0;
        for(int i=1;i<=100;i++){
            System.out.print(getPentagonalNumber(i)+" ");
            a++;
            if(a==10){
                System.out.println();
                a=0;
            }

        }

    }


}
