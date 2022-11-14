package designpattern2.category;

import java.math.BigDecimal;

import designpattern2.interfaces.TicketCategory;

public class AdultTicketCategory extends AbstractTicketCategory implements TicketCategory {
	private static final float ADULT_TICKET_PRICE = 15;

	@Override
	public String setTicketCategoryName() {
		// TODO Auto-generated method stub
		return "adult";
	}

	@Override
	public BigDecimal setTicketPrice() {
		// TODO Auto-generated method stub
		return new BigDecimal(ADULT_TICKET_PRICE);
	}

}
