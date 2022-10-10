import java.util.Scanner;

public class stringPalindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String rev="";
        char ch[]=s.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            rev=rev+ch[i];
        }
        if(rev.equals(s)){
            System.out.print("pal");
        }
        else{
            System.out.print("not pal");
        }
    }
}
