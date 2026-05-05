package com.raellacerda.entitiessave.services

import com.raellacerda.entitiessave.dto.PersonDepartmentDto
import com.raellacerda.entitiessave.dto.PersonWithDepartmentIdDto
import com.raellacerda.entitiessave.entities.Person
import com.raellacerda.entitiessave.mappers.toPersonDepartmentDto
import com.raellacerda.entitiessave.mappers.toPersonWithDepartmentIdDto
import com.raellacerda.entitiessave.repositories.DepartmentRepository
import com.raellacerda.entitiessave.repositories.PersonRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class PersonService (
    private val personRepository: PersonRepository,
    private val departmentRepository: DepartmentRepository
) {

    @Transactional
    fun insertPersonWithDepartment(dto: PersonDepartmentDto): PersonDepartmentDto {
        val departmentRef = departmentRepository.getReferenceById(dto.department.id)
        val entity = Person(
            name = dto.name,
            salary = dto.salary,
            department = departmentRef
        )
        val savedPerson = personRepository.save(entity)
        return savedPerson.toPersonDepartmentDto()
    }

    @Transactional
    fun insertPersonWithDepartmentId(dto: PersonWithDepartmentIdDto): PersonWithDepartmentIdDto {
        val departmentRef = departmentRepository.getReferenceById(dto.departmentId)

        val entity = Person(
            name = dto.name,
            salary = dto.salary,
            department = departmentRef
        )

        val savedPerson = personRepository.save(entity)

        return savedPerson.toPersonWithDepartmentIdDto()
    }

}