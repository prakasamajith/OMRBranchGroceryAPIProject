package com.omrbranch.globaldata;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GlobalData {
	private String stateIdText;
	private String logtoken;
	private int stateIdNum;
	private int cityIdNum;
	private String address_idNum;
	private int addressId;
	private String categoryId;
	private String nutsIdText;

}
