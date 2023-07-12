import com.sun.source.tree.BreakTree;

import java.util.Scanner;
public class SecondLargestElementOfArray {
    static int secondLargestElement(int[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[j] > array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 1; i < size; i++) {
            int max = array[0];
            if (array[i] < max)
                return array[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=scanner.nextInt();
        }
        int element=secondLargestElement(A);
        System.out.println(element);
    }
}
