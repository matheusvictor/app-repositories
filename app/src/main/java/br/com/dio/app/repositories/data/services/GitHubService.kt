package br.com.dio.app.repositories.data.services

import retrofit2.http.GET
import retrofit2.http.Path
import br.com.dio.app.repositories.data.model.Repo

interface GitHubService {

    // função irá rodar em outra tread
    @GET("users/{user}/repos")
    suspend fun listRepositories(@Path("user") user: String): List<Repo>

}
