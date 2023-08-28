package com.zeldaselfpromoapp

import android.app.Activity
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zeldaselfpromoapp.databinding.ActivityPreviewBinding
import java.io.Serializable

class PreviewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPreviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)
        binding = ActivityPreviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // retrieve the data
        val message = getSerializable(this, "Message", Message::class.java)

        // use the data
        val messagePreviewText = """
            Hi ${message.contactName}
            
            My name is ${message.displayName} and I am a ${message.getFullJobDescription()}.
            
            I have a portfolio to demonstrate my technical skills that I can show on request.
            
            I am able to start a new position ${message.getAvailability()}.
            
            Please get in touch if you have any suitable roles for me.
            
            Thanks and best regards.
            
        """.trimIndent()

        binding.textViewMessage.text = messagePreviewText
    }

    private fun <T : Serializable?> getSerializable(activity: Activity, name: String, clazz: Class<T>): T
    {
        return if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU)
            activity.intent.getSerializableExtra(name, clazz)!!
        else
            activity.intent.getSerializableExtra(name) as T
    }

}