package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Armstrong;

class ArmstrongTest {

	@Test
	void testCheckArmstrongNumber() {
		assertEquals(true,Armstrong.checkArmstrongNumber(153));
		assertEquals(false,Armstrong.checkArmstrongNumber(121));
		
	}
	}


