package com.semilooresapplication.app.modules.bmiresults.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.semilooresapplication.app.R
import com.semilooresapplication.app.appcomponents.base.BaseActivity
import com.semilooresapplication.app.databinding.ActivityBmiResultsBinding
import com.semilooresapplication.app.modules.bmiresults.`data`.viewmodel.BmiResultsVM
import com.semilooresapplication.app.modules.details.ui.DetailsActivity
import com.semilooresapplication.app.modules.recommendations.ui.RecommendationsActivity
import kotlin.String
import kotlin.Unit

class BmiResultsActivity : BaseActivity<ActivityBmiResultsBinding>(R.layout.activity_bmi_results) {
  private val viewModel: BmiResultsVM by viewModels<BmiResultsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.bmiResultsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnGroupSeventy.setOnClickListener {
      val destIntent = RecommendationsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnDetails.setOnClickListener {
      val destIntent = DetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "BMI_RESULTS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BmiResultsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
