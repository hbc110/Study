package com.InterfaceTests.PlayerImpl;
/*
 *  篮球运动员和教练
    乒乓球运动员和教练
    现在篮球运动员和教练要出国访问,需要学习英语
    请根据你所学的知识,分析出来哪些是类,哪些是抽象类,哪些是接口
 */
public class InterfaceTest {
    public static void main(String[] args) {
        //创建篮球运动员对象
        BasketBallPlayer bbp = new BasketBallPlayer();
        bbp.name = "姚明";
        bbp.age = 40;
        bbp.gender = "男";
        bbp.sleep();
        bbp.study();
        bbp.speak();
        System.out.println("------------");
        //创建乒乓球教练对象
        PingpangCoach ppc = new PingpangCoach();
        ppc.name = "刘胖子";
        ppc.age = 30;
        ppc.gender = "男";
        ppc.sleep();
        ppc.teach();
        //ppc.speak();
    }
}
