public class Base {
    public static void main(String[] args) {
        //upcasting 
        //Assigning a child class object to a parent class reference variable
        //upcasting invokes all the methods of parent class
        //but if the child class has overridden any method of parent class
        //then the child class method is invoked
         Mammal m=new Horse("Tommy",45); //upcasting
            m.eat();
            Horse h=new Horse("Shrie",69);
		h.eat();
		h.sleep();
		h.showName();
		h.showSpeed();
    }
    
}
