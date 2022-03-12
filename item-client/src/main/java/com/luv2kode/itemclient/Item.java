package com.luv2kode.itemclient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Item {

	private Long id;
	
	private String name;
}
