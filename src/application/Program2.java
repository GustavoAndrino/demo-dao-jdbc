package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		
		
		System.out.println("=== TEST 1: insert new department ===");
		Department department = new Department(null, "Coffes");
		departmentDao.insert(department);
		System.out.println("Insertion completed!");
		
		//*********************************************************************
		
		System.out.println("=== TEST 2: find all departments ===");
		List<Department> list = departmentDao.findAll();
		
		for(Department d : list) {
			System.out.println(d);
		}
		
		//*********************************************************************
		
		System.out.println("=== TEST 3: delete by name ===");
		String coffee = "Coffes";
		departmentDao.deleteByName(coffee);
		System.out.println("Deletion completed");
		
		//*********************************************************************
		
		System.out.println("=== TEST 4: find by id ===");
		Department dp = departmentDao.findById(3);
		System.out.println(dp);
				
		
		//*********************************************************************
		
		System.out.println("=== TEST 5: update department ===");
		dp.setName("Cores");
		departmentDao.update(dp);
		System.out.println(dp);

	}

}
