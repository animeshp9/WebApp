package company.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import company.beans.Beneficiary;
import company.beans.Company;
@Repository
public class CompanyDao {	
	List<Company> companies = new ArrayList<Company>();
	
	public CompanyDao(){
        Company company = new Company();
        company.setCompanyId(1);
        company.setName("Hsbc");
        company.setAddress("Vest Avenue");
        company.setCity("Pune");
        company.setCountry("India");
        	
        Company company1 = new Company();
        company1.setCompanyId(2);
        company1.setName("Principal Financial Group");
        company1.setAddress("Magarpatta");
        company1.setCity("Pune");
        company1.setCountry("India");
        companies.add(company);
        companies.add(company1);

	}
	public void addCompany(Company customer){
		int companyId = companies.size()+1;
		customer.setCompanyId(companyId);
		companies.add(customer);
	}
	public void addOwner(Beneficiary beneficiary,int companyId){
		for(Company company:companies){
			if(company.getCompanyId()==companyId){
	        		beneficiary.setName("Daksh");
	        		if(company.getBeneficiaries() == null)
	        		{	
	        			List list = new ArrayList();
	        			list.add(beneficiary);
	        			company.setBeneficiaries(list);
	        		}	else{
	        			company.getBeneficiaries().add(beneficiary);
	        		}	        		
			}
		}
	}
	
	public List<Company> getCompanies(){
		return companies;
	}
	
	public List<Company> updateCompany(Company company){
		
		for(Company cst:companies){
			if(cst.getCompanyId()==company.getCompanyId()){
				cst =company;
			}
		}
		return companies;
	}
	public List<Company> deleteCustomer(int customerId){
		companies.remove(customerId-1);
		return companies;
	}
}
