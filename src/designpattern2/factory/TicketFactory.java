package designpattern2.factory;

import java.math.BigDecimal;

import designpattern2.category.TicketCategoryList;
import designpattern2.interfaces.TicketCategory;

public class TicketFactory {
	private static TicketFactory INSTANCE;
	private TicketCategoryList ticketCategoryList;

	private TicketFactory(TicketCategoryList ticketCategoryList) {
		setTicketCategoryList(ticketCategoryList);
	}

	public static TicketFactory instance(TicketCategoryList ticketCategoryList) {
		if (INSTANCE == null) {
			INSTANCE = new TicketFactory(ticketCategoryList);
		}

		return INSTANCE;
	}
	
	public void setTicketCategoryList(TicketCategoryList ticketCategoryList) {
		this.ticketCategoryList = ticketCategoryList;
	}

	public TicketCategory getAmount(String categoryName, float taxPercentage) {
		TicketCategory ticketCategory = null;
		ticketCategory = ticketCategoryList.getItems().get(categoryName);

		ticketCategory.setTax(new BigDecimal(taxPercentage));
		return ticketCategory;
	}
}
