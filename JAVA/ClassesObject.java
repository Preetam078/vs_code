public class ClassesObject {
    public static void main(String[] args) {
        
        Person p1 = new Person(); // default constructor
        p1.age = 24;
        p1.name = "preetam";

        System.out.println(p1.age +" "+ p1.name);
        p1.walk();
        p1.walk(7);  //Passed Argument {Polymorphism}

        Person p2 = new Person(78,"mondal"); // constructor overloading

        System.out.println(p2.age +" "+ p2.name);
        p2.walk();
        p2.walk(12);  //Passed Argument {Polymorphism}

        System.out.println(Person.count);


        Developer d1 = new Developer(24, "programmer");
        d1.walk();
    }
}

class Developer extends Person { //Inheritance

    public Developer(int age, String name) { 
        super(age,name);  //use to call constructor of Parent class

    }
    void walk(){
        System.out.println("developer "+ name +" is walking");  //Run time polymorphism
    }
}

class Person { 
    String name;
    int age;

    static int count = 0; // it is a class property not object property
     
    public Person(){
        count++;
        System.out.println("created object");
    }

    public Person( int age,  String name) {
         this(); //use to call constructor within the constructor
        // name = Newname;
        // age = Newage;
        this.age = age;
        this.name = name; //another use this keyword
    }

    void walk(){
        System.out.println(name +" is walking");
    }

    void walk(int dis){
        System.out.println(name+ " is walked "+dis+" kilometer");
    }

}
