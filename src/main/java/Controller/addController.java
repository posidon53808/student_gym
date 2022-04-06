package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.studentDao;
import Model.student;


public class addController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public addController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String roomNumber=request.getParameter("roomNumber");
		String idCard=request.getParameter("idCard");
		String equipment=request.getParameter("equipment");
		String time=request.getParameter("time");
		student s=new student(roomNumber,idCard,equipment,time);
		new studentDao().add(s);
		response.sendRedirect("finish.jsp");
	}

}
