public class Main
{

    public static void countString(String s, Counter counter)
    {
        System.out.println(counter.count(s));
    }

    public static void main(String[] args)
    {
        printString printString = () -> System.out.println("Count me bitch!");
        printString.print();

        Counter c = s -> s.length();
        countString("Count me bitch!",  c); // you pass the whole Counter BEHAVIOR, soyou can store it in a variable
//        countString("Count me bitch!", new Counter()
//        {
//            @Override
//            public int count(String s)
//            {
//                return s.length();
//            }
//        });

    }
}

@FunctionalInterface
interface printString
{
    void print();
}

@FunctionalInterface
interface Counter
{
    int count(String s);
}

