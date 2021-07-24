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

import com.van.vuong.model.ChucVu;
import com.van.vuong.service.ChuVuSevice;

/**
 * @author Admin
 *
 */

@RestController
@RequestMapping("/api")
public class ApiChucVuController {

	@Autowired
	ChuVuSevice chuVuSevice;

	@GetMapping("/getAllChucVu")
	public List<ChucVu> getAllUser() {
		List<ChucVu> chucVu = chuVuSevice.getAllChucVu();
		return chucVu;
	}

	@GetMapping("/chucvu/{userId}")
	public ChucVu getUserById(@PathVariable("userId") int id) {
		return chuVuSevice.findByIdChucVu(id);
	}

	@GetMapping("/chucvu/param")
	public ChucVu getUserByIdParam(@RequestParam(name = "userId") int id) {
		return chuVuSevice.findByIdChucVu(id);
	}

	@GetMapping("/searchMaChucVu")
	public ResponseEntity<ChucVu> searchUser(@RequestParam(name = "chucVuSearch") String maChucVu) {
		ChucVu chucVu = new ChucVu();
		if (StringUtils.hasText(maChucVu)) {
			chucVu = chuVuSevice.findByMaChucVu(maChucVu);
		}
		return new ResponseEntity<ChucVu>(chucVu, HttpStatus.OK);
	}

	@PostMapping("/addChucVu")
	public ResponseEntity<ChucVu> addChucVu(@RequestBody ChucVu chucVu) {
		ChucVu newChucVu = new ChucVu();
		if (chucVu != null) {
			newChucVu = chuVuSevice.addChucVu(chucVu);
		}
		return new ResponseEntity<ChucVu>(newChucVu, HttpStatus.OK);
	}

	@DeleteMapping("/deleteChucVu")
	public String deleteUser(@RequestParam("id") int id) {
		chuVuSevice.deleteByIdChucVu(id);
		return "Success";
	}

	@PutMapping("/updateChucVu")
	public String updateUser(@RequestBody ChucVu chucVu) {
		ChucVu newChucVu = chucVu;
		if (chucVu != null) {
			chuVuSevice.updateChucVu(newChucVu);
		}
		return "Success";
	}

}
