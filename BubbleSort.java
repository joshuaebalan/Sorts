public class BubbleSort {
    public static void main(String[] args) {
        int[] unsorted = new int[args.length];
        for (int i = 0; i < unsorted.length; i++) {
            unsorted[i] = Integer.parseInt(args[i]);
        }
        int temp = 0;
        boolean swapped = false; //boolean measuring if a swap has been done yet
        do { //while the array isn't sorted
            swapped = false;
            for (int j = 1; j < unsorted.length; j++) { //get the next pair
                if (unsorted[j] < unsorted[j - 1]) { //swap the pair if needed
                    temp = unsorted[j - 1];
                    unsorted[j - 1] = unsorted[j];
                    unsorted[j] = temp;
                    swapped = true;
                }
            }
        } while (swapped); //if no swaps were made, the array is sorted
        for (int i = 0; i < unsorted.length; i++) {
            System.out.print(unsorted[i] + " ");
        }
    }
}