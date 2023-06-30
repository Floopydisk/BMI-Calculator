package com.semilooresapplication.app.modules.enterotp.`data`.model

import com.semilooresapplication.app.R
import com.semilooresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class EnterOtpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLetsgetyoub: String? =
      MyApp.getInstance().resources.getString(R.string.msg_let_s_get_you_b)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWehavesentan: String? =
      MyApp.getInstance().resources.getString(R.string.msg_we_have_sent_an)

)
