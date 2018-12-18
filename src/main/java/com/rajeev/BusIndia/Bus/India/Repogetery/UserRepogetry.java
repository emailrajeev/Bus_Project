package com.rajeev.BusIndia.Bus.India.Repogetery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rajeev.BusIndia.Bus.India.entity.User;

public interface UserRepogetry extends JpaRepository<User,Long>{
	
	@Query(nativeQuery=true,value="SELECT * FROM USER WHERE EMAIL = ?")
	public User findByEmail(User email);
}
