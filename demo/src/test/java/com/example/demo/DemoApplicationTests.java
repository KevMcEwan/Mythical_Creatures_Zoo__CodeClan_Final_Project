package com.example.demo;

import com.example.demo.IKill.IKill;
import com.example.demo.repositories.MythicalCreaturesRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	MythicalCreaturesRepo mythicalCreaturesRepo;

	@Test
	public void contextLoads() {
	}

	@Test
	public void saveCreature(){

	}

}

