package az.company.schoolmanageapp;

import az.company.schoolmanageapp.entity.Lessons;
import az.company.schoolmanageapp.entity.Students;
import az.company.schoolmanageapp.repository.LessonRepository;
import az.company.schoolmanageapp.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@SpringBootApplication
@EnableJpaRepositories
public class SchoolmanageappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolmanageappApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(StudentRepository lessonRepository) {
//		return runner -> {
//                getLesson(lessonRepository);
//		};
//	}
//
//	private void getLesson(StudentRepository lessonRepository) {
//		List<Object[]> results = lessonRepository.findStudentInfoWithSpecializationAndLessons();
//
//		for (Object[] result : results) {
//			String name = (String) result[0];
//			String specialization = (String) result[1];
//			String lesson = (String) result[2];
//			System.out.println("Name: " + name + ", Specialization: " + specialization + ", Lesson: " + lesson);
//		}
//	}

}
