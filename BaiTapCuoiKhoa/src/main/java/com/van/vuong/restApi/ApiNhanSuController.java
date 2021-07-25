/**
 * 
 */
package com.van.vuong.restApi;

import java.util.ArrayList;
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

import com.van.vuong.model.NhanSu;
import com.van.vuong.service.NhanSuSevice;

/**
 * @author Admin
 *
 */

@RestController
@RequestMapping("/api")
public class ApiNhanSuController {

	@Autowired
	NhanSuSevice nhanSuSevice;

	@GetMapping("/getAllNhanSu")
	public List<NhanSu> getAllNhanSu() {
		List<NhanSu> listNhanSu = nhanSuSevice.getAllNhanSu();
		return listNhanSu;
	}

	@GetMapping("/nhansu/{nhanSuId}")
	public NhanSu getNhanSuById(@PathVariable("nhanSuId") int nhanSuId) {
		return nhanSuSevice.findByIdNhanSu(nhanSuId);
	}

	@GetMapping("/nhansu/param")
	public NhanSu getNhanSuByIdParam(@RequestParam(name = "nhanSuId") int nhanSuId) {
		return nhanSuSevice.findByIdNhanSu(nhanSuId);
	}

	@GetMapping("/searchTenNhanSu")
	public ResponseEntity<NhanSu> searchTenNhanSu(@RequestParam(name = "nhanSuTenSearch") String nhanSuTenName) {
		NhanSu nhanSu = new NhanSu();
		nhanSu = nhanSuSevice.findByNameNhanSu(nhanSuTenName);
		return new ResponseEntity<NhanSu>(nhanSu, HttpStatus.OK);
	}
	
	@GetMapping("/searchIdNhanSu")
	public ResponseEntity<NhanSu> searchIdNhanSu(@RequestParam(name = "nhanSuSearch") int nhanSuId) {
		NhanSu nhanSu = new NhanSu();
		nhanSu = nhanSuSevice.findByIdNhanSu(nhanSuId);
		return new ResponseEntity<NhanSu>(nhanSu, HttpStatus.OK);
	}
	
	@GetMapping("/searchNhanSuTheoIdPhongBan")
	public ResponseEntity<NhanSu> searchNhanSuTheoPhongBan(@RequestParam(name = "nhanSuIdPhongBan") int nhanSuIdPhongBan) {
		List<NhanSu> listNhanSu = new ArrayList<NhanSu>();
		listNhanSu = nhanSuSevice.findNhanSuByNamePhongBan(nhanSuIdPhongBan);
		return new ResponseEntity(listNhanSu, HttpStatus.OK);
	}
	
	@GetMapping("/searchNhanSuTheoIdChucVu")
	public ResponseEntity<NhanSu> searchNhanSuTheoChucVu(@RequestParam(name = "nhanSuIdChucVu") int nhanSuIdChucVu) {
		List<NhanSu> listNhanSu = new ArrayList<NhanSu>();
		listNhanSu = nhanSuSevice.findNhanSuByChucVu(nhanSuIdChucVu);
		return new ResponseEntity(listNhanSu, HttpStatus.OK);
	}

	@PostMapping("/addNhanSu")
	public ResponseEntity<NhanSu> addNhanSu(@RequestBody NhanSu nhanSu) {
		NhanSu newNhanSu = new NhanSu();
		if (nhanSu != null) {
			newNhanSu = nhanSuSevice.addNhanSu(nhanSu);
		}
		return new ResponseEntity<NhanSu>(newNhanSu, HttpStatus.OK);
	}

	@DeleteMapping("/deleteNhanSu")
	public String deleteNhanSu(@RequestParam("nhanSuId") int nhanSuId) {
		nhanSuSevice.deleteByIdNhanSu(nhanSuId);
		return "Success";
	}

	@PutMapping("/updateNhanSu")
	public String updateNhanSu(@RequestBody NhanSu nhanSu) {
		NhanSu newNhanSu = nhanSu;
		if (nhanSu != null) {
			nhanSuSevice.updateNhanSu(newNhanSu);
		}
		return "Success";
	}

}
