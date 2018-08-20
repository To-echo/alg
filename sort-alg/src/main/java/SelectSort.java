import java.util.Arrays;

/**
 * @program: sort-alg
 * @description:选择排序 复杂度：n^2
 * @author: tianp
 * @create: 2018-08-20 16:17
 **/
public class SelectSort {
    public static void sort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = new int[]{5, 7, 8, 4, 6, 2, 1, 10};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
