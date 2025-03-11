package Model;

import java.util.Random;

public class Dice {
    private final Random random;
    private int die1;
    private int die2;
    private boolean isDouble;
    private int totalDoubles = 0;

    public Dice() {
        this.random = new Random();
        roll(); // Initialize dice with a roll
    }

    /**
     * Rolls two six-sided dice.
     * Updates the dice values and checks if it's a double.
     */
    public void roll() {
        die1 = random.nextInt(6) + 1; // Generates a number between 1 and 6
        die2 = random.nextInt(6) + 1;
        isDouble = die1 == die2;
        if (isDouble) {
            totalDoubles++;
        } else {
            totalDoubles = 0;
        }
    }

    /**
     * Returns the sum of both dice.
     * @return the total roll value.
     */
    public int getTotal() {
        return die1 + die2;
    }

    /**
     * Checks if the player rolled a double.
     * @return true if both dice have the same value, false otherwise.
     */
    public boolean isDouble() {
        return isDouble;
    }

    /**
     * Gets the value of the first die.
     * @return the value of die1.
     */
    public int getDie1() {
        return die1;
    }

    /**
     * Gets the value of the second die.
     * @return the value of die2.
     */
    public int getDie2() {
        return die2;
    }

}