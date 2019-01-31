package lesson6;

import lesson6.Company.JuniorQA;
import lesson6.Company.MidQA;
import lesson6.Company.QA;
import lesson6.Company.SeniorQA;


public class _2_Polymorphism {

    //Car is a machine, car extends

    public static void main(String[] args) {

        QA[] teamOfQAs = { new JuniorQA(), new MidQA(), new SeniorQA(), new JuniorQA() };

        System.out.println("- Array of QAs -");
        for (int i = 0; i < teamOfQAs.length; i++) {
            System.out.println("I'm " + teamOfQAs[i].getMyAssignment());
        }
    }
}
