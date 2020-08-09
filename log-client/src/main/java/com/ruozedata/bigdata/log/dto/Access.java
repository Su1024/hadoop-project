package com.ruozedata.bigdata.log.dto;

/**
 * @ClassName Access
 * @Description
 * @Author suguoming
 * @Date 2020/8/9 7:38 下午
 */
public class Access {
    private String dateStr;
    private String ipStr;
    private String agentIp;
    private Integer responseTime;
    private String referer;
    private String method;
    private String url;
    private String methodUrl;
    private Integer httpCode;
    private Integer requestSize;
    private String responseSize;
    private String cacheStatus;
    private String uaHead;
    private String type;

    public Access() {
    }

    @Override
    public String toString() {
        return dateStr + "\t" +
                ipStr + "\t" +
                agentIp + "\t" +
                responseTime + "\t" +
                referer + "\t" +
                method + "\t" +
                url + "\t" +
                methodUrl + "\t" +
                httpCode + "\t" +
                requestSize + "\t" +
                responseSize + "\t" +
                cacheStatus + "\t" +
                uaHead + "\t" +
                type;
    }


    public String getDateStr() {
        return dateStr;
    }

    public void setDateStr(String dateStr) {
        this.dateStr = dateStr;
    }

    public String getIpStr() {
        return ipStr;
    }

    public void setIpStr(String ipStr) {
        this.ipStr = ipStr;
    }

    public String getAgentIp() {
        return agentIp;
    }

    public void setAgentIp(String agentIp) {
        this.agentIp = agentIp;
    }

    public Integer getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(Integer responseTime) {
        this.responseTime = responseTime;
    }

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethodUrl() {
        return methodUrl;
    }

    public void setMethodUrl(String methodUrl) {
        this.methodUrl = methodUrl;
    }

    public Integer getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
    }

    public Integer getRequestSize() {
        return requestSize;
    }

    public void setRequestSize(Integer requestSize) {
        this.requestSize = requestSize;
    }

    public String getResponseSize() {
        return responseSize;
    }

    public void setResponseSize(String responseSize) {
        this.responseSize = responseSize;
    }

    public String getCacheStatus() {
        return cacheStatus;
    }

    public void setCacheStatus(String cacheStatus) {
        this.cacheStatus = cacheStatus;
    }

    public String getUaHead() {
        return uaHead;
    }

    public void setUaHead(String uaHead) {
        this.uaHead = uaHead;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
