public class FreqArr {
    public static void main(String [] args) {
        int[] rawNumbs = {1, 9, 9, 0, 2, 8, 0, 9};
        FreqArr.showFreqDict(rawNumbs);
    }

    public static void showFreqDict(int[] rawArray) {
        FreqArr.countValuesFrequency(rawArray);
    }

    public static void countValuesFrequency(int[] rawArray) {
        for (int i = 0; i < rawArray.length; i++) {
            int count = 0;
            int template = rawArray[i];

            if (FreqArr.checkIfValueWasCounted(rawArray, i)) {
                continue;
            }

            for (int j = 0; j < rawArray.length; j++) {
                if (rawArray[j] == template) {
                    count++;
                }
            }

            System.out.printf("%d appears %d times \n", template, count);
        }
    }

    public static Boolean checkIfValueWasCounted(int[] array, Integer index) {
        if (index == 0) {
            return false;
        }

        int temp = array[index]; // template value to compare
        int lenToCount = array.length - 1 - index; // the part of array that will be checked
        for (int i = 0; i < lenToCount; i++) {
            if (array[i] == temp) {
                return true;
            }
        }
        return false;
    }
}
