
// 原理：每一趟从待排序的记录中选出最小的元素，
// 顺序放在已排好序的序列最后，
// 直到全部记录排序完毕。
// 也就是：每一趟在n-i+1(i=1，2，…n-1)个记录中选取关键字最小的记录作为有序序列中第i个记录。
// 基于此思想的算法主要有简单选择排序、树型选择排序和堆排序。
public class SelectionSortDemo {
    public static void main(String[] args) {
        int a[]={1,3,45,7,4,2,6};
        for(int num:a){
            System.out.print(num+" ");
        }
        System.out.println();
        for(int i=0;i<a.length;i++){
            int k=i;
            for(int j=k+1;j<a.length;j++){
                if(a[j]<a[k])
                    k=j;
            }
            if(i!=k){
                a[i]=a[k]+a[i];
                a[k]=a[i]-a[k];
                a[i]=a[i]-a[k];
            }
        }
        for(int num:a){
            System.out.print(num+" ");
        }
    }
}
