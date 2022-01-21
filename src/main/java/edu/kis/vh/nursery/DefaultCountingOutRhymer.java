package edu.kis.vh.nursery;

/**
 * Simple stack implementation
 */
public class DefaultCountingOutRhymer {

    private static final int AMOUNT_OF_NUMBERS = 12;
    private static final int FULL = 11;
    private static final int EMPTY_TABLE = -1;
    private final int[] numbers = new int[AMOUNT_OF_NUMBERS];
    private int total = EMPTY_TABLE;

    /**
     * @return total value of stack
     */
    public int getTotal() {
        return total;
    }


    /**
     * Put element on the stack
     * @param in value to put on the stack
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Check if stack is empty
     * @return true if stack is empty false if not
     */
    public boolean callCheck() {
        return total == EMPTY_TABLE;
    }

    /**
     * Check if stack is full
     * @return true if stack is full false if not
     */
    public boolean isFull() {
        return total == FULL;
    }

    /**
     * Returns top element of the stack
     * @return last element of the stack
     */
    protected int peekaboo() {
        if (callCheck())
            return EMPTY_TABLE;
        return numbers[total];
    }

    /**
     * Pop element from the stack
     * @return last element of the stack
     */
    public int countOut() {
        if (callCheck())
            return EMPTY_TABLE;
        return numbers[total--];
    }

}
