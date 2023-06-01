package com.semilooresapplication.app.modules.bmi.`data`.model

import com.semilooresapplication.app.R
import com.semilooresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BmiModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBMICALCULATOR: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_bmi_calculator)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGender: String? = MyApp.getInstance().resources.getString(R.string.lbl_male)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGenderOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_female)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHEIGHT: String? = MyApp.getInstance().resources.getString(R.string.lbl_height)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistance: String? = MyApp.getInstance().resources.getString(R.string.lbl_145cm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeventy: String? = MyApp.getInstance().resources.getString(R.string.lbl_70)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWEIGHT: String? = MyApp.getInstance().resources.getString(R.string.lbl_weight)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAGE: String? = MyApp.getInstance().resources.getString(R.string.lbl_age)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_25)

)
