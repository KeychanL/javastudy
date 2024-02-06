package com.ict.day19;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex09 {
	public static void main(String[] args) {
		String pathname = "D:\\lkc\\util/test01.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			
		}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			} finally {
				try {
						fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}


	}
}