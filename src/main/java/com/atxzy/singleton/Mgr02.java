package com.atxzy.singleton;

public class Mgr02 {

    private static Mgr02 INSTANCE ;

    private Mgr02(){

    }

    public static Mgr02 getINSTANCE(){
        if(INSTANCE == null){
            try{
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            INSTANCE = new Mgr02();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for(int i = 0 ;i<100;i++) {
            new Thread(()-> System.out.println(Mgr02.getINSTANCE())).start();

        }
    }

}
