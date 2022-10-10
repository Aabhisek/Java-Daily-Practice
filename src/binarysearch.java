public class binarysearch {
    static int binary(int a[],int first,int last,int key){
        if(first<=last){
            int mid=(first+last)/2;
            if(a[mid]==key){
                return mid;
            }
            if(a[mid]>key){
                return binary(a,first,mid-1,key);
            }
            if(a[mid]<key){
                return binary(a,mid+1,last,key);
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={1,23,6,8,3,6};
        int key=6;
        int last=a.length-1;
        System.out.print(binary(a,0,last,key));

    }
}
