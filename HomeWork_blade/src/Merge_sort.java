
public class Merge_sort {
    private double[] array;
    private double[] temp;
    private int length;

    public double[] mergeSort(double[] arr) {
        this.array = arr;
        this.length = arr.length;
        this.temp = new double[length];
        merge1(0, length - 1);
        return arr;
    }
    private void merge1(int left, double right) {

        if (left < right) {
            double middle = left + (right - left) / 2;
            merge1(left, middle);
            merge1((int) (middle + 1), right);
            merge2(left, middle, right);
        }
    }

    private void merge2(int left, double middle, double right) {

        for (int i = left; i <= right; i++) {
            temp[i] = array[i];
        }
        int i = left;
        int j = (int) (middle + 1);
        int k = left;
        while (i <= middle && j <= right) {
            if (temp[i] <= temp[j]) {
                array[k] = temp[i];
                i++;
            } else {
                array[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = temp[i];
            k++;
            i++;
        }

    }
}
