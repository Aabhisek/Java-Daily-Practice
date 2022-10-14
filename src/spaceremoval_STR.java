import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class spaceremoval_STR {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s="abhijbajka";
        char a[]=s.toCharArray();
        HashSet<Character>set=new HashSet<>();
        for(char c:a){
            set.add(c);
        }
        System.out.println(set);

    }
}
/*

 */