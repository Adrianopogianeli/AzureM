package br.fiap.apogianeli.azurem.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import android.arch.persistence.room.Update
import br.fiap.apogianeli.azurem.model.Subscription
// import com.example.heiderlopes.roomkotlin.model.Game


@Dao
interface SubscriptionDAO {
    @Insert
    fun inserir(subscription: Subscription)
    @Query("SELECT * FROM Subscription")
    fun lerGames(): LiveData<List<Subscription>>
    @Query("SELECT * FROM Subscription WHERE id = :arg0") fun buscarPor(id: Int): Subscription
    @Update
    fun atualizar(subscription:  Subscription)
    @Delete
    fun apagar(subscription:  Subscription) }