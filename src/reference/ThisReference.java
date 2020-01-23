package reference;

import java.util.function.Consumer;

public class ThisReference
{

    public void exectute( Object o, Consumer consumer)
    {
        consumer.accept(o);
    }

    public void excecute()
    {
        exectute(10L, i -> {
            System.out.println("Value of i is " + i);
            System.out.println(this);
        });
    }

    @Override
    public String toString()
    {
        return "ThisReference class is being called here";
    }

    public static void main(String [] args)
    {
        ThisReference reference = new ThisReference();

        reference.excecute();
    }
}
