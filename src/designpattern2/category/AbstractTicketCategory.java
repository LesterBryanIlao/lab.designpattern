package designpattern2.category;

import java.math.BigDecimal;

public abstract class AbstractTicketCategory {
	protected BigDecimal price;
	private BigDecimal taxPercentage;
	protected String categoryName;
	
	public AbstractTicketCategory() {
		this.price = setTicketPrice();
		this.categoryName = setTicketCategoryName();
	}
	
	public void setTax(BigDecimal taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	
	public BigDecimal getTotalPriceWithTax() {
		return price.add(taxPercentage.multiply(price));
	}
	
	public abstract BigDecimal setTicketPrice();
	
	public BigDecimal getTicketPrice() {
		return this.price;
	}
	
	public abstract String setTicketCategoryName();
	
	public String getTicketCategoryName() {
		return this.categoryName;
	}
	
}
