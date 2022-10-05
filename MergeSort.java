public class MergeSort {
    public static void main(String[] args) {
        int[] unsorted = new int[args.length];
        for (int i = 0; i < unsorted.length; i++) {
            unsorted[i] = Integer.parseInt(args[i]);
        }

        int[] sorted = mergeSort(unsorted, 0, unsorted.length);
        for (int i = 0; i < unsorted.length; i++) {
            System.out.print(unsorted[i] + " ");
        }
    }
    public static int[] mergeSort(int[] x, int l, int r) {
        if (l == r) {
            for (int i = 0; i < x.length; i+= 2) { //to deal with the 2-sorted arrays
                if (x[i] > x[i + 1]) {
                    int temp = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = temp;
                }
            }
            return x;
        }
        else {
            int median = (int)Math.floor((double)(r + l) / 2);
            mergeSort(x, l, median);
            mergeSort(x, median + 1, r);
            merge(x, l, median, r);
        }
        return x;

    }

    public static int[] merge(int[] x, int l, int median, int r) {
        //splitting into 2 new arrays
        int[] L = new int[(median - l) + 1];
        int[] R = new int[r - median + 1];
        for (int i = 0; i < L.length - 1; i++) {
            L[i] = x[l + i];
        }
        for (int i = 0; i < R.length - 1; i++) {
            R[i] = x[i + median];
        }
        int a = 0;
        int b = 0;
        R[R.length - 1] = Integer.MAX_VALUE;
        L[L.length - 1] = Integer.MAX_VALUE;
        //these are so if one finishes before the other no other compare attempts will succeed (avoid index errors)
        for (int k = l; k < r; k++) {
            if (L[a] < R[b]) {
                x[k] = L[a];
                a++;
            } else {
                x[k] = R[b];
                b++;
            }
        }
        return x;
    }
}