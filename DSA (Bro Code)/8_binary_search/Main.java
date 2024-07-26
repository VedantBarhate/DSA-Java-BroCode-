// import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int arr[] = new int[10000000];
        int target = 78463;

        for (int i=0; i<arr.length; i++)
        {
            arr[i] = i;
        }
        int ind = binSearch(arr, target);
        System.err.println("Index is " + ind);
    }

    private static int binSearch(int[] arr, int target)
    {
        int low = 0;
        int high = arr.length -1;

        while (low <= high)
        {
            int mid = low + (high - low)/2;
            int val = arr[mid];
            if (val < target)
                low = mid +1;
            else if  (val > target)
                high = mid -1;
            else 
                return mid;
        }
        return -1;
    }
    
}