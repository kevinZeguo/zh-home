package com.zhonghua.comfortable.home.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zhonghua.comfortable.home.domain.jqgrid.JqgridPageResultDTO;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AjaxUtil {

    private static Log logger = LogFactory.getLog(AjaxUtil.class);


//    public static JSONObject fromObject(Object object) {
//        //处理日期函数
////        return JSONObject.toJSON(object,WebJsonConfig.getInstance());
//
//    }
//    public static JSONArray formObject(Object object) {
//        return JSONArray.fromObject(object,WebJsonConfig.getInstance());
//    }


//    public static JSONObject jqGridJson(Page page , JSONObject... userdata){
//        JSONObject json = new JSONObject();
//        if (page == null) {
//            json.put("records", 0);
//            json.put("page", 1);
//            json.put("rows", ArrayUtils.EMPTY_OBJECT_ARRAY);
//            return json;
//        }
//        json.put("total", page.getTotalPages());
//        json.put("page", page.getNumber()+1);
//        json.put("records", page.getTotalElements());
//        if(userdata != null && userdata.length > 0){  //zhangrui2016-11-18 需要添加额外的数据到页面
//            json.put("userdata",userdata[0]);
//        }
//        List dataList = page.getContent();
//        if (dataList != null && dataList.size() > 0) {
//            JSONArray jsonArray = new JSONArray();
//            for (Object item : dataList) {
//                Class c = item.getClass();
//                if (c == int.class || c == Integer.class ||
//                        c == long.class || c == Long.class ||
//                        c == float.class || c == Float.class ||
//                        c == double.class || c == Double.class ||
//                        c == boolean.class || c == Boolean.class ||
//                        c == byte.class || c == Byte.class ||
//                        c == char.class || c == Byte.class ||
//                        c == short.class || c == Short.class ||
//                        c == String.class) {
//                    jsonArray.add(item);
//                } else {
//                    jsonArray.add(JSONObject.fromObject(item, WebJsonConfig.getInstance()));
//                }
//            }
//            json.put("rows", jsonArray);
//        } else {
//            json.put("rows", ArrayUtils.EMPTY_OBJECT_ARRAY);
//        }
//        return json;
//    }

    /**
     * 将PageResultDTO对象转成JqGrid可以使用的JSON串
     *
     * @param pageResultDTO
     * @return
     */
    public static JSONObject gridJson(JqgridPageResultDTO pageResultDTO) {

        JSONObject json = new JSONObject();
        if (pageResultDTO == null || !pageResultDTO.getSuccess()) {
            json.put("records", 0);
            json.put("page", 1);
            json.put("message", pageResultDTO == null ? "PageResultDTO 对象为空" : pageResultDTO.getMessage());
            json.put("success", false);
            json.put("rows", ArrayUtils.EMPTY_OBJECT_ARRAY);
            return json;
        }
        json.put("success", true);
        int pageNum = (int) Math.ceil((double) pageResultDTO.getRecords() / (double) pageResultDTO.getLimit());
        json.put("total", pageNum);
        json.put("page", pageResultDTO.getPage());
        json.put("records", pageResultDTO.getRecords());
        List dataList = pageResultDTO.getRows();
        if (dataList != null && dataList.size() > 0) {
            JSONArray jsonArray = new JSONArray();
            for (Object item : dataList) {
                Class c = item.getClass();
                if (c == int.class || c == Integer.class ||
                        c == long.class || c == Long.class ||
                        c == float.class || c == Float.class ||
                        c == double.class || c == Double.class ||
                        c == boolean.class || c == Boolean.class ||
                        c == byte.class || c == Byte.class ||
                        c == char.class || c == Byte.class ||
                        c == short.class || c == Short.class ||
                        c == String.class) {
                    jsonArray.add(item);
                } else {
                    jsonArray.add(JSONObject.toJSON(item));
                }
            }
            json.put("rows", jsonArray);
        } else {
            json.put("rows", ArrayUtils.EMPTY_OBJECT_ARRAY);
        }
        return json;
    }


//    public static JSONObject page2Json(long total, JSONArray jsonArray) {
//        JSONObject json = new JSONObject();
//        json.put("totalProperty", total);
//        json.put("dataList", jsonArray);
//        return json;
//    }
//
//    public static JSONObject list2Json(List dataList) {
//        if (dataList == null || dataList.size() == 0) {
//            return page2Json(null);
//        }
//
//        JSONObject json = new JSONObject();
//        json.put("totalProperty", dataList.size());
//
//        JSONArray jsonArray = new JSONArray();
//        for (Object item : dataList) {
//            Class c = item.getClass();
//            if (c == int.class || c == Integer.class ||
//                    c == long.class || c == Long.class ||
//                    c == float.class || c == Float.class ||
//                    c == double.class || c == Double.class ||
//                    c == boolean.class || c == Boolean.class ||
//                    c == byte.class || c == Byte.class ||
//                    c == char.class || c == Byte.class ||
//                    c == short.class || c == Short.class ||
//                    c == String.class) {
//                jsonArray.add(item);
//            } else {
//                jsonArray.add(JSONObject.fromObject(item, WebJsonConfig.getInstance()));
//            }
//        }
//        json.put("dataList", jsonArray);
//
//        return json;
//    }
//
//    public static JSONObject list3Json(List dataList) {
//        if (dataList == null || dataList.size() == 0) {
//            return page2Json(null);
//        }
//
//        JSONObject json = new JSONObject();
//        json.put("totalProperty", dataList.size());
//        json.put("success", true);
//        JSONArray jsonArray = new JSONArray();
//        for (Object item : dataList) {
//            Class c = item.getClass();
//            if (c == int.class || c == Integer.class ||
//                    c == long.class || c == Long.class ||
//                    c == float.class || c == Float.class ||
//                    c == double.class || c == Double.class ||
//                    c == boolean.class || c == Boolean.class ||
//                    c == byte.class || c == Byte.class ||
//                    c == char.class || c == Byte.class ||
//                    c == short.class || c == Short.class ||
//                    c == String.class) {
//                jsonArray.add(item);
//            } else {
//                jsonArray.add(JSONObject.fromObject(item, WebJsonConfig.getInstance()));
//            }
//        }
//        json.put("data", jsonArray);
//
//        return json;
//    }
//
//    public static JSONObject page2Json(Page page) {
//        JSONObject json = new JSONObject();
//        if (page == null) {
//            json.put("totalProperty", 0);
//            json.put("dataList", ArrayUtils.EMPTY_OBJECT_ARRAY);
//            return json;
//        }
//
//        json.put("totalProperty", page.getTotalElements());
//        List dataList = page.getContent();
//        if (dataList != null && dataList.size() > 0) {
//            JSONArray jsonArray = new JSONArray();
//            for (Object item : dataList) {
//                Class c = item.getClass();
//                if (c == int.class || c == Integer.class ||
//                        c == long.class || c == Long.class ||
//                        c == float.class || c == Float.class ||
//                        c == double.class || c == Double.class ||
//                        c == boolean.class || c == Boolean.class ||
//                        c == byte.class || c == Byte.class ||
//                        c == char.class || c == Byte.class ||
//                        c == short.class || c == Short.class ||
//                        c == String.class) {
//                    jsonArray.add(item);
//                } else {
//                    jsonArray.add(JSONObject.fromObject(item, WebJsonConfig.getInstance()));
//                }
//            }
//            json.put("dataList", jsonArray);
//        } else {
//            json.put("dataList", ArrayUtils.EMPTY_OBJECT_ARRAY);
//        }
//        return json;
//    }
//
//    @SuppressWarnings({"rawtypes", "unchecked"})
//    public static JSONObject output(boolean success, String msg, JSONObject extData) {
//        Map map = new HashMap();
//        map.put("_success", success);
//        map.put("success", success);
//
//        map.put("_code", success ? 0 : 1);
//        map.put("_msg", msg);
//        map.put("errorMessage", msg);
//
//        if (extData == null || extData.equals("null")) {
//            extData = new JSONObject();
//        }
//
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.putAll(map);
//        jsonObject
//                .put("data", extData);
//
//        return jsonObject;
//    }
//
//    public static JSONObject success(String msg) {
//        return output(true, msg, null);
//    }
//
//    public static JSONObject success(String msg, Object object) {
//        JSONObject json = JSONObject.fromObject(object, WebJsonConfig.getInstance());
//        return output(true, msg, json);
//    }
//
//    public static String emptyVm() {
//        return "commons/empty";
//    }
//
//    public static JSONObject failure(String msg) {
//        return output(false, msg, null);
//    }
//
//    public static JSONObject failure(String msg, Object object) {
//        JSONObject json = JSONObject.fromObject(object, WebJsonConfig.getInstance());
//        return output(false, msg, json);
//    }
//
//    public static JSONObject emptyPage() {
//        return page2Json(null);
//    }
//
//}
//
//class WebJsonConfig extends JsonConfig {
//    public static WebJsonConfig getInstance() {
//        return instance;
//    }
//
//    private static WebJsonConfig instance = new WebJsonConfig();
//
//    private WebJsonConfig() {
//        this.registerJsonValueProcessor(java.util.Date.class, new MyDateJsonValueProcessor());
//        this.registerJsonValueProcessor(java.sql.Date.class, new MyDateJsonValueProcessor());
//        this.registerJsonValueProcessor(Timestamp.class, new MyDateJsonValueProcessor());
//        this.registerJsonValueProcessor(String.class, new MyStringJsonValueProcessor());
//
//        IgnoreFieldPropertyFilterImpl filter = new IgnoreFieldPropertyFilterImpl(null);
//        this.setJsonPropertyFilter(filter);
//    }
//
//    private class MyStringJsonValueProcessor implements JsonValueProcessor {
//        public Object processArrayValue(Object value, JsonConfig jsonConfig) {
//            if(null == value ){
//                return "" ;
//            }else{
//                if(value instanceof String){
//                    if("null".equals(value)){
//                        return "";
//                    }
//                }
//            }
//            return value.toString();
//        }
//
//        public Object processObjectValue(String s, Object object, JsonConfig jsonConfig) {
//            if(null == object ){
//                return "" ;
//            }else{
//                if(object instanceof String){
//                    if("null".equals(object)){
//                        return "";
//                    }
//                }
//            }
//            return object.toString();
//        }
//    }
//}
//
//class IgnoreFieldPropertyFilterImpl implements PropertyFilter {
//
//    /**
//     * 不需要过滤的属性名称
//     */
//    private String[] fields;
//
//    public IgnoreFieldPropertyFilterImpl() {
//    }
//
//    public IgnoreFieldPropertyFilterImpl(String[] pars) {
//        this.fields = pars;
//    }
//
//    public boolean apply(Object source, String name, Object value) {
//        if (value == null || "null".equals(value)) { // 值为空的属性 不转换为json
//            return true;
//        }
//
//        if (fields == null) { // fields为空 代表所有的非空属性都转换为json
//            return false;
//        }
//
//        if (fields != null && fields.length > 0) {
//            if (juge(fields, name)) {
//                return true;
//            } else {
//                return false;
//            }
//        }
//        return false;
//    }
//
//    /**
//     * 不需要过滤的属性
//     *
//     * @param s
//     * @param s2
//     * @return
//     */
//    public boolean juge(String[] s, String s2) {
//        for (String sl : s) {
//            if (s2.equals(sl)) {
//                return false;
//            }
//        }
//        return true;
//    }
}
