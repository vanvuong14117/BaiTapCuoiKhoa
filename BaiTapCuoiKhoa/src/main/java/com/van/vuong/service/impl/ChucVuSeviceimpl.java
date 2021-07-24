/**
 * 
 */
package com.van.vuong.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.van.vuong.model.ChucVu;
import com.van.vuong.repository.ChucVuRepository;
import com.van.vuong.service.ChuVuSevice;

/**
 * @author Admin
 *
 */
@Service
public class ChucVuSeviceimpl implements ChuVuSevice {
	@Autowired
	ChucVuRepository chucVuRepository;

	@Override
	public List<ChucVu> getAllChucVu() {
		// TODO Auto-generated method stub
		List<ChucVu> listChucVu = new ArrayList<ChucVu>();
		listChucVu = chucVuRepository.findAll();
		return listChucVu;
	}

	@Override
	public ChucVu addChucVu(ChucVu chucvu) {
		// TODO Auto-generated method stub
		return chucVuRepository.save(chucvu);
	}

	@Override
	public ChucVu searchChucVu(Integer id) {
		// TODO Auto-generated method stub
		return chucVuRepository.getById(id);
	}

	@Override
	public void deleteByIdChucVu(int id) {
		// TODO Auto-generated method stub
		chucVuRepository.deleteById(id);
	}

	@Override
	public void updateChucVu(ChucVu chucvu) {
		// TODO Auto-generated method stub
		ChucVu chucVuNew = findByIdChucVu(chucvu.getId());
		if (StringUtils.hasText(chucvu.getMaChucVu())) {
			chucVuNew.setMaChucVu(chucvu.getMaChucVu());
		}
		if (StringUtils.hasText(chucvu.getTenChucVu())) {
			chucVuNew.setTenChucVu(chucvu.getTenChucVu());
		}
		if (StringUtils.hasText(chucvu.getMoTa())) {
			chucVuNew.setMoTa(chucvu.getMoTa());
		}
		chucVuRepository.save(chucVuNew);
	}

	@Override
	public ChucVu findByIdChucVu(int id) {
		// TODO Auto-generated method stub
		return chucVuRepository.findById(id).get();
	}

	@Override
	public ChucVu findByNameChucVu(String tenChucVu) {
		// TODO Auto-generated method stub
		return chucVuRepository.getByTenChucVu(tenChucVu);
	}

	@Override
	public int checkInitChucVu(String maChucVu) {
		// TODO Auto-generated method stub
		int result = -1;
		result = chucVuRepository.checkInitByMaChucVu(maChucVu);
		return result;

	}

	@Override
	public ChucVu findByMaChucVu(String maChucVu) {
		// TODO Auto-generated method stub
		return chucVuRepository.getByMaChucVu(maChucVu);
	}

}
