package com.semilooresapplication.app.modules.enterotp.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.semilooresapplication.app.R
import com.semilooresapplication.app.appcomponents.base.BaseActivity
import com.semilooresapplication.app.databinding.ActivityEnterOtpBinding
import com.semilooresapplication.app.modules.enterotp.`data`.viewmodel.EnterOtpVM
import com.semilooresapplication.app.modules.signin.ui.SignInActivity
import kotlin.String
import kotlin.Unit

class EnterOtpActivity : BaseActivity<ActivityEnterOtpBinding>(R.layout.activity_enter_otp) {
  private val viewModel: EnterOtpVM by viewModels<EnterOtpVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.enterOtpVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnResetPassword.setOnClickListener {
      val destIntent = SignInActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ENTER_OTP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EnterOtpActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
