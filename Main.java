class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {
        for (int[] rowArray : twoDimArray) {
            int[] tempArray = new int[rowArray.length];
            int index = 0;
            for (int j = rowArray.length - 1; j >= 0; j--) {
                tempArray[index] = rowArray[j];
                index += 1;
            }
            System.arraycopy(tempArray, 0, rowArray, 0, rowArray.length);
        }
    }
}
