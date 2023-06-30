package com.semilooresapplication.app.modules.bmiresults.`data`.model

import com.semilooresapplication.app.R
import com.semilooresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BmiResultsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBMIRESULTS: String? = MyApp.getInstance().resources.getString(R.string.lbl_bmi_results)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThreeHundredThirtyThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_33_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYouhaveObese: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_have_obese)

)
