package com.omrbranch.payloadaddress;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.pojo.address.AddUserAddress_Input_Pojo;
import com.omrbranch.pojo.address.UpdateUserAddress_Input_Pojo;

public class AddressPayload extends BaseClass {

	public AddUserAddress_Input_Pojo addUserAddressPojo(String first_name, String last_name, String mobile,
			String apartment, int state, int city, int country, String zipcode, String address, String address_type) {
		AddUserAddress_Input_Pojo addUserAddress_Input_Pojo = new AddUserAddress_Input_Pojo(first_name, last_name,
				mobile, apartment, state, city, country, zipcode, address, address_type);
		addBody(addUserAddress_Input_Pojo);
		return addUserAddress_Input_Pojo;
	}
	
	public UpdateUserAddress_Input_Pojo updateUserAddressPojo(String address_id,String first_name, String last_name, String mobile,
			String apartment, int state, int city, int country, String zipcode, String address, String address_type) {
		UpdateUserAddress_Input_Pojo updateUserAddress_Input_Pojo = new AddUserAddress_Input_Pojo(address_id,first_name, last_name,
				mobile, apartment, state, city, country, zipcode, address, address_type);
		addBody(updateUserAddress_Input_Pojo);
		return updateUserAddress_Input_Pojo;
	}

}
