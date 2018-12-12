package com.pmesa48.model.common

import com.pmesa48.model.model.Pokemon
import io.reactivex.Flowable
import io.reactivex.internal.operators.flowable.FlowableAll

/**
 * @author <a href="pmesa@clickdelivery.com">Pablo Mesa</a>
 * @since 12/6/18
 */
interface Storage<T> {

    fun save(value: T)

    fun get(): Flowable<List<Pokemon>>
}