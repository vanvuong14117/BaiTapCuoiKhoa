/**
 * 
 */
package com.van.vuong.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.van.vuong.model.NhanSu;
import com.van.vuong.repository.NhanSuRepository;
import com.van.vuong.service.NhanSuSevice;

/**
 * @author Admin
 *
 */
@Service
public class NhanSuSeviceimpl implements NhanSuSevice {

	@Autowired
	NhanSuRepository nhanSuRepository;

	@Override
	public List<NhanSu> getAllNhanSu() {
		List<NhanSu> listNhanSu = new ArrayList<NhanSu>();
		listNhanSu = nhanSuRepository.findAll();
		return listNhanSu;
	}

	@Override
	public NhanSu addNhanSu(NhanSu nhanSu) {
		return nhanSuRepository.save(nhanSu);
	}

	@Override
	public NhanSu searchNhanSu(Integer id) {
		return nhanSuRepository.getById(id);
	}

	@Override
	public void deleteByIdNhanSu(int id) {
		nhanSuRepository.deleteById(id);
	}

	@Override
	public void updateNhanSu(NhanSu nhanSu) {
		NhanSu nhanSuNew = findByIdNhanSu(nhanSu.getId());
		if (StringUtils.hasText(nhanSu.getTen())) {
			nhanSuNew.setTen(nhanSu.getTen());
		}
		if (StringUtils.hasText(nhanSu.getNgaysinh())) {
			nhanSuNew.setNgaysinh(nhanSu.getNgaysinh());
		}
		if (StringUtils.hasText(nhanSu.getCmt())) {
			nhanSuNew.setCmt(nhanSu.getCmt());
		}
		if (nhanSu.getChucVu()!= null) {
			nhanSuNew.setChucVu(nhanSu.getChucVu());
		}
		if (nhanSu.getPhongBan() != null) {
			nhanSuNew.setPhongBan(nhanSu.getPhongBan());
		}
		nhanSuRepository.save(nhanSuNew);
	}

	@Override
	public NhanSu findByIdNhanSu(int id) {
		return nhanSuRepository.findById(id).get();
	}

	@Override
	public NhanSu findByNameNhanSu(String maNhanSu) {
		return nhanSuRepository.getByName(maNhanSu);
	}

	@Override
	public int checkInit(String maNhanSu) {
		return 0;
	}

	@Override
	public List<NhanSu> findNhanSuByChucVu(int idChucVu) {
		
		return nhanSuRepository.getNhanSuByPhongBan(idChucVu);
	}

	@Override
	public List<NhanSu> findNhanSuByNamePhongBan(int idPhongBan) {
		return nhanSuRepository.getNhanSuByPhongBan(idPhongBan);
	}


}
