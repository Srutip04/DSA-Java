package com.company;
import java.util.* ;


    public class Binary {
        public int binarySearch(int arr[], int l, int r, int x)
        {
            if (r>l)
            {
                int mid = (l + r) /2;

                // If the element is present at the
                // middle itself
                if (arr[mid] == x)
                    return mid;

                // If element is smaller than mid, then
                // it can only be present in left subarray
                if (arr[mid] > x)
                    return binarySearch(arr, l, mid, x);

                // Else the element can only be present
                // in right subarray
                return binarySearch(arr, mid+1, r, x);
            }

            // We reach here when element is not present
            //  in array
            return -1;
        }

        // Driver method to test above
        public static void main(String args[])
        {
            Binary ob = new Binary();
            int arr[] = {2,3,4,10,40,0,9,8,23};

            Arrays.sort(arr);

            int n = arr.length;
            int x = 8;
            int result = ob.binarySearch(arr,0,n-1,x);
            if (result == -1)
                System.out.println("Element not present");
            else
                System.out.println("Element found at index " +
                        result);
        }
    }



