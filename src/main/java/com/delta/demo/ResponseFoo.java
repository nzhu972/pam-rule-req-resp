package com.delta.demo;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ResponseFoo implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Status")
	private int status;

	public ResponseFoo() {
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public ResponseFoo(int status) {
		this.status = status;
	}

}