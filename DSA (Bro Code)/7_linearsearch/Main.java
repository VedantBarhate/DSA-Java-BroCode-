public class Main 
{
    public static void main(String[] args)
    {
        int[] arr = {4,5,2,8,6,1,3,7,9};

        int ind = linearSearch(arr, 8);

        System.out.println("Index is " + ind);

    }

    private static int linearSearch(int[] arr, int val)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == val)
            {
                return i;
            }
        }        
        return -1;
    }
}
