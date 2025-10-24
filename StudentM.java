import java.util.*;
class Student{
    String School_Name;
    String Name;
    int Class;
    char Section;
    String Parent_Name;
    long Phone_Num;

    //constructor overloading( the student constructor s1)
        Student(String school_name, String sName, int sClass, char section, String parent_name, long phone_num){
            this.Name=sName;
            this.Class=sClass;
            this.Section=section;
            this.Parent_Name=parent_name;
            this.Phone_Num=phone_num;
            this.School_Name=school_name;
        }
    //copy constructor (it copies th eschool name of the s1 student object)
        Student(Student s1,String newName, int newClass, char newSection, String newParentName, long newPhoneNum){
            this.Name=newName;
            this.Class=newClass;
            this.Section=newSection;
            this.Parent_Name=newParentName;
            this.Phone_Num=newPhoneNum;
            this.School_Name=s1.School_Name;
        }

    //methods of the user inputs to be shown after the inputs
        public void display(){
            System.out.println("\n---------------------------\n");
            System.out.println("\n------Student Details------");
            System.out.print("School Name       : " + School_Name);
            System.out.print("\nStudent Name    : " + Name);
            System.out.print("\nClass           : " + Class);
            System.out.print("\nSection         : " + Section);
            System.out.print("\nParent Name     : " + Parent_Name);
            System.out.print("\nPhone Number    : " + Phone_Num);
            System.out.println("\n---------------------------\n");
        }
}
public class StudentM{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
         System.out.println("\n-----------------------------------------------------\n");
         System.out.println("\t------Student Management System------");
         System.out.println("\n-----------------------------------------------------\n");

         System.out.print("Enter School Name: ");
         String schoolName = scanner.nextLine();

         System.out.print("\nHow many students do you want to enter? ");
         int inputs = scanner.nextInt();
         scanner.nextLine();//it consumes a new line

         //array of objects for student inputs
         Student[] students = new Student[inputs];
         int count = 0;

            //boolean for while loop
             boolean running = true;
             while(running){
            //menu in student management system
            System.out.println("1: Add Record of Students");
            System.out.println("2: Display Record of Students");
            System.out.println("3: Search Student by Name");
            System.out.println("4: Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1: 
                    for(int i=0; i<inputs; i++){
                    System.out.print("Enter the Details of Student : " + (i+1) + "\n");

                    //name
                    System.out.print("\nEnter Student Name: ");
                    String name = scanner.nextLine();
                    System.out.println();

                    //class
                    System.out.print("Enter Class: ");
                    int studentclass = scanner.nextInt();
                    scanner.nextLine(); //it consumes a new line
                    System.out.println();

                    //section
                    System.out.print("Enter Section: ");
                    char section = scanner.next().charAt(0);
                    scanner.nextLine(); //it consumes a new line
                    System.out.println();

                    //parent name
                    System.out.print("Enter Parent Name of the Student: ");
                    String parentName = scanner.nextLine();
                    System.out.println();

                    //phone number
                    System.out.print("Enter Parent's phone number: ");
                    long phoneNum = scanner.nextLong();
                    scanner.nextLine(); //it consumes a new line
                    System.out.println();

                    //creating objects of the student class
                    students[i]= new Student(schoolName, name, studentclass, section, parentName, phoneNum);
                    }
                break;

                case 2:
                    System.out.println("\n================ Student Details ================\n");
                    for(Student S : students){
                        if(S != null)
                        S.display();
                    }
                break;

                case 3:
                    System.out.print("\nEnter the name of the Student to search: ");
                    String searchname = scanner.nextLine();
                    boolean found = false;
                    for(Student S : students){
                        if(S != null && S.Name.equalsIgnoreCase(searchname)){
                            S.display();
                            found=true;
                        }
                    }
                break;

                case 4:
                    running = false;
                    System.out.println("\nExiting Student Management System.");
                    System.out.println("\n-----------------------------------------------------\n");
                break;
                
                default: 
                System.out.println("\nInvalid choice!!! \nPlease try again with a valid option.");
                break;
        }
    }
        scanner.close();
    }
}
