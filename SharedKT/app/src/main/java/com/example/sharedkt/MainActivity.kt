package com.example.sharedkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {    // 해당 액티비티가 처음시작될때 한번 실행됨 (초기화)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO: 저장된 데이터 로드
        loadData()
    }

    private fun saveData() {
        TODO("Not yet implemented")
        val pref = getSharedPreferences("pref", 0)
        val edit = pref.edit()  // 수정모드
        edit.putString("name", et_hello.text.toString())    // 1번째 인자는 키값 2번째 인자는 실제 담아둘 값
        edit.apply()    // 저장완료
    }

    private fun loadData() {
        TODO("Not yet implemented")
        val pref = getSharedPreferences("pref", 0)
        et_hello.setText("name", "")    // 1번인자는 저장할당시의 키값 2번인자는 값이 없을경우 대체값
    }

    override fun onDestroy() {  // 해당 액티비티가 종료되는 시점에 호출됨
        super.onDestroy()

        saveData()
    }
}