/**
 * 
 */
package com.van.vuong.service;

import java.util.List;

import com.van.vuong.model.PhongBan;

/**
 * @author Admin
 *
 */
public interface PhongBanSevice {
	public List<PhongBan> getAllPhongBan();

	public PhongBan addPhongBan(PhongBan phongBan);

	public PhongBan searchPhongBan(Integer id);

	public void deleteByIdPhongBan(int id);

	public void updatePhongBan(PhongBan phongBan);

	public PhongBan findByIdPhongBan(int id);

	public PhongBan findByMaPhongBan(String maPhongBan);

	public List<PhongBan> findByNamePhongBan(String maPhongBan);

	public int checkInit(String maPhongBan);

}
