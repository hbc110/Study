package com.PolymorphicTest.MiFactoryPhone;

class MiFactory {

    /*
    public  void createPhone(MiNote mi){
        mi.call();
    }

    public  void createPhone(RedMi mi){
        mi.call();
    }
     */

    public void createPhone(Phone p){
        p.call();
    }
}
