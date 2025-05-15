/**
 * Class for doing computations with variables
 * 
 * @author Anika Kaur
 */
public class Variable extends Function {
  
/**
 * Constructor for the variable class
 */
  public Variable(){
  }
  
  /**
 * converts variable to string
 * 
 * @return variable as a string
 */
  @Override
  public String toString() {
    return "x";
  }
  
 /**
 * Class for doing computations with numbers
 * 
 * @param variable to compare the variable with
 * 
 * @return whether the variables are equal
 */
  @Override
  public boolean equals(Object o)  {
    if (o instanceof Variable)  {
      return true;
    }
    return false;
  }
  
  
  /**
   * Calculates the value of the variable based on input
   * 
   * @return value of the variable
   */
  public double value(double variableValue) {
    return variableValue;
  }
  
  /**
   * Throws an exception if value is called without input
   * 
   * @return unsupportedOperationException when there is no input
   */
  public double value()  {
    
    throw new UnsupportedOperationException("You need to enter something!");
    
  
  }
  
  
  /**
   * Calculates the derivative of the variable
   * 
   * @return derivative of the variable
   */
  public Function derivative() {
    return new Number(1);
  }
  
}