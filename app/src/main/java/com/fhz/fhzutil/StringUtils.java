package com.fhz.fhzutil;

/**
 * 时间:11/10/21
 *
 * @author msfeng
 * 简述: TODO
 */
public class StringUtils {
    public static boolean isEmpty(String s){
        if(s.trim().equals("") || null == s){
            return true;
        }
        return false;
    }
}
