package com.semilooresapplication.app.modules.track.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.semilooresapplication.app.R
import com.semilooresapplication.app.appcomponents.base.BaseActivity
import com.semilooresapplication.app.databinding.ActivityTrackBinding
import com.semilooresapplication.app.modules.dashboard.ui.DashboardActivity
import com.semilooresapplication.app.modules.more.ui.MoreActivity
import com.semilooresapplication.app.modules.track.`data`.viewmodel.TrackVM
import kotlin.String
import kotlin.Unit

class TrackActivity : BaseActivity<ActivityTrackBinding>(R.layout.activity_track) {
  private val viewModel: TrackVM by viewModels<TrackVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.trackVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageIcons8moreNinetySix.setOnClickListener {
      val destIntent = MoreActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageHome.setOnClickListener {
      val destIntent = DashboardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TRACK_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TrackActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
