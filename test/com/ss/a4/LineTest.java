package com.ss.a4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class LineTest {

	static Line line;

	@BeforeEach
	public void init() {
		line = new Line(0, 0, 2, 3);
	}

	@Test
	void testGetSlope() {
		assertEquals(1.5, line.getSlope(), .001);
		
		line = new Line(0, 0, 0, 3);
		assertThrows(ArithmeticException.class, ()->{
			line.getSlope();
		});
	}

	@Test	
	void testGetDistance() {
		assertEquals(3.605, line.getDistance(), .001);
	}

	@Test
	void testParallelTo() {
		Line line2 = new Line(1, 0, 3, 3);
		assertEquals(true, line.parallelTo(line2));
		line2 = new Line(0,0,3,3);
		assertEquals(false, line.parallelTo(line2));
	}

}
