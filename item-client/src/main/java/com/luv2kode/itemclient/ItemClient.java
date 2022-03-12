package com.luv2kode.itemclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("item-catalog-service")
public interface ItemClient {

	@GetMapping("/items")
    String items();
}
