package com.atxzy.singleton;

public class Mgr03 {

    private static volatile Mgr03  INSTANCE;//要加上volatile

    private Mgr03(){

    }

    public static synchronized Mgr03 getINSTANCE(){
        if(INSTANCE == null) {
            synchronized (Mgr03.class) {
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    INSTANCE = new Mgr03();
                }
            }
        }
        return INSTANCE;

    }

    public static void main(String[] args) {
        for(int i = 0;i<100;i++) {
            new Thread(() -> System.out.println(Mgr03.getINSTANCE().hashCode())).start();
        }
    }

}
