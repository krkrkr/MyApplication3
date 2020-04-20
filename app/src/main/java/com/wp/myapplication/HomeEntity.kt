package com.wp.myapplication

import com.raizlabs.android.dbflow.annotation.Column
import com.raizlabs.android.dbflow.annotation.QueryModel

@QueryModel(database = FanguliDataBase::class)
data class HomeEntity(
    @Column var sname: String? = null,
    @Column var address: String? = null,
    @Column var process: String? = null
)
