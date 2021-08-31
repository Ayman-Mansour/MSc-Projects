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
@WebServlet(name = "UpdateServlet", urlPatterns = {"/UpdateServlet"})
public class UpdateServlet extends HttpServlet {

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
        String id = request.getParameter("task_id");
        String title = request.getParameter("title");
        String content= request.getParameter("content");
        List<User> userList = new ArrayList<User>();
        List<ToDoList> todoList = new ArrayList<ToDoList>();
        HttpSession session = request.getSession();
        DataProvider provider = new DataProvider();
        
         try {
            
          String name = (String) session.getAttribute("name");
          
            provider.todoUpdate(id, title, content);
                userList = provider.getUser(name);
            System.err.println("The size of User List is " + userList.size());
            
                todoList = provider.retrieveAllLists(userList.get(0).getId());
                if (!todoList.isEmpty()) {
                    request.setAttribute("todoList", todoList);
                    session.setAttribute("name", name);
                    request.setAttribute("name", session.getAttribute("name"));
                    RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                    rd.include(request, response);}
        } catch (SQLException ex) {
            Logger.getLogger(DeleteServlet.class.getName()).log(Level.SEVERE, null, ex);
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
