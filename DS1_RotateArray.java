package com.amresh.ds1;


public class DS1_RotateArray
{

  
    
    
  public static void main(String[] args)
  {
      int arr[]= {1,2,3,4,5,6,7};
      
      
      
      rotateArray(arr,2,7);
      
      for(Integer data:arr)
          System.out.print(data+" ");
  }
  
  
  public static void rotateLeftOneByOne(int arr[], int n)
  {
      
      int temp;
      
      temp=arr[0];
      
      for(int j=0;j<n-1;j++)
      {
          
          arr[j]=arr[j+1];
          arr[j+1]=temp;
      }
      
      
  }
  
  
  public static void rotateArray(int arr[],int d,int n)
  {
      
      for(int i=0;i<d;i++)
      {
         rotateLeftOneByOne(arr,n); 
      }
      
  }

}
