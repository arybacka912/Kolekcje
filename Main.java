package pl.bae.kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("jeden");
        stringList.add("dwa");
        stringList.add("trzy");

        stringList.size();
        stringList.isEmpty();
        stringList.remove(1);
        stringList.get(1);

        Person person = new Person("Jan", "Kowalski", 1);
        Person person2 = new Person("Ania", "Perska", 2);

        List<Person> personalList = new ArrayList<Person>();
        personalList.add(person);
        personalList.add(person2);

        for (Person p : personalList) {
            System.out.println(p.getName());

        }
    }
}
