package service;

import dao.CustomerDAO;
import entity.Customer;

public class CustomerService {
	
	//싱글톤
	private static final CustomerService INSTANCE = new CustomerService();
	public static CustomerService getInstance() {
		return INSTANCE;
	}
	
	private CustomerService() {}
	
	//DAO 객체
	private CustomerDAO dao = CustomerDAO.getInstance();
	
	//회원가입
	public void registerCustomer(Customer customer) {
		dao.insertCustomer(customer);
	}
	
	
	//서비스 메서드
	public Customer loginCustomer(String custId) {
		return dao.selectCustomer(custId);
		
		
	}
	
	//회원 탈퇴 - DELETE
	public void removeCustomer(String custId) {
		dao.deleteCustomer(custId);
	}
	
	//회원 수정 - UPDATE
	public void modifyCustomer(Customer customer) {
		dao.updateCustomer(customer);
	}
	
}
