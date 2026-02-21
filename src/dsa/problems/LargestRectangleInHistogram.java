package dsa.problems;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class LargestRectangleInHistogram {
    private static int Solve(int[] heights) {
        int result = 0, currentBar, nearestSmallerLeft, nearestSmallerRight;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
                currentBar = stack.pop();
                nearestSmallerLeft = stack.isEmpty() ? -1 : stack.peek();
                nearestSmallerRight = i;
                result = Math.max(result, (nearestSmallerRight - nearestSmallerLeft - 1) * heights[currentBar]);
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            currentBar = stack.pop();
            nearestSmallerLeft = stack.isEmpty() ? -1 : stack.peek();
            nearestSmallerRight = heights.length;
            result = Math.max(result, (nearestSmallerRight - nearestSmallerLeft - 1) * heights[currentBar]);
        }
        return result;
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

            System.out.printf("Largest Rectangle In Histogram: %d", Solve(arr));
        } catch (Exception e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
        }
    }
}
