package com.ict.day20;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Ex02 {
    public static void main(String[] args) {
        // 내 컴퓨터에 저장
        String pathname = "D:\\lkc\\util\\test01.txt";
        File file = new File(pathname);

        try (
            InputStream is = new URL("http://www.kma.go.kr/XML/weather/sfc_web_map.xml").openConnection().getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw)
        ) {
            StringBuilder sb = new StringBuilder();
            String msg;
            while ((msg = br.readLine()) != null) {
                sb.append(msg).append("\n");
            }

            bw.write(sb.toString());
            System.out.println("Download successful!");

        } catch (IOException e) {
            e.printStackTrace(); // handle the exception appropriately
        }
    }
}
