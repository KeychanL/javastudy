package com.ict.day19;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Es12 {
	public static void main(String[] args) {
		String inputPath = "D:\\lkc\\util/image01.png";
		String outputPath = "D:\\lkc\\util/image01.png";

		File in_file = new File(inputPath);
		FileInputStream fis = null;
		BufferedOutputStream bis = null;

		File out_file = new File(outputPath);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {
			fis = new FileInputStream(in_file);
			bis = new BufferedInputStream(fis);

			fos = new FileOutputStream(out_file);
			bos = new BufferedOutputStream(fos);

			int b = 0;
			while ((b = bis.read()) != -1) {
				bos.write(b);
			}
			bos.flush();
		} catch (FileNotFoundException e) {
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
