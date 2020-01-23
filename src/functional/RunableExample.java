package functional;

public class RunableExample
{

    public static void main(String[] args)
    {
        //this is bc Thread constructor takes a runnable and runnable interface has only one abstract method
        Thread lambdaThread = new Thread(()-> System.out.println("lambda thread"));
        lambdaThread.run();
    }
}
