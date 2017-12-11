package UnitTest;
import org.junit.Assert;
import org.junit.Test;

import cicd_workshop.RomanNumerals;

public class RomanNumeralsTest {
	@Test
	public void should_return_I_when_input_1(){
		RomanNumerals converter = new RomanNumerals();
		int inputNumber = 1;
		String expectedResult = "I";
		
		String actualResult = converter.convert(inputNumber);
		
		Assert.assertEquals(expectedResult, actualResult);
	}
}
