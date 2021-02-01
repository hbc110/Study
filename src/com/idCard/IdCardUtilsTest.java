package com.idCard;

public class IdCardUtilsTest {

    public static void main(String[] args) {
        String idCard_18 = "620105199003078473";
        String idCard_15 = "620105199003078";//number error
        String idCard_10 = "";
        System.out.println(idCard_18);
        System.out.println(idCard_15);
        System.out.println(IdCardUtils.validateIdCard18(idCard_18));
        System.out.println(IdCardUtils.validateIdCard15(idCard_15));
        System.out.println(IdCardUtils.validateIdCard10(idCard_10));
        System.out.println(IdCardUtils.conver15CardTo18(idCard_15)); // because of number error
        System.out.println(IdCardUtils.isNum(idCard_18));
        System.out.println(IdCardUtils.validateIdCard10(idCard_10));
        //System.out.println(IdCardUtils.validateTWCard(idCard_18)); // null
        System.out.println(IdCardUtils.validateHKCard(idCard_18));
        System.out.println(IdCardUtils.getYearByIdCard(idCard_18));
        System.out.println(IdCardUtils.getAgeByIdCard(idCard_18));
        System.out.println(IdCardUtils.getBirthByIdCard(idCard_18));
        System.out.println(IdCardUtils.getYearByIdCard(idCard_18));
        System.out.println(IdCardUtils.getMonthByIdCard(idCard_18));
        System.out.println(IdCardUtils.getDateByIdCard(idCard_18));
        System.out.println(IdCardUtils.getGenderByIdCard(idCard_18));
        System.out.println(IdCardUtils.getProvinceByIdCard(idCard_18));
    }
}
