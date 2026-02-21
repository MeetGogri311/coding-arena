package dsa.problems;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
    private static ArrayList<Integer> Solve(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        result[arr.length - 1] = -1;
        stack.push(arr[arr.length - 1]);
        for (int i = arr.length - 2; i >= 0; i--) {
            while (!stack.empty() && stack.peek() <= arr[i]) stack.pop();
            if (stack.empty()) result[i] = -1;
            else result[i] = stack.peek();
            stack.push(arr[i]);
        }
        ArrayList<Integer> nge = new ArrayList<>();
        for (int i : result) nge.add(i);
        return nge;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Array Length: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.print("Input Array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            ArrayList<Integer> nge = Solve(arr);

            System.out.print("Next Greater Element: ");
            for (Integer val : nge) System.out.printf("%d ", val);

        } catch (Exception e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
        }
    }
}
