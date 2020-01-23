package exception;

import java.util.function.BiConsumer;

public class ExceptionInLambdas
{

    //takes a biconsumer that can be used directly or a wrapper if needed
    private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer)
    {
        for(int i: numbers)
        {
            consumer.accept(i, key);
        }
    }

    //wrapper to use try and catch exceptions.
    private static BiConsumer<Integer, Integer> wrapper(BiConsumer<Integer, Integer> consumer)
    {
        return (i, k) -> {
            try{
                consumer.accept(i, k);

            }catch(Exception e)
            {
                System.out.println("exception caught " + e.getLocalizedMessage());
            }
        };
    }

    public static void main(String [] args)
    {
        int [] numbers = {1, 2, 3, 4};
        int key = 0;

        //we pass the wrapper and inside the wrapper we pass the actual lambda.
        process(numbers, key, wrapper((i, k)-> System.out.println(i / k)));

    }
}
