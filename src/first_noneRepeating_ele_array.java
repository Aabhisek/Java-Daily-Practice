import java.util.HashMap;
import java.util.Map;

public class first_noneRepeating_ele_array {
    public static void main(String[] args) {
        int a[] = { 9, 4, 9, 6, 7, 4 };
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:a){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        for(HashMap.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
