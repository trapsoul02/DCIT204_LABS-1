public class Main {
    public static void main(String[] args) {
        Scanner scanner = new scanner(System.in);

        system.out.print("Enter array size: ");
        int size = scanner.nextint();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("enter element " + (i + 1) + ":  ");
            array[i] = scanner.nexttInt();
        }

            system.out.print("\nEnter target value:  ");
            int target = scanner.nextInt();

            int linearResult = Algorithm.linearSearch(array, target);
            system.out.println("\nlinear search result:");
            if (linearResult != -1)
                system.out.println("Target  found at index " + linearResult);
            else
                system.out.println("Target not found.")

            Arrays.sort(array);

            int binaryResult = Algorithm.binarySearch(array, target);
            system.out.println("\nBinary search Result:");
            if (binaryResult != -1)
                system.out.println("Target found at index " + binaryResult);
            else
                system.out.println("Target not found.");

            scanner.clos()
        }

    }
}