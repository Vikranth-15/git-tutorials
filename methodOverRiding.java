class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal
{
    void sound(){
        System.out.println("Dog barks");
    }
}

//method overriding
//when a child class has the same method as the parent class
//it is known as method overriding
//it is used to provide specific implementation of a method
//that is already provided by its parent class
//it is used to achieve runtime polymorphism
//it is done by defining a method in child class
//with the same name,return type and parameters as in parent class

public class methodOverRiding {
    public static void main(String[] args) {
        Animal a=new Animal(); // creating Animal object
        a.sound(); // calls Animal's sound method
        Dog d=new Dog(); // creating Dog object
        d.sound(); // calls Dog's sound method
        Animal a1=new Dog(); //upcasting
        a1.sound(); // calls Dog's sound method due to method overriding

        //Output: 
        //Animal makes a sound
        //Dog barks
        //Dog barks
    }

}
