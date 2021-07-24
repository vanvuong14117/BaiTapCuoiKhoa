/**
 * 
 */
package com.van.vuong.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.van.vuong.model.NhanSu;

/**
 * @author Admin
 *
 */
@Repository
public interface NhanSuRepository extends JpaRepository<NhanSu, Integer> {

	@Query(value = "select * from nhan_su where ten like %?1%", nativeQuery = true)
	List<NhanSu> getByName(String searchValue);

	@Query(value = "select count(ten) from nhan_su where ten = ?1", nativeQuery = true)
	int checkInitByTenNhanSu(String searchValue);
}
