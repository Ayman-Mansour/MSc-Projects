<%-- 
    Document   : update
    Created on : Mar 28, 2017, 9:03:44 AM
    Author     : AYMAN MNSOR
--%>

<!--<link rel="icon" href="{{asset('loginicon.png')}}">
<!-- <link href="https://fonts.googleapis.com/css?family=Lato:100" rel="stylesheet" type="text/css"> -->
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" >
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" >  
<link rel="stylesheet" type="text/css" href="css/logo-nav.css" > 
<link rel="stylesheet" type="text/css" href="css/style.css" >
<script src="js/app-ajax.js" type="text/javascript"></script>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="d" %>
<script type="text/javascript">
    
//    document.getElementById('task').value = document.getElementById('task_id').value;
//$("#task_id").append("#last");
    parent.myhtml.getElementById('t_id').value = 'task_id'; 
//window.parent.document.getElementById('t_id').value = "gfhjgf";
</script>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="master.jsp" %>
<!DOCTYPE html>

        <div class="container">
        <div  class="col-md-6 col-md-offset-3" >
            <div class="panel panel-default " >
                <div class="panel-heading">Update To Do</div>
                <div class="panel-body">
                    <form class="form-horizontal" role="form" method="POST" action="UpdateServlet" >
                        <div id="last" class="form-group">
                            <label for="title" class="col-md-4 control-label">Title</label>
                            <d:set var="listid" value="${requestScope.taskid}"></d:set>
                            <input  hidden="hidden" type="text" name="task_id" value="<d:out value="${listid}"></d:out>">
                            <div class="col-md-6">
                                <input id="title" type="text" class="form-control" required="" name="title" >

                            </div>
                        </div>



                        <div class="form-group">
                            <label for="content" class="col-md-4 control-label">Content</label>

                            <div class="col-md-6">
                                <textarea id="content" style="height: 220px;width: 247px;" 
                                          type="text" class="form-control" required="" name="content"></textarea>
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-md-4 col-md-offset-4">
                                <button type="submit" class="btn btn-primary">
                                    <i class="fa fa-btn fa-user"></i> Update
                                </button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        </div>
   