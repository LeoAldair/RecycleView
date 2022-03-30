package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recycleview.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fakeVideoData: Array<JSONObject> = arrayOf(
            JSONObject("{\"title\": \"A QUÉ FAMOSO TE PARECES?\", \"channel\":\"Islas Vlogs\",\"views\":\"2M de vistas\",\"datePosted\":\"hace 1 año\",\"duration\":\"4:13\"}"),
            JSONObject("{\"title\": \"Paulo Londra - Plan A\", \"channel\":\"Paulo Londra\",\"views\":\"46M de vistas\",\"datePosted\":\"hace 6 días\",\"duration\":\"3:06\"}"),
            JSONObject("{\"title\": \"Cosas de Mexicanos\", \"channel\":\"Los ADN\",\"views\":\"150,572 vistas\",\"datePosted\":\"hace 19 horas\",\"duration\":\"7:40\"}"),
            JSONObject("{\"title\": \"Ahora y Siempre\", \"channel\":\"Quevedo\",\"views\":\"11M de vistas\",\"datePosted\":\"hace 3 meses\",\"duration\":\"2:29\"}"),
            JSONObject("{\"title\": \"Hoy sí que vas a entender la teoría de cuerdas\", \"channel\":\"Date un Vlog\",\"views\":\"1.3M de vistas\",\"datePosted\":\"hace 2 años\",\"duration\":\"18:05\"}"),
            JSONObject("{\"title\": \"El resplandor | La historia en 1 video\", \"channel\":\"FedeWolf\",\"views\":\"2.5M de views\",\"datePosted\":\"hace 3 años\",\"duration\":\"6:12\"}"),
            JSONObject("{\"title\": \"¿Qué pasó después de que el mundo olvidó a Peter Parker?\", \"channel\":\"Top Comics\",\"views\":\"695,210 vistas\",\"datePosted\":\"hace 9 días\",\"duration\":\"16:01\"}"),

        )
        binding.rvVideoEntries.adapter = MainAdapter(fakeVideoData)
    }
}