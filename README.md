================================================
CompanyService REST demo 
================================================
Author:Animesh Parashar
Date: 19th Feb 2016

 Spring REST API provides following services
+ Create new company 
+ Get a list of all companies 
+ Able to add beneficial owner(s) of the company 
+ Delete company

A company has the following attributes: 
+ Company ID 
+ Name 
+ Address 
+ City 
+ Country 
+ One or more beneficial owner(s) 

There is a JSP in the app with basic Angular code, it can be used to add,delete and list companies

URI exposed in this project are:
+ Angular based jsp (uses List, add and delete coompany)
 http://localhost:8080/CustomerService/customerService/hello
+ List of companies
 http://localhost:8080/CompanyService/companyService/company
+Delete company
http://localhost:8080/CompanyService/companyService/deleteCompany/{companyId}
+add company - pass company with body
http://localhost:8080/CompanyService/companyService/createCompany
+add owner.. pass Beneficiary and companyId
 http://localhost:8080/CompanyService/companyService/createBene
