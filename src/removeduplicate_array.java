import java.util.Arrays;

public class removeduplicate_array {
    public static void main(String[] args) {
        int a[]={1,1,2,3,3,4};
        Arrays.sort(a);
        int res[]=new int[a.length];
        int j=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                res[j++]=a[i];
            }
        }
        res[j++]=a[a.length-1];
        for(int i=0;i<j;i++){
            System.out.print(res[i]);
        }
    }
}
