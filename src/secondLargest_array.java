public class secondLargest_array {
    public static void main(String[] args) {
        int a[]={2,1,3,4,5};
        int fl=0;
        int sl=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length-1;j++){
                if(a[j]<a[j+1]){
                    fl=a[j];
                    sl=a[i];
                }
            }

        }
        System.out.print(fl);
    }
}
