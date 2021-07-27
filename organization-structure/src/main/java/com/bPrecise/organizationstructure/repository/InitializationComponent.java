package com.bPrecise.organizationstructure.repository;

import com.bPrecise.organizationstructure.model.Employee;
import com.bPrecise.organizationstructure.model.Position;
import com.bPrecise.organizationstructure.model.Report;
import com.bPrecise.organizationstructure.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Calendar;
import java.util.Date;

@Component
public class InitializationComponent {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private ReportRepository reportRepository;
    @Autowired
    private TaskRepository taskRepository;

    @PostConstruct
    private void init() {

        employeeRepository.deleteAll();

        Employee employee = new Employee();
        employee.setId("1234");
        employee.setFirstName("Jeff");
        employee.setLastName("Bezos");
        employee.setManagerId("5678");
        employee.setPosition(Position.EMPLOYEE);
        employeeRepository.save(employee);

        employee = new Employee();
        employee.setId("5678");
        employee.setFirstName("Elon");
        employee.setLastName("Musk");
        employee.setPosition(Position.MANAGER);
        employeeRepository.save(employee);

        Date date = new Date();


        Report report = new Report();
        report.setEmployeeId("1234");
        report.setManagerId("5678");
        report.setReportDate(date);
        report.setReportText("I want to buy Tesla");
        reportRepository.save(report);

        Task task = new Task();
        task.setEmployeeId("1234");
        task.setManagerId("5678");
        task.setAssignDate(date);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DAY_OF_MONTH, 1);
        task.setDueDate(cal.getTime());
        task.setTaskText("Code Review");
        taskRepository.save(task);
    }
}
