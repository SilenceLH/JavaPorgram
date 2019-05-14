import java.util.Arrays;

/**
 * @author liuhuan
 * @gmail xnjdlhjsj@gmail.com
 * @data 2019-05-2019/5/14
 */
public class array {
    public static void main(String[] args) {
        //声明数组
        int[] a;
        a = new int[5];
        int[] b = new int[5];
        //数组的长度
        System.out.println(b.length);
        for (int i = 0; i < b.length; i++) {
            b[i] = (int) (Math.random() * 1000);
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        //初始化二维数组，
        int[][] a1 = new int[2][3]; //有两个一维数组，每个一维数组的长度是3
        a1[1][2] = 5;  //可以直接访问一维数组，因为已经分配了空间

        //只分配了二维数组
        int[][] b1 = new int[2][]; //有两个一维数组，每个一维数组的长度暂未分配
        b1[0]  =new int[3]; //必须事先分配长度，才可以访问
        b1[0][2] = 5;

        //指定内容的同时，分配空间
        int[][] c2 = new int[][]{
                {1,2,4},
                {4,5},
                {6,7,8,9}
        };
        for (int i = 0; i < c2.length; i++) {
            for (int j = 0; j < c2[i].length; j++) {
                System.out.println(c2[i][j]);
            }
            System.out.println("\n");
        }

        /**
         * Arrays的用法:
         * Arrays提供了一个copyOfRange方法进行数组复制。
         */
        int a_arrays[] = new int[] {13, 62, 68, 82, 65, 9};
        // copyOfRange(int[] original, int from, int to)
        // 第一个参数表示源数组
        // 第二个参数表示开始位置(取得到)
        // 第三个参数表示结束位置(取不到)
        int b_arrays[] = Arrays.copyOfRange(a_arrays, 0, 3);
        for (int i = 0; i < b_arrays.length; i++) {
            System.out.print(b_arrays[i] + " ");
        }
        /**
         * 但是Arrays提供了一个toString()方法，直接把一个数组，转换为字符串，这样方便观察数组的内容
         */
        System.out.println();
        String content = Arrays.toString(a_arrays);
        System.out.println(content);
        /**
         * 在前面章节学习了 选择法排序 和 冒泡法排序，Arrays工具类提供了一个sort方法，只需要一行代码即可完成排序功能。
         */
        Arrays.sort(a_arrays);
        System.out.println(Arrays.toString(a_arrays));
        /**
         * 使用binarySearch进行查找之前，必须使用sort进行排序
         * 如果数组中有多个相同的元素，查找结果是不确定的
         */
        System.out.println(Arrays.binarySearch(a_arrays, 62));
        /**
         * Arrays.equals()
         *比较两个数组的内容是否一样
         */
        int a3[] = new int[] { 18, 62, 68, 82, 65, 9 };
        int b3[] = new int[] { 18, 62, 68, 82, 65, 8 };
        System.out.println(Arrays.equals(a3,b3));
        /**
         * Arrays.fill
         * 使用同一个值，填充整个数组
         */
        int b5[] = new int[10];
        Arrays.fill(b5, 12);
        System.out.println(Arrays.toString(b5));
    }
}
