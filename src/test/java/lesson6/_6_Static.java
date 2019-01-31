package lesson6;


// class User {
//    public String name; //instance variable
//    public static int numberOfUsers; //class variable
//}
//
//public class _6_Static {
//
//    public static void main(String[] args) {
//        User user1 = new User();
//        User user2 = new User();
//
//        user1.name = "Bob";
//        user2.name = "Siu";
//
//        System.out.println("1st user's name= " + user1.name);
//        System.out.println("2d  user's name= " + user2.name);
//
//        user1.numberOfUsers++;
//        System.out.println("1st animal's age= " + user1.numberOfUsers);
//        user2.numberOfUsers++;
//        System.out.println("2d  animal's age= " + user2.numberOfUsers);
//    }
//}
//
//class User {
//    public String name;  //instance variable
//    public static int numberOfUsers; //class variable
//
//    public User() {
//        numberOfUsers++;
//    }
//}
//
//public class _6_Static {
//    public static void main(String[] args) {
//        User user1 = new User();
//        System.out.println("Number of users (from 1st user)= " + user1.numberOfUsers);
//        User user2 = new User();
//        System.out.println("Number of users (from 2d  user)= " + user2.numberOfUsers);
//    }
//}

class User {
    public String name;  // instance variable
    public static int numberOfUsers; // class variable

    public User() {
        numberOfUsers++;
    }

    // class method
    public static void getNumberOfUsers() {
        // class method can work with class variable
        System.out.println("Number of users= " + numberOfUsers);
        // class method can't work with instance variable
//        System.out.println(name);
    }
}

public class _6_Static {
    public static void main(String[] args) {
//        User user1 = new User();
//        User user2 = new User();

        User.getNumberOfUsers();

        System.out.println("Random number= " + Math.random());
    }
}
