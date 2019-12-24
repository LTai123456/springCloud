package com.example.demo;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        for (int i = 0; i < 50; i++) {
            ThreadA threadA = new ThreadA(service);
            threadA.start();
            threadA.sleep(1000);
        }
    }
}
class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.seckill();
    }
}