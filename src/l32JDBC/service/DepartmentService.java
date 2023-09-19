package l32JDBC.service;

import l32JDBC.crud.DepartmentManager;
import l32JDBC.model.Department;

import java.sql.SQLException;

public class DepartmentService {


    private DepartmentManager departmentManager;

    public DepartmentService() {
        this.departmentManager = new DepartmentManager();
    }

    public void createDepartment(Department department) throws SQLException {
        departmentManager.insertDepartmant(department);
    }

    public Department getDepartmentById(int id) throws SQLException {
        return departmentManager.findDepartmentById(id);
    }

    public void updateDepartment(Department department) throws SQLException {
        departmentManager.updateDepartment(department);
    }

    public void deleteDepartment(int id) throws SQLException {
        departmentManager.deleteDepartment(id);
    }

}
