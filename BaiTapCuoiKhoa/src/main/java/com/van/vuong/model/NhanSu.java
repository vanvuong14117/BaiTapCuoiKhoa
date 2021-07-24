/**
 * 
 */
package com.van.vuong.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Admin
 *
 */
@Table(name = "nhan_su")
@Entity
public class NhanSu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String ten;
	private String ngaysinh;
	private String cmt;

	@ManyToOne
	@JoinColumn(name = "phongban_id", nullable = false)
	// phongban_id giong khoa ngoai, la 1 cot trong table nhan su
	// ten name = "phongban_id" = 1 , get nguyen cai fong ban = 1 bo vao bien nay
	private PhongBan phongBan;

	@OneToOne
	@JoinColumn(name = "chucvu_id", nullable = false)
	private ChucVu chucVu;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getCmt() {
		return cmt;
	}

	public void setCmt(String cmt) {
		this.cmt = cmt;
	}

	public PhongBan getPhongBan() {
		return phongBan;
	}

	public void setPhongBan(PhongBan phongBan) {
		this.phongBan = phongBan;
	}

	public ChucVu getChucVu() {
		return chucVu;
	}

	public void setChucVu(ChucVu chucVu) {
		this.chucVu = chucVu;
	}

	public NhanSu(int id, String ten, String ngaysinh, String cmt, PhongBan phongBan, ChucVu chucVu) {
		super();
		this.id = id;
		this.ten = ten;
		this.ngaysinh = ngaysinh;
		this.cmt = cmt;
		this.phongBan = phongBan;
		this.chucVu = chucVu;
	}

	public NhanSu(int id, String ten, String ngaysinh, String cmt) {
		super();
		this.id = id;
		this.ten = ten;
		this.ngaysinh = ngaysinh;
		this.cmt = cmt;
	}

	public NhanSu(int id, String ten, String ngaysinh, String cmt, PhongBan phongBan) {
		super();
		this.id = id;
		this.ten = ten;
		this.ngaysinh = ngaysinh;
		this.cmt = cmt;
		this.phongBan = phongBan;
	}

	public NhanSu(int id, String ten, String ngaysinh, String cmt, ChucVu chucVu) {
		super();
		this.id = id;
		this.ten = ten;
		this.ngaysinh = ngaysinh;
		this.cmt = cmt;
		this.chucVu = chucVu;
	}

	public NhanSu() {
		super();
	}

}
