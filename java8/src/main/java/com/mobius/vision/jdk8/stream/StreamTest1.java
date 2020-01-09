package com.mobius.vision.jdk8.stream;

import cn.hutool.core.io.resource.ClassPathResource;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author NingXioaoming
 * @createTime 2019/11/11 18:12
 * @description
 */
public class StreamTest1 {
    public static void main(String[] args) {

        File file = new File("D:\\city.txt");
        InputStreamReader read = null;
        try {
            read = new InputStreamReader(new FileInputStream(file), "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bufferedReader = new BufferedReader(read);
        String lineTxt = null;
        try {
            while ((lineTxt = bufferedReader.readLine()) != null) {
//                System.out.println(lineTxt);
//                System.out.println(1);
                JSONArray jsonObj = new JSONArray(lineTxt);
                for (Object o : jsonObj
                ) {
                    JSONObject jsonObject = new JSONObject(o.toString());
                    Object c = jsonObject.get("c");
                    JSONArray carr = new JSONArray(c.toString());
                    System.out.println("{");
                    System.out.println("\"n\": \"" + jsonObject.get("n") + "\",");
                    System.out.print("\"c\": [");
                    int i = 0;
                    for (Object oo : carr
                    ) {
                        i++;
                        JSONObject jsonObjectoo = new JSONObject(oo.toString());
                        JSONArray carrr = new JSONArray(jsonObjectoo.get("a").toString());
                        System.out.println("{");
                        System.out.print("\"a\": [\"不限\", ");
                        int j = 0;
                        for (Object ooo : carrr
                        ) {
                            j++;
                            if (j == carrr.size()) {
                                System.out.print("\"" + ooo.toString() + "\"");
                            }
//                            JSONObject jsonObjectooo = new JSONObject(ooo.toString());
                            else {
                                System.out.print("\"" + ooo.toString() + "\", ");
                            }
                        }
                        System.out.print("],");
                        System.out.println();
                        System.out.print("\"n\": ");
                        System.out.println("[\"不限\", \"" + jsonObjectoo.get("n") + "\"]");
                        if (i == carr.size()) {
                            System.out.print("}");
                        } else {
                            System.out.print("},");
                        }
//                        System.out.print("\""+jsonObjectoo.get("a")+"\", ");
//                        System.out.println(jsonObjectoo.toString()+",");
                    }
                    System.out.println("]");
//                    System.out.println();
//                    System.out.println(o.toString());
//                    System.out.println();
                    System.out.println("},");
                }
//                System.out.println(jsonObj.toString());
            }
//            System.out.println(lineTxt);

            read.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
