package cp03_numberanalyzer_mortada_a;

import java.util.Arrays;

public class NumberAnalyzer<T extends Number>
{
 
    private T[] numbers;
    
    // Constructor that accepts an array of numbers
    public NumberAnalyzer(T[] numbers)
    {
   this.numbers = numbers;     
        
    }
    
    // Method to get the highest number
    public T getHighestNumbers()
    {
        
     // sorts the array in ascending order
    Arrays.sort(numbers);
    
   // returns the last element in  the array
    return numbers[numbers.length -1];
    }
    
    // method to get the lowest number in the array
    public T getlowestNumbers()
    {
        //sorts the array in ascending order
       Arrays.sort(numbers);
       
       //returns the first element in the array
       return numbers[0];    
    }
    
    // method to get the total of all numbers in the array
    public double getTotalNumbers()
    {
    double total =0;
    // loop through the numbers in the array and add it to the total
    for(T number : numbers)
    {
       total += number.doubleValue();
    }
    //return the  total
    return total;
    
    }
    // method to get the average of all numbers
    
    public double getAverageNumbers(){
        
        //  total of all numbers divided by the length of the array
        return getTotalNumbers() / numbers.length;
    }
   
}