/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.time.LocalTime;
import model.Employee ;

/**
 *
 * @author log
 */
public class MyServlet extends HttpServlet {

      int count =0 ;
     
 protected void process(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 // logic
      count++;
     // جمعت البيانات من ال request
     int id = Integer.parseInt( request.getParameter("employeeId"));
     String firstName = request.getParameter("employeeFirstName");
     String secondName = request.getParameter("employeeSecondName");
     String employeeTitle = request.getParameter("employeeTitle");
     String employeeBirthDate = request.getParameter("employeeBirthDate");
     String employeeHireDate = request.getParameter("employeeHireDate");
     String employeeAddress= request.getParameter("employeeAddress");
     String  employeeCity= request.getParameter("employeeCity");
     String employeeRegion = request.getParameter("employeeRegion");
     String employeePostalCode = request.getParameter("employeePostalCode");
     String employeeCountry = request.getParameter("employeeCountry");
     String employeePhone = request.getParameter("employeePhone");
     //عملت object عشان اخزن فيه البيانات
     Employee employee = new Employee();
     employee.setEmployeeAddress(employeeAddress);
     employee.setEmployeeBirthDate(employeeBirthDate);
     employee.setEmployeeCity(employeeCity);
     employee.setEmployeeCountry(employeeCountry);
     employee.setEmployeeHireDat(employeeHireDate);
     employee.setEmployeePhone(employeePhone);
     employee.setEmployeePostalCode(employeePostalCode);
     employee.setEmployeeRegion(employeeRegion);
     employee.setEmployeeTitle(employeeTitle);
     employee.setFirstName(firstName);
     employee.setId(id);
     employee.setSecondName(secondName);
  
     /*
// Make session to share employee object
HttpSession session =  request.getSession();
session.setAttribute("employeeObject", employee);
     */

// instead of sharing data by session, using request

request.setAttribute("employeeObject", employee);

// make request dispatch to go to another servlet without hyper link

 RequestDispatcher requestDispatcher = request.getRequestDispatcher("SessionServlet");
 requestDispatcher.forward(request, response);



 /*   
//presntation
                PrintWriter out =  response.getWriter();
               out.println("<html>");
                    out.println("<body>");    

                        out.println("<b> Id </b>" + id + "<br>");
                        out.println("<b> " + firstName + " "+ secondName + " is added to database " + "<br>");
                        
                        out.println("User Number  : </b>" + count+ "<br>");
                        if(count==10){
                        out.println("<fonmployeeAddress(employeeAddress);t color = \"green\"> <b> You are the winner</b></font><br>");
                        }
                    
                        out.println("<b> if you have  any problem send email to : <b>" );
                     // servlet config
                        out.print(getServletConfig().getInitParameter("email") + "<br>");
                        // servlet context
                        out.print(getServletContext().getInitParameter("UserEmail"));

                        out.print("<a href='/firstWebAplication/SessionServlet' >Show Employee Detail </a>");
                        
                   out.println("<body>");

               out.println("<html>"); 
*/
    }
    
      
      
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
   process(request,response);
 
    }

    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
               process(request,response);

       
    }

  

    
}
