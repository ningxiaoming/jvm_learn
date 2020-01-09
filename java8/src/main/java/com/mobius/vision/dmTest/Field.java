package com.mobius.vision.dmTest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author NingXioaoming
 * @createTime 2019/12/16 17:18
 * @description
 */
public class Field {

    public static void main(String[] args) {


        List<Tt> list = new ArrayList<>();
        Tt tt = new Tt();
        tt.setFieldId("11");
        tt.setFieldName("一一");
        Tt tt2 = new Tt();
        tt2.setFieldId("22");
        tt2.setFieldName("貮貮");
        list.add(tt);
        list.add(tt2);
        String s = JSONArray.toJSONString(list);

        String ss = "[{\"fieldId\":\"field1\",\"fieldName\":\"_id\",\"fieldType\":\"String\",\"isVirtual\":\"0\"},{\"fieldId\":\"field2\",\"fieldName\":\"品牌名称\",\"fieldType\":\"String\",\"isVirtual\":\"0\"},{\"fieldId\":\"field3\",\"fieldName\":\"城市\",\"fieldType\":\"String\",\"isVirtual\":\"0\"},{\"fieldId\":\"field4\",\"fieldName\":\"分类\",\"fieldType\":\"String\",\"isVirtual\":\"0\"},{\"fieldId\":\"field5\",\"fieldName\":\"销售热度\",\"fieldType\":\"String\",\"isVirtual\":\"0\"},{\"fieldId\":\"field6\",\"fieldName\":\"区\",\"fieldType\":\"String\",\"isVirtual\":\"0\"},{\"fieldId\":\"field7\",\"fieldName\":\"食品月度销售\",\"fieldType\":\"String\",\"isVirtual\":\"0\"},{\"fieldId\":\"field8\",\"fieldName\":\"维度\",\"fieldType\":\"String\",\"isVirtual\":\"0\"},{\"fieldId\":\"field9\",\"fieldName\":\"经度\",\"fieldType\":\"String\",\"isVirtual\":\"0\"},{\"fieldId\":\"field10\",\"fieldName\":\"每月销售\",\"fieldType\":\"String\",\"isVirtual\":\"0\"},{\"fieldId\":\"field11\",\"fieldName\":\"价钱\",\"fieldType\":\"String\",\"isVirtual\":\"0\"},{\"fieldId\":\"field12\",\"fieldName\":\"产品名称\",\"fieldType\":\"String\",\"isVirtual\":\"0\"},{\"fieldId\":\"field14\",\"fieldName\":\"地点\",\"fieldType\":\"String\",\"isVirtual\":\"0\"}]";

        String sss = "[{\"fieldId\":\"field1\",\"fieldName\":\"_id\",\"fieldType\":\"String\",\"isVirtual\":\"0\"},{\"fieldId\":\"field2\",\"fieldName\":\"品牌名称\",\"fieldType\":\"String\",\"isVirtual\":\"0\"}]";
        List<String> list1 = new ArrayList<>();

        JSONArray array = JSONArray.parseArray(ss);
        array.stream().map(item -> (JSONObject) item).map(item -> item.getString("fieldName")).forEach(item -> list1.add(item));

        for (String s1 : list1
        ) {
            System.out.println(s1);
        }


        System.out.println(sss);
    }


}

class Tt {

    String fieldId;
    String fieldName;

    Tt() {
    }

    public String getFieldId() {
        return fieldId;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
}
