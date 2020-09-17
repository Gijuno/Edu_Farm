package com.gijuno.edu_farm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_temper.view.*
import kotlinx.android.synthetic.main.temper_list.view.*
import slush.Slush

class TemperFragment : Fragment() {

    private val initialItems = listOf(
        TemperItem("1번째", "09:30", "5 ˚C"),
        TemperItem("2번째", "10:30", "6 ˚C"),
        TemperItem("3번째", "11:30", "3 ˚C")
    )
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view =  inflater.inflate(R.layout.fragment_temper, container, false)

        val temper_result = Slush.SingleType<TemperItem>()

            .setItemLayout(R.layout.temper_list) // Set item layout
            .setLayoutManager(LinearLayoutManager(context)) // Set LayoutManager (No need to write if already exists)
            .onBind { view, item ->
                view.temper_time_num.text = item.time_num
                view.temper_time_set.text = item.time_set
                view.temper_temper.text = item.temper
            }
            .setItems(initialItems)
            .into(view.temper_recyview)

        val itemListEditor = temper_result.itemListEditor

        var count = 1
        view.temper_add_btn.setOnClickListener {
            itemListEditor.addItem(TemperItem("${count++}번째", "time","light"))
        }

        return view
    }
}