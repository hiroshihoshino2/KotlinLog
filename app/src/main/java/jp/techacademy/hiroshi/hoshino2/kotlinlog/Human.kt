package jp.techacademy.hiroshi.hoshino2.kotlinlog

import android.util.Log

open class Human: Animal, Thinkable  {

    var hobby: String = "世界平和"

    // 引数付きコンストラクタ
    constructor(name: String, age: Int, hobby: String): super(name, age) {

        // Thinkableインターフェイスのメソッドをオーバーライド
        // プロパティ
        this.hobby = hobby

     }

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("hoshinolog1", "私の名前は"+ this.name + "です。年は永遠の" + this.age + "歳です。")
    }

    override fun think() {
        Log.d("hoshinolog2", "私は"+ this.hobby + "について考えています。")
    }

}