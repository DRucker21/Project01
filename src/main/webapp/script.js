/**
 * 
 */
function display() {
	var name = "Richard";
	for (i = 1; i < 5; i++) {
		document.write("<h1>" + name);
	}
	document.write("<br>");
	grade = 100;
	document.write(name + " your grade is " + grade);
}
function addNumbers() {
	alert("Welcome To Add Numbers");
	var num1 = prompt("Enter Number(1)");
	var num2 = prompt("Enter Number(2)");
	result = parseInt(num1) + parseInt(num2);
	var data = confirm("Do You Want To See The Sum ")
	if (data) {
		alert("Sum Of The Two Numbers Are : " + result);
	} else {
		alert("Thank you for usng my app");
	}
}
function disp(message) {
	var name = 'Richard'
	var city = new String(London)
	if (message == null) {
		message = "Welcome Guest"
	}
	alert(message);
}
function init() {
	alert("Please Enter Full Name")
	var fname = prompt("Enter First Name: ")
	var lname = prompt("Enter Last Name: ")
	var nfname = fname.charAt(0)
	var fullName = (nfname + " " + lname)
	var data = confirm("Do you want to display your Name? ")
	if (data) {
		alert("Welcome Mr./Mrs. " + fullName)
	} else {
		alert("Thanks")
	}

}
function rand() {
	var r = Math.floor(Math.random() * 10) + 1
	alert(r);
}
function lastDateCheck() {
	var today = new Date();
	alert(today);
	var lastdate = new Date();
	lastdate.setFullYear(2022, 1, 31);//31st March 2022
	if (lastdate > today) {
		var day = 1000 * 60 * 60 * 24;
		x = (lastdate - today) / day;
		alert("Number of days left " + x);
	} else {
		alert("Time is up, I've come to get what's owed")
	}
}
function electricBill() {
	var today = new Date();
	alert(today);
	var overpaidDate = new Date();
	overpaidDate.setFullYear(2022, 2, 25);
	alert(overpaidDate)
}
var promise = new Promise(function(resolve, reject) {
	const x = 5;
	const y = 3;
	if (x >= y) {
		resolve();
	} else {
		reject();
	}
});

promise.
	then(function() {
		console.log('Sucess! x have greater value');
	}).
	catch(function() {
		console.log('Error');
	});
