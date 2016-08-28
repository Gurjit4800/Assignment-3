package datamanagement;

public class StudentUnitRecord implements IStudentUnitRecord 
//navinder singh atwal	
//11542757
//
{
	private Integer sid;// sid for student id
	private String uc;//uc for subject code
	private float a1, a2, ex; //a1 for assignment 1, a2 for assignment 2 and ex for exam

	//following are the variables used in program
	public StudentUnitRecord(Integer id, String code, float asg1, float asg2,
			float exam) 
	   {
		this.sid = id;//subject id
		this.uc = code;//subject code
		this.setAsg1(asg1);//assignment 1 marks
		this.setAsg2(asg2);//assignment 2 marks
		this.setExam(exam);// exam marks
	   }

	public Integer getStudentID() 
	   {
		return sid;//sid is used for student id
	   }

	public String getUnitCode() 
	   {
		return uc;// uc is used for subject code
	   }

	public void setAsg1(float a1) 
	   {
		if (a1 < 0 || //logical statement for conditional situations
			a1 > UnitManager.UM().getUnit(uc).getAsg1Weight()) 
		   {
			throw new RuntimeException("Mark cannot be less than zero or greater than assessment weight");
		   }
		this.a1 = a1;
	   }

	public float getAsg1() 
	   {
 
		return a1;
	   }

	public void setAsg2(float a2) 
	   {
		if (a2 < 0 ||//logical statement for conditional situations
			a2 > UnitManager.UM().getUnit(uc).getAsg2Weight()) 
		   {
			throw new RuntimeException("Mark cannot be less than zero or greater than assessment weight");
		   }
		this.a2 = a2;

	   }

	public float getAsg2() 
	   {
		return a2;
	   }

	public void setExam(float ex) 
	   {
		if (ex < 0 ||//logical statement for conditional situations
				ex > UnitManager.UM().getUnit(uc).getExamWeight()) 
		       {
				throw new RuntimeException("Mark cannot be less than zero or greater than assessment weight");
			   }
		this.ex = ex;
	   }

	public float getExam() 
	   {
		return ex;
	   }

	public float getTotal() 
	   {
		return a1 + a2 + ex;//logical statement for total marks obtained

	   }
}
