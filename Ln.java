/**
* Class for doing computations with ln functions
* 
* @author Anika Kaur
*/
public class Ln extends SpecialFunction {
  
  // represents operand for ln class
   private Function operand;
  
  /**
   * Constructor for ln functions
   * 
   * @param operand for ln function
   */
  public Ln(Function operand) {
    this.operand = operand;
  }
  
  /**
   * Converts ln functions to String
   * 
   * @return ln function as String
   */
  @Override
public String toString() {
  return "ln(" + getOperand().toString() + ")";
}
  
  /**
   * Calculates derivative of ln function
   * 
   * @return derivative of ln function
   */
  public Function derivative() {
    return operand;
  }
  
  /**
   * Calculates value of ln function
   * 
   * @returns value of ln function
   */
  public double value(double lnValue) {
    return Math.log(lnValue);
  }
  
 /**
  * Calculates value of ln function
  * 
  * @throws unsupported operation exception for not entering a value
  */
    public double value() {
     throw new UnsupportedOperationException("You need to enter something!");
    
  }
  
  
  
  
  
  
  
}