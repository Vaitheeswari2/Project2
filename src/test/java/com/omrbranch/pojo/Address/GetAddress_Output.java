package com.omrbranch.pojo.Address;
import java.util.ArrayList;

import com.omrbranch.pojo.Address.DatumGetAddress;

import lombok.Data;


@Data

public class GetAddress_Output {
	private int status;
    private String message;
    private ArrayList <DatumGetAddress> data;
}

