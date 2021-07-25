/**
 * 
 */
package com.van.vuong.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.van.vuong.model.PhongBan;

/**
 * @author Admin
 *
 */
@Repository
public interface PhongBanRepository extends JpaRepository<PhongBan, Integer> {

	@Query(value = "select * from phong_ban where ten_phong_ban like ?1", nativeQuery = true)
	PhongBan getByTenPhongBan(String searchValue);

	@Query(value = "select * from phong_ban where ma_phong_ban like ?1", nativeQuery = true)
	PhongBan getByMaPhongBan(String searchValue);

	@Query(value = "select count(ma_phong_ban) from phong_ban where ma_phong_ban = ?1", nativeQuery = true)
	int checkInitByMaPhongBan(String searchValue);
}
