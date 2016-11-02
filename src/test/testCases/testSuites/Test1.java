/**
 * 
 */
package com.mycompany.example_mvn_archetype_quickstart;

import junit.framework.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test1 extends TestCase {

	@Test
	public Test1 ( String testName){
		super( testName);
		System.out.println("AppTest " + testName +);
	}
	
	public static Test suite(){
		System.out.println("Zakaria engaged suite");
		return new TestSuite(;)
	}
	public void testapp() {
		System.out.print("Zakaria entered testApp");
		assertTrue (true);
	}

}
