package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the STUDENT_GRADEBOOK database table.
 * 
 */
@Entity
@Table(name="STUDENT_GRADEBOOK")
@NamedQuery(name="StudentGradebook.findAll", query="SELECT s FROM StudentGradebook s")
public class StudentGradebook implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="STUD_ID")
	private long studId;

	@Column(name="ASSIGNMENT_NAME")
	private String assignmentName;

	@Column(name="ASSIGNMENT_TYPE")
	private String assignmentType;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_SUBMIT")
	private Date dateSubmit;

	private long grade;

	@Column(name="STUD_NAME")
	private String studName;

	public StudentGradebook() {
	}

	public long getStudId() {
		return this.studId;
	}

	public void setStudId(long studId) {
		this.studId = studId;
	}

	public String getAssignmentName() {
		return this.assignmentName;
	}

	public void setAssignmentName(String assignmentName) {
		this.assignmentName = assignmentName;
	}

	public String getAssignmentType() {
		return this.assignmentType;
	}

	public void setAssignmentType(String assignmentType) {
		this.assignmentType = assignmentType;
	}

	public Date getDateSubmit() {
		return this.dateSubmit;
	}

	public void setDateSubmit(Date dateSubmit) {
		this.dateSubmit = dateSubmit;
	}

	public long getGrade() {
		return this.grade;
	}

	public void setGrade(long grade) {
		this.grade = grade;
	}

	public String getStudName() {
		return this.studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

}