public class privateConstructors{
    //String model;
    String name;
//    private privateConstructors(String model){ //private constructor
//         //private constructor can not be accessed outside the class
//         //it can be accessed only within the class
//         //it is used in singleton class
//         //it is used in factory method design pattern
//         this.model=model;
//     }

    privateConstructors(String name){ //default constructor
        //default constructor can be accessed within the package
        //it can not be accessed outside the package
        //it is used to restrict access to the class
        //it is used in singleton class
        //it is used in factory method design pattern
        
        this.name=name;    
    }

    void display(int model){
        System.out.println("this model number is "+model);
    }

    public static void main(String[] args) {
        privateConstructors p=new privateConstructors("Tesla");
        p.display(2025);
    }
}