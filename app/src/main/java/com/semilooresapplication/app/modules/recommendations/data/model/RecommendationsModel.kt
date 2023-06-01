package com.semilooresapplication.app.modules.recommendations.`data`.model

import com.semilooresapplication.app.R
import com.semilooresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RecommendationsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRECOMMENDATIONSOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_recommendations)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRunning: String? = MyApp.getInstance().resources.getString(R.string.lbl_running)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWalking: String? = MyApp.getInstance().resources.getString(R.string.lbl_walking)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYoga: String? = MyApp.getInstance().resources.getString(R.string.lbl_yoga)

)
