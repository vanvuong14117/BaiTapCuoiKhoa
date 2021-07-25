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

	public ChucVu addChucVu(ChucVu chucVu);

	public ChucVu searchChucVu(Integer idChucvu);

	public void deleteByIdChucVu(int idChucvu);

	public void updateChucVu(ChucVu chucVu);

	public ChucVu findByIdChucVu(int idChucvu);

	public ChucVu findByMaChucVu(String maChucVu);

	public ChucVu findByNameChucVu(String maChucVu);

	public int checkInitChucVu(String maChucVu);

}
