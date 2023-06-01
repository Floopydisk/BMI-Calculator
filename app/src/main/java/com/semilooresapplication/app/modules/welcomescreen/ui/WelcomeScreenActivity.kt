package com.semilooresapplication.app.modules.welcomescreen.ui

import androidx.activity.viewModels
import com.semilooresapplication.app.R
import com.semilooresapplication.app.appcomponents.base.BaseActivity
import com.semilooresapplication.app.databinding.ActivityWelcomeScreenBinding
import com.semilooresapplication.app.modules.signup.ui.SignUpActivity
import com.semilooresapplication.app.modules.welcomescreen.`data`.viewmodel.WelcomeScreenVM
import kotlin.String
import kotlin.Unit

class WelcomeScreenActivity :
    BaseActivity<ActivityWelcomeScreenBinding>(R.layout.activity_welcome_screen) {
  private val viewModel: WelcomeScreenVM by viewModels<WelcomeScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.welcomeScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnGetStarted.setOnClickListener {
      val destIntent = SignUpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "WELCOME_SCREEN_ACTIVITY"

  }
}
