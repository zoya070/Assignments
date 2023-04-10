package ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Entity.Course;
import Repository.CourseRepository;
import Service.CourseService;
@Repository
public class CourseServiceImpl implements CourseService {
	@Autowired
	CourseRepository courseRepository;
	@Override
	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return courseRepository.findAll();
	}

	@Override
	public Course findCourseBYID(int course_id) {
		// TODO Auto-generated method stub
		return courseRepository.findById(course_id).get();
	}

	@Override
	public void DeleteCourseBYID(int course_id) {
		// TODO Auto-generated method stub
		courseRepository.deleteById(course_id);
	}

	@Override
	public Course ADDCourse(Course course) {
		// TODO Auto-generated method stub
		return courseRepository.save(course);
	}

	@Override
	public Course UpdateCourse(Course course) {
		// TODO Auto-generated method stub
		Course update_course=courseRepository.findById(course.getCourse_id()).get();
		update_course.setCourse_name(course.getCourse_name());
		update_course.setFaculty(course.getFaculty());
		return update_course;
	}

}
