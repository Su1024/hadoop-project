package com.ruozedata.bigdata.log.utils;


import com.ruozedata.bigdata.log.dto.Access;
import org.junit.Test;

public class UploadUtilsTest {

    public static final String URL = "http://127.0.0.1:9898/log/upload";

    @Test
    public void testUpload() {
        for (int i = 0; i < 100; i++) {
            Access access = new Access();
            access.setAgentIp(i + "ip123");
            UploadUtils.upload(URL, access.toString());
        }
    }
}