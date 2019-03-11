package com.alibaba.cola.context;

/**
 *
 * 上下文在请求处理之前初始化，通常应该在拦截器中
 * Context is initialized before request processing, usually it should be in Interceptor,
 *
 * 并将通过在一个请求的所有层使用，这就是为什么它在命令和实体组合
 * and will be used through in all layers in one request, that is why it's composited in Command and Entity
 *
 * 注意上下文是无状态的，并且是线程安全的
 * Note that the Context is stateless and thread safe
 *
 * cola 框架的上下文
 * @author Frank Zhang
 * @date 2019-01-02 10:14 AM
 */

public class Context<T> {

    /**
     * bizCode用于扩展，命名应该遵循Java命名空间。
     * bizCode is used for Extension, the naming should follow Java namespace.
     *
     * For example: "ali.tmall.supermarket" means it is "天猫超市的业务编码"
     */
    private String bizCode;

    /**
     *
     * 这是应用程序定制的内容，不同的应用程序会有不同的上下文内容。
     * This is the content for application customization, different application would have different Context content.
     *
     * For example: in a typical application, the content might contain before info
     *
     * String userId;
     * String roleName;
     * String orgId;
     * String operatorId;
     */
    private T content;

    public String getBizCode() {
        return bizCode;
    }

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Context{" +
                "bizCode='" + bizCode + '\'' +
                ", content=" + content +
                '}';
    }
}
