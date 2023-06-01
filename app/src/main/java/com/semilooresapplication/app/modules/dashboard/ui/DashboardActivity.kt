package com.semilooresapplication.app.modules.dashboard.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.semilooresapplication.app.R
import com.semilooresapplication.app.appcomponents.base.BaseActivity
import com.semilooresapplication.app.databinding.ActivityDashboardBinding
import com.semilooresapplication.app.modules.bmi.ui.BmiActivity
import com.semilooresapplication.app.modules.dashboard.`data`.viewmodel.DashboardVM
import com.semilooresapplication.app.modules.more.ui.MoreActivity
import com.semilooresapplication.app.modules.profile.ui.ProfileActivity
import com.semilooresapplication.app.modules.track.ui.TrackActivity
import kotlin.String
import kotlin.Unit

class DashboardActivity : BaseActivity<ActivityDashboardBinding>(R.layout.activity_dashboard) {
  private val viewModel: DashboardVM by viewModels<DashboardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.dashboardVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageIcons8trackNinetySix.setOnClickListener {
      val destIntent = TrackActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowcalculateyour.setOnClickListener {
      val destIntent = BmiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageUndrawpicprof.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageIcons8moreNinetySix.setOnClickListener {
      val destIntent = MoreActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "DASHBOARD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DashboardActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
