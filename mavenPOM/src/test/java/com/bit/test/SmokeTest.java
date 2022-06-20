package com.bit.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Pages.HomePage;
import utility.Help;

public class SmokeTest {
	@Test
	public void test1() {
		//Help h = new Help();
		//h.click();
		
		HomePage p = new HomePage();
		//p.prime(6);
	}
	
	
	@Test
	public void test2(){
		//swap();
		//System.out.println(fac(4));
		System.out.println(discount(5, dr.findElement(By.xpath("hsfdjs"))));
		
	}
	public void swap() {
		
		int a = 2;
		int b= 3;
		
		b = b- a;
		a = a+b;
		b= a - b;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		
		
	}
	
	public int fac(int a) {
		
		int b = a;
		for(int i = a-1; i >= 1; i--) {
			//int b = a;
			
			
			b = b* (i);
			
		}
		return b;
		
	}
	
	WebDriver dr;
	public double discount(int num, WebElement ele) {
		//double price = 100;
		
		int price = Integer.parseInt(ele.getText());
		dr.findElement(By.xpath("Quantity Xpath")).click();//it will help to click to change quantity
		int actualPrice = Integer.parseInt(ele.getText());
		double extotal = 0;
		
			if (num%2 ==0) {
				int a = (num/2);
				extotal = ((a*price)*(0.5)) + ((num/2)*price);
			}
			else {
				int r = num%2;
				int dis = num - r;
				dis = (dis/2);
				extotal = (r*price) + ((dis*price)*(0.5)) + ((dis)*price);
				
			}
			
			if (actualPrice == extotal) {
				System.out.println("Are same");
			}
			else {
				System.out.println("Are Not Same");
			}
			
			
		return extotal;
		
	}
	
	
	

}
