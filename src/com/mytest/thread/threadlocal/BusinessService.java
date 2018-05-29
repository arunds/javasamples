package com.mytest.thread.threadlocal;

import com.mytest.thread.threadlocal.Context;

public class BusinessService {

    public void businessMethod() {
        // get the context from thread local
        Context context = MyThreadLocal.get();
        System.out.println(context.getTransactionId());
    }
}