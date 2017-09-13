import java.util.Date;
import java.util.*;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
			
		
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here	
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index<=0 || index>=students.length()){
			throw new IllegalArgumentException;
		}
		else{
			return students[index];
		}
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(index<=0 || index>=students.length()){
			throw new IllegalArgumentException;
		}
		else{
			student[index] = student;
		}
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		ArrayList<Student> al=new ArrayList<Student>(Arrays.asList(students));
		al.addFirst()
		if(student == Null)
		{
			throw new IllegalArgumentException;
		}
		
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		ArrayList<Student> al=new ArrayList<Student>(Arrays.asList(students));
		al.addLast(student);
		if(student == Null)
		{
			throw new IllegalArgumentException;
		}
		
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		ArrayList<Student> al=new ArrayList<Student>(Arrays.asList(students));
		al.add(index,student);
		if(student == Null)
		{
			throw new IllegalArgumentException;
		}
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		ArrayList<Student> al=new ArrayList<Student>(Arrays.asList(students));
		al.remove(index);
		if(student == Null)
		{
			throw new IllegalArgumentException;
		}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		ArrayList<Student> al=new ArrayList<Student>(Arrays.asList(students));
		al.remove(student);
		if(index<=0 || index>=students.length()){
			throw new IllegalArgumentException;
		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		ArrayList<Student> al=new ArrayList<Student>(Arrays.asList(students));
		if(student == Null)
		{
			throw new IllegalArgumentException;
		}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		ArrayList<Student> al=new ArrayList<Student>(Arrays.asList(students));
		if(index<=0 || index>=students.length()){
			throw new IllegalArgumentException;
		}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		ArrayList<Student> al=new ArrayList<Student>(Arrays.asList(students));
		if(index<=0 || index>=students.length()){
			throw new IllegalArgumentException;
		}
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		ArrayList<Student> al=new ArrayList<Student>(Arrays.asList(students));
		if(student == Null)
		{
			throw new IllegalArgumentException;
		}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		 static void bubbleSort(int[] arr) {  
              int n = students.length;  
                int temp = 0;  
                for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                 if(arr[j-1] > arr[j]){  
                //swap elements  
                 temp = students[j-1];  
                 students[j-1] = students[j];  
                 students[j] = temp;  
               }  
            }
        }
                          
	}
		
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		if(student == Null)
		{
			throw new IllegalArgumentException;
		}
		return null;
	}
}
