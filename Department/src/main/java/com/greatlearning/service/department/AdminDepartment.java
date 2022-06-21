/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.greatlearning.service.department;

/**
 *
 * @author DELL
 */
public class AdminDepartment extends SuperDepartment {

    @Override
    public String departmentName() {
        System.out.println("Welcome to Admin Department");
        return "Admin Department ";
    }

    @Override
    public String getTodaysWork() {
        return "Complete your documents Submission ";
    }

    @Override
    public String getWorkDeadline() {
        return "Complete by EOD  ";
    }
}
