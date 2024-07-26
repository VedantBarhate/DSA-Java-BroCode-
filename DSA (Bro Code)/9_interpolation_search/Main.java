
public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,4,5,8,9,12,14,16,19,20,22};

        int ind = interpolationSearch(arr, 12);

        System.out.println("index is " + ind);
    }

    private static int interpolationSearch(int[] arr, int val)
    {
        int high = arr.length - 1;
        int low = 0;

        while (val >= arr[low] && val <=arr[high] && low <= high)
        {
            int probe = low + (high-low)*(val - arr[low]) / 
                        (arr[high] - arr[low]);

            System.out.println("probe: " + probe);

            if (arr[probe] == val)
            {
                return probe;
            }
            else if (arr[probe] < val)
            {
                low = probe + 1;    
            }
            else
            {
                high = probe - 1;
            }
        }
        return -1;
    }

}
