package org.howard.edu.lsp.midterm.question2;

public class RangeTester {

    public static void main(String[] args) {
        // Test case 1: Create two IntegerRange objects for testing
        IntegerRange range1 = new IntegerRange(5, 10);
        IntegerRange range2 = new IntegerRange(8, 15);

        // Test case 2: Test the contains method
        System.out.println("Test case 2:");
        System.out.println("range1 contains 7: " + range1.contains(7)); // Output: true
        System.out.println("range1 contains 12: " + range1.contains(12)); // Output: false
        System.out.println();

        // Test case 3: Test the overlaps method
        System.out.println("Test case 3:");
        System.out.println("range1 overlaps with range2: " + range1.overlaps(range2)); // Output: true
        System.out.println();

        // Test case 4: Test the size method
        System.out.println("Test case 4:");
        System.out.println("Size of range1: " + range1.size()); // Output: 6
        System.out.println("Size of range2: " + range2.size()); // Output: 8
        System.out.println();

        // Test case 5: Test the equals method
        System.out.println("Test case 5:");
        IntegerRange range3 = new IntegerRange(5, 10);
        System.out.println("range1 equals range3: " + range1.equals(range3)); // Output: true
        System.out.println();

        // Additional test cases
        System.out.println("Additional test cases:");
        // Test case 6: Range with negative values
        IntegerRange range4 = new IntegerRange(-10, -5);
        System.out.println("range4 contains -7: " + range4.contains(-7)); // Output: true
        System.out.println("range4 contains -12: " + range4.contains(-12)); // Output: false
        System.out.println("Size of range4: " + range4.size()); // Output: 6
        System.out.println();

        // Test case 7: Empty range
        IntegerRange range5 = new IntegerRange(20, 10);
        System.out.println("range5 contains 15: " + range5.contains(15)); // Output: false
        System.out.println("Size of range5: " + range5.size()); // Output: 0
        System.out.println();

        // Test case 8: Overlapping ranges with negative values
        IntegerRange range6 = new IntegerRange(-5, 5);
        System.out.println("range4 overlaps with range6: " + range4.overlaps(range6)); // Output: true
    }
}
