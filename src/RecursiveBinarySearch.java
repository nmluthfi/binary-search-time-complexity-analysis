
public class RecursiveBinarySearch {
    // Mengembalikan nilai dari suatu index
    // jika ditemuka dalam sebuah array
    // jiak tidak ditemukan return -1
    int binarySearch(int arr[],
                     int startIndex,
                     int arrayLength,
                     int searchedIndex)
    {
        // Batasi batas indeks kanan dan kiri
        // untuk menghindari array overflow
        if (arrayLength >= startIndex && startIndex<arr.length-1) {

            int mid = startIndex + (arrayLength - startIndex) / 2;

            // jika elemen yang ditemukan ketemu
            // dan ditemukan diposisi tengah
            if (arr[mid] == searchedIndex)
                return mid;

            // Jika elemen lebih kecil dari nilai tengah,
            // maka dapat ditemukan dibagian kiri array
            if (arr[mid] > searchedIndex)
                return binarySearch(arr, startIndex, mid - 1, searchedIndex);

            // Jika elemen lebih besar dari nilai tengah,
            // maka dapat ditemukan dibagian kanan array
            else
                return binarySearch(arr, mid + 1, arrayLength, searchedIndex);
        }

        // Jika tidak ditemukan return -1
        return -1;
    }

    // Driver method to test above
    public static void main(String args[])
    {
        RecursiveBinarySearch ob = new RecursiveBinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int arrayLength = arr.length;
        int searchedIndex = 10;
        int result = ob.binarySearch(arr, 0, arrayLength - 1, searchedIndex);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}
