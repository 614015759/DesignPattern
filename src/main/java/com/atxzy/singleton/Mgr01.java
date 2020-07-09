package com.atxzy.singleton;

import sun.awt.windows.ThemeReader;

public class  Mgr01 {

    private Mgr01(){

    }

    private static class MgrINSTANCE{

        private static Mgr01 INSTANCE= new Mgr01();
    }
    public static Mgr01 getINSTANCE(){
        return MgrINSTANCE.INSTANCE;
    }


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(Mgr01.getINSTANCE().hashCode())).start();

        }

    }
}
