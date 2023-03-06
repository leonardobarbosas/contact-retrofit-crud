package br.senai.sp.jandira.contactretrofit.api

import br.senai.sp.jandira.contactretrofit.model.Contact
import retrofit2.Call
import retrofit2.http.GET

interface ContactCall {

    //chamada que lista todos os contatos
    @GET("contacts")
    fun getAll(): Call<List<Contact>>

}