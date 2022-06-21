/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.greatlearning.service.department;

/**
 *
 * @author DELL
 */
public class Department {

    public static void main(String[] args) {

        AdminDepartment AdminObj = new AdminDepartment();
        System.out.println(AdminObj.departmentName());
        System.out.println(AdminObj.getTodaysWork());
        System.out.println(AdminObj.getWorkDeadline());
        // Inherited from super Department
        System.out.println(AdminObj.isTodayAHoliday());
        System.out.println("");
        System.out.println("");

        HrDepartment HrObj = new HrDepartment();
        System.out.println(HrObj.departmentName());
        System.out.println(HrObj.doActivity());

        System.out.println(HrObj.getTodaysWork());
        System.out.println(HrObj.getWorkDeadline());
        // Inherited from super Department
        System.out.println(HrObj.isTodayAHoliday());

        System.out.println("");
        System.out.println("");

        TechDepartment TechObj = new TechDepartment();
        System.out.println(TechObj.departmentName());
        System.out.println(TechObj.getTodaysWork());
        System.out.println(TechObj.getWorkDeadline());
        // Inherited from super Department
        System.out.println(TechObj.isTodayAHoliday());
    }
}
