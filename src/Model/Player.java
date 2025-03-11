package Model;

public class Player {


    private String name;
    private int balance;

    public Player(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public void updateBalance(int amount) {
        this.balance += amount;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void buyProperty(Property titleDeedCards) {
    }

    public void payRent(Player owner, Property titleDeedCards) {
    }

    public void isVisitingJail() {

    }

    public void sendToJail() {
    }
}
