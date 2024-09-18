package com.omrbranch.pojo.Address;

	import lombok.AllArgsConstructor;
	import lombok.Data;
	import lombok.NoArgsConstructor;

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public class AddAddress_Output {
		private int status;
	    private String message;
	    private int address_id;
	}


