package com.omrbranch.pojo.product;
import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchProduct_Output {
	private int status;
    private String message;
    private ArrayList <DatumProduct> data;
    private String currency;
}
