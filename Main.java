package motherChild;

import java.util.Vector;

/**
 * Created by hungt on 4/1/2017.
 */
public class Main {
    Vector<Person> allPeople = new Vector<Person>(0);

    public static void main(String[] args) {
        Main o = new Main();
        Person bob = o.createPerson("Bob", true);
        Person julie = o.createPerson("Julie", false);
        Person lara = o.createPerson("Lara", false);
        Person niv = o.createPerson("Niv", true);
        Person lola = o.createPerson("Lola", false);
        Person kevin = o.createPerson("Kevin", true);

        julie.addChild(lara);
        julie.addChild(bob);

        niv.addChild(lara);
        niv.addChild(bob);

        lara.addChild(lola);
        kevin.addChild(lola);

        o.printMothers();
    }

    public Person createPerson(String nameArg, boolean isMaleArg){
        Person createdPerson = new Person(nameArg, isMaleArg);
        this.allPeople.add(createdPerson);
        return createdPerson;
    }

    public void printMothers(){
        for(Person person : this.allPeople){
            if(person.getIsMale() && person.getChildren().size() > 0){
                //This person is a mother
                System.out.println("Hi, I'm a mother! My children are: ");
                for(Person child: person.getChildren()){
                    System.out.println(child.getName());
                }
            }
        }
    }

}
