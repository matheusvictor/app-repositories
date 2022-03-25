package br.com.dio.app.repositories.data.repositories

import kotlinx.coroutines.flow.flow
import br.com.dio.app.repositories.data.services.GitHubService

class RepoRepositoryImplementation(private val service: GitHubService) : RepoRepository {

    override suspend fun listRepositories(user: String) = flow {
        val repoList = service.listRepositories(user)
        emit(repoList)
    }

}
