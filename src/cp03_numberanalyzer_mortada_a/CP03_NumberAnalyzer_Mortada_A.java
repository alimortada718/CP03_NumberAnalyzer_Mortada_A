/*
 *  Application Title:
 * Author: Ali Mortada
 * Keene State College Computer Science
 * Date:3/2023
 * class:CS-280-01-SP23
 */
package cp03_numberanalyzer_mortada_a;

/*Description
Write a generic class with a type parameter constrained to the Number class or any subclass of Number. 
The constructor should accept an array of such objects.
The class should have methods that return the highest and lowest values in the array,
the total of the elements, and the average value of all the elements. Demonstrate the class in an application.
*/
public class CP03_NumberAnalyzer_Mortada_A {

    
    public static void main(String[] args) 
    {
        // create an array of integer objects
    Integer[] numbers = {2,5,9,1,3,6};
    
    // creating a new instance
    NumberAnalyzer<Integer> analyzer = new NumberAnalyzer<> (numbers);
    
    // prints the highest,lowest,total,average numbers in the array
    System.out.println("Highest number: " + analyzer.getHighestNumbers());
     System.out.println("Lowest number: " + analyzer.getlowestNumbers());
     System.out.println("Total: " + analyzer.getTotalNumbers());
     System.out.println("Average: " + analyzer.getAverageNumbers());
     
    }
    
}
