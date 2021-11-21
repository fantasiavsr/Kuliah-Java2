package Minggu7.Praktikum;

public class SortMain {
    public static void main(String[] args) {
        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};

        System.out.println("Sorting dengan merge sort");

        MergeSorting mSort = new MergeSorting();

        System.out.println("Data awal");

        mSort.printArray(data);
        mSort.sort(data, 0, data.length-1);
        mSort.mergeSort(data);

        System.out.println("Setelah diurutkan");

        mSort.printArray(data);
    }
}