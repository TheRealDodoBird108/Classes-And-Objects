/*
We Dealt with classes before but just to put a main method in it
now we are going to use classes to use and create objets
Now what is OOP, (Object-Oriented Programming)
and how does it help?

OOP has many benefits such as:
1.OOP is faster and easier to execute
2.OOP provides a clear structure for the programs
3.OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
4.OOP makes it possible to create full reusable applications with less code and shorter development time

now how does Class and Object work?

Try to image this with me

You Have a class called Fruit and has various Objects such as a Apple and a Banana

Class:                  Object:
Fruits                  Apple, Banana, Mango

Car                     Volvo, Audi, Nissan, Toyota


That's basically it, this is the best way to think of classes and objects, and throughout the next programs you'll be
reading you should find no no difficulty making a class and creating and using objects in them.
*/ 
public class ClassesAndObjects1 {
    String Apple = "Apple"; // I made a String inside the class not inside the main method.
    String Mango = "Mango";
    String Avocado = "Avocado";

    int x = 5;
    int y = 1;
    public static void main(String[] args){

        ClassesAndObjects1 NewObj = new ClassesAndObjects1();//I now created an object, to be able to call the String that's inside the class
        System.out.println(NewObj.Apple + " " + NewObj.Mango);
        System.out.println(NewObj.x + NewObj.y); //Adding x and y
    }
}


