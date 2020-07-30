package com.wp.handson4;

public class Test {
	
	@Override
	public String toString() {
		return "[testName=" + testName + ", testMarks=" + testMarks + "]";
	}
	private String testId;
	private String testName;
	private int testMarks;
	
	public String getTestId() {
		return testId;
	}
	public void setTestId(String testId) {
		this.testId = testId;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public int getTestMarks() {
		return testMarks;
	}
	public void setTestMarks(int testMarks) {
		this.testMarks = testMarks;
	}
}
