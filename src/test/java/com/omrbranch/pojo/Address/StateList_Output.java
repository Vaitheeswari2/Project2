package com.omrbranch.pojo.Address;

import java.util.ArrayList;

import com.omrbranch.pojo.Address.DatumState;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StateList_Output {
	private int status;
    private String message;
    private ArrayList <DatumState> data;
}
