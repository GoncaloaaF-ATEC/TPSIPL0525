package pt.atec.a0x_apis

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.DELETE


interface APIHandler {


    @GET("comments")
    fun getAllComments() : Call<List<Coment>>


    @GET("comments/{id}")
    fun getComment(@Path("id") id: Int) : Call<Coment>


}