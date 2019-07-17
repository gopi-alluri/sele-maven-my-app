package com.mycompany.app.my_app;

import java.io.IOException;
import java.util.ArrayList;

public class DataDrivenTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataDriven dataDriven = new DataDriven();
		ArrayList<String> testData = dataDriven.getData("login");
		System.out.println(testData);
		testData = dataDriven.getData("purchase");
		System.out.println(testData);
	}

}
