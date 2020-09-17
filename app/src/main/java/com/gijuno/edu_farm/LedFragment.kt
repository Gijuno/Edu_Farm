package com.gijuno.edu_farm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_led.view.*
import kotlinx.android.synthetic.main.led_list.view.*
import slush.Slush

class LedFragment : Fragment() {

    private val initialItems = listOf(
        LedItem("1번째", "09:30", "1 nm"),
        LedItem("2번째", "10:30", "2 nm"),
        LedItem("3번째", "11:30", "3 nm")
    )

    override fun onCreateView(

        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view =  inflater.inflate(R.layout.fragment_led, container, false)

        val led_result = Slush.SingleType<LedItem>()

            .setItemLayout(R.layout.led_list) // Set item layout
            .setLayoutManager(LinearLayoutManager(context)) // Set LayoutManager (No need to write if already exists)
            .onBind { view, item ->
                view.led_time_num.text = item.time_num
                view.led_time_set.text = item.time_set
                view.led_light.text = item.light
            }
            .setItems(initialItems)
            .into(view.led_recyview)

        val itemListEditor = led_result.itemListEditor

        var count = 1
        view.led_add_btn.setOnClickListener {
            itemListEditor.addItem(LedItem("${count++}번째", "time","light"))
        }

        return view
    }
}