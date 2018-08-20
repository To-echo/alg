import java.util.Arrays;

/**
 * @program: sort-alg
 * @description: 归并排序
 * 属于分治算法，通过在当前子列表的中间进行划分，使得产生两个相等的一半，然后再递归排序，
 * 当两个子列表排序完成之后，再进行归并，得到输入子列表的有序版本。因此最重要的是归并。
 * 假设元素个数为n，那么归并之后，分为高度为：logn的完全平衡树
 * 每一层有n个节点，所以平均复杂度为:nlogn  通过空间换时间
 * 平均复杂度：nlogn
 * @author: tianp
 * @create: 2018-08-19 20:03
 **/
public class MergeSort {
    public static void merge(int a[], int left, int point, int right) {
        //创建两个归并的临时数组
        int n1 = point - left + 1;
        int n2 = right - point;
        int le[] = new int[n1];
        int ri[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            le[i] = a[left + i];
        }
        for (int j = 0; j < n2; j++) {
            ri[j] = a[point + j + 1];
        }
        int i = 0, j = 0;
        for (int k = left; k <= right; k++) {
            //当le数组元素全部搞定时，使用ri数组
            if (i >= n1) {
                a[k] = ri[j];
                ++j;
            }
            //当ri数组元素全部搞定后，使用le的值
            else if (j >= n2) {
                a[k] = le[i];
                ++i;
            }
            //当le的值小于ri的值时，使用le的值
            else if (le[i] <= ri[j]) {
                a[k] = le[i];
                ++i;
            } else {
                a[k] = ri[j];
                ++j;
            }
        }
    }

    public static void mergeSort(int[] a, int left, int right) {
        if (left >= right) {
            return;
        }
        int splitPoint = (right - left) / 2 + left;
        mergeSort(a, left, splitPoint);
        mergeSort(a, splitPoint + 1, right);
        merge(a, left, splitPoint, right);
    }

    public static void main(String[] args) {
        int a[] = new int[]{5, 7, 8, 4, 6, 2, 1, 10};
        mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
