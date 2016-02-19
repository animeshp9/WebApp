package company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import company.beans.Beneficiary;
import company.beans.Company;
import company.dao.CompanyDao;

@RestController
@RequestMapping("/companyService")
public class CompanyController {

	@Autowired(required=true)
	CompanyDao cusDao;
	        @RequestMapping(value = "/company", method = RequestMethod.GET,headers="Accept=application/json")
	        public List<Company> listAllCompanies() {
	            return cusDao.getCompanies();
	            
	        }
	        
	        @RequestMapping(value = "/deleteCompany/{customerId}", method = RequestMethod.POST)
	        public @ResponseBody List<Company> deleteCompany(@PathVariable int customerId) {
	        	cusDao.deleteCustomer(customerId);
	            return cusDao.getCompanies();
	        }
	        
	        @RequestMapping(value = "/createCompany", method = RequestMethod.POST)
	        public @ResponseBody List<Company> createCompany(@RequestBody Company company) {
	        	cusDao.addCompany(company);
	            return cusDao.getCompanies();
	        }
	        
	        @RequestMapping(value = "/updateCompany", method = RequestMethod.PUT)
	        public String updateCompany(Company company) {
	    		System.out.println("in side update");
	        	cusDao.updateCompany(company);
	    		return	"success";
	        }
	        
	        @RequestMapping(value = "/addBene", method = RequestMethod.POST)
	        public String addOwner(Beneficiary beneficiary,int companyId) {
	        	cusDao.addOwner(beneficiary, companyId);
	            return "CustomerService";
	        }	        
	        
	         
}
