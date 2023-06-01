package com.semilooresapplication.app.modules.details.`data`.model

import com.semilooresapplication.app.R
import com.semilooresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DetailsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSUMMARY: String? = MyApp.getInstance().resources.getString(R.string.lbl_summary)

)
