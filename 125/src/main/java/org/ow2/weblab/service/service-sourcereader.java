package org.ow2.weblab.service;

import javax.jws.WebService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.ow2.weblab.core.services.AccessDeniedException;
import org.ow2.weblab.core.services.ContentNotAvailableException;
import org.ow2.weblab.core.services.InsufficientResourcesException;
import org.ow2.weblab.core.services.InvalidParameterException;
import org.ow2.weblab.core.services.ServiceNotConfiguredException;
import org.ow2.weblab.core.services.SourceReader;
import org.ow2.weblab.core.services.UnexpectedException;
import org.ow2.weblab.core.services.UnsupportedRequestException;
import org.ow2.weblab.core.services.sourcereader.GetResourceArgs;
import org.ow2.weblab.core.services.sourcereader.GetResourceReturn;

/**
 * Template for WebLab service which uses SourceReader interface
 * 
 * @author WebLab Team
 */
@WebService(endpointInterface = "org.ow2.weblab.core.services.SourceReader")
public class 10th implements SourceReader {


	/**
	 * The instance of logger used inside 10th
	 */
	private final Log logger;


	/**
	 * Constructor
	 */
	public 10th() {
		this.logger = LogFactory.getLog(this.getClass());

		// TODO Initialise other fields if needed

		this.logger.info("Service 10th successfully started");
	}


	@Override
	public GetResourceReturn getResource(final GetResourceArgs args) throws AccessDeniedException, ContentNotAvailableException,
			InsufficientResourcesException, InvalidParameterException, ServiceNotConfiguredException, UnexpectedException, UnsupportedRequestException {
		this.logger.debug("Early start of getResource method.");

		this.checkGetResourceArgs(args);

		// TODO Implement your method here!

		this.logger.error("Method getResource not yet implemented.");
		throw new UnsupportedRequestException("Method getResource not yet implemented.", "Constructor not yet implemented.");
	}


	/**
	 * Method that tests that the GetResourceArgs is correct regarding
	 * specification of 10th
	 * 
	 * @param args
	 *            The argument received by the getResource method
	 * @throws InvalidParameterException
	 *             If args it contains is <code>null</code> or offset is less
	 *             than <code>0</code>
	 */
	protected void checkGetResourceArgs(GetResourceArgs args) throws InvalidParameterException {
		if (args == null) {
			throw new InvalidParameterException("GetResourceArgs is null.");
		}
		if (args.getOffset() < 0) {
			throw new InvalidParameterException("Offset in GetResourceArgs is less than zero.");
		}

		// TODO Test the existence of an usageContext if required
	}

}
