<%-- 
    Document   : index
    Created on : Mar 25, 2017, 4:11:48 AM
    Author     : AYMAN MNSOR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="master.jsp" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="d" %>
<script src="js/app-ajax.js" type="text/javascript"></script>
<%--<script>
                $(document).ready(function () {                        
                        $('#btn').click(function (event) {
            var h1 = "<iframe id='myHtml' name=myhtml'' style='height: 500px;width: 575px;'scrolling='no' ' frameborder='0' src='update.jsp'></iframe>";
                               document.getElementById('metual').innerHTML = h1;
            ;
         });
                 parent.myhtml.getElementById('t_id').value = 'task_id'
       });
        </script>--%>

<div class="container">
    <h2 style="text-align: center;">Welcome back  # <span style="color: #08c"><d:out value="${name}"></d:out></span> #</h2>
        <br/>
        <div class="row">
            <div id="metual" class="col-md-6 " style="margin-left: 0;">
                <div class="panel panel-default">
                    <div class="panel-heading">To Do</div>
                    <div class="panel-body">
                        <form class="form-horizontal" role="form" method="POST" action="HomeServlet" >
                            <div class="form-group">
                                <label for="title" class="col-md-4 control-label">Title</label>

                                <div class="col-md-6">
                                    <input id="title" type="text" class="form-control" required="" name="title" >

                                </div>
                            </div>



                            <div class="form-group">
                                <label for="content" class="col-md-4 control-label">Content</label>

                                <div class="col-md-6">
                                    <textarea id="content" style="height: 240px;width: 247px;" 
                                              type="text" class="form-control" required="" name="content"></textarea>
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="col-md-4 col-md-offset-6">
                                    <button type="submit" class="btn btn-primary">
                                        <i class="fa fa-btn fa-user"></i> Save
                                    </button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <div class="col-md-6" >
                <div class="panel panel-success" style="
                     height: 440px;
                     overflow: scroll;
                     overflow-x: hidden " >
                    <div class="panel-heading "><h3>To Do Lists</h3></div>
                    <div class="panel-body">
                    <d:forEach items="${requestScope.todoList}" var="list">
                        <d:choose>
                            <d:when test="${list.completed ==false}">
                                <div class="col-sm-6">
                                    <div class="panel panel-inverse-primary">
                                        <div class="panel-heading">
                                            <div class="row">
                                                <h3>
                                                    <div class="col-xs-12 ">


                                                        <input hidden="hidden" id="task_id" name="task_id"
                                                               value=" ${list.id}">

                                                        <div class=""><d:out value="${list.title}"></d:out>
                                                            </div> 
                                                        </div>
                                                    </h3> 
                                                    <div class="col-xs-12 "><d:out value="${list.content}"></d:out></div>
                                                </div>
                                            </div>

                                            <div class="panel-footer">
                                                <div class="row" class="col-xs-12 ">


                                                    <form class="col-xs-12" style="width: 31%;" action="GoToUpdateServlet" method="post">
                                                        <input hidden="hidden" id="task_id" name="task_id"
                                                               value=" ${list.id}"><button type="submit" class="btn btn-warning">
                                                        Edit
                                                    </button></form>

                                                <form class="col-xs-12" style="width: 31%;" action="CompletedServlet" method="post">
                                                    <input hidden="hidden" id="task_id" name="task_id"
                                                           value=" ${list.id}"><button type="submit"  class="btn btn-success">
                                                        <i class="fa fa-btn fa-user"></i> Done
                                                    </button>
                                                </form>
                                                <form class="col-xs-12" style="width: 31%;" action="DeleteServlet" method="post">
                                                    <input hidden="hidden" id="task_id" name="task_id"
                                                           value=" ${list.id}"><button type="submit" class="btn btn-danger">
                                                        Delete
                                                    </button></form>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </d:when>
                            <d:otherwise>
                                <div class="col-sm-6">
                                    <div class="panel panel-inverse-primary">
                                        <div class="panel-heading">
                                            <div class="row">
                                                <h3>
                                                    <div class="col-xs-12 ">


                                                        <input hidden="hidden" id="task_id" name="task_id"
                                                               value=" ${list.id}">

                                                        <div class=""><strike><d:out value="${list.title}"></d:out></strike>
                                                            </div> 
                                                        </div>
                                                    </h3> 
                                                    <div class="col-xs-12 "><strike><d:out value="${list.content}"></d:out></strike></div>
                                                </div>
                                            </div>

                                            <div class="panel-footer">
                                                <div class="row" class="col-xs-12 ">


                                                    <form class="col-xs-12" style="width: 31%;" action="GoToUpdateServlet" method="post">
                                                        <input hidden="hidden" id="task_id" name="task_id"
                                                               value=" ${list.id}"><button type="submit" class="btn btn-warning">
                                                        Edit
                                                    </button></form>

                                                <form class="col-xs-12" style="width: 31%;" action="DeleteServlet" method="post">
                                                    <input hidden="hidden" id="task_id" name="task_id"
                                                           value=" ${list.id}"><button type="submit" class="btn btn-danger">
                                                        Delete
                                                    </button></form>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                            </d:otherwise>
                        </d:choose>
                    </d:forEach>

                </div>

            </div>
        </div>
    </div>
</div>

<div id="hi"></div>




