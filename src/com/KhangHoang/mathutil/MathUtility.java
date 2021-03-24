/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.KhangHoang.mathutil;

/**
 *
 * @author abc
 */
public class MathUtility {

    //class nay chua cac ham toan hoc fake lai class chuan JDK
    //java.ultil.Math ben trong chua cac ham toan hoc sqrt() abs() sin().
    // cai gi ma dung chung cho moi noi, thi ta se dat la sta tic
    public static final double PI = 3.1415;

    //Ham dung chung tinh giai thua ()
    //quy uc n! = 1.2.3.4..n
    //ko co giai thua so am
    //giai thua tang rat nhanh, 20! vừa khớp kiểu long
    //21! tràn long, bị sai nếu ráng lưu biến kiểu long
    //long:10^18 con số 0
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid argument. N must be between ");
        
        //CPU chay den day, sure n tuwf 0..20
        if (n == 0 || n == 1) 
            return 1;
        
        //CPU chay den day sure n = 2..20
        long result = 1; // co tinh 
        for (int i = 2; i <= n; i++) 
            result *= i;
        
        return result;
    }
}
