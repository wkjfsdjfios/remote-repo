import entity.Course;
import entity.Teacher;
import view.Pages;

import static service.Data.AllCourseHouse;
import static service.Data.Teachers;

/**
 * @author 听风
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //Pages.TeaCourseMangeView();
        //Pages.StuSelectCourse();
        Teacher teacher = new Teacher();
        Course course = new Course();
        course.setCourseId("222");
        course.setCourseName("高等数学");
        course.setTeacherId("999");
        course.setCourseTerm("第一学期");
        AllCourseHouse.add(course);
        course.viewAllCourses(teacher);
//        course.updateAllCourse(teacher);
//        System.out.println("课程CourseId:(" + course.getCourseId() + ")");
//        System.out.println("课程名字courseName:(" + course.getCourseName() + ")");
//        System.out.println("教师teacherId:(" + course.getTeacherId() + ")");
//        System.out.println("开设学期courseTerm:(" + course.getCourseTerm() + ")");
//        System.out.println("*********************************");
//        course.updateAllCourse(teacher);
//        System.out.println("课程CourseId:(" + course.getCourseId() + ")");
//        System.out.println("课程名字courseName:(" + course.getCourseName() + ")");
//        System.out.println("教师teacherId:(" + course.getTeacherId() + ")");
//        System.out.println("开设学期courseTerm:(" + course.getCourseTerm() + ")");
    }
}
