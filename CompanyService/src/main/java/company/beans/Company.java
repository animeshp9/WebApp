package company.beans;

import java.util.ArrayList;
import java.util.List;

public class Company{

	int companyId;
	String name;
	String address;
	String city;
	String country;
	List<Beneficiary> beneficiaries;
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public List<Beneficiary> getBeneficiaries() {
		return beneficiaries;
	}
	public void setBeneficiaries(List<Beneficiary> beneficiaries) {
		this.beneficiaries = beneficiaries;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public static void main(String[] args) {
		List<Company> companies = new ArrayList<Company>();
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
        
        for(Company company2: companies){
        	if(company2.getCompanyId()==1){
        		Beneficiary beneficiary = new Beneficiary();
        		beneficiary.setName("Daksh");
        		List list = new ArrayList();
        		list.add(beneficiary);
        		company2.setBeneficiaries(list);
        	}
        }
        
        System.out.println("dfjdfjjd");
	}
}
