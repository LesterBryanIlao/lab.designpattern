package designpattern2.category;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import designpattern2.interfaces.TicketCategory;

 
public class TicketCategoryList {
	private Map<String, TicketCategory> ticketCategoryList;
	
	public TicketCategoryList() {
		ticketCategoryList = new HashMap<>();
		ticketCategoryList.put("senior", new SeniorTicketCategory());
		ticketCategoryList.put("adult", new AdultTicketCategory());
		ticketCategoryList.put("children", new ChildrenTicketCategory());
	}
	
	public void add(String categoryName, TicketCategory ticketCategory) {
		categoryName = categoryName.toLowerCase();
		if (categoryName==null) {
			throw new IllegalArgumentException("Category name cannot be null");
		}
		if (ticketCategory.getTicketCategoryName() == null) {
			throw new IllegalArgumentException("Ticketcategory name cannot be null");
		}

		if (ticketCategoryList.containsKey(categoryName)) {
			throw new IllegalArgumentException("Category already exist.");
		} else {
//			ticketCategory.setTicketPrice();
			ticketCategoryList.put(categoryName, ticketCategory);
		}
	}
	
	public void remove(String categoryName) {
		TicketCategory ticketCategory = ticketCategoryList.get(categoryName);
		if (ticketCategory == null) {
			throw new RuntimeException("Item not found");
		}
		ticketCategoryList.remove(categoryName);
	}

	public Map<String, TicketCategory> getItems() {
		return ticketCategoryList;
	}

	public List<TicketCategory> getItemsAsList() {
		return new ArrayList<>(ticketCategoryList.values());
	}
}
