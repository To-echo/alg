import java.util.Arrays;
import java.util.SortedMap;

/**
 * @program: sort-alg
 * @description: 快速排序
 * 最坏复杂度 n^2 按有序方式排列，分治的二叉树高度为线性长度,而不是平衡的
 * 平均复杂度nlogn
 * @author: tianp
 * @create: 2018-08-20 12:15
 **/
public class QuickSort {
    public static void sort(int a[], int start, int end) {
        if (end<= start){
            return;
        }
        int key = a[start];
        int i = start + 1, j = end;
        while (i <= j) {
            while (a[i] < key) {
                i++;
            }
            while (a[j] > key) {
                j--;
            }
            if (i >=j){
                break;
            }
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
        }
        //key 与a[start] 交换 ，这里只能与j交换，因为j在最后一次交换后，会执行j--。此时j属于比key小的范围，而最后一次i++
        //执行时，i已经属于，比key大的范围了，此刻只能用比key小的范围中的数与a[starter] 交换
        a[start] = a[j];
        a[j] = key;
        sort(a, start, j-1);
        sort(a, j + 1, end);
    }

    public static void main(String[] args) {
        int a[] = new int[]{5, 7, 8, 4, 6, 2, 1, 10};
        sort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
