package com.headstartdevelopment.easymessages.testproject;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FirstMessageManagementTest {
	

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testSimpleReturnOfMsg() {
		System.out.println(FirstMessageManagement.createMessage("MSG1"));
	}

}
