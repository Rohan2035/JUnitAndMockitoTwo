package com.rohan.course.JUnitAndMockitoLearningTwo.stocks;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class StockServiceTest {
	
	private StockService stockService;
	private Portfolio portfolio;
	
	public StockServiceTest() {
		
		this.stockService = mock(StockService.class);
		this.portfolio = new Portfolio();
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testOne() {
		
		Stock googleStock = new Stock(1, "Google", 10);
		Stock microsoftStock = new Stock(2, "Microsoft", 100);
		
		List<Stock> stockList = new ArrayList<>();
		
		stockList.add(googleStock);
		stockList.add(microsoftStock);
		
		portfolio.setStockList(stockList);
		portfolio.setStockService(stockService);
		
		when(stockService.getStockPrice(googleStock)).thenReturn(50.00);
		when(stockService.getStockPrice(microsoftStock)).thenReturn(1000.00);
		
		double marketValue = portfolio.getMarketValue();
		
		assertEquals(marketValue, 100500, 0.0f);
		
	}
	

}
