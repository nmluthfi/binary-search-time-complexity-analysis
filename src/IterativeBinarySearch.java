public class IterativeBinarySearch {
    // Mengembalikan nilai dari suatu index
    // jika ditemuka dalam sebuah array
    // jiak tidak ditemukan return -1
    int binarySearch(int arr[], int searchedIndex) {
        int startIndex = 0, arrayLength = arr.length - 1;
        while (startIndex <= arrayLength) {
            int m = startIndex + (arrayLength - startIndex) / 2;

            // Check jika searchedIndex ada ditengah
            if (arr[m] == searchedIndex) // basic op 1
                return m;

            // Jika searchedIndex lebih besar dari nilai tengah, cari di kanan
            if (arr[m] < searchedIndex) // basic op 1
                startIndex = m + 1;

                // // Jika searchedIndex lebih kecil dari nilai tengah, cari di kiri
            else // basic op 1
                arrayLength = m - 1;
        }

        // jika tidak ditemukan return -1
        return -1;
    }

    // Driver method to test above
    public static void main(String args[])
    {
        IterativeBinarySearch ob = new IterativeBinarySearch ();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int searchedIndex = 10;
        int result = ob.binarySearch(arr, searchedIndex);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}
