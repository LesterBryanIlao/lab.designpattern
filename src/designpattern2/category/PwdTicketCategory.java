package designpattern2.category;

import java.math.BigDecimal;

import designpattern2.interfaces.TicketCategory;

public class PwdTicketCategory extends AbstractTicketCategory implements TicketCategory {
	private static final float PWD_TICKET_PRICE = 11;

	@Override
	public BigDecimal setTicketPrice() {
		// TODO Auto-generated method stub
		return new BigDecimal(PWD_TICKET_PRICE);
	}

	@Override
	public String setTicketCategoryName() {
		// TODO Auto-generated method stub
		return "pwd";
	}

}
