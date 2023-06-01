package com.semilooresapplication.app.modules.forgotpassword.`data`.model

import com.semilooresapplication.app.R
import com.semilooresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ForgotPasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLetsgetyoub: String? =
      MyApp.getInstance().resources.getString(R.string.msg_let_s_get_you_b)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_we_re_going_to)

)
