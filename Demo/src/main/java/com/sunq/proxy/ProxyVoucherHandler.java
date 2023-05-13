package com.sunq.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 *
 * @author SunQiang
 * @since 1.0.0
 */
public class ProxyVoucherHandler implements InvocationHandler {

    private IVoucher voucher;

    public ProxyVoucherHandler(IVoucher voucher) {
        this.voucher = voucher;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(this.voucher, args);
        return "haha";
    }

    public static void main(String[] args) {
        EVoucher eVoucher = new EVoucher();
        eVoucher.setPay_account_no("123");

        InvocationHandler handler = new ProxyVoucherHandler(eVoucher);
        IVoucher proxyVoucher = (IVoucher) Proxy.newProxyInstance(EVoucher.class.getClassLoader(), new Class[]{IVoucher.class}, handler);
        String payAcctNo = proxyVoucher.getPayAcctNo();
        System.out.println("payAcctNo:" + payAcctNo);
    }
}
