class Vikky{
    //class is a blueprint of an object
    //class is a user defined data type
    //class is a collection of objects
    //class is a collection of variables and methods

    //class is a collection of attributes and behaviors
    
    //attributes are the properties of the class
    //behaviors are the actions of the class
    //attributes are represented by variables
    //behaviors are represented by methods

    //class is a template for creating objects
    
    //class is a user defined data type
    //class is a collection of objects
    String name; //instance variable
    int age; //instance variable also known as non-static variable

    //constructor is a special method that is used to initialize the instance variables
       public Vikky(String name,int age){
            this.name=name;
            this.age=age;
        }

        public void display(){
            System.out.println(name+" "+age);
        }

        public static void main(String[] args){
            Vikky v=new Vikky("vikranth",23);
            v.display();
        }


}