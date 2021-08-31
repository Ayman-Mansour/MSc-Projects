/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DataProvider;
import model.ToDoList;
import model.User;

/**
 *
 * @author AYMAN MNSOR
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//         List<User> userList = new ArrayList<User>();
////        processRequest(request, response);
//        DataProvider provider=new DataProvider();
//        try {
//            userList = provider.getUsers();
//            System.out.println();
//        } catch (SQLException ex) {
//            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet LoginServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet LoginServlet at " + userList.get(0).getName() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String pass = request.getParameter("password");
        List<User> userList = new ArrayList<User>();
        List<ToDoList> todoList = new ArrayList<ToDoList>();
        processRequest(request, response);
        DataProvider provider = new DataProvider();
        PrintWriter out = response.getWriter();

        try {
            userList = provider.getUser(name);
            System.err.println("The size of User List is " + userList.size());
            if (provider.loginAuth(name, pass)) {
                todoList = provider.retrieveAllLists(userList.get(0).getId());
                if (!todoList.isEmpty()) {
                    request.setAttribute("todoList", todoList);
                    HttpSession session = request.getSession();
                    long creationTime = session.getCreationTime();
            System.out.println("Session has created at "+creationTime);
                    session.setAttribute("name", name);
                    request.setAttribute("name", session.getAttribute("name"));
                    RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                    rd.include(request, response);
                } else {
                    HttpSession session = request.getSession();
                    session.setAttribute("name", name);
                    request.setAttribute("name", session.getAttribute("name"));
                    RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                    rd.include(request, response);
                }
//            System.out.println(todoList.get(0).getContent());

            } else {
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.include(request, response);

            }
//           processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
