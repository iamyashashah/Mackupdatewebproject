

import java.io.IOException;
import java.util.List;

import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.QSData;
import model.StudentGradebook;

/**
 * Servlet implementation class MackGradebook
 */
@WebServlet("/MackGradebook")
public class MackGradebookservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MackGradebookservlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		QSData qs3=new QSData();
		long id=0;
		String stud_name="";
		long stud_grade = 0L;
		String assignment_name="";
		String assignment_type="";
		

		String output="";

		String user_input=request.getParameter("name");
		long check =qs3.CheckforUSER(user_input);

		if(check>0)
		{

			System.out.println("firstpoint");
			List<StudentGradebook> list=qs3.FindWithtype(user_input).getResultList();


			for (StudentGradebook gb:list)
			{

				id = gb.getStudId();
				stud_name=gb.getStudName();
				stud_grade=gb.getGrade();
				assignment_name=gb.getAssignmentName();
				assignment_type=gb.getAssignmentType();
				
				
//				output +=gb.getStudId()+"\t"+gb.getAssignmentName()+"\t"+gb.getDateSubmit()+"\t"+gb.getGrade()+"\n";
				System.out.println("check");
			}
			request.setAttribute("id", id);
			request.setAttribute("stud_name", stud_name);
			request.setAttribute("stud_grade", stud_grade);
			request.setAttribute("assignment_name", assignment_name);
			request.setAttribute("assignment_type", assignment_type);
			

//			request.setAttribute("result", output);
//			System.out.println(output);
			request.getRequestDispatcher("/output.jsp").forward(request, response);
		}
		else {
			request.setAttribute("message", "not valid user name");
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
	}

}
