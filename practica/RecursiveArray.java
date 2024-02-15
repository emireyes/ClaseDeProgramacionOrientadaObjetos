package practica;

public class RecursiveArray {
    private int[] arr;

    public RecursiveArray(int[] arr) {
        this.arr = arr;
    }

    public void printArray() {
        printArray(arr, 0);
    }

    private void printArray(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }
        System.out.println(arr[index]);
        printArray(arr, index + 1);
    }

    public boolean search(int target) {
        return search(arr, target, 0);
    }

    private boolean search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        if (arr[index] == target) {
            return true;
        }
        return search(arr, target, index + 1);
    }
}
