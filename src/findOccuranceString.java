import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class findOccuranceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char a[]=s.toCharArray();
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char c:a){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        System.out.print(map);
    }
}
