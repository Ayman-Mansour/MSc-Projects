<%-- 
    Document   : Login
    Created on : Mar 24, 2017, 8:58:39 AM
    Author     : AYMAN MNSOR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="d" %>
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
<link rel="icon" href="todo.png">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" >
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" >  
<link rel="stylesheet" type="text/css" href="css/logo-nav.css" > 
<link rel="stylesheet" type="text/css" href="css/style.css" >

<html>
    <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>

<div class="container">
<!--    <div class="row">
        <img style="margin: auto; display: block;

        " height="150px" width="150px" src="{{asset('loginicon.png')}}" alt="LOGO">
        <br>
    </div>-->
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <div class="panel panel-default">
                <div class="panel-heading">Login</div>
                <div class="panel-body">
                    <form class="form-horizontal" role="form" method="POST" action="LoginServlet" >
                        

                        <div class="form-group">
                            <label for="name" class="col-md-4 control-label">User Name</label>

                            <div class="col-md-6">
                                <input id="name" type="name" class="form-control" required="" name="name" >

                                
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="password" class="col-md-4 control-label">Password</label>

                            <div class="col-md-6">
                                <input id="password" type="password" class="form-control" required="" name="password">

                                
                            </div>
                        </div>

                        <div class="form-group" >
                            <div class="col-md-6 col-md-offset-6">
                                <button type="submit" class="btn btn-primary">
                                    <i class="fa fa-btn fa-sign-in"></i> Login
                                </button>

                                <a class="btn btn-link" href="register.jsp">Register</a>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
<h4 style="text-align: center;">Last Login at ( <span style="color: #08c"><d:out value="${lastvisit}"></d:out></span> )</h4>
</div>
    </body>
</html>

