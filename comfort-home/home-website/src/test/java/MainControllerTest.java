import com.alibaba.fastjson.JSONObject;
import com.zhonghua.comfortable.home.util.HttpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @program: cf-home
 * @description: ${description}
 * @author: mazeguo
 * @create: 2019-01-01 22:21
 **/
public class MainControllerTest {
    private static final Logger logger = LoggerFactory.getLogger(MainControllerTest.class);
//    private static final String host = "http://localhost:8080/";
    private static final String host = "http://59.110.152.117/home/";



    public void testProductList() {
        String result = HttpUtils.sendGet(host + "product.ajax", "");
        logger.warn(result);
    }

    public void testQuote(String ps, float usableArea) throws UnsupportedEncodingException {
        JSONObject object = new JSONObject();
        object.put("phoneNum", "18910328375");
        object.put("userName", "马泽国");
        object.put("ps", ps);
        object.put("type", "1");
        object.put("usableArea", usableArea);
        object.put("liveCount", "1");
        object.put("parlorCount", "1");
        object.put("roomCount", "2");
        String result = HttpUtils.sendGet(host + "quote.ajax", "d=" + URLEncoder.encode(object.toJSONString(), "utf-8"));
        logger.warn("ps:[ " + ps + " ] , usableArea :[ " + usableArea + " ],result：" + result);
    }

    public static void main(String[] args) throws Exception {
        MainControllerTest test = new MainControllerTest();
//        test.testProductList();

        test.testQuote("10001,20001,30001,40001,50001,60001", 80); //28950--40500，

//        test.testQuote("10002,20002,30001,40002,50002,60002",80);
//
//        test.testQuote("10003,20003,30002,40003,50003,60002", 80);
//
//        test.testQuote("10004,20004,30002,40003,50001,60002", 80);
//
//        test.testQuote("10001,20001,30001,40001,50001,60001", 90);
//        test.testQuote("10002,20002,30001,40002,50002,60002", 90);
//        test.testQuote("10003,20003,30002,40003,50003,60002", 90);
//        test.testQuote("10004,20004,30002,40003,50001,60002", 90);
//
//        test.testQuote("10001,20001,30001,40001,50001,60001", 120);
//        test.testQuote("10002,20002,30001,40002,50002,60002", 120);
//        test.testQuote("10003,20003,30002,40003,50003,60002", 120);
//        test.testQuote("10004,20004,30002,40003,50001,60002", 120);
//
//        test.testQuote("10001,20001,30001,40001,50001,60001", 150);
//        test.testQuote("10002,20002,30001,40002,50002,60002", 150);
//        test.testQuote("10003,20003,30002,40003,50003,60002", 150);
//        test.testQuote("10004,20004,30002,40003,50001,60002", 150);
//
//        test.testQuote("10001,20001,30001,40001,50001,60001", 200);
//        test.testQuote("10002,20002,30001,40002,50002,60002", 200);
//        test.testQuote("10003,20003,30002,40003,50003,60002", 200);
//        test.testQuote("10004,20004,30002,40003,50001,60002", 200);
//
//        test.testQuote("10001,20001,30001,40001,50001,60001", 250);
//        test.testQuote("10002,20002,30001,40002,50002,60002", 250);
//        test.testQuote("10003,20003,30002,40003,50003,60002", 250);
//        test.testQuote("10004,20004,30002,40003,50001,60002", 250);
//
//        test.testQuote("10001,20001,30001,40001,50001,60001", 180);
//        test.testQuote("10003,20003,30002,40003,50003,60002", 180);
//
//        test.testQuote("10001,20001,30001,40001,50001,60001", 350);
//        test.testQuote("10003,20003,30002,40003,50003,60002", 350);
//
//        test.testQuote("10001,20001,30001,40001,50001,60001", 400);
//        test.testQuote("10003,20003,30002,40003,50003,60002", 400);
    }

}
