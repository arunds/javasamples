package com.mytest.thread;
public class Notifier implements Runnable {
 
    private Message msg;
     
    public Notifier(Message msg) {
        this.msg = msg;
    }
 
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        //System.out.println(name+" started");
        try {
            Thread.sleep(1000);
            synchronized (msg) {
                msg.setMsg(name+" Notifier work done");
                System.out.println("B4 Notify" + name);
                //msg.notify();
                msg.notifyAll();
                System.out.println("After Notify" + name);
                
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         
    }
 
}