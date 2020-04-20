package com.wp.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.raizlabs.android.dbflow.config.FlowConfig
import com.raizlabs.android.dbflow.config.FlowManager
import com.raizlabs.android.dbflow.kotlinextensions.from
import com.raizlabs.android.dbflow.kotlinextensions.list
import com.raizlabs.android.dbflow.kotlinextensions.select
import com.raizlabs.android.dbflow.kotlinextensions.where
import com.raizlabs.android.dbflow.sql.language.SQLite

class main:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

//        val mStaff1 = StaffEntity(0, "张三", "10123456789")
//        val mStaff2 = StaffEntity(0, "李四", "11123456789")
//        val mStaff3 = StaffEntity(0, "王五", "12123456789")
//        val mStaff4 = StaffEntity(0, "赵六", "13123456789")
//        val mStaff5 = StaffEntity(0, "孙七", "14123456789")
//        mStaff1.save()
//        mStaff2.save()
//        mStaff3.save()
//        mStaff4.save()
//        mStaff5.save()
//
//        val mWork1 = WorkEntity(0, "玉龙路金石街道钰龙苑5栋5单元5号", "正在签约", 1)
//        val mWork2 = WorkEntity(0, "玉龙路金石街道钰龙苑5栋5单元5号", "正在签约", 2)
//        val mWork3 = WorkEntity(0, "玉龙路金石街道钰龙苑5栋5单元5号", "正在签约", 3)
//        val mWork4 = WorkEntity(0, "玉龙路金石街道钰龙苑5栋5单元5号", "正在签约", 4)
//        val mWork5 = WorkEntity(0, null, null, 5)
//        mWork1.save()
//        mWork2.save()
//        mWork3.save()
//        mWork4.save()
//        mWork5.save()

        val staff = (select from StaffEntity::class).list
        val work = (select from WorkEntity::class).list
        val home = SQLite.select(StaffEntity_Table.sname,WorkEntity_Table.address,WorkEntity_Table.process)
            .from(StaffEntity::class.java)
            .innerJoin(WorkEntity::class.java)
            .on(StaffEntity_Table.sid.withTable().eq(WorkEntity_Table.sid.withTable()))
            .queryCustomList(HomeEntity::class.java)

        Toast.makeText(this, "员工$staff", Toast.LENGTH_LONG).show()
        Toast.makeText(this, "工作$work", Toast.LENGTH_LONG).show()
        Toast.makeText(this, "联合$home", Toast.LENGTH_LONG).show()
    }
}