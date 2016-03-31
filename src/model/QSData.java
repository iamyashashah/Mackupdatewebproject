package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import java.math.BigDecimal;
import java.util.List;
import model.DBUtil; 

public class QSData { 

	public TypedQuery <StudentGradebook> FindWithtype (String studName){
		EntityManager em1 = DBUtil.getEmFactory().createEntityManager();

		return em1.createQuery(
				"SELECT gb FROM StudentGradebook gb WHERE gb.studName LIKE :name",StudentGradebook.class)
				.setParameter("name", studName);
	}

		public long CheckforUSER (String studName){
			EntityManager em2 = DBUtil.getEmFactory().createEntityManager();
			TypedQuery query=em2.createQuery("SELECT count(gb) FROM StudentGradebook gb WHERE gb.studName LIKE :name",StudentGradebook.class)
			.setParameter("name",studName);
			long total=(long) query.getSingleResult();
			
			return total;
		}
		
		public int updateGradeBook(String name, String assignment_name, String assignment_type, long grade)
		{
			int count=0;
			EntityManager em3 = DBUtil.getEmFactory().createEntityManager();
			EntityTransaction trans=em3.getTransaction();
			
			TypedQuery query=em3.createQuery("Update StudentGradebook gb set gb.assignmentName=:assignment_name, gb.assignmentType= :assignment_type, gb.grade= :stud_grade where gb.studName = :name",StudentGradebook.class)
					.setParameter("assignment_name", assignment_name)
					.setParameter("assignment_type", assignment_type)
					.setParameter("stud_grade", grade)
					.setParameter("name", name);
			try
			{
				trans.begin();
				count=query.executeUpdate();
				trans.commit();
			}
			catch (Exception e)
			{
				trans.rollback();
			}
			finally
			{
				em3.close();
			}
			return count;
		}
}
