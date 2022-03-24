<!DOCTYPE html>
<html>
<head>
<!--<link type="text/css" rel="stylesheet" href="Style.css">-->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<script type="text/javascript">
	function validatesSignUpForm() {
		var uname1 = document.getElementById("username").value;
		var uname2 = document.signupform.username.value;
		var pwd = document.forms[0].elements[1].value;
		var confirmpwd = document.forms[0].elements[2].value;

		var qual = document.signupform.qualification.options.selectedIndex;

		var radio = new Array();
		for (i = 3; i <= 5; i++) {
			radio[i] = document.forms[0].elements[i].checked
		}

		if (uname1.length == 0) {
			alert("Please enter username");
			return false;
		} else if (pwd.length == 0) {
			alert("Please enter password");
			return false;
		} else if (pwd != confirmpwd) {
			alert("Password and confirm password does not match");
			return false;
		}
		else if (pwd.length < 6 || pwd.length > 12) {
			alert("Password length must be between 6-12")
			return false;
		}
		else if (radio[0] == 0 && radio[1] == 0 && radio[2] == 0) {
			alert("Please select a gender");
			return false;
		} else if (qual == 0) {
			alert("Please select a qualification");
			return false;
		}
	}
</script>
<body>
	<h1 align="center">Welcome To Revature-ERS</h1>
	<h4 align="center"><% out.println(new java.util.Date()); %></h4>
	<%  %>
<table class="table table-striped table-dark">
	<thead>
		<tr>
			<th scope="col"><a href = "LogIn.html">Manager Login</a></th>
			<th scope="col" ><a href="EmployeeLogin.html">Employee Login</a></th>
			<!--<th scope="col"><a href = "SignIn.html"> SignUp</a></th>-->
			<th scope="col"><a href="check.html">Check System</a></th>
			<th scope="col"><a href="aboutUs.html"> About Us</a></th>
		</tr>
	</thead>
</table>
<hr>
<h2 align="center">Create New Account</h2>
<hr>
<form class="form-style" action="SignInController"
		onsubmit="return validateSignUpForm()" name="signupform" method="post">
		<table cellspacing="15" cellpadding="15" class="table table-striped table-dark">
			<tr>
				<td><label>* UserName:</label></td>
				<td><input type="text" name="username" id="username"></td>
				
			</tr>
			<tr>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td><label>* Password:</label></td>
				<td><input type="password" name="password" id="password"></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td><label>* Confirm Password: </label></td>
				<td><input type="password" name="confirmpassword" id="confirmpassword"></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td><label>Qualification:</label></td>
				<td><select name="qualification" id="qualification">
						<option>--Select--</option>
						<option>UnderGraduate</option>
						<option>Graduate</option>
						<option>PostGraduate</option>
						<option>Masters</option>
				</select></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td><label>Gender:</label></td>
				<td><input type="radio" name="gender" value="male">Male
					<input type="radio" name="gender" value="female">Female 
					<input type="radio" name="gender" value="other">Other</td>
			</tr>
			<tr>
				<td></td>
				<td></td>
			</tr>
 			<tr>
				<td></td>
				<td><input type="submit" value="SignUp" size="15"></td>
			</tr>
		</table>
	</form>
</body>
</html>  