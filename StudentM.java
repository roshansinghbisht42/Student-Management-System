package oops;
import java.nio.channels.Pipe.SourceChannel;
import java.util.*;
    class Student{

        String Name;
        int Class;
        String Sec;
        int Class_roll;
        int att_per;
        Long Parent_no;

        Student(String Name_Stud, int Class_Stud, String Sec_Stud, int Class_Roll, int Attandance, Long Parent_ph){
            this.Name = Name_Stud;
            this.Class = Class_Stud;
            this.Sec = Sec_Stud;
            this.Class_roll = Class_Roll;
            this.att_per = Attandance;
            this.Parent_no = Parent_ph;
        }

        Student(String NewName, Student S1,int Class_Roll, int Attandance, Long Parent_ph){
            this.Name = NewName;
            this.Class = S1.Class;
            this.Sec = S1.Sec;
            this.Class_roll = Class_Roll;
            this.att_per = Attandance;
            this.Parent_no = Parent_ph;
        }
        public void Details(){
            System.out.print("Name of Student: " + Name + "\n");
            System.out.print("Class of Student: " + Class + "\n");
            System.out.print("Section of Student: " + Sec + "\n");
            System.out.print("Class roll of Student: " + Class_roll + "\n");
            System.out.print("Attandance of Student: " + att_per + "\n");
            System.out.print("Parent Phone number of Student: " + Parent_no + "\n\n");
            System.out.println("----------------------------------------------------------");
        }
    }

 class StudentM {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------------------------------");
        System.out.println("\t\tStudent Management System");
        System.out.println("\tNOTE: All the must be of same Section and Class");
        System.out.println("----------------------------------------------------------");
      
        System.out.print("Class of Student: ");
        int Studentclass = scanner.nextInt();
        System.out.println();

        System.out.print("Section of Student: ");
        String Studentsection = scanner.next();
        System.out.println();

        System.out.print("How many Student data you want to save = ");
        int input = scanner.nextInt();
        System.out.println();

        Student[] Students = new Student[input];

        for (int i = 0; i < input; i++){
                System.out.println("Enter the details of Student");

                System.out.print("Name of Student: ");
                String name = scanner.next();
                scanner.nextLine();
                System.out.println();

                System.out.print("Class Roll Number of Student: ");
                int Class_roll = scanner.nextInt();
                System.out.println();

                System.out.print("Attandce of Student: ");
                int att_per = scanner.nextInt();
                System.out.println();

                System.out.print("Parent Phone number of Student: ");
                Long Parent_no = scanner.nextLong();
                System.out.println();

                Students[i] = new Student(name, Class_roll, name, Class_roll, att_per, Parent_no);
            }
        System.out.println("---------------------------------------------");
        System.out.println("\n\n----------------Student Records-----------------\n");
        for(Student s : Students){
            s.Details();
        }
    }
}
