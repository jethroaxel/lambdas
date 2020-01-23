package reference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import exercise.Person;

public class Reference2
{
    public static void main(String [] args)
    {
        List<Person> people = Arrays.asList(
                new Person("Thorval", "Montero", 38),
                new Person("Jackie", "Molke", 29),
                new Person("Liza", "Hopkins", 25),
                new Person("Kelley", "Sucker", 31));

        //consumer will call take an implementation of accept  which is printing p argument.
        performConditionally(people, p -> true, System.out::println);// same as (p) -> method (p);

        //Thread t = new Thread(() -> printMessage());
        Thread t = new Thread(Reference2::printMessage);//same as above bc of () -> method()
        t.run();
    }

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

    private static void printMessage()
    {
        System.out.println("Message printed!!!");
    }
}
