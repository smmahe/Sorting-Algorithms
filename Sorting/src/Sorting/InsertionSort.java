package Sorting;

import java.io.InputStreamReader;
import java.util.Scanner;

public class InsertionSort 
{
  private  int elements[];
  private  Scanner input;
   
    public InsertionSort(int size)
    {
        elements = new int[size];   
        input = new Scanner(new InputStreamReader(System.in));
    }
    
    public void set()
    {
        for(int i = 0; i<elements.length; i++)
        {
            elements[i] = input.nextInt();
        }
    }
    
    
    public void display()
    {
        System.out.println("Sorted Order:");
        System.out.println();
        for(int i=0; i<elements.length; i++)
        {
            System.out.println(elements[i]);
            
        }
    }
    
    public void sort()
    {
        if(elements.length==1){
            System.out.println("Already Sorted");
            System.exit(1);
        }
        
        for(int i=1; i<elements.length; i++)
        {
            int key = elements[i];
            int j=i-1;
            
            while(j>=0 && elements[j] > key )
            {
                elements[j+1]=elements[j];
                j--;
                
            }
            elements[j+1]=key;
        
        }
    }
    
    
    public static void main(String[] args) 
    {
        System.out.println("1:Enter the number of elements:");
        Scanner in = new Scanner(new InputStreamReader(System.in));
        int n=in.nextInt();
        InsertionSort obj = new InsertionSort(n);
        obj.set();
        obj.sort();
        obj.display();
        
    }
}
