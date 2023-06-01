package com.semilooresapplication.app.modules.dashboard.`data`.model

import com.semilooresapplication.app.R
import com.semilooresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DashboardModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGOODMORNING: String? = MyApp.getInstance().resources.getString(R.string.lbl_good_morning)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeburl: String? = MyApp.getInstance().resources.getString(R.string.lbl_lesny_io)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCalculateyour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_calculate_your)

)
