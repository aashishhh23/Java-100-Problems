// Design a Course Class:
// Instance variables:courseName, enrolledStudents
// Static Variable: maxCapacity, the maximum number of students for any course
// Instance Methods: enrollStudent(String studentName), unenrollStudent(String studentName).
// Static Method : setMaxCapacity(int capacity), to set the maximum capacity for courses.

class Course {

    static int maxCapacity = 100;

    String courseName;

    int enrollments;

    String[] enrolledStudents;

    Course(String courseName) {
        this.courseName = courseName;
       this.enrollments = 0;
       this.enrolledStudents =  new String[maxCapacity];
    }

    // array declared



    // static method

    static  void setMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;
    }

    void enrollStudents(String studentName) {
        enrolledStudents[enrollments] = studentName;
        enrollments++;
    }

    void unenrollStudent(String studentName) {
        System.out.println("Student removed");
        enrollments--;
    }

}
