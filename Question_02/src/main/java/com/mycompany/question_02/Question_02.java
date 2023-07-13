package com.mycompany.question_02;
public class Question_02 
{

    public static void main(String[] args) 
    {
        try
        {
        int arr[]=new int[6];
        int value=arr[3];
        System.out.println("Last element= "+value);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: The array is out of bound");
        }
    }
}
