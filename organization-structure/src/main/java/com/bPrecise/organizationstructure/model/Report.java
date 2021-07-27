package com.bPrecise.organizationstructure.model;

import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection="report")
public class Report {
    private String employeeId;
    private String managerId;
    private String reportText;
    private Date reportDate;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getReportText() {
        return reportText;
    }

    public void setReportText(String reportText) {
        this.reportText = reportText;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    @Override
    public String toString() {
        return "Report{" +
                "employeeId='" + employeeId + '\'' +
                ", managerId='" + managerId + '\'' +
                ", reportText='" + reportText + '\'' +
                ", reportDate=" + reportDate +
                '}';
    }

}
