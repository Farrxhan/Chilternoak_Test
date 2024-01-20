package com.app.utils;

import java.io.IOException;

public class Test {
public static void main(String[] args) throws IOException {
	System.out.println(ExcelReader.getData(0,"Sheet1"));
	System.out.println(ExcelReader.getData(1,"Sheet1"));
	System.out.println(ExcelReader.getData(2,"Sheet1"));
	System.out.println(ExcelReader.getData(3,"Sheet1"));
	System.out.println(ExcelReader.getData(4,"Sheet1"));
}
}
