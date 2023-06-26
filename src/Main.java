public class Main {
    public static void main(String[] args) {
        int[][][] cube = {
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                },
                {
                        {10, 11, 12},
                        {13, 14, 15},
                        {16, 17, 18}
                },
                {
                        {19, 20, 21},
                        {22, 23, 24},
                        {25, 26, 27}
                }
        };

        int secondLargest = findSecondLargestDiagonalValue(cube);
        System.out.println("Второе по величине значение элементов диагоналей: " + secondLargest);
    }

    public static int findSecondLargestDiagonalValue(int[][][] arr) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int diagonalValue = arr[i][i][i];
            if (diagonalValue > largest) {
                secondLargest = largest;
                largest = diagonalValue;
            } else if (diagonalValue > secondLargest && diagonalValue < largest) {
                secondLargest = diagonalValue;
            }
        }

        return secondLargest;
    }
}