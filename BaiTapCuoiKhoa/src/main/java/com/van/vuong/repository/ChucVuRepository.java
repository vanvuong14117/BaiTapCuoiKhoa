/**
 * 
 */
package com.van.vuong.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.van.vuong.model.ChucVu;

/**
 * @author Admin
 *
 */
@Repository
public interface ChucVuRepository extends JpaRepository<ChucVu, Integer>{
	
	@Query(value = "select * from chuc_vu where ten_chuc_vu like %?1%", nativeQuery = true)
	List<ChucVu> getByName(String searchValue);
	
	@Query(value = "select count(ma_chuc_vu) from chuc_vu where ma_chuc_vu = ?1",nativeQuery = true)
	int checkInitByMaChucVu(String searchValue);
	
}
