import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Excercise {
    public static void main(String[] args) {
        List<Person> people= Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Caroll", 42),
                new Person("Thomas", "Carylyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        //Step 1: Sort list by last name
        Collections.sort(people, (p1, p2) ->  p1.getLastName().compareTo(p2.getLastName()));

        //Step 2: Create a method that prints all elements in the list
        printConditionally(people, p-> p.getLastName().startsWith(""));

        //Step 3: Create a method that prints all people that have last name beginning with C
       /* printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("C");
            }
        });

        */
        printConditionally(people, p-> p.getLastName().startsWith("C"));
    }

    private static void printConditionally(List<Person> people, Condition condition){
        for (Person p : people) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }
    }

    private static void printAll(List<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }
}

interface Condition{
      boolean test(Person p);
}
