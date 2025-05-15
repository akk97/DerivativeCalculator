/** 
 *  Tests calculator functions 
 * 
 * @author Anika Kaur
 */



import org.junit.*;
import static org.junit.Assert.*;

/**
* Test calculator heirarchy
*/
public class CalculatorTester {
  
/**
* Test the string method in variable class
*/
@Test
public void testStringVariable() {
Variable v1 = new Variable();
assertEquals("x", v1.toString());
}

/**
* Test the derivative method in variable class
*/
@Test
public void testDerivativeVariable() {
Variable v1 = new Variable();
assertEquals(new Number(1), v1.derivative());
}

/**
* Test the equals method in variable class
*/
@Test
public void testEqualsVariable()  {
Variable v1 = new Variable();
Variable v2 = new Variable();
assertTrue(v1.equals(v2));
}

/**
* Test the value method in variable class
*/
@Test
public void testValueVariable()  {
Variable v1 = new Variable();
assertEquals(new Number(4), new Number(v1.value(4)));
}

/**
* Test the left getter method in binary class
*/
@Test
public void testLeftGetterBinary()  {
Number operand1 = new Number(2);
Number operand2 = new Number(4);
BinaryOp b1 = new BinaryOp(operand1,BinaryOp.Op.PLUS, operand2);
assertEquals(operand1, b1.getLeftOperand());
}   

/**
* Test the right getter method in binary class
*/
@Test
public void testRightGetterBinary()  {
Number operand1 = new Number(2);
Number operand2 = new Number(4);
BinaryOp b1 = new BinaryOp(operand1, BinaryOp.Op.PLUS, operand2);
assertEquals(operand2, b1.getRightOperand());
}

/**
* Test the operator getter in binary class
*/
@Test
public void testOperatorGetterBinary()  {
Number operand1 = new Number(2);
Number operand2 = new Number(4);
BinaryOp b1 = new BinaryOp(operand1, BinaryOp.Op.PLUS, operand2);
assertEquals('+', b1.getOperator());
}

/**
* Test the equals method in binary class
*/
@Test
public void testEqualsBinary()  {
Number operand1 = new Number(2);
Number operand2 = new Number(4);
Number operand3 = new Number(3);
Number operand4 = new Number(6);
BinaryOp b1 = new BinaryOp(operand1, BinaryOp.Op.PLUS, operand2);
BinaryOp b2 = new BinaryOp(operand1, BinaryOp.Op.PLUS, operand2);
BinaryOp b3 = new BinaryOp(operand3, BinaryOp.Op.PLUS, operand4);
assertTrue(b1.equals(b2));
assertFalse(b1.equals(b3));
}

/**
* Test the string method in binary class
*/
@Test
public void testStringBinary() {
Number operand1 = new Number(2);
Number operand2 = new Number(4);
BinaryOp b1 = new BinaryOp(operand1, BinaryOp.Op.PLUS, operand2);
assertEquals("2 + 4", b1.toString());
}

/**
* Test the value method in binary class
*/
@Test
public void testValueBinary()  {
Number operand1 = new Number(2);
Number operand2 = new Number(4);
BinaryOp b1 = new BinaryOp(operand1, BinaryOp.Op.MULT, operand2);
assertEquals(new Number(8), b1.value());
}

/**
* Test the derivative method in binary class
*/
@Test
public void testDerivativeBinary() {
Number operand1 = new Number(4);
Number operand2 = new Number(2);
BinaryOp b1 = new BinaryOp(operand1, BinaryOp.Op.DIV, operand2);
assertEquals(new Number(0), b1.derivative());  
}

/**
* Test the string method in number class
*/
@Test
public void testStringNumber()  {
Number n1 = new Number(4);
assertEquals("4", n1.toString());
}

/**
* Test the equals method in number class
*/
@Test
public void testEqualsNumber() {
Number n1 = new Number(6);
Number n2 = new Number(6);
Number n3 = new Number(4);
assertTrue(n1.equals(n2));
assertFalse(n1.equals(n3));  
}

/**
* Test the derivative method in number class
*/
@Test
public void testDerivativeNumber() {
Number n1 = new Number(5);
assertEquals(new Number(0), n1.derivative());
}

/**
* Test the value method in number class
*/
@Test
public void testValueNumber()   {
Number n1 = new Number(5); 
assertEquals(5.0, n1.value(), 0.001);  
}

/**
* Test the operand getter in polynomial class
*/
@Test
public void testOperandGetter()  {
Function operand = new Number(3);
Polynomial p1 = new Polynomial(operand, 2);
assertEquals(operand, p1.getOperand());
}

/**
* Test the power getter in polynomial class
*/
@Test
public void testPowerGetter()  {
Function operand = new Number(3);  
Polynomial p1 = new Polynomial(operand, 2);  
assertEquals(2.0, p1.getPower(),0.001);
}

/**
* Test the equals method in polynomial class
*/
@Test
public void testEqualsPoly() {
Function operand1 = new Number(6);  
Function operand2 = new Number(6);  
Function operand3 = new Number(6);  
Polynomial p1 = new Polynomial(operand1, 4);  
Polynomial p2 = new Polynomial(operand2, 4);  
Polynomial p3 = new Polynomial(operand3, 5);  
assertTrue(p1.equals(p2));
assertFalse(p1.equals(p3));  
}


/**
* Test the equals method in polynomial class
*/
@Test
public void testEqualsLongPolynomials() {
Function operand1 = new Polynomial(new Variable(), 2);  
Function operand2 = new Polynomial(new Variable(), 2);  
Function operand3 = new Polynomial(new Variable(), 2); 
Function constant1 = new Number(1); 
Function constant2 = new Number(4); 
Polynomial polynomial1 = new Polynomial(new BinaryOp(operand1, BinaryOp.Op.PLUS, constant1), 2);  
Polynomial polynomial2 = new Polynomial(new BinaryOp(operand2, BinaryOp.Op.PLUS, constant2), 2);  
Polynomial polynomial3 = new Polynomial(new BinaryOp(operand3, BinaryOp.Op.PLUS, constant1), 2); 
assertTrue(polynomial1.equals(polynomial3));  
assertFalse(polynomial1.equals(polynomial2));  
}


/**
* Test the toString method in polynomial class
*/
@Test
public void testStringPoly()  {
Function operand = new Number(6);  
Polynomial p1 = new Polynomial(operand, 4);  
assertEquals("6x^4", p1.toString());  
}


/**
* Test the value method in polynomial class
*/
@Test
public void testValuePoly()   {
Function operand = new Number(2);  
Polynomial p1 = new Polynomial(operand, 3);  
assertEquals(8.0, p1.value(2), 0.001);  
}

/**
* Test the derivative method in polynomial class
*/
@Test
public void testDerivativePoly() {
Function operand = new Number(5);
Polynomial p1 = new Polynomial(operand, 3);
Polynomial expectedResult = new Polynomial(new Number(15), 2);
assertEquals(expectedResult, p1.derivative());
}

/**
* Test the toString method in sine class
*/

@Test
public void testStringSine() {
Function operand = new Number(30);
Sine s1 = new Sine(operand);
assertEquals("sin(30)", s1.toString()); 
}

/**
* Test the equals method in sine class
*/
@Test
public void testEqualsSine() {
Function operand1 = new Number(30);
Function operand2 = new Number(60);
Sine s1 = new Sine(operand1);
Sine s2 = new Sine(operand1);
Sine s3 = new Sine(operand2);
assertTrue(s1.equals(s2));
assertFalse(s1.equals(s3));  
}

/**
* Test the derivative method in sine class
*/
@Test
public void testDerivativeSine()  {
Function operand = new Number(30);
Sine s1 = new Sine(operand);
Cosine c1 = new Cosine(operand);
assertEquals(c1, s1.derivative());  
}

/**
* Test the derivative method in sine class with longer operand
*/
@Test
public void testDerivativeSine2() {
Function operand = new BinaryOp(new Variable(), BinaryOp.Op.PLUS, new Number(1));
Sine s1 = new Sine(operand);
Function sineDerivative = s1.derivative();
Cosine expectedDerivative = new Cosine(operand);
assertEquals(expectedDerivative, sineDerivative);
}

/**
* Test the value method in sine class
*/
@Test
public void testValueSine()   {
Function operand = new Number(30);
Sine s1 = new Sine(operand); 
assertEquals(new Number(.5), s1.value());  
}

/**
* Test the toString method in cosine class
*/
@Test
public void testStringCosine() {
Function operand = new Number(30);
Cosine c1 = new Cosine(operand);
assertEquals("cos(30)", c1.toString()); 
}

/**
* Test the equals method in cosine class
*/
@Test
public void testEqualsCosine() {
Function operand1 = new Number(30);
Function operand2 = new Number(60);
Cosine c1 = new Cosine(operand1);
Cosine c2 = new Cosine(operand1);
Cosine c3 = new Cosine(operand2);
assertTrue(c1.equals(c2));
assertFalse(c1.equals(c3));  
}

/**
* Test the derivative method in cosine class
*/
@Test
public void testDerivativeCosine()  {
Variable v1 = new Variable();
Function operand = new Variable();
Cosine c1 = new Cosine(operand);
Function expectedResult = c1.derivative();
Function testResult = new BinaryOp(new Number(-1), BinaryOp.Op.MULT, new Sine(v1));
assertEquals(expectedResult, testResult);  
}

/**
* Test the value method in cosine class
*/
@Test
public void testValueCosine()   {
Function operand = new Number(60);
Cosine c1 = new Cosine(operand); 
assertEquals(new Number(.5), c1.value());  
}

/**
* Test the toString method in log class
*/
@Test
public void testStringLog() {
Function operand = new Number(5);
Log g1 = new Log(operand);
assertEquals("Log(5)", g1.toString()); 
}

/**
* Test the equals method in log class
*/
@Test
public void testEqualsLog() {
Function operand1 = new Number(5);
Function operand2 = new Number(10);
Log g1 = new Log(operand1);
Log g2 = new Log(operand1);
Log g3 = new Log(operand2);
assertTrue(g1.equals(g2));
assertFalse(g1.equals(g3));  
}

/**
* Test the derivative method in log class
*/
@Test
public void testDerivativeLog()  {
Variable v1 = new Variable();
Function operand = new Variable();
Log g1 = new Log(operand);  
Function expectedDerivative = new BinaryOp(new Number(1), BinaryOp.Op.DIV, new Ln(v1)); 
assertEquals(expectedDerivative, g1.derivative());
}

/**
* Test the value method in log class
*/
@Test
public void testValueLog()   {
Function operand1 = new Number(1);
Log g1 = new Log(operand1); 
assertEquals(new Number(0), g1.value());  
}

/**
* Test the string method in exp class
*/
@Test
public void testStringExp() {
Function operand1 = new Number(2);
Exp e1 = new Exp(operand1);
assertEquals("e^2", e1.toString()); 
}

/**
* Test the equals method in exp class
*/
@Test
public void testEqualsExp() {
Function e1 = new Number(5);
Function e2 = new Number(5);
Function e3 = new Number(3);
assertTrue(e1.equals(e2));
assertFalse(e1.equals(e3));  
}

/**
* Test the derivative method in exp class
*/
@Test
public void testDerivativeExp()  {
Variable v1 = new Variable();
Function operand = new Variable();
Exp e1 = new Exp(operand);
Function expectedResult = new Exp(v1);
assertEquals(expectedResult, e1.derivative());  
}

/**
* Test the value method in variable class
*/
@Test
public void testValueExp()   {
Function operand = new Number(0);
Exp e1 = new Exp(operand); 
assertEquals(1.0, e1.value(0), .001);  
}



 



}


  
