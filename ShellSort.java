public class ShellSort {
    public static void main(String[] args) {
        int[] unsorted = new int[args.length];
        for (int i = 0; i < unsorted.length; i++) {
            unsorted[i] = Integer.parseInt(args[i]);
        }
        //selection sort begins
        for (int i = unsorted.length / 2; i >= 1; i = (int)Math.ceil((double) i / 2)) {
            int temp = 0;
            for (int j = i; (j < unsorted.length); j = j + i) {
                if (unsorted[j - i] > unsorted[j]) { // swap j - i and j if j - i is bigger than j
                    temp = unsorted[j - i];
                    unsorted[j - i] = unsorted[j];
                    unsorted[j] = temp;
                }


            }
            /*
            System.out.print("Array At Step " + (i) + ": ");
            for (int z = 0; z < unsorted.length; z++) {
                System.out.print(unsorted[z] + " ");
            }
            System.out.print("\n"); */
            if (i == 1) { //insurance policy for if division gets weird to avoid an infinite loop
                break;
            }
        }
        for (int i = 0; i < unsorted.length; i++) {
            System.out.print(unsorted[i] + " ");
        }
    }
}