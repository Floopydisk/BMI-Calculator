package com.semilooresapplication.app.modules.recommendations.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.semilooresapplication.app.modules.recommendations.`data`.model.RecommendationsModel
import org.koin.core.KoinComponent

class RecommendationsVM : ViewModel(), KoinComponent {
  val recommendationsModel: MutableLiveData<RecommendationsModel> =
      MutableLiveData(RecommendationsModel())

  var navArguments: Bundle? = null
}
