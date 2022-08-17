package com.kotlinexample.kotlinspringbootdemo.service.impl

import com.kotlinexample.kotlinspringbootdemo.entity.Musician
import com.kotlinexample.kotlinspringbootdemo.mapper.MusicianMapper
import com.kotlinexample.kotlinspringbootdemo.service.IMusicianService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MusicianService @Autowired constructor(private val mapper:MusicianMapper):IMusicianService{

    override fun findAll(): List<Musician> {
        return mapper.selectAllMusician()
    }

    override fun getOne(id: Int): Musician {
        return mapper.selectById(id)
    }
}