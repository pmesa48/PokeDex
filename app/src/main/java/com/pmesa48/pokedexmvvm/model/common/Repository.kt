package com.pmesa48.model.common

import io.reactivex.Observable

/**
 * @author <a href="pmesa@clickdelivery.com">Pablo Mesa</a>
 * @since 12/6/18
 */
interface Repository<T> {

    fun get(): Observable<T>

}