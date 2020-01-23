package collection;

import java.util.Arrays;
import java.util.List;

import exercise.Person;

public class ForClient
{
    public static void main(String [] args)
    {
        List<Person> people = Arrays.asList(
                new Person("Thorval", "Montero", 38),
                new Person("Jackie", "Molke", 29),
                new Person("Liza", "Hopkins", 25),
                new Person("Kelley", "Sucker", 31));

        printList(people);
    }

    public static void printList(List<Person> list)
    {
        list.forEach(System.out::println);
    }
}
