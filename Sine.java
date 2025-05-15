/** 
 *  Class for doing computations with sine
 * 
 * @author Anika Kaur
 */
public class Sine extends SpecialFunction {
  
  //stores the operand of the sine function
  private Function operand;
  //stores the value of the operand of the sine function
  private double sinValue;
    
  /**
   * Constructor for the sine class
   * 
   * @param operand of the sine function
   */
  public Sine(Function operand)  {
    this.operand = operand;
  }
  
 /**
  * Converts a sine function to a string
  * 
  * @return the sine function as a string
  */
  @Override
public String toString() {
  return "sin(" + getOperand().toString() + ")";
}
  
  /**
   * Calculates the derivative of a sine function
   * 
   * @return the derivative of the sine function
   */
  public Function derivative() {
    return new Cosine(operand);
  }
  
  /**
   * Calculates the value of the sine function with input
   * 
   * @param value for sine function
   * 
   * @return value of the sine function
   */
   public double value(double sinValue) {
    return Math.sin(sinValue);
  }
   
   /**
    * Throws an exception when no value is entered
    * 
    * @throws the unsupportedOperationException when no vale is put in
    */
    public double value() {
     throw new UnsupportedOperationException("You need to enter something!");
    
  }
  
   
   
  
  
  
  
  
  
}