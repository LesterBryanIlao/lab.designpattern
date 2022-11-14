package designpattern2.interfaces;

import java.math.BigDecimal;

public interface TicketCategory {
	void setTax(BigDecimal tax);
	String setTicketCategoryName();
	String getTicketCategoryName();
	BigDecimal setTicketPrice();
	BigDecimal getTicketPrice();
	BigDecimal getTotalPriceWithTax();
}
