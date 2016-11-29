package pitexample;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import pitexample.StockFetcher;
import yahooStocks.*;;

public class StockFetcherTest { 
	
	@Test
	public void validHighTest() { 
		Stock facebook = StockFetcher.getStock("FB");
		assertTrue(StockFetcher.validHigh(facebook));
	}
	
	@Test
	public void isOnlyUSCurrencyTest() { 
		Stock facebook = StockFetcher.getStock("FB");
		assertTrue(StockFetcher.isOnlyUSCurrency(facebook));
	}
	
	@Test
	public void isOnlyUSCurrencyFailTest() { 
		Stock facebook = StockFetcher.getStock("FB");
		facebook.setCurrency("Bitcoin");
		assertFalse(StockFetcher.isOnlyUSCurrency(facebook));
	}
	
	@Test
	public void ValidDayHighTest() { 
		Stock facebook = StockFetcher.getStock("FB");
		assertTrue(StockFetcher.validDayHigh(facebook));
	}
	
	@Test
	public void shortRatioAboveLimitTest() { 
		Stock facebook = StockFetcher.getStock("FB");
		double highValueForRatio = 40.0;
		assertTrue(StockFetcher.shortRatioIsNotAboveLimit(facebook, highValueForRatio));
	}
}
