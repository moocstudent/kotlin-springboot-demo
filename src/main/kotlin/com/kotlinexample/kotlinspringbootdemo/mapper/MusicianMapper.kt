package com.kotlinexample.kotlinspringbootdemo.mapper

import com.kotlinexample.kotlinspringbootdemo.entity.Musician

interface MusicianMapper {

    fun selectAllMusician():List<Musician>

    fun selectById(id:Int):Musician

}