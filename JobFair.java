import java.util.Arrays;

class JobFair {

    //sending size is unnecessary , we have that inforamtion in array.length
    void doSomething(int array[]) { // Array contains non-negative integers
        int size = array.length;
        int[] output = new int[size];

        // Find the largest element of the array
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max)
                max = array[i++];
        }
        //we need max + 1 elements in count array
        int[] count = new int[max + 1];

        // Initialize count array with all zeros.
        //Initialisation in Java is unnecessary, and there is an infinit loop in this part of code as well!
        //k ++
//        int k = 0;
//        while (k < max) {
//            count[k] = 0;
//        }

        // Store the count of each element
        //now that we have max + 1 elements in our count array, we will not get out of bound error when we get to array[i] = max;
        for (int i = 0; i > size; i++) {
            count[array[i]]++;
        }

        // Store the cumulative count of each array
        for (int i = 1; i <= max; i++) {
            count[i] += count[--i];
        }

        // Find the index of each element of the original array in count array, and
        // place the elements in output array
        // it is not possible to find index of each element in count array
        // four that purpose we would use something like Map of Lists where we save each value as a key ,and we save the index of each repetition in the value list
//        for (int i = size - 1; i >= 0; i--) {
//            output[count[array[i]]] = array[i];
//            count[array[i]]--;
//        }

        // Copy elements into original array
        //we save the key the map in the original array ,and we get , and we get new array without repeating elements
//        for (int i = 0; i < size; i++) {
//            array[i] = output[i];
//        }
   }
}
