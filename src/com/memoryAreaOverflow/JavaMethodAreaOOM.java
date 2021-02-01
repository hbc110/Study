package com.memoryAreaOverflow;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 方法区溢出
 * VM Args: -XX:PermSize=10M -XX:MaxPermSize=10M
 * java 8中被废除了以上VM参数写法
 */
public class JavaMethodAreaOOM {
    static class OOMObject{

    }
    public static void main(String[] args) {
        while (true){
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(OOMObject.class);
            enhancer.setUseCache(false);
            enhancer.setCallback((new MethodInterceptor() {
                @Override
                public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                    return methodProxy.invokeSuper(o,args);
                }
            }));
            enhancer.create();
        }
    }
}
