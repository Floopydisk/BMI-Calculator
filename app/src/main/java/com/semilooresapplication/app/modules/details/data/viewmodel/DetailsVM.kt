package com.semilooresapplication.app.modules.details.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.semilooresapplication.app.modules.details.`data`.model.DetailsModel
import org.koin.core.KoinComponent

class DetailsVM : ViewModel(), KoinComponent {
  val detailsModel: MutableLiveData<DetailsModel> = MutableLiveData(DetailsModel())

  var navArguments: Bundle? = null
}
