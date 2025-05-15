/**
* Class does computations with polynomials
* 
* @author Anika Kaur
*/
public class Polynomial extends Function {
 
  // stores the operand of the polynomial function
  private Function operand;
  // stores the value of the power of the polynomial
  private double power;
  //stores calculated value of the polynomial
  private double polyValue;
  
  /**
   * Constructor for polynomial
   * 
   * @param operand for polynomial
   * 
   * @param power for the polynomial
   */
  public Polynomial(Function operand, double power) {
    this.operand = operand;
    this.power = power;
  }
  
 /**
  *  Getter for the power of the polynomial
  * 
  * @return power value
  */
  public double getPower() {
    return power;
  }
  
  /**
   * Getter for the operand of the polynomial
   * 
   * @return value of a polynomial 
   */
  public Function getOperand() {
    return operand;
  }
  
  /**
   * Checks if polynomials are equal
   * 
   * @param polynomial to compare with
   * 
   * @return whether polynomials are equal
   */
  @Override
  public boolean equals(Object o)  {
    if (this == o) {
        return true;
    }
    if (o instanceof Polynomial) {
      
        //stores value of other polynomial being compared as a polynomial
        Polynomial other = (Polynomial) o;
        return this.operand.equals(other.operand) && this.power == other.power;
    }
    return false;
  }

/**
 *  Converts polynomial to a string
 * 
 * @return polynomial as a string
 */
public String toString() {
   if (power == 0) {
        return operand.toString();
    } else if (power == 1) {
        return operand.toString() + "x";
    } else {
        return operand.toString() + "x^" + power;
    }
}

/**
 * Class for doing computations with numbers
 * 
 * @return value of a polynomial 
 */
public double value(double polyValue) {
  return Math.pow(operand.value(polyValue), power);
}  
  

/**
* Throws an exception if value is used without input
* 
* @throws unsupported operation exception if there no value is entered
*/
  public double value()  {
    
    throw new UnsupportedOperationException("You need to enter something!");
    
  
  }


/**
* Calculates the derivative of a polynomial
* 
* @returns the derivative of the function
*/ 
@Override
public Function derivative() {
  
  if (power == 0)  {
    return new Number(0);
  }
  
  else if (power == 1)  {
    return operand.derivative();
  }
 
  else  {
    
    // stores the value of the polynomial derivative when power is greater than 1
     Function lastDerivative = new BinaryOp(new Number(power), BinaryOp.Op.MULT, new Polynomial(operand, power - 1));
     return lastDerivative;
  }
  
 
}
    
  
  
}