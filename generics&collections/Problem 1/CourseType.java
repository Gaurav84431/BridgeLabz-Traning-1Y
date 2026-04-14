abstract class CourseType {}
class ExamCourse extends CourseType {}
class AssignmentCourse extends CourseType {}
class ResearchCourse extends CourseType {}

class Course<T extends CourseType> {
    T type;

    public Course(T type) {
        this.type = type;
    }
}

class CourseUtil {
    public static void display(java.util.List<? extends CourseType> list) {
        for (CourseType c : list) {
            System.out.println(c.getClass().getSimpleName());
        }
    }
}