import java.util.Arrays;

public class removeDuplicateArray {
    public static void main(String[] args) {
        int a[]={1,3,2,1,3,4,5,6,2,2};
        Arrays.sort(a);
        int freq[]=new int[a.length];
        int j=0;
        for(int i=0;i<a.length-1;i++){

            if(a[i]!=a[i+1]){
                freq[j++]=a[i];
            }
        }
        freq[j++]=a[a.length-1];



        for(int i=0;i<j;i++){
            System.out.print(freq[i]+" ");
        }
    }
}
