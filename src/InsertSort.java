public class InsertSort {
    public static void main(String[] args) {
        int a[]={1,3,45,7,4,2,6};
        for(int num:a){
            System.out.print(num+" ");
        }
        System.out.println();
        for(int i=1;i<a.length;i++) {
            int temp=a[i];
            int j;
            for(j=i-1;j>=0;j--){
                if(a[j]>temp){
                    a[j+1]=a[j];
                }
                else break;
            }
            a[j+1]=temp;

        }

        for(int num:a){
            System.out.print(num+" ");
        }
    }
}
