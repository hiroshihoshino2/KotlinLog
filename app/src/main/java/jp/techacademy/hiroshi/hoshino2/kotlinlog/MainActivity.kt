package jp.techacademy.hiroshi.hoshino2.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human(name = "星野", age = 40, hobby = "食っちゃ寝" )      // インスタンス１
        human1.say()
        human1.think()

        val human2 = Human(name = "鬼太郎", age = 20, hobby = "妖怪")      // インスタンス２
        human2.say()
        human2.think()

    }

}