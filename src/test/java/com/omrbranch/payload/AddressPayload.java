package com.omrbranch.payload;
import com.omrbranch.pojo.Address.AddAddress_Input;
import com.omrbranch.pojo.Address.CityList_Input;
import com.omrbranch.pojo.Address.DeleteAddress_Input;
import com.omrbranch.pojo.Address.UpdateAddress_Input;
public class AddressPayload {
	public CityList_Input addCityPayLoad (String stateId) {
        return new CityList_Input (stateId);
    }

    public AddAddress_Input addAddressPayLoad (String firstName, String lastName, String mobile, String apartment, int state, int city, int country, String zipcode, String address, String address_type) {
        return new AddAddress_Input (firstName, lastName, mobile, apartment, state, city, country, zipcode, address, address_type);
    }

    public UpdateAddress_Input updateAddressPayLoad (String addressId, String firstName, String lastName, String mobile, String apartment, int state, int city, int country, String zipcode, String address, String address_type) {
        return new UpdateAddress_Input (addressId, firstName, lastName, mobile, apartment, state, city, country, zipcode, address, address_type);
    }

    public DeleteAddress_Input deleteAddressPayLoad (String addressId) {
        return new DeleteAddress_Input (addressId);
    }

}
