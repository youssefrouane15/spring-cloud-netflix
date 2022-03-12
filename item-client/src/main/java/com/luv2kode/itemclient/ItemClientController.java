package com.luv2kode.itemclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemClientController {
	
	private ItemClient itemClient;
	
	ItemClientController(ItemClient itemClient) {
		this.itemClient = itemClient;
	}
	
	@GetMapping(value="/items")
	String items() {
		return itemClient.items();
	}


}
