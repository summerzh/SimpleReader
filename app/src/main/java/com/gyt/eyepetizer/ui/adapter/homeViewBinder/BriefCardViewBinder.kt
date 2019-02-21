package com.gyt.eyepetizer.ui.adapter.homeViewBinder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gyt.eyepetizer.beans.HomeBean
import com.gyt.simplereader.R
import me.drakeet.multitype.ItemViewBinder

/**
 * @author gyt
 * @date on 2019/2/19 4:34 PM
 * @describer TODO
 */
class BriefCardViewBinder : ItemViewBinder<HomeBean.Item, BriefCardViewBinder.ViewHolder>() {
    override fun onCreateViewHolder(inflater: LayoutInflater, parent: ViewGroup): ViewHolder {
        val itemView = inflater.inflate(R.layout.item_brief_card, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: HomeBean.Item) {
    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}
