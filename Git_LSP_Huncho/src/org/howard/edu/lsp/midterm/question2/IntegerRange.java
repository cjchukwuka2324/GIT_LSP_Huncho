package org.howard.edu.lsp.midterm.question2;

/**
 * Represents a range of integers defined by a lower bound (inclusive) and an upper bound (inclusive).
 */
public class IntegerRange implements Range {

    private Integer lowerBound; // The lower bound of the integer range
    private Integer upperBound; // The upper bound of the integer range

    /**
     * Constructs an IntegerRange with the specified lower and upper bounds.
     *
     * @param lowerBound the lower bound of the range (inclusive)
     * @param upperBound the upper bound of the range (inclusive)
     */
    public IntegerRange(Integer lowerBound, Integer upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    /**
     * Checks if the specified integer value is within the range.
     *
     * @param value the integer value to check
     * @return true if the value is within the range, false otherwise
     */
    @Override
    public boolean contains(int value) {
        return value >= this.lowerBound && value <= this.upperBound;
    }

    /**
     * Checks if this range overlaps with another range.
     *
     * @param other the range to check for overlap with
     * @return true if there is an overlap, false otherwise
     */
    @Override
    public boolean overlaps(Range other) {
        if (other == null) {
            return false;
        }
        IntegerRange otherRange = (IntegerRange) other;
        return this.lowerBound <= otherRange.upperBound && this.upperBound >= otherRange.lowerBound;
    }

    /**
     * Calculates and returns the size of the range.
     *
     * @return the size of the range
     */
    @Override
    public int size() {
        return this.upperBound - this.lowerBound + 1;
    }

    /**
     * Compares this IntegerRange with the specified object for equality.
     *
     * @param o the object to compare with
     * @return true if the specified object is equal to this range, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof IntegerRange)) {
            return false;
        }
        IntegerRange otherRange = (IntegerRange) o;
        return this.lowerBound.equals(otherRange.lowerBound) && this.upperBound.equals(otherRange.upperBound);
    }
}
