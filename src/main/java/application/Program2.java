package application;

import dao.DaoFactory;
import dao.DepartmentDao;
import entities.Department;

import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        System.out.println("===== Teste 1: Department insert =====");
        Department newDepartment = new Department(null,"Food");
        departmentDao.insert(newDepartment);
        System.out.println("Department Inserted, new ID: " + newDepartment.getId());

        System.out.println("===== Teste 2: Department findById =====");
        Department departmentById = departmentDao.findById(3);
        System.out.println(departmentById);

        System.out.println("===== Teste 3: Department update =====");
        departmentById.setName("Sports");
        departmentDao.update(departmentById);
        System.out.println("Update complete");

        System.out.println("===== Teste 4: Department delete =====");
        departmentDao.deleteById(8);
        System.out.println("Delete complete");

        System.out.println("===== Teste 5: Department findAll =====");
        List<Department> departments = departmentDao.findAll();
        for (Department department : departments) {
            System.out.println(department);
        }
    }
}
