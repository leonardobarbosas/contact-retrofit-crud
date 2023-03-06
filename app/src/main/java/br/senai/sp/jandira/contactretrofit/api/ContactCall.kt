package br.senai.sp.jandira.contactretrofit.api

import br.senai.sp.jandira.contactretrofit.model.Contact
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST

interface ContactCall {

    //chamada que lista todos os contatos
    @GET("contacts")
    fun getAll(): Call<List<Contact>>

    @POST("contacts")
    fun save(contact: Contact)
}