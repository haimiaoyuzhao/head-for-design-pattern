package indi.zht.unit7.caffinebeverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffineBeverage {

	@Override
	public void brew() {
		// TODO Auto-generated method stub
		System.out.println("dripping coffee through filter");
	}

	@Override
	public void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("add sugar");
	}
	
	@Override
	public boolean ifCustomerWantCondiments() {
		// TODO Auto-generated method stub
		System.out.print("if you want some sugar?y or n :");
		String answer = getUserInput();
		if ("y".equals(answer)) {
			return true;
		}
		return false;
	}

	
	private String getUserInput() {
		String answer = null;
		try {
			BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
			
			answer = bufferReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			return answer;
		}
	}
}
