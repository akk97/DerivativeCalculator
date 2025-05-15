/**
* Class for represents all functions for the function calculator
* 
* @author Anika Kaur
*/
public abstract class Function {
 
 // represents value for value function
 private double value;
  
//abstract function for abstract class
 public abstract Function derivative();

  
  
/**
 * Abstract method for converting functions or operations to strings
 */
 public abstract String toString();

  
  /**
   * Abstract method for seeing if two functions or operations are equal
   * 
   * @param input is an object to compare
   */
 public abstract boolean equals(Object o);
  
 /**
  * Abstract method for calculating value
  * 
  * @param value for equals method
  */
 public abstract double value(double value);
  
 /**
  * Abstract method for calculating value for operations or functions
  */
  public abstract double value();
  
  
  
 
  
  
  
  
  
}