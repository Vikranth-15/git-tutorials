
public  class Horse extends Mammal{
	int speed;
	Horse(String name,int speed){
        //calling parent class constructor
		super(name); 
        //super must be the first statement
        //super is used to access parent class members
        //super.name=name;
        //constructor can call parent class constructor
        //using super()
        //super() must be the first statement in constructor
        //super.sleep();
		this.speed=speed;
	}
	void showName() {
		System.out.println("My name is "+ super.name);
	}
	void showSpeed() {
		System.out.println(name+" speed is "+ speed);
	}
	void eat() {
		System.out.println("Horse is eating");
	}
	void sleep() {
		System.out.println("Horse is sleeping");
	}
}