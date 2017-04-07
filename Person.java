package motherChild;

import java.util.Vector;

/**
 * Created by hungt on 4/1/2017.
 */
public class Person {
    private String name = "";
    private boolean isMale = false;
    private Vector<Person> children = new Vector<Person>(0);

    public Person (String nameArg, boolean isMaleArg) {
        this.name = nameArg;
        this.isMale = isMaleArg;
    }

    public String getName(){
        return this.name;
    }

    public boolean getIsMale(){
        return this.isMale;
    }

    public Vector<Person> getChildren(){
        return this.children;
    }

    //Prints info about person
    public void speak(){
        String gender = this.isMale ? "male" : "female";
        System.out.println("Hello, my name is " + this.name + " and I am " + gender + ".");
    }

    //Prints person's children
    public void printChildren(){
        System.out.println("My children are ");
        for (Person child : this.children) {
            System.out.println(child.name);
        }
    }

    //Creates a clone of the person
    public Person clone(){
        Person clone = new Person(this.name, this.isMale);
        clone.children = this.children;
        return clone;
    }

    public void addChild(Person childObject){
        this.children.add(childObject);
    }
}
