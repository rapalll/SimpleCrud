package com.grack.rapalll.simplecrud

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.student_list.view.*

class StudentAdapter (private  val context: Context,
                      private val arrayList: ArrayList<Student>) : RecyclerView.Adapter<StudentAdapter.Holder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.student_list,parent,false))
    }

    override fun getItemCount(): Int = arrayList!!.size

    override fun onBindViewHolder(holder: Holder, position: Int) {

        holder.view.nimList.text = arrayList?.get(position)?.nim
        holder.view.namaList.text = "Nama : "+arrayList?.get(position)?.name
        holder.view.addressList.text = "Alamat : "+arrayList?.get(position)?.address
        holder.view.genderList.text = "Jenkel : "+arrayList?.get(position)?.gender


        holder.view.cvList.setOnClickListener {
            val i = Intent(context, ManageStudentActivity::class.java)
            i.putExtra("editmode","1")
            i.putExtra("nim",arrayList?.get(position)?.nim)
            i.putExtra("nama",arrayList?.get(position)?.name)
            i.putExtra("address",arrayList?.get(position)?.address)
            i.putExtra("gender",arrayList?.get(position)?.gender)
            context.startActivity(i)
        }

    }

    class Holder(val view:View) : RecyclerView.ViewHolder(view)

}