package com.qfedu.test;

import com.qfedu.webxml.MobileCodeWS;
import com.qfedu.webxml.MobileCodeWSSoap;
import org.junit.Test;

/**
 * @author Buffer
 * @date 2020/8/4 9:49
 * @Description 测试 Git
 */
public class GitTest {
    @Test
    public void demo() {
        System.out.println("This is Git Test");
    }

    @Test
    public void testMobileNum() {
        MobileCodeWS mobileCodeWS = new MobileCodeWS();

        MobileCodeWSSoap mobileCodeWSSoap = mobileCodeWS.getMobileCodeWSSoap();

        String mobileCodeInfo = mobileCodeWSSoap.getMobileCodeInfo("18337259450", "");

        System.out.println(mobileCodeInfo);
    }
}