/**
 * 
 */
package com.van.vuong.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.van.vuong.model.PhongBan;
import com.van.vuong.service.PhongBanSevice;

/**
 * @author Admin
 *
 */

@RestController
@RequestMapping("/api")
public class ApiPhongBanController {

	@Autowired
	PhongBanSevice phongBanSevice;

	@GetMapping("/getAllPhongBan")
	public List<PhongBan> getAllPhongBan() {
		List<PhongBan> chucVu = phongBanSevice.getAllPhongBan();
		return chucVu;
	}

	@GetMapping("/phongban/{userId}")
	public PhongBan getPhongBanById(@PathVariable("userId") int id) {
		return phongBanSevice.findByIdPhongBan(id);
	}

	@GetMapping("/phongban/param")
	public PhongBan getPhongBanByIdParam(@RequestParam(name = "userId") int id) {
		return phongBanSevice.findByIdPhongBan(id);
	}

	@GetMapping("/searchMaPhongBan")
	public ResponseEntity<PhongBan> searchPhongBan(@RequestParam(name = "phongBanSearch") String maPhongBan) {
		PhongBan phongban = new PhongBan();
		if (StringUtils.hasText(maPhongBan)) {
			phongban = phongBanSevice.findByMaPhongBan(maPhongBan);
		}
		return new ResponseEntity<PhongBan>(phongban, HttpStatus.OK);
	}

	@PostMapping("/addPhongBan")
	public ResponseEntity<PhongBan> addPhongBan(@RequestBody PhongBan phongBan) {
		PhongBan newPhongBan = new PhongBan();
		if (phongBan != null) {
			newPhongBan = phongBanSevice.addPhongBan(phongBan);
		}
		return new ResponseEntity<PhongBan>(newPhongBan, HttpStatus.OK);
	}

	@DeleteMapping("/deletePhongBan")
	public String deletePhongBan(@RequestParam("id") int id) {
		phongBanSevice.deleteByIdPhongBan(id);
		return "Success";
	}

	@PutMapping("/updatePhongBan")
	public String updatePhongBan(@RequestBody PhongBan phongBan) {
		PhongBan newPhongBan = phongBan;
		if (phongBan != null) {
			phongBanSevice.updatePhongBan(newPhongBan);
		}
		return "Success";
	}

}
