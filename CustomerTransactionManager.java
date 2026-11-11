import java.util.Scanner;

public class CustomerTransactionManager {

    static Scanner scanner = new Scanner(System.in);

    static String[] transactionIDs;
    static double[] transactionAmounts;
    static double[][] itemDetails;

    static int count;
    static int categories = 3;

    public static void main(String[] args) {

        System.out.print("Enter number of customer transactions: ");
        count = scanner.nextInt();

        transactionIDs = new String[count];
        transactionAmounts = new double[count];
        itemDetails = new double[count][categories];

        // INPUT CUSTOMER DATA
        for (int i = 0; i < count; i++) {

            System.out.println("\nCustomer " + (i + 1));

            System.out.print("Enter Transaction ID: ");
            transactionIDs[i] = scanner.next();

            System.out.print("Enter Total Purchase Amount: ");
            transactionAmounts[i] = scanner.nextDouble();

            for (int j = 0; j < categories; j++) {
                System.out.print("Enter Item Category " + (j + 1) + " Amount: ");
                itemDetails[i][j] = scanner.nextDouble();
            }
        }

        // DISPLAY ORIGINAL DATA
        System.out.println("\n===== CUSTOMER TRANSACTIONS =====");
        displayData();

        // SORTING MENU
        System.out.println("\n===== SORTING ALGORITHMS =====");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Insertion Sort");
        System.out.println("3. Selection Sort");
        System.out.println("4. Merge Sort");

        System.out.print("Choose sorting algorithm: ");
        int choice = scanner.nextInt();

        System.out.println("\n1. Ascending");
        System.out.println("2. Descending");

        System.out.print("Choose sorting order: ");
        int order = scanner.nextInt();

        boolean ascending = (order == 1);

        // EXECUTE SORTING
        switch (choice) {

            case 1:
                bubbleSort(ascending);
                break;

            case 2:
                insertionSort(ascending);
                break;

            case 3:
                selectionSort(ascending);
                break;

            case 4:
                mergeSort(0, count - 1, ascending);
                break;

            default:
                System.out.println("Invalid choice!");
                scanner.close();
                return;
        }

        // DISPLAY SORTED DATA
        System.out.println("\n===== SORTED TRANSACTIONS =====");
        displayData();

        scanner.close();
    }

    private static void mergeSort(int i, int j, boolean ascending) {
        throw new UnsupportedOperationException("Unimplemented method 'mergeSort'");
    }

    private static void selectionSort(boolean ascending) {
        throw new UnsupportedOperationException("Unimplemented method 'selectionSort'");
    }

    private static void insertionSort(boolean ascending) {
        throw new UnsupportedOperationException("Unimplemented method 'insertionSort'");
    }

    // DISPLAY ARRAY DATA
    static void displayData() {

        System.out.println("\nID\tTotal\tItem 1\tItem 2\tItem 3");

        for (int i = 0; i < count; i++) {

            System.out.print(transactionIDs[i] + "\t");
            System.out.print(transactionAmounts[i] + "\t");

            for (int j = 0; j < categories; j++) {
                System.out.print(itemDetails[i][j] + "\t");
            }

            System.out.println();
        }
    }

    // COMPARE TWO VALUES
    static boolean shouldSwap(double a, double b, boolean ascending) {
        if (ascending) {
            return a > b;
        } else {
            return a < b;
        }
    }

    // SWAP CUSTOMER DATA
    static void swap(int i, int j) {

        double tempAmount = transactionAmounts[i];
        transactionAmounts[i] = transactionAmounts[j];
        transactionAmounts[j] = tempAmount;

        String tempID = transactionIDs[i];
        transactionIDs[i] = transactionIDs[j];
        transactionIDs[j] = tempID;

        for (int k = 0; k < categories; k++) {

            double temp = itemDetails[i][k];
            itemDetails[i][k] = itemDetails[j][k];
            itemDetails[j][k] = temp;
        }
    }

    // BUBBLE SORT
    static void bubbleSort(boolean ascending) {

        for (int i = 0; i < count - 1; i++) {

            for (int j = 0; j < count - i - 1; j++) {

                if (shouldSwap(transactionAmounts[j],
                        transactionAmounts[j + 1], ascending)) {

                    swap(j, j + 1);
                }
            }
        }
    }
}