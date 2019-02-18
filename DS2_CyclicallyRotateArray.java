package com.alight.ds1;


public class DS2_CyclicallyRotateArray
{

    public static void main(String[] args)
    {

        int arr[]= {1,2,3,4,5,6,7};
        cyclicallyRotate(arr,3,7);
        
        for(Integer data:arr)
            System.out.print(data+" ");
    }
    
    public static void cyclicallyRotate(int arr[],int d,int n)
    {
        for(int i=0;i<d;i++)
        {
            rotateRightOneByOne(arr,n);
        }
        
    }
    
    public static void  rotateRightOneByOne(int arr[],int n)
    {
       int temp;
       temp=arr[n-1];
        for(int j=n-1;j>0;j--)
        {
            arr[j]=arr[j-1];
            
            arr[j-1]=temp;
        }
    }
    
    
   
}
