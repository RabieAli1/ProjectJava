
package com.mycompany.hospitalsystem;

public class Test {
    private String testId;
    private String testName;
    private String date;
    private String time;
    private String result;

    public Test(String testId, String testName, String date, 
        String time, String result) {
        this.testId = testId;
        this.testName = testName;
        this.date = date;
        this.time = time;
        this.result = result;
    }

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

    public String getDate() {
        return date; 
    }
    public void setDate(String date) {
        this.date = date; 
    }

    public String getTime() {
        return time; 
    }
    public void setTime(String time) {
        this.time = time; 
    }

    public String getResult() {
        return result; 
    }
    public void setResult(String result) {
        this.result = result; 
    }

    @Override
    public String toString() {
        return "Test ID: " + testId + ", Name: " + testName +  ", Date: " + date + ", Time: " + time + ", Result: " + result;
    }
}