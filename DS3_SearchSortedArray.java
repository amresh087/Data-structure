package com.amresh.ds1;


public class DS3_SearchSortedArray
{

    public static void main(String[] args)
    {
      int arr[] = {4, 5, 6, 7, 8, 9, 1, 2, 3}; 
      
      int n=arr.length;
      int key=7;
      int l=0;
      int r=n-1;
      int i=searchData(arr,l,r,key);
      
      if(i!=-1)
      System.out.println("index "+i+"  value  "+arr[i]);
      else
          System.out.println("Not present  "+i);  

    }
    
    
    
    public static int searchData(int arr[],int l,int r,int key)
    {
        if(l>r)
            return -1;
        
        
        int mid=(l+r)/2;
        
        if(arr[mid]==key)
            return mid;
        //if array is sorted arr[l].......arr[mid-1]
        if(arr[l]<= arr[mid])
        {
            
            if(key>=arr[l] && key<=arr[mid])
                return searchData(arr,l,mid-1,key);
            return searchData(arr,mid+1,r,key);
            
            
            
        }
        //if array is not sorted
        if(key>=arr[mid] && key<=arr[r])
            return searchData(arr,mid+1,r, key);
        return searchData(arr, l, mid-1, key);
        
        
        
    }
    
    
    
    
    

}
