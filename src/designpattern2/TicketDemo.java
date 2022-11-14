package designpattern2;

import designpattern2.beans.Tax;
import designpattern2.category.NewBornTicketCategory;
import designpattern2.category.PwdTicketCategory;
import designpattern2.category.TicketCategoryList;
import designpattern2.factory.TicketFactory;
import designpattern2.interfaces.TicketCategory;
import designpattern2.util.DefaultTicketEnum;
import designpattern2.util.StringUtil;

public class TicketDemo {
	public static void main(String[] args) {
		Tax tax = Tax.instance(12);
		
		TicketCategoryList ticketCategoryList = new TicketCategoryList();
		
		
		TicketCategory childrenTicket = TicketFactory.instance(ticketCategoryList).getAmount(StringUtil.toString(DefaultTicketEnum.CHILDREN), tax.getTax());
		print(childrenTicket);
		System.out.println();
		
		TicketCategory adultTicket = TicketFactory.instance(ticketCategoryList).getAmount(StringUtil.toString(DefaultTicketEnum.ADULT), tax.getTax());
		print(adultTicket);
		System.out.println();
		
		TicketCategory seniorTicket = TicketFactory.instance(ticketCategoryList).getAmount(StringUtil.toString(DefaultTicketEnum.SENIOR), tax.getTax());
		print(seniorTicket);
		System.out.println();
		
		ticketCategoryList.add("pwd", new PwdTicketCategory());
		
		TicketCategory pwdTicket = TicketFactory.instance(ticketCategoryList).getAmount("pwd", tax.getTax());
		print(pwdTicket);
		System.out.println();
		
		ticketCategoryList.add("newborn", new NewBornTicketCategory());
		
		TicketCategory newBornTicket = TicketFactory.instance(ticketCategoryList).getAmount("newborn", tax.getTax());
		print(newBornTicket);
	}
	
	public static void print(TicketCategory ticketCategory) {
		System.out.println(String.format("Category: %s", ticketCategory.getTicketCategoryName()));
		System.out.println(String.format("Ticket Price: %.2f", ticketCategory.getTicketPrice()));
		System.out.println(String.format("Ticket Price (with Tax): %.2f", ticketCategory.getTotalPriceWithTax()));
	}
}
