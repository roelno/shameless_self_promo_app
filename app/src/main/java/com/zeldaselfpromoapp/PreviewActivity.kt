package com.zeldaselfpromoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zeldaselfpromoapp.databinding.ActivityPreviewBinding

class PreviewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPreviewBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)
        binding = ActivityPreviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textViewMessage.text = "I am manually setting some text in TextView."
    }

}