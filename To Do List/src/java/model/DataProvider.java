/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author AYMAN MNSOR
 */
public class DataProvider {

    //Database connection
    private Connection myCon;
    private PreparedStatement statement;

    void connectToDB() throws ClassNotFoundException, SQLException {
        // Instantiate the driver for MySQL
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

// Create the connection to the db
        try {
//      conn = DriverManager.getConnection ("jdbc:odbc:DS","","");
            myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/todo_list", "root", "");
//      String query = "select * from users";
//             Statement s = null;
//	     s = myCon.createStatement();
//
//	     ResultSet rs= s.executeQuery(query);
//             while(rs.next()){
//             System.out.println(rs.getString("id"));
//             }

            //When you upload, use this statement instead:
            //myCon = DriverManager.getConnection("cjdbc:mysql://localhost:3306/ex_cars?user=ex_cars&password=9a0zns83ve40as98345hnv?autoReconnect=true"); //hostgator
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public boolean loginAuth(String name, String pass) throws SQLException {

        java.util.List<User> userList = new ArrayList<User>();
        // connect to data base
        try {
            connectToDB();
        } catch (ClassNotFoundException e1) {

            e1.printStackTrace();
        }

        boolean found = false;
        try {
            statement = (PreparedStatement) myCon.prepareStatement(
                    "select * from users where name = ? and password = ?");
            statement.setString(1, name);
            statement.setString(2, pass);

            ResultSet rs = statement.executeQuery();

            found = rs.next();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            // close both the SQL statement and the DB connection
            if (statement != null) {
                statement.close();
            }
            if (myCon != null) {
                myCon.close();
            }
        }
        return found;

    }

    public java.util.List<User> getUser(String name) throws SQLException {

        java.util.List<User> userList = new ArrayList<User>();
        // connect to data base
        try {
            connectToDB();
        } catch (ClassNotFoundException e1) {

            e1.printStackTrace();
        }

        boolean found = false;
        try {
            statement = (PreparedStatement) myCon.prepareStatement(
                    "select * from users where name=? ");
            statement.setString(1, name);
            

            ResultSet rs = statement.executeQuery();

            
//System.err.println("The user list size"+rs.getNString(0));
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setPassword(rs.getString("password"));
                userList.add(user);
            }
            System.err.println("The user list size"+userList.size());
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            // close both the SQL statement and the DB connection
            if (statement != null) {
                statement.close();
            }
            if (myCon != null) {
                myCon.close();
            }
        }
        return userList;

    }

    public void registeration(String name, String pass) throws SQLException {

        java.util.List<User> userList = new ArrayList<User>();
        // connect to data base
        try {
            connectToDB();
        } catch (ClassNotFoundException e1) {

            e1.printStackTrace();
        }

        boolean done = false;
        try {
            statement = (PreparedStatement) myCon.prepareStatement(
                    "insert into users(name,password) values(?,?)");

            statement.setString(1, name);
            statement.setString(2, pass);

            int update = statement.executeUpdate();

            if (update > 0) {
                System.out.println("Registered !!!");
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            // close both the SQL statement and the DB connection
            if (statement != null) {
                statement.close();
            }
            if (myCon != null) {
                myCon.close();
            }
        }
//		return done;

    }

    public void todoInsert(int user_id,String title, String content) throws SQLException {

        java.util.List<User> userList = new ArrayList<User>();
        // connect to data base
        try {
            connectToDB();
        } catch (ClassNotFoundException e1) {

            e1.printStackTrace();
        }

        boolean done = false;
        try {
            statement = (PreparedStatement) myCon.prepareStatement(
                    "insert into task_list(user_id,title,content,completed) values(?,?,?,0)");
            statement.setInt(1, user_id);
            statement.setString(2, title);
            statement.setString(3, content);

            int update = statement.executeUpdate();

            if (update > 0) {
                System.out.println("Insert Compeleted !!!");
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            // close both the SQL statement and the DB connection
            if (statement != null) {
                statement.close();
            }
            if (myCon != null) {
                myCon.close();
            }
        }
//		return done;

    }

      public void todoUpdate(String id ,String title, String content) throws SQLException {

        java.util.List<User> userList = new ArrayList<User>();
        // connect to data base
        try {
            connectToDB();
        } catch (ClassNotFoundException e1) {

            e1.printStackTrace();
        }

        boolean done = false;
        try {
            statement = (PreparedStatement) myCon.prepareStatement(
                    "update task_list set title=?,content=?, completed=0 where id=?");
            
            statement.setString(1, title);
            statement.setString(2, content);
            statement.setString(3, id);
            int update = statement.executeUpdate();

            if (update > 0) {
                System.out.println("Insert Compeleted !!!");
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            // close both the SQL statement and the DB connection
            if (statement != null) {
                statement.close();
            }
            if (myCon != null) {
                myCon.close();
            }
        }
//		return done;

    }
      
       public void todoDelete(String id ) throws SQLException {

        java.util.List<User> userList = new ArrayList<User>();
        // connect to data base
        try {
            connectToDB();
        } catch (ClassNotFoundException e1) {

            e1.printStackTrace();
        }

        try {
            statement = (PreparedStatement) myCon.prepareStatement(
                    "delete from task_list where id=?");
            
            statement.setString(1, id);
            int delete = statement.executeUpdate();

            if (delete > 0) {
                System.out.println("Delete has Compeleted !!!");
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            // close both the SQL statement and the DB connection
            if (statement != null) {
                statement.close();
            }
            if (myCon != null) {
                myCon.close();
            }
        }
//		return done;

    }
       
       public void todoCompleted(String id ) throws SQLException {

        java.util.List<User> userList = new ArrayList<User>();
        // connect to data base
        try {
            connectToDB();
        } catch (ClassNotFoundException e1) {

            e1.printStackTrace();
        }

        try {
            statement = (PreparedStatement) myCon.prepareStatement(
                    "update task_list set completed=? where id=?");
            statement.setInt(1, 1);
            statement.setString(2, id);
            int completed = statement.executeUpdate();

            if (completed > 0) {
                System.out.println("Todo task has Compeleted !!!");
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            // close both the SQL statement and the DB connection
            if (statement != null) {
                statement.close();
            }
            if (myCon != null) {
                myCon.close();
            }
        }
//		return done;

    }
    
    public java.util.List<ToDoList> retrieveAllLists(int id) throws SQLException {

        java.util.List<ToDoList> todoList = new ArrayList<ToDoList>();
        // connect to data base
        try {
            connectToDB();
        } catch (ClassNotFoundException e1) {

            e1.printStackTrace();
        }
        Statement s = null;
        try {

            statement = (PreparedStatement) myCon.prepareStatement(
                    "select * from task_list where user_id like ?");

            statement.setInt(1, id);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                ToDoList todo = new ToDoList();
                todo.setId(rs.getInt("id"));
                todo.setTitle(rs.getString("title"));
                todo.setContent(rs.getString("content"));
                todo.setCompleted(rs.getBoolean("completed"));
                todoList.add(todo);
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            // close both the SQL statement and the DB connection
            if (s != null) {
                s.close();
            }
            if (myCon != null) {
                myCon.close();
            }
        }
        return todoList;
    }

}
