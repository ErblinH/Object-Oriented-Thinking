public class Course{

/*
10.9 (The Course class) Revise the Course class as follows:
 The array size is fixed in Listing 10.6. Improve it to automatically increase
the array size by creating a new larger array and copying the contents of the
current array to it.
 Implement the dropStudent method.
 Add a new method named clear() that removes all students from the
course.
Write a test program that creates a course, adds three students, removes one,
and displays the students in the course.
*/

   private String courseName;
   private String[] students = new String[100];
   private int numberOfStudents;
   
   public Course(String courseName){
      this.courseName = courseName;
   }
   public void addStudents(String student){
      String[] temp = new String[students.length];
      if(numberOfStudents == students.length){
         for(int i = 0;i<students.length;i++){
            temp[i] = students[i];
         }
         students = temp;
      }
   
      students[numberOfStudents] = student;
      numberOfStudents++;
   }
   public String[] getStudents(){
      return students;
   }
   public int getNumberOfStudents() {
      return numberOfStudents;
   }
 
   public String getCourseName() {
      return courseName;
   }
   public void dropStudent(String student){
      String[] a = new String[students.length-1];
      int j = 0;
      for(int i = 0;i<a.length;i++){
         if(students[i].equals(student)) j++;
         
         a[i] = students[j];
         j++;
      }
   }
   
   public void clear(){
      students = new String[1];
      numberOfStudents++;
   }
}