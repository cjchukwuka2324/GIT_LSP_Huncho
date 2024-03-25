package org.howard.edu.lsp.midterm.question2;

/**
 * Defines the contract for a range of values.
 */
public interface Range {

    /**
     * Checks if the range contains the specified integer value.
     *
     * @param value the integer value to check
     * @return true if the value is contained within the range, false otherwise
     */
    boolean contains(int value);

    /**
     * Checks if this range overlaps with another range.
     *
     * @param other the range to check for overlap with
     * @return true if there is an overlap, false otherwise
     */
    boolean overlaps(Range other);

    /**
     * Calculates and returns the size of the range.
     *
     * @return the size of the range
     */
    int size();
}
