package com.wp.myapplication

import android.app.Application
import com.raizlabs.android.dbflow.config.DatabaseConfig
import com.raizlabs.android.dbflow.config.FlowConfig
import com.raizlabs.android.dbflow.config.FlowManager

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        FlowManager.init(FlowConfig.builder(this)
                .addDatabaseConfig(DatabaseConfig.builder(FanguliDataBase::class.java)
                    .databaseName("FanguliDataBase")
                    .build())
                    .build())

//        FlowManager.init(FlowConfig.builder()
//            .addDatabaseConfig(DatabaseConfig.builder(AppDatabase.class)
//                .databaseName("AppDatabase")
//                .build())
//                .build())
    }
}