import java.util.Comparator;
//Using comparables to compare students' marks.
class student implements Comparable<student>{
    private int age,marks;
    void setMarks(int m){
        this.marks = m;}
    void setAge(int a){
        this.age = a;}
    int getAge(){
        return age;}
    int getMarks(){
        return marks;}
    public int compareTo(student N){
        return this.marks - N.marks;
    }
}
// using comparators to compare students' ages
class CompareAge implements Comparator<student>{
    public int compare(student S1, student S2){
        return S1.getAge() - S2.getAge(); 
    }
}
public class Student2{
    public static void main(String [] args){
        student S1 = new student();
        student S2 = new student();
        S1.setAge(20);S1.setMarks(90);
        S2.setAge(30);S2.setMarks(70);
        int result = S1.compareTo(S2);
        if(result > 0){
            System.out.println("Student 1 performed better than student 2");  
        }else if(result < 0){
            System.out.println("Student 2 is better than student 1");
        }
        else{
            System.out.println("Student 1 and student 2 got the same marks");
       }
       CompareAge compareAge = new CompareAge();
       int Result = compareAge.compare(S1,S2);
       if(Result > 0){
            System.out.println("Student 1 is older than student 2");  
        }else if(Result < 0){
            System.out.println("Student 2 is older than student 1");
        }
        else{
            System.out.println("Student 1 and student 2 have the same age");
       }



    }
} 
