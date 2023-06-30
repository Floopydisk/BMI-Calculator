package com.semilooresapplication.app.modules.more.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.semilooresapplication.app.R
import com.semilooresapplication.app.appcomponents.base.BaseActivity
import com.semilooresapplication.app.databinding.ActivityMoreBinding
import com.semilooresapplication.app.modules.dashboard.ui.DashboardActivity
import com.semilooresapplication.app.modules.more.`data`.viewmodel.MoreVM
import com.semilooresapplication.app.modules.profile.ui.ProfileActivity
import com.semilooresapplication.app.modules.track.ui.TrackActivity
import kotlin.String
import kotlin.Unit

class MoreActivity : BaseActivity<ActivityMoreBinding>(R.layout.activity_more) {
  private val viewModel: MoreVM by viewModels<MoreVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.moreVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageUndrawpicprof.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageIcons8trackNinetySix.setOnClickListener {
      val destIntent = TrackActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageHome.setOnClickListener {
      val destIntent = DashboardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "MORE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MoreActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
