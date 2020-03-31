function loginWindow(){
	if(document.getElementById("registerHub").style.display = "block"){
		document.getElementById("registerHub").style.display = "none"
	}
	document.getElementById("login").style.display = "block";
		
}
function registerHubWindow(){
	if(document.getElementById("login").style.display = "block"){
		document.getElementById("login").style.display = "none";
	}
	document.getElementById("registerHub").style.display = "block";
	
}
function registerCustomer(){
	document.getElementById("registerHub").style.display = "none";
	document.getElementById("registerCustomer").style.display = "block";
	
}
function registerCompany(){
	document.getElementById("registerHub").style.display = "none";
	document.getElementById("registerCompany").style.display = "block";
	
}
function registerCompanyNext(){
	document.getElementById("registerCompany").style.display = "none";
	document.getElementById("registerCompanyNext").style.display = "block";
	
}
function registerCompanyNext2(){
	document.getElementById("registerCompanyNext").style.display = "none";
	document.getElementById("registerCompanyNext2").style.display = "block";
	
}
function addItem(){
	let a = document.getElementById("aboutMenuInputs").cloneNode(true);
	document.getElementById("wrapMenuInputs").appendChild(a);

}
function addCategory(){
	let a = document.getElementById("wrapMenuCategory").cloneNode(true);
	document.getElementById("wrapMenuCat").appendChild(a);
	
}
function exit(){
	document.getElementById("login").style.display = "none";
	document.getElementById("registerHub").style.display = "none";
	document.getElementById("registerCustomer").style.display = "none";
	document.getElementById("registerCompany").style.display = "none";
	document.getElementById("registerCompanyNext").style.display = "none";
	document.getElementById("registerCompanyNext2").style.display = "none";
}
function clickCheckBoxReservation(){
	const a = document.getElementById("visibleForm");
	if(a.style.display === "block"){
		a.style.display="none";
	}else {
		a.style.display="block";
		
		
	}
	
	
	
	
}