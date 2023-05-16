/** EmployeeTest.java
 *  This runs the program and calculates the employee salary
 *  Andrea Jacobs 2180242266
 *  17 May 2023 */

package za.ac.cput;

import javax.swing.*;
import java.util.*;

public class EmployeeTest {
    public static void main(String[] args){
        ArrayList <Employee> employees = new ArrayList<Employee>();

        employees.add(new Employee("Peter", "Smith", 25000));
        employees.add(new Employee("Sarah", "Williams", 2000));
        employees.add(new Employee("Amber", "Marks", 85000));
        employees.add(new Employee("Dean", "October", 15000));
        employees.add(new Employee("Demi", "Jacobs", 6500));
        employees.add(new Employee("Vince", "Messing", 540000));

        for(Employee employee : employees){
            JOptionPane.showMessageDialog(null, employee.toString());
        }


        String allEmployees = "";

        //Search all employees that start with the letter D
        String startLetter = "D";
        allEmployees = "";
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getSurname().toLowerCase().startsWith(startLetter.toLowerCase())) {
                allEmployees += "Name: " + employees.get(i).getName() + "\n";
                allEmployees += "Surname: " + employees.get(i).getSurname() + "\n\n";
            }
        }

        JOptionPane.showMessageDialog(null, allEmployees);

        startLetter = JOptionPane.showInputDialog("Enter the start letter of surname: ");
        allEmployees = "";
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getSurname().toLowerCase().startsWith(startLetter.toLowerCase())) {
                allEmployees += "Name: " + employees.get(i).getName() + "\n";
                allEmployees += "Surname: " + employees.get(i).getSurname() + "\n\n";
            }
        }
        JOptionPane.showMessageDialog(null, allEmployees);

        for (int j = 0; j < employees.size(); j++) {
            for (int i = 0; i < employees.size(); i++) {
                if (employees.get(i).getSalary() <= 5000) {
                    employees.remove(i);
                }
            }
        }
        allEmployees = "";
        for (int i = 0; i < employees.size(); i++) {
            allEmployees += "Name: " + employees.get(i).getName() + "\n";
            allEmployees += "Surname: " + employees.get(i).getSurname() + "\n";
            allEmployees += "Salary: R" + employees.get(i).getSalary() + "\n\n";
        }
        JOptionPane.showMessageDialog(null, allEmployees);

        employees.sort((o1, o2) -> o1.getSurname().compareTo(o2.getSurname()));
        allEmployees = "The list in alphabetical order of surname:\n";
        for (int i = 0; i < employees.size(); i++) {
            allEmployees += "Name: " + employees.get(i).getName() + "\n";
            allEmployees += "Surname: " + employees.get(i).getSurname() + "\n";
            allEmployees += "Salary: R" + employees.get(i).getSalary() + "\n\n";
        }
        JOptionPane.showMessageDialog(null, allEmployees);

        employees.sort((o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary()));
//---------------------------------------------------------------------------------
        allEmployees = "The list in ascending order of salary:\n";
        for (int i = 0; i < employees.size(); i++) {
            allEmployees += "Name: " + employees.get(i).getName() + "\n";
            allEmployees += "Surname: " + employees.get(i).getSurname() + "\n";
            allEmployees += "Salary: R" + employees.get(i).getSalary() + "\n\n";
        }
        JOptionPane.showMessageDialog(null, allEmployees);
    }
}
