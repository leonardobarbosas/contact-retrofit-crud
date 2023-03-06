package br.senai.sp.jandira.contactretrofit.api

import br.senai.sp.jandira.contactretrofit.Constants.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitApi {

    //retrofit é o postman do kotlin
    //object do retrofit(client http que faz get, put, etc.)
    companion object {
        private lateinit var instance: Retrofit

        fun getRetrofit(): Retrofit {
            //o :: é para pegar a instancia do objeto
            //o !:: serve como um else
            //essa instancia so vai ser concluida se nao estiver inicializada
            if (!::instance.isInitialized) {
                instance = Retrofit
                    .Builder()
                    .baseUrl(Constants.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return instance
            //criar a instancia ou ja utilizar uma existente
        }
    }

}