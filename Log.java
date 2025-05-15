/**
* Abstract class for special functions(log,exp,sine,cosine) that is part of the function heirarchy
* 
* @author Anika Kaur
*/
public class Log extends SpecialFunction  {
  
  // represents the operand of a log function
  private Function operand;
  
  /**
   * Constructor for the log class
   * 
   * @param operand for log class
   */
  public Log(Function operand) {
    this.operand = operand;
  }
  
  /**
   * Converts log function to a string
   * 
   * @return log function as a string
   */
  @Override
public String toString() {
  return "log(" + getOperand().toString() + ")";
}
  
   /**
    * Calculates the derivative of the log function
    * 
    * @return derivative of the log function
    */
  public Function derivative() {
    return new BinaryOp(new Number(1), BinaryOp.Op.DIV, new Ln(operand));
  }
  
  /**
   * Calculates the value of the log function
   * 
   * @return the value of the log function
   */
  public double value(double logValue) {
    return Math.log(logValue);
  }
  
 /**
  * Throws an exception if no input is given for value
  * 
  * @throws unsupportedOperationException when a value is not put in
  */
    public double value() {
     throw new UnsupportedOperationException("You need to enter something!");
    
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
}