package br.com.dio.app.repositories.data.repositories

import kotlinx.coroutines.flow.Flow
import br.com.dio.app.repositories.data.model.Repo

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}
