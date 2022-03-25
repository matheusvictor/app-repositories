package br.com.dio.app.repositories.domain.di

import org.koin.dsl.module
import org.koin.core.module.Module
import org.koin.core.context.loadKoinModules
import br.com.dio.app.repositories.domain.ListUserRepositoriesUseCase

object DomainModel {

    fun load() {
        loadKoinModules(useCaseModule())
    }

    private fun useCaseModule(): Module {
        return module {
            factory {
                ListUserRepositoriesUseCase(get())
            }
        }
    }

}
