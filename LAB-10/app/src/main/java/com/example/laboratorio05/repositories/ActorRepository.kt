package com.example.laboratorio05.repositories

import com.example.laboratorio05.data.dao.ActorDao
import com.example.laboratorio05.data.model.ActorModel

class ActorRepository(private val actorDao: ActorDao) {

    suspend fun getAllActors() = actorDao.getAllActors()

    suspend fun insertActor(actorModel: ActorModel) = actorDao.insertActor(actorModel)
}