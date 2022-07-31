package application;

import java.util.List;
import java.util.Scanner;

import modal.dao.DaoFactory;
import modal.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department findById ===");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		List<Department> list;
		
		System.out.println("=== TEST 2: department findAll ===");
		list = departmentDao.findAll();
		
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n === TEST 3: department insert ===");
		Department newDepartment = new Department(null, "Temporary");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! new id = " + newDepartment.getId());
		
		System.out.println("\n === TEST 4: department update ===");
		newDepartment = departmentDao.findById(6);
		newDepartment.setName("Design");
		departmentDao.update(newDepartment);
		System.out.println("Update Completed!");
		
		System.out.println("\n === TEST 5: department delete ===");
		System.out.println("Enter id for delete test:");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete Completed!");
	}

}
