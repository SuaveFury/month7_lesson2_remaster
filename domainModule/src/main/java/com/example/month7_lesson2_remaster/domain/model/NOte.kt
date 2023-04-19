package com.example.month7_lesson2_remaster.domain.model

class NOte(
    var id: Int? =null,
    var title: String?=null,
    var desc: String?=null
):java.io.Serializable{
    companion object {
        const val DEFAULT_ID = 0
    }
}
