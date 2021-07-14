/**
 * 
 */
package com.van.vuong.service;

import java.util.List;

import com.van.vuong.model.ChucVu;



/**
 * @author Admin
 *
 */
public interface ChuVuSevice {
	public List<ChucVu> getAllChucVu();

	public ChucVu addChucVu(ChucVu chucvu);

	public ChucVu searchChucVu(Integer id);
	
	public void deleteByIdChucVu(int id);
	
	public void updateChucVu(ChucVu chucvu);
	
	public ChucVu findByIdChucVu (int id);
	
	public List<ChucVu> findByNameChucVu (String maChucVu);
	
	public int checkInitChucVu (String maChucVu);

	
}
