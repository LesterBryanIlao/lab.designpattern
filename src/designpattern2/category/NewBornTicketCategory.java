package designpattern2.category;

import java.math.BigDecimal;

import designpattern2.interfaces.TicketCategory;

public class NewBornTicketCategory extends AbstractTicketCategory implements TicketCategory {
	private static final float NEWBORN_TICKET_PRICE = 0;

	@Override
	public String setTicketCategoryName() {
		// TODO Auto-generated method stub
		return "newborn";
	}

	@Override
	public BigDecimal setTicketPrice() {
		// TODO Auto-generated method stub
		return new BigDecimal(NEWBORN_TICKET_PRICE);
	}

}
