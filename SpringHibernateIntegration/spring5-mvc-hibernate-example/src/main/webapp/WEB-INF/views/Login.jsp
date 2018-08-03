<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
body
{
margin: 2% 20% 2% 20%;
background-color: #eaf9ff;
}
.main{
padding: 20%;
}
.card
{
  background-image: url('../image/bgimg.png');
  height: 350px;
  width: 400px;
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  max-width: 100%;
  max-height: 100%;
  margin: auto;
  /*background-color: #f4f7fc;*/
}

.inner-card{
padding: 3% 10% 3% 10%;
max-height: auto;
}

input[type=text]{
    width: 100%;
    box-sizing: border-box;
    border: 2px solid #ccc;
    border-radius: 4px;
    font-size: 16px;
    background-color: white;
    background-image: url('user.png');
    background-position: 8px 8px; 
    background-repeat: no-repeat;
    padding: 12px 20px 12px 50px;
    height: 50px;
    font-size: 18px;
}

input[type=password]{
    width: 100%;
    box-sizing: border-box;
    border: 2px solid #ccc;
    border-radius: 4px;
    font-size: 16px;
    background-color: white;
    background-image: url('/main/webapp/image/bgimg.png');
    background-position: 8px 8px; 
    background-repeat: no-repeat;
    padding: 12px 20px 12px 50px;
    height: 50px;
    font-size: 18px;
}
input[type=submit]{
    /*background-image: url('image/bgimg.png');*/
    box-sizing: border-box;
    width: 100%;
    height: 50px;
    border: 2px solid #ccc;
    border-radius: 4px;
    font-size: 16px;
}

#header{
color: white;
text-align: center;
margin-bottom: 5px;
font-size: 24px;
}
.column{
padding:10px;
}
.label{
color: #777;
margin-bottom: 5px;
font-size: 18px;
}

@media screen and (max-width: 600px) {
body{
margin: 0;
}
.main{
padding:5%;
}
}

@media screen and (max-width: 600px) {
body{
margin: 2%;
}
.main{
padding: 2%;
}
}
</style>
</head>
<body>
<div class="main">
<form action="Login.htm" method="post">
	<div class="card">
		<div class="inner-card">
			<div class="column" id="header">
				Login Page
			</div>

			<div class="column">
				<!--<div class="label">User Id</div>-->
				<input type="text" name="name" placeholder="User Name"/>
			</div>
			
			<div class="column">
				<!--<div class="label">Password</div>-->
				<input type="password" name="password" placeholder="Password"/>
			</div>

			<div class="column" style="text-align:center">
				<input type="submit" value="Login"/>
			</div>

			<div class="column" style="text-align:right;">
				<a href="#" style="text-decoration:none; color: #257;">Forget Password.</a>
			</div>
			<div style="color: red;">${status }</div>
		</div>
	</div>
</form>
</div>
</body>
</html>