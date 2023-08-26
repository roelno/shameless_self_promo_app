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

        // retrieve the value
        val contactName = intent.getStringExtra("Contact Name")
        val contactNumber = intent.getStringExtra("Contact Number")
        val displayName = intent.getStringExtra("Display Name")
        val includeJunior = intent.getBooleanExtra("Include Junior", false)
        val jobTitle = intent.getStringExtra("Job Title")
        val immediateStart = intent.getBooleanExtra("Immediate Start", false)
        val startDate = intent.getStringExtra("Start Date")

        val testString = "Contact Name: $contactName, Contact Number: $contactNumber, Display Name: $displayName, " +
                "Include Junior: $includeJunior, Job Title: $jobTitle, Immediate Start: $immediateStart, Start Date: $startDate"

        binding.textViewMessage.text = testString
    }

}