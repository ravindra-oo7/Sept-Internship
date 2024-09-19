package com.SeptInternship.demo01_calculator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.SeptInternship.demo01_calculator.dto.NumbersDTO;
import com.SeptInternship.demo01_calculator.services.CalculatorService;

@RestController
@RequestMapping("/api/calculator")
public class MyController {
	
	@Autowired
	private CalculatorService calservice;
	
    @RequestMapping(value = "/add", method = RequestMethod.POST)
	public int add(int num1, int num2)
	{
		return calservice.add(num1,num2);
	}

    @PostMapping("/sub")
    public int sub(@RequestParam(name="newNum1") int num1,@RequestParam int num2)
   	{ 
   		return calservice.sub(num1, num2);
   	}
    
    @GetMapping("/div")
    public int div(int num1, int num2)
   	{
   		return calservice.div(num1, num2);
   	}
    
    @PostMapping("/multi")
   	public int multi(int num1, int num2)
   	{
   		return calservice.multi(num1, num2);
   	}
    
    @PostMapping("/addThree")
    @ResponseBody
    public int addThreeNum(@RequestBody NumbersDTO numbers) 
    {
        return calservice.addThree(numbers.getNum1(), numbers.getNum2(), numbers.getNum3());
    }
    
}
