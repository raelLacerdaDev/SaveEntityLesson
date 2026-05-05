package com.raellacerda.entitiessave.services

import com.raellacerda.entitiessave.dto.PersonDepartmentDto
import com.raellacerda.entitiessave.mappers.toEntity
import com.raellacerda.entitiessave.mappers.toPersonDepartmentDto
import com.raellacerda.entitiessave.repositories.PersonRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class PersonService (private val personRepository: PersonRepository) {

    @Transactional
    fun insertPersonWithDepartment(person: PersonDepartmentDto): PersonDepartmentDto {
        
        val entity = person.toEntity()
        val newRow = personRepository.save(entity)

        return newRow.toPersonDepartmentDto()
    }

}