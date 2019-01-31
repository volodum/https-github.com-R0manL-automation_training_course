package lesson6;

import lesson6.Company.JuniorQA;
import lesson6.Company.QA;


public class _1_Inheritance {

    public static void main(String[] args) {
        QA qa1 = new QA();
        qa1.paySalary(5);
        qa1.getAmountOfMoney();

        System.out.println("My position= " + qa1.getMyAssignment());

        JuniorQA jQA1 = new JuniorQA();
        System.out.println(jQA1.getMyAssignment());
    }
}
