public class matrixEqualCheck {
    public static void main(String[] args) {
        int a[][]={{1,3,4},{2,4,3},{3,4,5}};
        int b[][]={{1,3,4},{2,4,3},{3,4,5}};
        int c1=a[0].length;
        int c2=b[0].length;
        int r1=a.length;
        int r2=b.length;
        boolean equal=true;
        if(r1!=r2 || c1!=c2){
            System.out.println("matrix not equal");
        }
        else{
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(a[i][j]!=b[i][j]){
                        equal=false;
                        break;
                    }
                }

            }
            if(equal){
                System.out.println("matrix is equal ");
            }
            else{
                System.out.println("matrix not equal");
            }
        }

    }
}
