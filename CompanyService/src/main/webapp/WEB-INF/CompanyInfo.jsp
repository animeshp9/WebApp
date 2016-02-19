<!DOCTYPE html>
<html>
<!--  <reference path= "angular.min.js"/> -->
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<head>
<meta charset="ISO-8859-1">
<title>MycompanyClient</title>

<script type = "text/javascript">
var app = angular.module('myApp', []);
app.controller('companyController', function($rootScope,$scope, $http) {
	$rootScope.result = {};
    $http.get("http://localhost:8080/CompanyService/companyService/company")
    .success(function(response) {
    	$rootScope.result = response;
    });
    
    $scope.deleteCompany = function() {
		    	
        $http.post('http://localhost:8080/CompanyService/companyService/deleteCompany/'+$scope.companyToDelete).success(function(response) {
        	$rootScope.result = response;
        });
    }
    
});
app.controller('myCtrl', function($rootScope,$scope, $http) {
    $scope.company = {};
    var customer = {};
    
    $scope.addCompany = function() {
    	company = {
        		name:$scope.company.name,
        		address:$scope.company.address,
        		city:$scope.company.city,
        		country:$scope.company.country,
        		city:$scope.company.city};
    	
        $http.post('http://localhost:8080/CompanyService/companyService/createCompany', company ).success(function(response) {
        	$rootScope.result = response;
        });
    }
  
});	
</script>
</head>
<body ng-app ="myApp" >

<div ng-controller ="companyController">
<table cellpading="2" cellspacing="2" border="1">
<tr>
     <th>CompanyId</th>
     <th>Name</th>
     <th>Address</th>
     <th>City</th>
     <th>Country</th>
     <th>Delete</th>
</tr>  
<tr ng-repeat= "company in result">

    <td>{{company.companyId}}</td>
    <td>{{company.name}}</td>
    <td>{{company.address}}</td>
    <td>{{company.city}}</td>
    <td>{{company.country}}</td>
    <td><input type=radio name="delete" id="delete" value={{company.companyId}} ng-model="$parent.companyToDelete"></td>
</tr>
<tr>
	<td>    
		<button ng-click="deleteCompany()">Delete Company</button>
	</td>
<tr>	
</table>
</div>
<div ng-controller='myCtrl'>
<table>
<tr>
     <th>Name</th>
     <th>Address</th>
     <th>City</th>
     <th>Country</th>    
</tr>
<tr>
    <td><input type=text name="name" ng-model=company.name></td>
    <td><input type=text name="address" ng-model=company.address></td>
    <td><input type=text name="city" ng-model=company.city></td>
    <td><input type=text name="country" ng-model=company.country></td>    
<tr>
	<td>    
		<button ng-click="addCompany()">Add New</button>
	</td>
<tr>	
  </tr>
  
</div>


</table>

</body>
</html>