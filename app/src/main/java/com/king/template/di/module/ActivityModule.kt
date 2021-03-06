package com.king.template.di.module

import com.king.frame.mvvmframe.di.component.BaseActivitySubcomponent
import com.king.template.app.home.HomeActivity
import com.king.template.app.splash.SplashActivity
import com.king.template.temp.TempActivity
import com.king.template.temp.TempListActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
@Module(subcomponents = [BaseActivitySubcomponent::class])
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun contributeTempActivity(): TempActivity

    @ContributesAndroidInjector
    abstract fun contributeTempListActivity(): TempListActivity

    @ContributesAndroidInjector
    abstract fun contributeSplashActivity(): SplashActivity

    @ContributesAndroidInjector
    abstract fun contributeHomeActivity(): HomeActivity

}