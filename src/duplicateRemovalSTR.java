import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class duplicateRemovalSTR {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        //iterative approach
        char a[]=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<a.length;i++){
            boolean repeated=false;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    repeated=true;
                    break;
                }
            }
            if(!repeated){
                sb.append(a[i]);

            }
        }
        System.out.println(sb);

        //Approach 2
        /*
        HashSet<Character> set=new LinkedHashSet<>();

        for(int i=0;i<s.length();i++) {
            set.add(s.charAt(i));
        }
        System.out.println(set);
*/


    }
}
