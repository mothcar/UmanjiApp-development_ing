package com.umanji.umanjiapp.data.repository.datasource.user

import com.umanji.umanjiapp.data.entity.UserEntity
import com.umanji.umanjiapp.data.exception.CannotCalled
import com.umanji.umanjiapp.data.network.RestApi
import io.reactivex.Completable
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton

/**
 * [UserDataStore] implementation based on connections to the api.
 *
 * @constructor A [UserDataStore] based on connections to the api (Cloud).
 * @property restApi The [RestApi] implementation to use.
 */
@Singleton
open class CloudUserDataStore @Inject constructor(
        private val restApi: RestApi
) : UserDataStore {

    override fun me(): Single<UserEntity> {
        throw CannotCalled()
    }

    override fun saveMe(userEntity: UserEntity): Completable {
        throw CannotCalled()
    }

    override fun deleteMe(): Completable {
        throw CannotCalled()
    }
}
