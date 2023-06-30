package com.semilooresapplication.app.modules.more.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.semilooresapplication.app.modules.more.`data`.model.MoreModel
import org.koin.core.KoinComponent

class MoreVM : ViewModel(), KoinComponent {
  val moreModel: MutableLiveData<MoreModel> = MutableLiveData(MoreModel())

  var navArguments: Bundle? = null
}
