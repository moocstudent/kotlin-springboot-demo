package com.kotlinexample.kotlinspringbootdemo.service

import com.kotlinexample.kotlinspringbootdemo.entity.Musician

interface IMusicianService {

    fun findAll():List<Musician>

    fun getOne(id:Int):Musician

}