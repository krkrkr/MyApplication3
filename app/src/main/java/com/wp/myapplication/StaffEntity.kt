package com.wp.myapplication

import com.raizlabs.android.dbflow.annotation.Column
import com.raizlabs.android.dbflow.annotation.PrimaryKey
import com.raizlabs.android.dbflow.annotation.Table
import com.raizlabs.android.dbflow.structure.BaseModel

@Table(name = "staff", database = FanguliDataBase::class)
data class StaffEntity(
    @PrimaryKey(autoincrement = true) var sid: Int = 1,
    @Column var sname: String? = null,
    @Column var phone: String? = null
) : BaseModel()