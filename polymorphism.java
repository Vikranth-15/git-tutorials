class Person{
    void work(){ //base class method
        System.out.println("Person is working"); //base class method implementation
    }
}

class Doctor extends Person{ //derived class
    void work(){ //overriding base class method
            System.out.println("Doctor is treating patients"); //derived class method implementation
        }
}

class Engineer extends Person{ //derived class
    void work(){ //overriding base class method
            System.out.println("Engineer is building bridges"); //derived class method implementation
        }
}


public class polymorphism {
    public static void main(String[] args) {
        Person p; //base class reference
        p=new Person(); //base class reference to base class object
        p.work(); //calls base class method
        p=new Doctor(); //base class reference to derived class object
        p.work(); //calls derived class method
        p=new Engineer(); //base class reference to derived class object
        p.work(); //calls derived class method
    }
}
