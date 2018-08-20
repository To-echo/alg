import java.util.Arrays;

/**
 * @program: sort-alg
 * @description:冒泡排序 复杂度：n^2
 * @author: tianp
 * @create: 2018-08-20 16:14
 **/
public class BubbleSort {
    public static void sort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[] = new int[]{5, 7, 8, 4, 6, 2, 1, 10};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
