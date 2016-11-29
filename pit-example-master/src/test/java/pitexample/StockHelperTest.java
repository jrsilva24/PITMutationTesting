package pitexample;

import static org.junit.Assert.*;

import org.junit.Test;

public class StockHelperTest {

	@Test
	public void handleDoubletest() {
		StockHelper stockHelper = new StockHelper();
		int value = 123;
		assertEquals(stockHelper.handleInt("123"), value);
	}
	
	@Test
	public void handleInttest() {
		StockHelper stockHelper = new StockHelper();
		double value = 123.123;
		double fuzz = 0.001;
		assertEquals(stockHelper.handleDouble("123.123"), value, fuzz);
	}
}
