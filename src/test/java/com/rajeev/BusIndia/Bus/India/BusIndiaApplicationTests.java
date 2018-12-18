package com.rajeev.BusIndia.Bus.India;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rajeev.BusIndia.Bus.India.Repogetery.UserRepogetry;
import com.rajeev.BusIndia.Bus.India.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BusIndiaApplicationTests {
    @Autowired
	UserRepogetry repo;
	@Test
	public void contextLoads() {
		
		
		
	}

}
