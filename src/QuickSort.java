public class QuickSort {


        private static void quick_sort ( int[] a, int l, int r){
            if (l < r) {
                int i = l;
                int j = r;
                int temp = a[l];
                while (i < j) {
                    while (i < j && a[j] > temp)
                        j--;
                    if (i < j)
                        a[i++] = a[j];
                    while (i < j && a[i] < temp)
                        i++;
                    if (i < j)
                        a[j--] = a[i];
                }
                a[i] = temp;
                quick_sort(a, l, r - 1);
                quick_sort(a,l+1,r);
            }


        }

    public static void main(String[] args) {
        int a[]={1,3,45,7,4,2,6};
        for(int num:a){
            System.out.print(num+" ");
        }
        System.out.println();
        quick_sort(a,0,a.length-1);
        for(int num:a){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
