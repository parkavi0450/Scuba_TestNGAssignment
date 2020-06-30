package scuba;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameterization {

	@Test(groups="ADD")
	@Parameters({ "a", "b", "c"})	
	public void add(float a,float b,float c) {		
		float sum=a+b+c;
		Assert.assertEquals(sum, 158.01);
		System.out.println("Addition :"+sum);
		Reporter.log("TestNG_ReportsAndLogs -> Addition", true);
				
	}
	
	@Test(groups="SUB")
	@Parameters({ "a", "b"})	
	public void sub(float a,float b) {
		float sub;
		if(a>b) {
		 sub=a-b;
		 Assert.assertNotEquals(sub, 50);
		System.out.println(sub);
		Reporter.log("TestNG_ReportsAndLogs -> Subtraction", true);
		}else if(b>a) {
			 sub=b-a;
			 Assert.assertNotEquals(sub, 50);
			System.out.println("Subtraction :"+sub);
			Reporter.log("TestNG_ReportsAndLogs -> Subtraction", true);
		}
				
	}
	
	@Test(groups="MUL")
	@Parameters({ "a", "b", "c","d"})	
	public void mul(float a,float b,float c,float d) {
		
		boolean value=false;
		if(a!=0 && b!=0 && c!=0 && d!=0) {
			 value=true;
		float mul=a*b*c*d;
		Assert.assertTrue(value, "Assertion passed");
		System.out.println("Multiplication :"+mul);
		Reporter.log("TestNG_ReportsAndLogs -> Multiplication", true);
		}else {
			value=false;
			Assert.assertTrue(value, "Assertion Failed");
			System.out.println("Multiplication :" + 0);
			Reporter.log("TestNG_ReportsAndLogs -> Multiplication", true);
		}
				
	}
	
	@Test(groups="DIV")
	@Parameters({ "x", "y"})	
	public void div(int x,int y) {
		
		boolean value;
		try {
		int div=x/y;
		value=false;
		Assert.assertFalse(value, "Assertion Passed");
		System.out.println("Division :"+div);
		Reporter.log("TestNG_ReportsAndLogs -> Division", true);
				
	}catch(Exception e) {
		value=true;
		Assert.assertFalse(value, "Assertion Failed");
		System.out.println("Arithmetic Exception");
		Reporter.log("TestNG_ReportsAndLogs -> Division", true);
	}
	}
	
	
	@Test(groups="MOD")
	@Parameters({ "x", "y"})	
	public void mod(int x,int y) {		
		float mod=x%y;
		System.out.println("Modulation :"+mod);
		Reporter.log("TestNG_ReportsAndLogs -> Modulation", true);
	}
	
	@Test(groups="NEGATE")
	@Parameters({ "x"})	
	public void negate(int x) {
		System.out.println("Before Negation :"+x);
		int negate=~x;		
		System.out.println("After Negation :"+negate);
		Reporter.log("TestNG_ReportsAndLogs -> Negation", true);		
	}
  
  
}
