package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.employeeDao;
import Dao.studentDao;

public class deleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public deleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		if(id!=""&&id!=null) 
		{
		new studentDao().delete(Integer.parseInt(id));}
		
	
 response.sendRedirect("deletefinish.jsp");
 }
}
