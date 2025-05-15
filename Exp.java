/**
* Class for exponential function computations
* 
* @author Anika Kaur
*/
public class Exp extends SpecialFunction {
  
  // stores the operand for special functions
  private Function operand;
  
  // stores value for an exponential function
  private double expValue;
  
  /**
   * Constructor fot the cosine class
   * 
   * @param operand for exp function
   */
  public Exp(Function operand) {
    this.operand = operand;
  }
  
  
/**
 * Converts exponetial function to string
 * 
 * @return exponential function as a string
 */
  @Override
public String toString() {
  return "e^" + getOperand().toString();
}
  
  
  /**
   * Calculates derivative of exponential function
   * 
   * @return derivative of exponential function
   */
  public Function derivative() {
    return new Exp(operand);
  }
  
  /**
   * Calculates value of an exponential function
   * 
   * @param value input for exponential function
   * 
   * @return value of exponential function
   */
  public double value(double expValue) {
    return Math.exp(expValue);
  }
  
 /**
  * Throws an exception if no value put for value function
  * 
  * @throws unsupported operation exception if no value put in value method
  */
    public double value() {
     throw new UnsupportedOperationException("You need to enter something!");
    
  }
  
  
}