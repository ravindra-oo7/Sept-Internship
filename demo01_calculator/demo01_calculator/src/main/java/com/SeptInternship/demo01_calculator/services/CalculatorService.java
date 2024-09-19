package com.SeptInternship.demo01_calculator.services;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
	
	public int add(int num1,int num2)
	{
		return num1+num2;
	}
	
	public int sub(int num1,int num2)
	{
		return num1-num2;
	}
	
	public int div(int num1,int num2)
	{
		return num1/num2;
	}
	
	public int multi(int num1,int num2)
	{
		return num1*num2;
	}

	public int addThree(int num1, int num2, int num3) 
	{
		return num1+num2+num3;
	}

}
