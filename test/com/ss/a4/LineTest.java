package com.ss.a4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
class LineTest {

	private Line line;

//	@Before
//	public void init() {
//		line = new Line(0, 0, 2, 3);
//	}

	@Test
	void testGetSlope() {
		line = new Line(0, 0, 2, 3);
		assertEquals(1.5, line.getSlope(), .001);
	}

	@Test
	void testGetDistance() {
		line = new Line(0, 0, 2, 3);
		assertEquals(3.605, line.getDistance(), .001);
	}

	@Test
	void testParallelTo() {
		line = new Line(0, 0, 2, 3);
		Line line2 = new Line(1, 0, 3, 3);
		assertEquals(true, line.parallelTo(line2));
	}

}
