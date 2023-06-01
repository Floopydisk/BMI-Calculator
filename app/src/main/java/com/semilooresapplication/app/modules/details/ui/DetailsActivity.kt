package com.semilooresapplication.app.modules.details.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.semilooresapplication.app.R
import com.semilooresapplication.app.appcomponents.base.BaseActivity
import com.semilooresapplication.app.databinding.ActivityDetailsBinding
import com.semilooresapplication.app.modules.details.`data`.viewmodel.DetailsVM
import com.semilooresapplication.app.modules.recommendations.ui.RecommendationsActivity
import kotlin.String
import kotlin.Unit

class DetailsActivity : BaseActivity<ActivityDetailsBinding>(R.layout.activity_details) {
  private val viewModel: DetailsVM by viewModels<DetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.detailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnGroupSeventy.setOnClickListener {
      val destIntent = RecommendationsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "DETAILS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DetailsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
