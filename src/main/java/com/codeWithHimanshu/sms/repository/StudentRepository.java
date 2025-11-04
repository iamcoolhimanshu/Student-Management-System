package com.codeWithHimanshu.sms.repository;

import com.codeWithHimanshu.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
