package massiv;

public class Task {

    public int array18(int[] array) {
        int n = array.length-1;
        int result = 0;
        int element = array[0];
        for (int i = 1; i < n; i++) {
            if (element > array[n]) {
                element = array[i];
            }else{
                result =  element;
                break;
            }

        }
        return result;
    }
}
