package com.ericsson.scopeTest;

public abstract class RequestManager {
	private RequestHandler requestHandler;

	public void handleRequest() {
		requestHandler = getRequestHandler();
		requestHandler.handleRequest();
	}

	public abstract RequestHandler getRequestHandler();
}