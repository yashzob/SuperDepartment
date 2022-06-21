/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.greatlearning.service.department;

/**
 *
 * @author DELL
 */
public class HrDepartment extends SuperDepartment {

    @Override
    public String departmentName() {
        System.out.println("Welcome to HR Department");
        return "HR Department ";
    }

    public String getTodaysWork() {
        return "“ Fill today’s worksheet and mark your attendance ";
    }

    public String getWorkDeadline() {
        return "Complete by EOD  ";
    }

    public String doActivity() {
        return "team Lunch  ";
    }
}
