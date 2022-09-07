class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {
        for (int i = 0; i < twoDimArray.length; i++) {
            int[] tempArray = new int[twoDimArray[0].length];
            int index = 0;
            for (int j = twoDimArray[0].length - 1; j >= 0; j--) {
                tempArray[index] = twoDimArray[i][j];
                index += 1;
            }
            index = 0;
            for (int j = 0; j < twoDimArray[0].length; j++) {
                twoDimArray[i][j] = tempArray[index];
                index += 1;
            }
        }
    }
}
