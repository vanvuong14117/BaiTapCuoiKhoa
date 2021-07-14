/**
 * 
 */
package com.van.vuong.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.van.vuong.model.PhongBan;
import com.van.vuong.repository.NhanSuRepository;
import com.van.vuong.repository.PhongBanRepository;
import com.van.vuong.service.ChuVuSevice;
import com.van.vuong.service.PhongBanSevice;

/**
 * @author Admin
 *
 */
@Service
public class PhongBanSeviceimpl implements PhongBanSevice {

	@Autowired
	PhongBanRepository phongBanRepository;

	@Override
	public List<PhongBan> getAllPhongBan() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		List<PhongBan> listPhongBan = new ArrayList<PhongBan>();
		listPhongBan = phongBanRepository.findAll();
		return listPhongBan;
	}

	@Override
	public PhongBan addPhongBan(PhongBan phongBan) {
		// TODO Auto-generated method stub
		return phongBanRepository.save(phongBan);
	}

	@Override
	public PhongBan searchPhongBan(Integer id) {
		// TODO Auto-generated method stub
		return phongBanRepository.getById(id);
	}

	@Override
	public void deleteByIdPhongBan(int id) {
		// TODO Auto-generated method stub
		phongBanRepository.deleteById(id);
	}

	@Override
	public void updatePhongBan(PhongBan phongBan) {
		// TODO Auto-generated method stub
		PhongBan phongBanNew = findByIdPhongBan(phongBan.getId());
		if (StringUtils.hasText(phongBan.getMaPhongBan())) {
			phongBanNew.setMaPhongBan(phongBan.getMaPhongBan());
		}
		if (StringUtils.hasText(phongBan.getTenPhongBan())) {
			phongBanNew.setTenPhongBan(phongBan.getTenPhongBan());
		}
		if (StringUtils.hasText(phongBan.getMoTa())) {
			phongBanNew.setMoTa(phongBan.getMoTa());
		}
	}

	@Override
	public PhongBan findByIdPhongBan(int id) {
		// TODO Auto-generated method stub
		return phongBanRepository.findById(id).get();
	}

	@Override
	public List<PhongBan> findByNamePhongBan(String maPhongBan) {
		// TODO Auto-generated method stub
		return phongBanRepository.getByName(maPhongBan);
	}

	@Override
	public int checkInit(String maPhongBan) {
		// TODO Auto-generated method stub
		return 0;
	}

}
