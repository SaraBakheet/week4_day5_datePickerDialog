package com.example.criminalintent.crimeListFragment

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.criminalintent.database.Crime
import com.example.criminalintent.database.CrimeRepository

class CrimeListViewModel : ViewModel() {

    val  crimeRepository  =   CrimeRepository.get()

    val liveDataCrimes = crimeRepository.getAllCrimes()


    fun addCrime(crime: Crime){
        crimeRepository.addCrime(crime)
    }

}