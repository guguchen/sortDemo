public class BumbleSort {
    public static void main(String[] args) {
        int a[]={1,3,45,7,4,2,6};
        for(int num:a){
            System.out.print(num+" ");
        }
        System.out.println();
        for(int i=0;i<a.length;i++){

            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]) {

                    a[j+1] = a[j] + a[j+1];
                    a[j] = a[j+1] - a[j];
                    a[j+1] = a[j+1] - a[j];
                }
            }
        }
        for(int num:a){
            System.out.print(num+" ");
        }
    }
}
