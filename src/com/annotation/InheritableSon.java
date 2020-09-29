package com.annotation;


import java.lang.annotation.*;

/**
 * 自定义的Annotation
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

/*
当注解 Inheritable 被 @Inherited 标注时，它具有继承性。否则，没有继承性。
 */

//@Inherited



@interface Inheritable
{

}

@Inheritable
class InheritableFather{
    public InheritableFather(){
        // InheritableBase是否具有 Inheritable Annotation
        System.out.println("InheritableFather:"+InheritableFather.class.isAnnotationPresent(Inheritable.class));
    }
}

/**
 * InheritableSon 类只是继承于 InheritableFather
 */
public class InheritableSon extends InheritableFather{
    public  InheritableSon(){
        super(); //调用父类的构造函数
        // InheritableSon类是否具有 Inheritable Annotation
        System.out.println("InheritableSon:"+InheritableSon.class.isAnnotationPresent(Inheritable.class));
    }

    public static void main(String[] args) {
        InheritableSon is = new InheritableSon();
    }
}
