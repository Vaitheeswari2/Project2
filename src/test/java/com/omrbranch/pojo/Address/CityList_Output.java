package com.omrbranch.pojo.Address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

import com.omrbranch.pojo.Address.CityList_Output;
import com.omrbranch.pojo.Address.DatumState;
import com.omrbranch.pojo.Address.DatumCity;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CityList_Output {
	private int status;
    private String message;
    private ArrayList <DatumCity> data;

}
