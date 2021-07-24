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
@Table(name = "phong_ban")
@Entity
public class PhongBan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String maPhongBan;
	private String tenPhongBan;
	private String moTa;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMaPhongBan() {
		return maPhongBan;
	}

	public void setMaPhongBan(String maPhongBan) {
		this.maPhongBan = maPhongBan;
	}

	public String getTenPhongBan() {
		return tenPhongBan;
	}

	public void setTenPhongBan(String tenPhongBan) {
		this.tenPhongBan = tenPhongBan;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public PhongBan(int id, String maPhongBan, String tenPhongBan, String moTa) {
		super();
		this.id = id;
		this.maPhongBan = maPhongBan;
		this.tenPhongBan = tenPhongBan;
		this.moTa = moTa;
	}

	public PhongBan() {
		super();
	}

	@Override
	public String toString() {
		return "PhongBan [id=" + id + ", maPhongBan=" + maPhongBan + ", tenPhongBan=" + tenPhongBan + ", moTa=" + moTa
				+ "]";
	}

}
