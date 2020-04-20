package com.wp.myapplication

import com.raizlabs.android.dbflow.annotation.Database
import com.raizlabs.android.dbflow.annotation.Migration
import com.raizlabs.android.dbflow.sql.migration.AlterTableMigration

@Database(version = FanguliDataBase.VERSION)
object FanguliDataBase {
    const val VERSION = 1
}

