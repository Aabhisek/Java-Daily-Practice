import java.util.Scanner;

public class subString {
    static String processstring(String s){
        String ans="";
        for(int i=0;i<s.length();i=i+3){
            ans+=s.substring(i+1,i+3)+s.charAt(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(processstring(s));
    }
}
