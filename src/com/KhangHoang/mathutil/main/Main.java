/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.KhangHoang.mathutil.main;

import com.KhangHoang.mathutil.MathUtility;

/**
 *
 * @author abc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // System.out.println("Hello");
       long expected = 120; // tui hy vong 120 la gia tri tra ve
       int n = 5;           // neu tu tinh 5!
       long actual = MathUtility.getFactorial(n);
        System.out.println("Expected: " + expected + "; Actual: " + actual);
        //tinh huong test so 2, 0! xem sao?
        //Tinh huong tes, tinh huong xai, goi la test case
        expected = 1;
        n = 0;
        actual = MathUtility.getFactorial(n);
        // dung mat de so sanh again
        System.out.println("Expected: " + expected + "; Actual: " + actual);
        
    }
    
}
// tỏng quy trinh lap tring chuye nguyen o cac cty, dac biet lam cho jp
// moi ham/class ban viet ra deu phai dc tét ki cang truoc khi ghepo
//no vao trong cac cum tinh nang, va ghep voi UI, back-end
//lam sao de tét cac ham , cac class
//dan dav co nhieu cac
//1. cach 1; sout(ket qua xu li cua ham)
//2. cac 2: Joptionpane (pop-up len ket qua xu li ham ) ben java desktop
//3.cach3: ghi vao Log file trong mon java web, hay in ket qua xu li 
// ra 1 trang web tam nao do
// voi 3 cach nay, ta goi ham, nhin ket qua tra ve cua ham -actuak value 
// va ta ngam so sánh với các kết quả mà ta  tự tính toán trước đó 
// khi chưa gọi hàm ta gọi là giá trị kì vọng - EXPECTED VALUE
//Á ĐÙ, HÀM CHẠY ĐÚNG
    //NẾU KO BẰNG, ĐÙ, HÀM XỬ LÍ SAI
//3 CÁCH TRÊN ĐÒI HỎI DEV PHẢI DÙNG MẮT ĐỂ LUẬN KẾT QUẢ ĐÚNG SAI
// NẾU NHIỀU TEST CASE CAANF PHAIR TEST, TA RẤT DỄ BỎ SÓT, NHÌN SAI KẾT QUẢ
// TEST KHI CODE VỪA MỚI XONG TỪNG HÀM GỌI LÀ UNIT TEST

//CÒN CÁCH XIN XÒ THỨ 4
//TA KHÔNG CẦN NHÌN BẰNG MẮT TỪNG TRƯỜNG HỢP SỬ DỤNG HÀM
// NHỜ MÁY SO SÁNG GIÙM ACTUAL VỚI EXPECTED LUÔN
//VÀ NẾU TÁT CẢ CÁC TÌNH HUỐNG ĐỀU KHỚP , BẰNG NHAU, NÉM RA 1 MÀU XANH
//NÊU HẦU HẾT ĐỀU KHỚP , CHỈ CÓ ÍT NHẤT 1 CÁI KHONG KHỚP , HÀM KHÔNG ỔN ĐỊNH
//NÉM RA MÀU ĐỎ -> CẢNH CÁO DÂN DEV CODE CÓ TRỤC TRẶC
//VẬY LKUCS NÀY TA CHỈ NHÌN MÀU LÀ ĐỦ , KHÔNG CÀN LUẬN TỪNG KẾT QUẢ
//KĨ THUẬT NÀY GỌI LÀ TÉ DRIVEN DEVELOPMENT + TEST AUTOMATION
//VỪA VIẾT CODE VỪA VIẾT TEST, TỰ ĐỘNG HÓA VIỆC TEST
//MUỐN LÀM DC ĐIỀU NÀY , TA CẦN THÊM THƯ VIỆN PHỤ TRỢ ĐỂ TUNG RA MÀU
//THƯ VIỆN NÀY ĐỀU CÓ TƯƠNG ỨNG Ở CÁC NGÔN NGỮ LẬP TRÌNH
//JAVA:JUNIT, TESTnG...
//c#: nUNIT, XuNIT,msTEST
//PHP: PHPUNIT
//..