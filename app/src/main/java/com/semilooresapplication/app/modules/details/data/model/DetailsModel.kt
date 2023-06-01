package com.semilooresapplication.app.modules.details.`data`.model

import com.semilooresapplication.app.R
import com.semilooresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DetailsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSUMMARY: String? = MyApp.getInstance().resources.getString(R.string.lbl_summary)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourBMI: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_bmi)
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
  var txtObese: String? = MyApp.getInstance().resources.getString(R.string.lbl_obese)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_less_than_18_5)

)
