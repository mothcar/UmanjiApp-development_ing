package com.umanji.umanjiapp.domain.interactor

import com.umanji.umanjiapp.domain.entity.User
import com.umanji.umanjiapp.domain.executor.PostExecutionThread
import com.umanji.umanjiapp.domain.executor.ThreadExecutor
import com.umanji.umanjiapp.domain.repository.UserRepository
import io.reactivex.Observable
import javax.inject.Inject

/**
 * This class is an implementation of [UseCase] that represents a use case for
 * retrieving a current [User].
 */
open class GetMe @Inject constructor(
        threadExecutor: ThreadExecutor,
        postExecutionThread: PostExecutionThread,
        private val userRepository: UserRepository
) : UseCase<Nothing?, User>(threadExecutor, postExecutionThread) {

    override fun buildUseCaseObservable(params: Nothing?): Observable<User> =
            userRepository.me().toObservable()
}
