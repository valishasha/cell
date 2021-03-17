package org.ow2.weblab.service;

import org.junit.Before;
import org.junit.Test;
import org.ow2.weblab.core.services.InvalidParameterException;

/**
 * Template for WebLab service test which uses SourceReader interface
 * 
 * @author WebLab Team
 */
public class 2nd {


	/**
	 * Instance of service which implement a SourceReader
	 */
	private 10th sourceReader;


	/**
	 * Initialisation before tests
	 */
	@Before
	public void init() {
		this.sourceReader = new 10th();
	}


	/**
	 * Exception tests
	 */
	@Test(expected = InvalidParameterException.class)
	public void testNullGetResourceArgs() throws Exception {
		this.sourceReader = new 10th();
		this.sourceReader.getResource(null);
	}

}