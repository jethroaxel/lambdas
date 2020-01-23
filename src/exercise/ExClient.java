package exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ExClient
{
    public static void main(String [] args)
    {
        List<Person> people = Arrays.asList(
                new Person("Thorval", "Montero", 38),
                new Person("Jackie", "Molke", 29),
                new Person("Liza", "Hopkins", 25),
                new Person("Kelley", "Sucker", 31));

        // sort list by last name java7
//        Collections.sort(people, new Comparator<Person>()
//        {
//            @Override
//            public int compare(Person p1, Person p2)
//            {
//                return p1.getLastName().compareToIgnoreCase(p2.getLastName());
//            }
//        });

        // sort list by last name java8
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareToIgnoreCase(p2.getLastName()));


        //create method that prints all elements in the list
        System.out.println("The whole list: ");
        performConditionally(people, p -> true, p -> System.out.println(p.toString())); //prints all no matter what bc argument p is passed and the function testCondition is returning always true.


        //create method that prints all ppl that have last name beginning with m
        System.out.println();
        System.out.println("People whose last name start with M ");
        performConditionally(people, p -> p.getLastName().toLowerCase().startsWith("m"), p -> System.out.println(p.toString()));
    }

    //now the method can perform whatever behavior we give to it instead of just printing.
    private static void performConditionally(List<Person> people, Predicate<Person> condition, Consumer<Person> consumer)
    {
        for(Person p: people)
        {
            if (condition.test(p))
            {
                consumer.accept(p);
            }
        }
    }

    /*
    For other useful lambda conditions, we have other interfaces: Supplier which takes not arg and returns an obj, and Function which takes and arg and returns a result, consumer takes arg and returns void
     */

//    public interface Condition{
//        boolean testCondition(Person p);
//    }

}
