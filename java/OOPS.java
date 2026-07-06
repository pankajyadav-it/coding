// class Pen{
//     String color;
//     String type; //ballpoint gel
//     public void write(){
//         System.out.println("writing something");
//     }
// }
// public class OOPS {
//     public static void main(String[] args) {
//         Pen pen1 = new Pen();
//         pen1.color = "blue";
//         pen1.type = "gel";
//         pen1.write();
//     }
// }




// 2nd code
//Now Use in java This keyword
// class Pen{
//     String color;
//     String type; //Es method ko color print krane ke liye rakhna hai
//     public void printColor(){
//         System.out.println(this.color); //This yha current object ko refer kr rha hai
//     }
// }
// public class OOPS{
//     public static void main(String args[]){
//         Pen pen1 = new Pen();
//         pen1.color = "blue";
//         pen1.type = "gel";
//         Pen pen2 = new Pen();
//         pen2.color = "black";
//         pen2.type = "ballpoint";
//         pen1.printColor();
//         pen2.printColor();
//     }
// }



//3rd code
// class Student{
//     String name;
//     int age;
//     public void printInfo(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }
// }
// public class OOPS{
// public static void main(String args[]){
//     Student s1 = new Student();
//     s1.name = "pankaj";
//     s1.age = 21;
//     s1.printInfo();

// }
// }




//4th code
//Parameterized constructor
// class Student{
//     String name;
//     int age;
//     //method to print Student information
//     public void printInfo(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }
//     //Parameterized constructor
//     Student(String name,int age){
//         this.name = name;
//         this.age = age;
//     }
// }
// public class OOPS{
//     public static void main(String[] args) {
//         //Creating object and initializing values using constructor
//         Student s1 = new Student("Pankaj",21);
//         s1.printInfo();
//     }
// }





//5th Code
// Copy constructor
class Student{
    String name;
    int age;
    public void printInfo(){
    System.out.println(this.name);
    System.out.println(this.age);
    }
    //Parameterized constructor
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    // Copy constructor
    Student (Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
}
public class OOPS{
    public static void main(String args[]){
        //Parameterized constructor
        Student s1 = new Student("Pankaj",21);
        //New object jisme s1 copy ho rha
        Student s2 = new Student(s1);
        // s1 ka data print hoga
        s1.printInfo();
        System.out.println("--Copy hone ke bad--");
        // s2 ka data print
        s2.printInfo();

    }

}