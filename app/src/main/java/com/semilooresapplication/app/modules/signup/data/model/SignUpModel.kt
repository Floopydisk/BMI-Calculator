package com.semilooresapplication.app.modules.signup.`data`.model

import com.semilooresapplication.app.R
import com.semilooresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomeOnboard: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_onboard)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLetshelpyou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_let_s_help_you2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignIn: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangleTwoValue: String? = null
)
