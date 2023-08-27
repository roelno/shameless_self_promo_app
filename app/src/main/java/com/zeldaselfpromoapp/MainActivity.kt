package com.zeldaselfpromoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.zeldaselfpromoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonPreview.setOnClickListener {
            onPreviewClicked()
        }

        val spinnerValue = arrayOf("Android Developer", "Android Engineer")
        val spinnerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, spinnerValue)
        binding.spinnerJobTitle.adapter = spinnerAdapter

    }

    private fun onPreviewClicked() {
        val contactName = binding.editTextContactName.text.toString()
        val contactNumber = binding.editTextContactNumber.text.toString()
        val displayName = binding.editTextMyDisplayName.text.toString()
        val includedJunior = binding.checkBoxJunior.isChecked
        val jobTitle = binding.spinnerJobTitle.selectedItem?.toString()
        val immediateStart = binding.checkBoxImmediateStart.isChecked
        val startDate = binding.editTextStartDate.text.toString()

        val previewActivityIntent = Intent(this, PreviewActivity::class.java)
        previewActivityIntent.putExtra("Contact Name", contactName)
        previewActivityIntent.putExtra("Contact Number", contactNumber)
        previewActivityIntent.putExtra("Display Name", displayName)
        previewActivityIntent.putExtra("Include Junior", includedJunior)
        previewActivityIntent.putExtra("Job Title", jobTitle)
        previewActivityIntent.putExtra("Immediate Start", immediateStart)
        previewActivityIntent.putExtra("Start Date", startDate)

        startActivity(previewActivityIntent)
    }
}