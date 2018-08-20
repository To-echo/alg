import java.util.Arrays;

/**
 * @program: sort-alg
 * @description: 插入排序
 * 复杂度：
 * 1.已有序数组：n
 * 2.最坏情况,给一个倒序排序为顺序：n^2
 * @author: tianp
 * @create: 2018-08-20 16:23
 **/
public class InsertSort {
    public static void sort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int j = i + 1;
            while (j > 0 && a[j] < a[j - 1]) {
                int temp = a[j - 1];
                a[j - 1] = a[j];
                a[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = new int[]{5, 7, 8, 4, 6, 2, 1, 10};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
