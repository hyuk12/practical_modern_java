package org.example.chapter04;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread  = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        });
        thread.start();
        // 해당 익명 함수를 람다식으로 바꿔보기
        Thread thread1 = new Thread(() -> {
            System.out.println("Hello World");
        });

        
    }
}
