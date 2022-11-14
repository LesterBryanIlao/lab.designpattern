package designpattern2.category;

import java.math.BigDecimal;

import designpattern2.interfaces.TicketCategory;

public class SeniorTicketCategory extends AbstractTicketCategory implements TicketCategory{
	private static final float SENIOR_TICKET_PRICE = 12;

	@Override
	public String setTicketCategoryName() {
		// TODO Auto-generated method stub
		return "senior";
	}

	@Override
	public BigDecimal setTicketPrice() {
		// TODO Auto-generated method stub
		return new BigDecimal(SENIOR_TICKET_PRICE);
	}
	
	
}
