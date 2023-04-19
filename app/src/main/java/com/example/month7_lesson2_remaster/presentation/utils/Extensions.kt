package com.example.month7_lesson2_remaster.presentation.utils

import android.widget.Toast
import androidx.fragment.app.Fragment
fun Fragment.showToast(text: String) {
    Toast.makeText(requireContext(), text, Toast.LENGTH_SHORT).show()
}