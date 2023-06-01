package com.semilooresapplication.app.modules.bmi.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.semilooresapplication.app.R
import com.semilooresapplication.app.appcomponents.base.BaseActivity
import com.semilooresapplication.app.databinding.ActivityBmiBinding
import com.semilooresapplication.app.modules.bmi.`data`.viewmodel.BmiVM
import com.semilooresapplication.app.modules.bmiresults.ui.BmiResultsActivity
import kotlin.String
import kotlin.Unit

class BmiActivity : BaseActivity<ActivityBmiBinding>(R.layout.activity_bmi) {
  private val viewModel: BmiVM by viewModels<BmiVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.bmiVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      // TODO please, add your navigation code here
      finish()
    }
    binding.btnCalculateBmi.setOnClickListener {
      val destIntent = BmiResultsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "BMI_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BmiActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
