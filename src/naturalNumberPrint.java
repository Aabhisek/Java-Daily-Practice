import java.util.Scanner;

public class naturalNumberPrint {
    static int i=1;
    static int n=0;
    static void print(){
        while(i<=n){
            System.out.println(i);
            i++;
            print();
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
        naturalNumberPrint.print();

    }
}
