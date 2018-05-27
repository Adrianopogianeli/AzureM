package br.fiap.apogianeli.azurem.dao

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import br.fiap.apogianeli.azurem.model.Subscription
import br.fiap.apogianeli.azurem.dao.SubscriptionDAO

//import com.example.heiderlopes.roomkotlin.dao.GameDAO
//import com.example.heiderlopes.roomkotlin.model.Game

@Database(entities = arrayOf(Subscription::class), version = 1) abstract class BancoDeDados : RoomDatabase() {
    abstract fun subscriptionDAO(): SubscriptionDAO companion object {

        var INSTANCE: BancoDeDados? = null

        fun getDatabase(context: Context): BancoDeDados? { if (INSTANCE == null) {

            INSTANCE = Room.databaseBuilder(context.applicationContext, BancoDeDados::class.java,
                    "gamesdbs")
                    .build()
        }
            return INSTANCE }
    }
}