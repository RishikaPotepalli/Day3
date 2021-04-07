package ss;

public class Stock {

	private String stockName; 
	private int stockPrice;  
	
	public Stock(String name, int price) {
		stockName = name;
		stockPrice = price;
	}
	
	public void changePrice(float perChange,boolean action)
	{
		if(action==true)
		
			stockPrice+=(perChange*stockPrice)/100;
		
		else
			
			stockPrice-=(perChange*stockPrice)/100;
		
		
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(int stockPrice) {
		this.stockPrice = stockPrice;
	}
	
}

