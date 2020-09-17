package com.gijuno.edu_farm

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_led.setTextColor(Color.parseColor("#707070"));
        btn_introduce.setTextColor(Color.parseColor("#707070"));
        btn_nutrient.setTextColor(Color.parseColor("#707070"));
        btn_temper.setTextColor(Color.parseColor("#707070"));
        btn_water.setTextColor(Color.parseColor("#707070"));


        supportFragmentManager.beginTransaction()
            .replace(R.id.view, MainFragment())
            .commit()

        btn_introduce.setOnClickListener() {
            supportFragmentManager.beginTransaction()
                .replace(R.id.view, IntroduceFragment())
                .commit()
            btn_introduce.setTextColor(Color.parseColor("#ffffff"));
            btn_led.setTextColor(Color.parseColor("#707070"));
            btn_nutrient.setTextColor(Color.parseColor("#707070"));
            btn_temper.setTextColor(Color.parseColor("#707070"));
            btn_water.setTextColor(Color.parseColor("#707070"));
        }

        btn_led.setOnClickListener() {
            supportFragmentManager.beginTransaction()
                .replace(R.id.view, LedFragment())
                .commit()
            btn_led.setTextColor(Color.parseColor("#ffffff"));
            btn_introduce.setTextColor(Color.parseColor("#707070"));
            btn_nutrient.setTextColor(Color.parseColor("#707070"));
            btn_temper.setTextColor(Color.parseColor("#707070"));
            btn_water.setTextColor(Color.parseColor("#707070"));
        }

        btn_nutrient.setOnClickListener() {
            supportFragmentManager.beginTransaction()
                .replace(R.id.view, NutrientFragment())
                .commit()
            btn_nutrient.setTextColor(Color.parseColor("#ffffff"));
            btn_led.setTextColor(Color.parseColor("#707070"));
            btn_introduce.setTextColor(Color.parseColor("#707070"));
            btn_temper.setTextColor(Color.parseColor("#707070"));
            btn_water.setTextColor(Color.parseColor("#707070"));
        }

        btn_temper.setOnClickListener() {
            supportFragmentManager.beginTransaction()
                .replace(R.id.view, TemperFragment())
                .commit()
            btn_temper.setTextColor(Color.parseColor("#ffffff"));
            btn_led.setTextColor(Color.parseColor("#707070"));
            btn_introduce.setTextColor(Color.parseColor("#707070"));
            btn_nutrient.setTextColor(Color.parseColor("#707070"));
            btn_water.setTextColor(Color.parseColor("#707070"));
        }

        btn_water.setOnClickListener() {
            supportFragmentManager.beginTransaction()
                .replace(R.id.view, WaterFragment())
                .commit()
            btn_water.setTextColor(Color.parseColor("#ffffff"));
            btn_led.setTextColor(Color.parseColor("#707070"));
            btn_introduce.setTextColor(Color.parseColor("#707070"));
            btn_nutrient.setTextColor(Color.parseColor("#707070"));
            btn_temper.setTextColor(Color.parseColor("#707070"));
        }

    }
}