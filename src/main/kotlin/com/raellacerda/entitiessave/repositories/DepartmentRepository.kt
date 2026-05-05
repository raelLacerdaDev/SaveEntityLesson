package com.raellacerda.entitiessave.repositories

import com.raellacerda.entitiessave.entities.Department
import org.springframework.data.jpa.repository.JpaRepository

interface DepartmentRepository : JpaRepository<Department, Long>