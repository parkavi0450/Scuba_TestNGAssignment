package scuba;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;

public class TestNGData {
 

  @DataProvider(name="SquareRoot")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 6, 5 },
      new Object[] { 18, 33 },
    };
  }
  
  @Test(dataProvider="SquareRoot",groups="SQUARE")
  public void squareRoot(int a,int b) {
	 
	  System.out.println("SquareRoot of A = "+ a*a);
	  System.out.println("SquareRoot of B = "+ b*b);
	  Reporter.log("TestNG_ReportsAndLogs -> SquareRoot", true);
  }
}
