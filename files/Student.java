public class Student{
   private String name;
   private int age;
   private String id;
   private char  gender;
   private float gpa;
   public Student(String name, int age,String id, char gender, float gpa){
		this.name = name;
		this.age = age;
		this. id = id;
		this.gender = gender;
		this.gpa = gpa;
	}
 

   public static void main(String[] args){
        Student student_A = new Student("Kabuga",31,"2025/BCS/021/PS",'M',3.3f);
        Student student_B = new Student("Nowembabazi",24,"2025/BCS/033/PS",'F',3.5f);
        
   }
}
