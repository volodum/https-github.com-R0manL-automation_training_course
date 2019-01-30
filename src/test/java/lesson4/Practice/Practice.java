package lesson4.Practice;


public class Practice {

//    //---Task 1--- Guess is it  a method, a constructor or something else? Does it valid/invalid code?
//    public void setValue (int value) {
//        //Body //METHOD
//    }
//
//    public String (int value) {
//        //Body //NO NAME OF METHOD
//    }
//
//    public int getValue () {
//        //Body //METHOD
//    }
//
//    public Practice() {
//        // Body //CONSTRUCTOR
//    }
//
//    public void Practice() {
//        //Body //WRONG VOID IS OBSOLETE
//    }
//
//    public static Practice() {
//        //Body  wrong no return type
//    }
//
//    public static practice() {
//        //Body //WRONG
//    }
//
//    public int practice() {
//        //Body //METHOD
//    }
//
//    public String practice() {
//        //Body //METHOD
//    }
//
//    public String rocket(int speed) {
//        //Body//METHOD
//    }
//
//    public int rocket(int speed, String Name) {
//        //Body +
//    }
//
//    public String rocket(int speed, String Name) {
//        //Body +
//    }
//
//    private static String rocket(int speed, String Name) {
//        //Body +
//    }
//
//    //---Task 2---
//    // Which of the following lines causes an error? (Line number are given as comments)
//    Practice() {
//    } // 1
//    public String Practice(int value) { // 2
//        //this(); // 3 invalid
//    }
//
//    public static void main(String[] args) { //4
//        Practice pr = new Practice(3); //5
//    }

//    //---Task 3--- what is output of this code?
//    public static void main (String[] args) {
//        B b = new B("1");
//        B c = b;
//        b = new B("3");
//        System.out.println("b.b1= " + b.b1);
//        System.out.println("c.b1= " + c.b1);
//    }
//
//    //---Task 4--- what is output of this code?
//    public static void main(String[] args) {
//        Vehicle a1, a2, a3;
//        a1=a2=a3= new Vehicle();
//
//        a1.speed = 1;
//        a2.speed = 2;
//
//        if (a1 == a2) {
//            System.out.println("Same.");
//        } else {
//            System.out.println("Different.");
//        }
//    }
//
//    //---Task 5--- what is output of this code? 3
//    public static void main (String[] args) {
//        A obj = new A();
//        System.out.println("X= " + obj.x);
//        obj.close();
//    }

//    //---Task 6--- what is output of this code?
//    public static void main (String[] args) {
//       C obj1 = new C();
//       C obj2 = new C();
//
//       C1 c1 = new C1();
//       C1 c2 = new C1();
//
//       c1.m(obj1);
//       c2.m(obj2);
//
//        System.out.println(obj1.x + obj2.x);
//    }

//    //---Task 7--- what is output of this code?
//    public static void main (String[] args) {
//        D d = new D();
//        d.attribute = 1;
//        update(d);
//        System.out.println(d.attribute);
//    }
//
//    static void update(D d1) {
//        d1 = new D();
//        d1.attribute = 2;
//    }
//
//    //---Task 8---
//    // Why "string builder" is more efficient then concatenating ("text" + "other text") strings?
//
//    //---Task 9---
//    // Rewrite code below using printf and formatting for 'names' and 'ages'.
//        public static void main (String[] args) {
//        String[] names = { "Bob", "Dirk", "Peter", "Siue", "Merry" };
//        int[] ages = { 34, 21, 5, 67, 44 };
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("My name is " + names[i] + ". I'm " + ages[i] + " years old.");
//            System.out.printf("My name is %s. I'm %s years old.%n", names[i],ages[i]);
//        }
//    }
//
//    //---Task 10--- Fill in the blank to create a function that does not return any value.
//    public static void myFunction(int x) {
//        System.out.println(x);
//    }

    //---Task 11--- what is output of this code?
    public static void main(String[] args) {
        E obj = new E(7);
        System.out.println(obj.b);
    }
}
