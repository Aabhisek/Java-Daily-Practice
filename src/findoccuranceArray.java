public class findoccuranceArray {
    public static void main(String[] args) {
        int a[]={1,3,2,1,3,4,5,6,2,2};
        int freq[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            int count=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                    freq[j]=-1;
                }
            }
            if(freq[i]!=-1){
                freq[i]=count;
            }
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=-1){
                System.out.print(a[i]+ ":" +freq[i]+" ");
            }
    }


    }
}
