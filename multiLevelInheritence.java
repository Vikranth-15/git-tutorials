class Animal{
    void sleep(){
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog{
    void weep(){
        System.out.println("Puppy is weeping");
    }
}
public class multiLevelInheritence {
    public static void main(String[] args) {
        Puppy p=new Puppy();
        p.weep();
        p.sound();
        p.sleep();
    }
}
