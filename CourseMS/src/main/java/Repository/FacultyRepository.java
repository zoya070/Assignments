package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Integer>
{

}
