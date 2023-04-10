package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> 
{

}
