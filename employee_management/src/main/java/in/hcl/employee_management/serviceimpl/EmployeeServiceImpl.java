package in.hcl.employee_management.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.hcl.employee_management.domain.Employee;
import in.hcl.employee_management.repository.EmployeeRepository;
import in.hcl.employee_management.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveorUpdate(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public Employee findEmployeeByIdentifier(String employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Employee> findAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployeeByIdentifier(String employeeId) {
		// TODO Auto-generated method stub
		
	}

}
