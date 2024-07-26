

public class Main
{
    public static void main(String[] args)
    {
        // walk(50000);

        // int x = factorial(7);
        // System.out.println(x);

        int y = power(2, 8);
        System.err.println(y);

    }

    private static int power(int base, int exp)
    {
        if (exp < 1) return 1;
        return base * power(base, exp - 1);
    }

    // private static int factorial(int num)
    // {
    //     if (num < 1) return 1;
    //     else return num * factorial(num - 1);
    // }

    // private static void walk(int steps)
    // {
    //     if (steps < 1) return;
    //     System.out.println("you take a step");
    //     walk(steps - 1);
    // }


}
