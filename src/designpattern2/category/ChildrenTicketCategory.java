package designpattern2.category;

import java.math.BigDecimal;

import designpattern2.interfaces.TicketCategory;

public class ChildrenTicketCategory extends AbstractTicketCategory implements TicketCategory{
	private static final float CHILDREN_TICKET_PRICE = 10;

	@Override
	public String setTicketCategoryName() {
		// TODO Auto-generated method stub
		return "children";
	}

	@Override
	public BigDecimal setTicketPrice() {
		// TODO Auto-generated method stub
		return new BigDecimal(CHILDREN_TICKET_PRICE);
	}
	
	
}
