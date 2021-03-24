/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.KhangHoang.mathutil.test;

import com.KhangHoang.mathutil.MathUtility;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author abc
 */

public class MathUtilityTest {
    
    // ta se viet nhung doa code o day de test cái hàm chính getFactorial()
    // bên MathUtility coi mày chạy có đúng ko 
    // viết code để test code chính
    //đúng sai ở đây chúng tôi dunhf màu sắc XANH ĐỎ
     //biến hàm thường thành hàm main()
    //Shift-F6 để chạy
    @Test
    public void testFactorialGivenRightArgumenReturnsGoodResult(){
        long expected = 120;
        int n = 5; // tui muốn tính 5!
        long actual = MathUtility.getFactorial(n);
        assertEquals(expected, actual);
        //khop mau xanh , xai lech mau do
        // mau xanh xuat hien khi tat ca cac tinh huong xai ham
        // test case deu mau xanh// mau do xuat hien ngay khi co it nhat 1 thang do
        //                 mot test case sai , tat ca bo di
        //an y: ham da dung phai dung cho tat ca cac tinh huong
        //minh tes
        assertEquals(720, MathUtility.getFactorial(6));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(1, MathUtility.getFactorial(0));
        //khi mau do thi co 2 tinh huong: ham tinh sai khong nhi ki vong
        //                                ham tinh dung, ban ki vong sai
    }
    //ta se di test ham co nem ra ngoai le nhu thie ke ko
    // ham dc thiet ke rang: dua tham so 0..20-> tinhs dung n !
    //                       nem ra ngoai le canh bao sai tham so, ngoai mien gia tri tinh dc
    //chot : dua tham so ca chon phai nem ve ngoai le
    //       neu thy dung la nem ve ngoai le khi dua tham so ca chon thi ket luan ham dung, Xanh
    //thay ngoai le khi dua n ca chon, mung roi nuoc mat vi ham chay dung nhu thiet ke
    //ngoai le xuat hien khi -5! thi la ham dung ma
    //ngoai le thi ko phai la gia tri de so sanh kieu assertEquals()
    //vay ta phai dung keiu khac!!
    //@Test(expected = Exception.class) // khong nen bat muc cao nhat mac du ko sai
    //@Test(expected = IllegalArgumentException.class)
    public void getFactorialGivenWrongArgumentThrowException(){
        MathUtility.getFactorial(40);
        MathUtility.getFactorial(-40);
    } 
    
}
