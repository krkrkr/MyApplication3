package com.wp.myapplication

import com.raizlabs.android.dbflow.annotation.Column
import com.raizlabs.android.dbflow.annotation.ForeignKey
import com.raizlabs.android.dbflow.annotation.PrimaryKey
import com.raizlabs.android.dbflow.annotation.Table
import com.raizlabs.android.dbflow.structure.BaseModel

@Table(name = "work", database = FanguliDataBase::class)
data class WorkEntity(
    @PrimaryKey(autoincrement = true) var wid: Int = 0,
    @Column var address: String? = null,
    @Column var process: String? = null,
    @Column var sid: Int? = null
) : BaseModel()