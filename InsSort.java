public class InsSort {
    public static void main(String[] args) {
        int[] unsorted = new int[args.length];
        for (int i = 0; i < unsorted.length; i++) {
            unsorted[i] = Integer.parseInt(args[i]);
        }
        //insertion sort begins

        for (int i = 1; i < unsorted.length; i++) {
            int temp = 0;
            for (int j = i; ((j > 0) && (unsorted[j] < unsorted[j - 1])); j--) { //find minimum value
                temp = unsorted[j - 1];
                unsorted[j - 1] = unsorted[j];
                unsorted[j] = temp;


            }
            System.out.print("Array At Step " + (i) + ": ");
            for (int z = 0; z < unsorted.length; z++) {
                System.out.print(unsorted[z] + " ");
            }
            System.out.print("\n");
        }
        for (int i = 0; i < unsorted.length; i++) {
            System.out.print(unsorted[i] + " ");
        }
    }
}