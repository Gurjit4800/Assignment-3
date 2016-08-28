package datamanagement;
//navinder singh atwal	
//11542757
//
public class ListStudentsCTL 
   //spaces corrected and code is aligned in good way
{
	private StudentManager sm;
	public ListStudentsCTL() 
	{
		sm = StudentManager.get();
	}
public void listStudents( IStudentLister lister, String unitCode ) 

   {
	lister.clearStudents();
	StudentMap students = sm.getStudentsByUnit( unitCode );
	for (Integer id : students.keySet() ) lister.addStudent(students.get(id));
	}
}
