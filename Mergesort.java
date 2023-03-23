import java.util.Scanner;
public class Mergesort {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter strings ");
            String input = scanner.nextLine();
            String[] strings = input.split(" "); 
            mergeSort(strings, 0, strings.length - 1); 
            System.out.println("Sorted list: ");
            for (String string : strings) {
                System.out.print(string + " ");
            }
        }

  
        public static void mergeSort(String[] array, int l, int h) {
            if (l < h) {
                int mid = l + (h - l) / 2;
                mergeSort(array, l, mid); 
                mergeSort(array, mid + 1, h); 
                merge(array, l, mid, h); 
            }
        }

    
        public static void merge(String[] array, int l, int mid, int h) {
            String[] str = new String[array.length];
            for (int i = l; i <= h; i++) {
                str[i] = array[i];
            }
            int i = l;
            int j = mid + 1;
            for (int k = l; k <= h; k++) {
                if (i > mid) {
                    array[k] = str[j++];
                } else if (j > h) {
                    array[k] = str[i++];
                } else if (str[j].compareTo(str[i]) < 0) {
                    array[k] = str[j++];
                } else {
                    array[k] = str[i++];
                }
            }
        }
}