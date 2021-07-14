/**
 * 
 */
package com.van.vuong.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Admin
 *
 */

@Table(name = "chuc_vu")
@Entity

public class ChucVu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String maChucVu;
	private String tenChucVu;
	private String moTa;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMaChucVu() {
		return maChucVu;
	}
	public void setMaChucVu(String maChucVu) {
		this.maChucVu = maChucVu;
	}
	public String getTenChucVu() {
		return tenChucVu;
	}
	public void setTenChucVu(String tenChucVu) {
		this.tenChucVu = tenChucVu;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	@Override
	public String toString() {
		return "ChucVu [id=" + id + ", maChucVu=" + maChucVu + ", tenChucVu=" + tenChucVu + ", moTa=" + moTa + "]";
	}
	public ChucVu(int id, String maChucVu, String tenChucVu, String moTa) {
		super();
		this.id = id;
		this.maChucVu = maChucVu;
		this.tenChucVu = tenChucVu;
		this.moTa = moTa;
	}
	public ChucVu() {
		super();
	}
	
	

}
