package com.zhu.keshee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)//增加乐控件toolbar
        supportActionBar?.let {
            it.setDisplayHomeAsUpEnabled(true)
            it.setHomeAsUpIndicator(R.drawable.ic_menu)
        }//增加按键调动侧边账户栏
        navView.setCheckedItem(R.id.login)
        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.login->Toast.makeText(this,"ss",Toast.LENGTH_SHORT).show()
                R.id.regist->Toast.makeText(this,"ss",Toast.LENGTH_SHORT).show()
            }
             true
        }//侧边栏按钮点击事件注册
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home ->drawerLayout.openDrawer(GravityCompat.START)}//设置bar栏的呼出侧边按钮
        return true
    }
}