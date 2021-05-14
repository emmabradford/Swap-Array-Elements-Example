
/**
 * Write a description of class Example here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Example
{
    public static void main(String[] args)
    {
        int[] numbers = {5, 9, 7, 3, 4, 2, 8};
        System.out.println("before mystery call");
        for(int number : numbers)
        {
            System.out.print(number + " ");
        }
        System.out.println("");
        mystery(numbers, 3, 5);
        System.out.println("after mystery call");
        for(int number : numbers)
        {
            System.out.print(number + " ");
        }
    }

    private static void mystery(int[] a, int x, int y)
    {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

}
