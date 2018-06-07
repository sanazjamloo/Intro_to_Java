package chapter_09;

       
/*The stock class: Following the example of the Circle class from Section 9.2, design a
class named Stock that contains:
1. A string data field named symbol for the stock’s symbol
2. A string data field named name for the stock’s name
3. A double data field named previousClosingPrice that stores the stock price for the
previous day
4. A double data field named currentPrice that stores the stock price for the current
time
5. A constructor that creates a stock with the specified symbol and name
6. A method named getChangePercent() that returns the percentage changed from
previousClosingPrice to currentPrice*/



public class Exercise_09_02 {
	
	/** Main method */
	public static void main(String[] args) {
		// Create a Stock object with the stock  
		Stock stock = new Stock("ORCL", "Oracle Corporation");
		stock.previousClosingPrice = 34.5;
		stock.currentPrice = 36.56;

		// Display the price-change percentage
		System.out.println("\nStock name: " + stock.name);
		System.out.println("Stock symbol: " + stock.symbol);
		System.out.printf("Price-change percentage: %.2f%%\n", 
			stock.getChangePercent());
	} 
}
	