

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.QSData;
import model.StudentGradebook;

/**
 * Servlet implementation class UpadateServlet
 */
@WebServlet("/UpadateServlet")
public class UpadateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpadateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		QSData qs3=new QSData();
//		StudentGradebook gbupdate=new StudentGradebook();
		
		String name=request.getParameter("name");
		String assignment_name=request.getParameter("assignment_name");
		String assignment_type=request.getParameter("assignment_type");
		long grade = Long.parseLong(request.getParameter("grade"));
		
		int count=qs3.updateGradeBook(name, assignment_name, assignment_type, grade);
		System.out.println(count);
		
		
	
//		gbupdate.setStudId(Long.parseLong(request.getParameter("id")));
//		gbupdate.setStudName(request.getParameter("name"));
//		gbupdate.setAssignmentName(request.getParameter("assignment_name"));
//		gbupdate.setAssignmentType(request.getParameter("assignment_type"));
//		gbupdate.setGrade(new BigDecimal(request.getParameter("stud_grade")));
		
		
	}

}
