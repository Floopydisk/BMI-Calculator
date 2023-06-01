package com.semilooresapplication.app.modules.bmi.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.semilooresapplication.app.modules.bmi.`data`.model.BmiModel
import org.koin.core.KoinComponent

class BmiVM : ViewModel(), KoinComponent {
  val bmiModel: MutableLiveData<BmiModel> = MutableLiveData(BmiModel())

  var navArguments: Bundle? = null
}
