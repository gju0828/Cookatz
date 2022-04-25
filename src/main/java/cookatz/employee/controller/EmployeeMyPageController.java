package cookatz.employee.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cookatz.common.controller.SuperClass;
import cookatz.employee.bean.Employee;
import cookatz.employee.dao.EmployeeDao;

public class EmployeeMyPageController extends SuperClass  {
	EmployeeDao mdao = null;
	Employee bean = null;
	
	public EmployeeMyPageController() {
		this.mdao = new EmployeeDao();
		this.bean = new Employee();
		
	}
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		super.doProcess(request, response); 
		
		String gotopage ="/employee/mypage.jsp";
		super.GotoPage(gotopage);
		
		
	}

	
}
