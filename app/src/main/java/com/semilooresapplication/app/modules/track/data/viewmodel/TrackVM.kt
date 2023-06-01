package com.semilooresapplication.app.modules.track.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.semilooresapplication.app.modules.track.`data`.model.TrackModel
import org.koin.core.KoinComponent

class TrackVM : ViewModel(), KoinComponent {
  val trackModel: MutableLiveData<TrackModel> = MutableLiveData(TrackModel())

  var navArguments: Bundle? = null
}
