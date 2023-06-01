package com.semilooresapplication.app.modules.recommendations.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.semilooresapplication.app.R
import com.semilooresapplication.app.appcomponents.base.BaseActivity
import com.semilooresapplication.app.databinding.ActivityRecommendationsBinding
import com.semilooresapplication.app.modules.dashboard.ui.DashboardActivity
import com.semilooresapplication.app.modules.recommendations.`data`.viewmodel.RecommendationsVM
import kotlin.String
import kotlin.Unit

class RecommendationsActivity :
    BaseActivity<ActivityRecommendationsBinding>(R.layout.activity_recommendations) {
  private val viewModel: RecommendationsVM by viewModels<RecommendationsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.recommendationsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.floatingBtnFloatingactionbutton.setOnClickListener {
      val destIntent = DashboardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "RECOMMENDATIONS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RecommendationsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
