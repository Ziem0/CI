package com.bitbucket.devops.contintegration;

import com.bitbucket.devops.contintegration.models.PageInfo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ContIntegrationApplicationTests {

	PageInfo pageInfo;

	@Before
	public void setUp() {
		pageInfo = new PageInfo("2");
	}

	@Test
	public void contextLoads() {
		assertTrue(true);
	}

	@Test
	public void demo() {
		assertEquals("ok", pageInfo.getStatus());
	}
}

