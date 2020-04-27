import org.junit.Test;

public class sort01 {

    public int[] sort(int[] array) {
        int min = 0;
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; i < array.length; i++) {
                if (min == array[j]) {
                }
                if (min > array[j]) {
                    int temp = min;
                    min = array[j];
                    array[j] = temp;

                }//里层循环找出当前循环最小
            }

            result[i] = min;//外层循环将最小值逐个放入结果数组

        }


        return result;
    }

    @Test
    public void test01() {

        int[] arr = {5, 10, 6};
        int[] sort = sort(arr);

        for (int i : sort) {
            System.out.println(i);
        }


    }

}
