package br.fiap.apogianeli.azurem.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

//A anotacao @Entity abaixo indica indica que // a classe sera uma tabela SQL
@Entity class Subscription {
    //A anotacao PrimaryKey indica que a variável id será chave primária
    // da nossa base dados e ativamos o autoGenerate para que o id
    // seja gerado automaticamente
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
    var nome: String? = null
    var descricao: String? = null

    constructor() {}
    constructor(nome: String, plataforma: String) { this.nome = nome
        this.descricao = plataforma
    }

    constructor(id: Int, nome: String, plataforma: String) { this.id = id
        this.nome = nome
        this.descricao = plataforma
    }
}