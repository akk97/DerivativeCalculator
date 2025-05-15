/**
 * Class for binary operations using +,-,/,*
 * 
 * @author Anika Kaur
 */
public class BinaryOp extends Function {
  
  // field stores left operand
  private Function leftOperand;
  
  //field stores right operand;
  private Function rightOperand;
  
  //field stores operator
  private char operator;
  
  //field stores operator in string form
  private String operatorString;
  
  //field stores result when value is put in
  private double valueResult;
  
  /** 
   * Enum for binary symbols
   */ 
   public enum Op  {
   PLUS('+'), SUB('-'), MULT('*'), DIV('/');
   
      //stores symbol for operator
      private char symbol;
    
    Op(char symbol) {
      this.symbol = symbol;
    }
    
   /**
    * Method to get symbol
    * 
    * @return symbol of the operation
    */
    public char getSymbol() {
      return symbol;
    }
  
    
  }
  

  
/** 
 * Constructor for BinaryOp that takes input for operator,left operand,right operand
 * 
 * @param left operand of operation
 * 
 * @param right operand of operation
 * 
 * @param operator of operation
 */
  public BinaryOp(Function leftOperand, Op operator, Function rightOperand)  {
    
   this.leftOperand = leftOperand;
   this.operator = operator.getSymbol();
   this.rightOperand = rightOperand;
   
  }
  
  
  
  /**
   * Getter for left operand 
   * 
   * @return left operand
   */
  public Function getLeftOperand() {
    return leftOperand;
  }
  
   /**
    * Getter for right operand 
    * 
    * @return right operand
    */
  public Function getRightOperand() {
    return rightOperand;
  }
  
   /**
    * Getter for operator
    * 
    * @return operator
    */
  public char getOperator()  {
    return operator;
  }
  
  
  
 
  
  
 /** 
  * Method to see if the binary op paramters of two objects are equal
  * 
  * @param binaryOp to compare to
  * 
  * @return whether parameters are equal
  */
  @Override
  public boolean equals(Object o)  {
    if (this == o) {
        return true;
    }
    if (o instanceof BinaryOp) {
        BinaryOp other = (BinaryOp) o;
        return this.leftOperand.equals(other.leftOperand) && this.rightOperand.equals(other.rightOperand) && this.operator == other.operator;
    }
    return false;
  }
  
 /** 
  * ToString method to convert left operand,operator,and right operand to put in string
  * 
  * @returns binary operation as a string
  */
  @Override
  public String toString() {
   String leftString = leftOperand.toString();
   String rightString = rightOperand.toString();
   
    /** 
     * Case switch to find the operator
     */
   switch(operator) {
     case '+':
       operatorString = "+";
       break;
     case '-':
       operatorString = "-";
       break;
     case '/':
       operatorString = "/";
       break;
     case '*':
       operatorString = "*";
     default:
       throw new UnsupportedOperationException("Pick an operator");
   }
     
    
   
    return leftString + " " + operatorString + " " + rightString;
  }
  
  /** 
 * Finds the value of a binary operation without input
 * 
 * @return value
 */
  @Override
  public double value()  {

     /** 
      * Case switch to find the operator
      */
    switch(operator) {
      case '+':
        
        // valueResult stores the calculated value based on the operator,left operand,right operand
        valueResult = leftOperand.value() + rightOperand.value();
        break;
      case '-':
        valueResult = leftOperand.value() - rightOperand.value();
        break;
      case '/':
        valueResult = leftOperand.value() / rightOperand.value();
        break;
      case '*':
        valueResult = leftOperand.value() * rightOperand.value();
      default:
        throw new UnsupportedOperationException("Pick an operator");
    }
    
    return valueResult;
    
  }
  
 /** 
 * Finds the value of a binary operation with input
 * 
 * @param value input
 * 
 * @return value of binary operation
 */
  @Override
  public double value(double value)  {

   /** 
 * Case switch to find the operator
 */
    switch(operator) {
      case '+':
        // valueResult stores the calculated value based on the operator,left operand,right operand
        valueResult = leftOperand.value(value) + rightOperand.value(value);
        break;
      case '-':
        valueResult = leftOperand.value(value) - rightOperand.value(value);
        break;
      case '/':
        valueResult = leftOperand.value(value) / rightOperand.value(value);
        break;
      case '*':
        valueResult = leftOperand.value(value) * rightOperand.value(value);
      default:
        throw new UnsupportedOperationException("Pick an operator");
    }
    
    return valueResult;
    
  }
  
  
  
  /** 
 * Calculates derivative of the binary operation
 * 
 * @return derivative of binary operation
 */
  
  public Function derivative() {
    return new Number(0);
  }
    
    
  
  
  
}