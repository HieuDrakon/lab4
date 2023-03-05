/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinhvien;

public class SinhVienIT extends SinhVienPoly {
	double diemJava;
	double diemCss;
	double diemHtml;
	public SinhVienIT(String nganh,String hoTen,double diemJava,double diemCss,double diemHtml) {
		super(hoTen,nganh);
		this.diemJava=diemJava;
		this.diemCss=diemCss;
		this.diemHtml=diemHtml;
	}
	@Override
	double getDiem() {
		return (2*diemJava+diemCss+diemHtml)/4;
	}
}
