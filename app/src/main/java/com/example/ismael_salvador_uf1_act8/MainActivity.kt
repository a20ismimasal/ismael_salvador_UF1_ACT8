package com.example.ismael_salvador_uf1_act8

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MatriculacioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_matriculacio)


        val checkboxMateria1 = findViewById<CheckBox>(R.id.checkbox_materia1)
        val checkboxMateria2 = findViewById<CheckBox>(R.id.checkbox_materia2)
        val checkboxMateria3 = findViewById<CheckBox>(R.id.checkbox_materia3)
        val checkboxMateria4 = findViewById<CheckBox>(R.id.checkbox_materia4)


        val radioGroupTorn = findViewById<RadioGroup>(R.id.radioGroupTorn)


        val btnConfirmar = findViewById<Button>(R.id.btn_confirmar)

        btnConfirmar.setOnClickListener {

            val materiasSeleccionades = mutableListOf<String>()
            if (checkboxMateria1.isChecked) materiasSeleccionades.add("Matèria 1")
            if (checkboxMateria2.isChecked) materiasSeleccionades.add("Matèria 2")
            if (checkboxMateria3.isChecked) materiasSeleccionades.add("Matèria 3")
            if (checkboxMateria4.isChecked) materiasSeleccionades.add("Matèria 4")


            val tornSeleccionat = when (radioGroupTorn.checkedRadioButtonId) {
                R.id.radio_mati -> "Matí"
                R.id.radio_tarda -> "Tarda"
                else -> "Cap torn seleccionat"
            }


            val resultat = "Matèries: ${materiasSeleccionades.joinToString(", ")}\nTorn: $tornSeleccionat"
            Toast.makeText(this, resultat, Toast.LENGTH_LONG).show()
        }
    }
}