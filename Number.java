/**
 * Class for doing computations with numbers
 * 
 * @author Anika Kaur
 */
public class Number extends Function {
  
  // represents a number 
  private double number;
  
  //represents a value for the number
  private double value;

  
/**
 * Constructor for the number class
 * 
 * @param number 
 */
  public Number(double number) {
    this.number = number;
  }


/**
 * Converts number to a string
 * 
 * @return number as a string
 */
  @Override
  public String toString()  {
     if (number == (int) number) {
        return Integer.toString((int) number);
    } else {
        return Double.toString(number);
    }
  }
  
 
  
 /**
  * Checks if two numbers are equal
  * 
  * @param object
  * 
  * @return whether numbers are equal
  */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
        return true;
    }
    if (o instanceof Number) {
      
      //stores value to be compared with 
        Number compNumber = (Number) o;
        return Double.compare(compNumber.number, this.number) == 0;
    }
    return false;
  }
  
/**
 * Calculates derivative of a number
 * 
 * @return the derivative of the number
 */
  @Override
  public Function derivative() {
    return new Number(0);
  }
  
 /**
  * Calculates the value of a number without input
  *  
  * @return value of the number
  */
  @Override
  public double value() {
    return number;
  }
  
  /**
   * Calculates value of a number with input  
   * 
   * @param value for the number
   * 
   * @return value of the number
   */
  @Override
  public double value(double value)  {
    return number;
  }
  
 
  
  
  
}