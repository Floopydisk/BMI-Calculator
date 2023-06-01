package com.semilooresapplication.app.modules.welcomescreen.`data`.model

import com.semilooresapplication.app.R
import com.semilooresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class WelcomeScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLetshelpyou: String? = MyApp.getInstance().resources.getString(R.string.msg_let_s_help_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_this_app_can_yo)

)
