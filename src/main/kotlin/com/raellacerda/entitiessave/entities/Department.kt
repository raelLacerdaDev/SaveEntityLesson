package com.raellacerda.entitiessave.entities

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import jakarta.persistence.Table


@Entity
@Table(name = "tb_department")
class Department (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L,
    val name: String,

    @OneToMany(mappedBy = "department")
    private val _people : MutableList<Person> = mutableListOf(),

) {
    val people: List<Person> get() = _people.toList()

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Department) return false
        return id == other.id
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }
}