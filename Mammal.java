public  class Mammal {
	String name;

    //constriuctor
    //constructor name is same as class name
    //it is used to intialize the object
    //it is invoked at the time of object creation
    //it does not have return type
    //it can have parameters
    //if no constructor is defined in a class default constructor is provided by compiler
    //if constructor is defined in a class then default constructor is not provided by compiler
    //constructor overLoading is possible in java
    //constructor can be private,public,protected,default
    //constructor can not be final,abstract,static
    //constructor can not be inherited
    //constructor can call another constructor of same class using this()
    //constructor can call parent class constructor
    //using super()
    //super() must be the first statement in constructor
	Mammal(String name){
		this.name=name;
	}
	
	 void eat() {
		System.out.println("I am eating");
	}
	void sleep() {
		System.out.println("I am sleeping");
	}
}
