package com.amresh.ds1;


public class DS4_PairInSortedRotated
{

    public static void main(String[] args)
    {
        int arr[]= {11, 15, 6, 7, 9, 10};
        
       System.out.println(pairInSortedRotated(arr, arr.length, 16));

    }
    
    
    
    static int pairInSortedRotated(int arr[],  int n, int x)
    {
        int i; 
        for (i = 0; i < n - 1; i++) 
            if (arr[i] > arr[i+1]) //checking like 10>11 false,11>15 false,15>6 true then break now start sorted sub array
                break;
        
        int l=(i+1)%n;
        int r=i;
        
        int count=0;

        
        
        while (l != r) 
        { 
            // If we find a pair with  
            // sum x, then increment  
            // cnt, move l and r to  
            // next element. 
            if (arr[l] + arr[r] == x) 
            { 
                count++; 
                  
                // This condition is required  
                // to be checked, otherwise  
                // l and r will cross each  
                // other and loop will never  
                // terminate. 
                if(l == (r - 1 + n) % n) 
                { 
                    return count; 
                } 
                  
                l = (l + 1) % n; 
                r = (r - 1 + n) % n; 
            } 
      
            // If current pair sum  
            // is less, move to  
            // the higher sum side. 
            else if (arr[l] + arr[r] < x) // then l move right becuase  this is checked sorted sub array higher value lies right side becuase this is sorted(increasing order) subarr
                l = (l + 1) % n; 
              
            // If current pair sum  
            // is greater, move  
            // to the lower sum side. 
            else// //here checked second sub array this is not sorted order (decresing order) so higher value lies left side so subtract 1 from r and add n becoze n%n ==0 so no effect
                r = (n + r - 1) % n; 
        } 
        
        
        
       
        
        
        
        return count;
    }

}
