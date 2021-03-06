package com.example.f1app_v1.ui.DriverDetail

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavArgs
import androidx.navigation.fragment.navArgs
import com.example.f1app_v1.R
import com.example.f1app_v1.databinding.FragmentDriverDetailBinding

class DriverDetailFragment : Fragment(R.layout.fragment_driver_detail) {

    private lateinit var binding: FragmentDriverDetailBinding
    private val args by navArgs<DriverDetailFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDriverDetailBinding.bind(view)

        binding.txtDriverName.text = args.name.let {
            val splitted = it.split(",")
            "${splitted[1]} ${splitted[0]} "
        }
        binding.txtSalary.text = "Salary: ${args.salary}"
        binding.txtCountryofresidence.text = "Country of residence: ${args.countryofresidence}"
        binding.txtBirth.text = "Birth: ${args.dateofbirth}, ${args.placeofbirth}"
        binding.txtDebut.text = "Debut: ${args.debut}"
        binding.txtFirstVictory.text = "First victory: ${args.firstVictory}"
        binding.txtWcsWon.text = "WCs won: ${args.wcsWon.toString()}"
        binding.txtTeamName.text = "${args.teamName}"
        binding.txtTeamNationality.text = " ${args.teamNationality}"

    }
}