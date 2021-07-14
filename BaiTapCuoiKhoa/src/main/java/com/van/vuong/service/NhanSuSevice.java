/**
 * 
 */
package com.van.vuong.service;

import java.util.List;

import com.van.vuong.model.ChucVu;
import com.van.vuong.model.NhanSu;

/**
 * @author Admin
 *
 */
public interface NhanSuSevice {

	public List<NhanSu> getAllNhanSu();

	public NhanSu addNhanSu(NhanSu nhanSu);

	public NhanSu searchNhanSu(Integer id);

	public void deleteByIdNhanSu(int id);

	public void updateNhanSu(NhanSu nhanSu);

	public NhanSu findByIdNhanSu(int id);

	public List<NhanSu> findByNameNhanSu(String maNhanSu);

	public int checkInit(String maNhanSu);

}
