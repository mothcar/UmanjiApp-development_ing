package com.umanji.umanjiapp.domain.repository

import com.umanji.umanjiapp.domain.entity.User
import io.reactivex.Completable
import io.reactivex.Single


/**
 * Interface that represents a Repository for [User].
 */
interface UserRepository {

    /**
     * Get a [Single] which will emit a current [User].
     */
    fun me(): Single<User>

    /**
     * Get a [Completable] which will be completed if current [User] is successfully saved.
     * i.e. sign in
     */
    fun saveMe(user: User): Completable

    /**
     * Get a [Completable] which will be completed if current [User] is successfully deleted.
     * i.e. logout
     */
    fun deleteMe(): Completable
}
