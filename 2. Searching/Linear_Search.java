import java.util.*;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = { 11, 2, 9, 16, 25 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element you want to search : ");
        int key = sc.nextInt();
        boolean flag = false;
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                flag=true;
                break;
            }
        }
        if (flag == true)
            System.out.println("ELement found at index : "+ i);
        else
            System.out.println("Element not found.");


    }
}