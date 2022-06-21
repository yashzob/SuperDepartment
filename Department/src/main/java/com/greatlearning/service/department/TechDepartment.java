/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.greatlearning.service.department;

/**
 *
 * @author DELL
 */
public class TechDepartment extends SuperDepartment {

    @Override
    public String departmentName() {
        System.out.println("Welcome to Tech Department");
        return "Tech Department  ";
    }

    @Override
    public String getTodaysWork() {
        return "“ Complete coding of module 1 ";
    }

    @Override
    public String getWorkDeadline() {
        return "Complete by EOD  ";
    }

    public String getTechStackInformation() {
        return "Core Java  ";
    }
}
