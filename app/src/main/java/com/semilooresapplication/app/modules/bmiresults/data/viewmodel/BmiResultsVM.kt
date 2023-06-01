package com.semilooresapplication.app.modules.bmiresults.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.semilooresapplication.app.modules.bmiresults.`data`.model.BmiResultsModel
import org.koin.core.KoinComponent

class BmiResultsVM : ViewModel(), KoinComponent {
  val bmiResultsModel: MutableLiveData<BmiResultsModel> = MutableLiveData(BmiResultsModel())

  var navArguments: Bundle? = null
}
