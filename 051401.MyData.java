package Eample;

import java.io.*;

public class Duqu {

    public static void main(String[] args) {
        File file = new File("D:\\mydata.txt");//文件路径
        try {
            FileReader fr = new FileReader(file);//读取文件
            BufferedReader reader = new BufferedReader(fr);//BufferedReader类从字符输入流中读取文本并缓冲字符，以便有效地读取字符，数组和行
            String str = reader.readLine();
            while (str != null) {
                System.out.println(str);
                str = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            //当抛出多个异常时，子异常当在父异常前抛出。
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
