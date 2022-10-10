import java.util.*;
public class primenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        if(n==0 || n==1){
            System.out.print("not a prime number");
        }
        else{
            for(int i=2;i<n-1;i++){
                if(n%2==0){
                    count++;
                }

            }
            if(count>1){
                System.out.print("Not prime");
            }
            else{
                System.out.print("prime");
            }
        }

    }
}
