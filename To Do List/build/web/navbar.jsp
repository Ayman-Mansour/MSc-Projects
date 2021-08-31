<%-- 
    Document   : Navbar
    Created on : Mar 24, 2017, 9:15:07 AM
    Author     : AYMAN MNSOR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>-->
<link rel="stylesheet" type="text/css" href="css/dropdown_menu.css" >
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/To_Do_List/">
                <img height="55px" width="60px" src="todo.png" alt="LOGO">
            </a>
        </div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <!--                    <ul class="nav navbar-nav">
                                <li>
                                    <a href="{{ url ('student') }}">Students</a>
                                </li>
                                 <li class="dropdown">
                                     <a class="dropbtn">Student</a>
                                     <div class="dropdown-content">
                                          <a href="{{ url ('addstudent') }}">Add Student</a>
                                          <a href="#">Link 2</a>
                                          <a href="#">Link 3</a>
                                     </div>
                                </li> 
                                <li>
                                    <a href="{{ url ('teacher') }}">Teachers</a>
                                </li>
                                <li>
                                    <a href="{{ url ('courses_names') }}">Courses</a>
                                </li>
                                <li>
                                    <a href="{{ url ('expense') }}">Expenses</a>
                                </li>
                                <li>
                                    <a href="{{ url ('result') }}">Results</a>
                                </li>
                                <li>
                                    <a href="{{ url ('report') }}">Reports</a>
                                </li>
            
                                
                                <li>
                                    <a href="{{ url ('about') }}">About</a>
                                </li>
                            </ul>-->


            <ul class="nav navbar-nav navbar-right">
                <li>
                    <a class="pull-right" href="LogoutServlet">Logout</a>
                </li>
            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </div>
    <!-- /.container -->
</nav>
