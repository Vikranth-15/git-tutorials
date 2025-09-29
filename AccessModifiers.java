class Demo {
    private int a=10; //private access modifier
    //private members are accessible only within the class
    //try to access private member outside the class
    //gives compile time error

}
class Test{
    protected int b=15; //protected access modifier
    //protected members are accessible within the package
    //and outside the package using inheritance
    //subclass in different package can access protected member

    public int c=12;
    //public members are accessible from anywhere
    //if a member is declared public it can be accessed from
    //any other class
    int d=14; //default access modifier
    //default members are accessible only within the package
    //if a member is declared default it can be accessed
    //only by classes in the same package
    //it is not accessible from outside the package
}
public class AccessModifiers {
    public static void main(String[] args) {
        Demo obj=new Demo();
        Test t=new Test();
        System.out.println(t.b);
        System.out.println(t.d);
       // System.out.println(obj.a);
    }
}
