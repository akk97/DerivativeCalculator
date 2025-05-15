/**
* Class for doing computations with cosine functions
* 
* @author Anika Kaur
*/
public class Cosine extends SpecialFunction {
  
  // operand for cosine class
  private Function operand;
  
  /**
   * Constructor for cosine class
   * 
   * @param operand for cosine function
   */
  public Cosine(Function operand)  {
    this.operand = operand;
  }
  
  /**
   * Converts sine function to a String
   * 
   * @return string form of sine function
   */
  @Override
public String toString() {
  return "cos(" + getOperand().toString() + ")";
}
  
    /**
     * Calculates value for cosine function
     * 
     * @param value for cosine function
     */
   public double value(double cosValue) {
    return Math.cos(cosValue);
  }
   
  /**
    * Throws an exception when value is called with parameters in cosine function
    * 
    * @throws unsupported operation exception for not having a value entered
    */
    public double value() {
     throw new UnsupportedOperationException("You need to enter something!");
    
  }
  
  
  
  
 /**
   * Class for doing computations with cosine functions
   * 
   * @return derivative of the cosine function
   */
  public Function derivative() {
    
    // stores derivative of the operand
     Function operandDerivative = operand.derivative();
     
     //stores negative one so that the function can be negated
     Function n1 = new Number(-1);
     
    return new BinaryOp(n1, BinaryOp.Op.MULT, operandDerivative);
  }
  
  
  
  
  
  
}