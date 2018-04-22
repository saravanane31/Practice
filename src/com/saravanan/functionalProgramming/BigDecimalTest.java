package com.saravanan.functionalProgramming;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class BigDecimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final List<BigDecimal> prices = Arrays.asList(new BigDecimal("10"), new BigDecimal("30"), new BigDecimal("17"),
				new BigDecimal("20"), new BigDecimal("15"), new BigDecimal("18"),
				new BigDecimal("45"), new BigDecimal("12"));
		
		BigDecimal finalValue = BigDecimal.ZERO;
		
		for(BigDecimal decimal:prices){
			if(decimal.compareTo(BigDecimal.valueOf(20))>0){
				finalValue = finalValue.add(decimal.multiply(BigDecimal.valueOf(0.9)));
			}
		}
		
		System.out.println("Final Value==="+finalValue);
		
	}

}
