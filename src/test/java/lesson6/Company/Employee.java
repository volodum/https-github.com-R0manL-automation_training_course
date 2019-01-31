package lesson6.Company;


public class Employee {

    protected int money;

    public void paySalary(int value) {
        System.out.println("Add " + value + " to my balance.");
        this.money += value;
    }

    public int getAmountOfMoney() {
        System.out.println("I have= " + money);
        return this.money;
    }
}
