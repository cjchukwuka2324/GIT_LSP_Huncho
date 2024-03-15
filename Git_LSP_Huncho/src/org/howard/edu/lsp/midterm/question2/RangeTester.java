package org.howard.edu.lsp.midterm.question2;

public class RangeTester {
    public static void main(String[] args) {
        // Create IntegerRange instances
        IntegerRange range1 = new IntegerRange(1, 10);
        IntegerRange range2 = new IntegerRange(5, 15);
        IntegerRange range3 = new IntegerRange(20, 30);

        // Test contains method
        System.out.println("Range 1 contains 5: " + range1.contains(5)); // true
        System.out.println("Range 1 contains 15: " + range1.contains(15)); // false

        // Test overlaps method
        System.out.println("Range 1 overlaps with Range 2: " + range1.overlaps(range2)); // true
        System.out.println("Range 1 overlaps with Range 3: " + range1.overlaps(range3)); // false

        // Test size method
        System.out.println("Size of Range 1: " + range1.size()); // 10

        // Test equals method
        IntegerRange range4 = new IntegerRange(1, 10);
        System.out.println("Range 1 equals Range 4: " + range1.equals(range4)); // true
    }
}




