package com.ict.day20;
//코로나
import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Ex03 {
    public static void main(String[] args) {
        // 내 컴퓨터에 저장
        String pathname = "D:\\lkc\\util\\test02.txt";
        File file = new File(pathname);

        try (
            InputStream is = new URL("https://discord.com/channels/1189751938963746906/1189753325579677786/1200255321877270539").openConnection().getInputStream();
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