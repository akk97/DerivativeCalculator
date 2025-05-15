/**
 * Abstract class for special functions(log,exp,sine,cosine) that is part of the function heirarchy
 * 
 * @author Anika Kaur
 */

public abstract class SpecialFunction extends Function {
  
  // stores operand of the function
  private Function operand;
  
  
   /**
    * Class for doing computations with numbers
    * 
    * @return operand of the function
    */
  public Function getOperand() {
    return operand;
  }
    
  /**
   * Checks if two special functions are equal
   * 
   * @param special function to compare with
   * 
   * @return whether functions are equal
   */
    @Override
    public  boolean equals(Object o)  {
      
      //represents a special function
      SpecialFunction s = (SpecialFunction) o;
    if (this == o) {
      return true;
  }
    if (o == null || getClass() != o.getClass()) {
  return false;
  }
    return operand.equals(s.operand);
  }
  
}
  


  
  
  
  
