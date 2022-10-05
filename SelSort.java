public class SelSort {
    public static void main(String[] args) {
        int[] unsorted = new int[args.length];
        for (int i = 0; i < unsorted.length; i++) {
            unsorted[i] = Integer.parseInt(args[i]);
        }
        //selection sort begins
        int temp = 0;
        int min = Integer.MAX_VALUE;
        int mindex = 0;

        for (int i = 0; i < unsorted.length; i++) {
            temp = unsorted[i]; //save the place to swap to
            for (int j = i; j < unsorted.length; j++) { //find minimum value
                if (unsorted[j] < min) {
                    min = unsorted[j];
                    mindex = j;
                }
            }
            unsorted[i] = min;
            unsorted[mindex] = temp; //swap
            min = Integer.MAX_VALUE; //reset min
        }
        for (int i = 0; i < unsorted.length; i++) {
            System.out.print(unsorted[i] + " ");
        }
    }
}