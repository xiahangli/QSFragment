package com.example.jsactivity

import com.example.jsactivity.pluginimpl.qspanel.dagger.SubModule
import dagger.Module
import dagger.Provides

/**
 * @author Henry
 *@Date 2022/3/17  2:56 AM
 *@Email 2427417167@qq.com
 */

@Module(includes = [SubModule::class])
class MyModule {

    @Provides
    fun providesSomething(): Something {
        val a = SubModule::javaClass
//        val receiver = KProperty<A>()
//        var get = a.get(receiver = receiver)
        return Something()
    }

    class A{}
}