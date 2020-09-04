package com.lancer.passwordhelper.ui.activity.video

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lancer.passwordhelper.R
import com.lancer.passwordhelper.base.BaseActivity
import com.lancer.passwordhelper.databinding.ActivityVideoBinding
import com.lancer.passwordhelper.model.bean.VideoInfo

class VideoActivity : BaseActivity<ActivityVideoBinding>() {


    companion object {
        const val TAG = "NewDetailActivity"

        const val EXTRA_VIDEO_INFO = "videoInfo"
        const val EXTRA_VIDEO_ID = "videoId"

        fun start(context: Activity, videoInfo: VideoInfo) {
            val starter = Intent(context, VideoActivity::class.java)
            starter.putExtra(EXTRA_VIDEO_INFO, videoInfo)
            context.startActivity(starter)
//            context.overridePendingTransition(R.anim.anl_push_bottom_in, R.anim.anl_push_up_out)
        }

        fun start(context: Activity, videoId: Long) {
            val starter = Intent(context, VideoActivity::class.java)
            starter.putExtra(EXTRA_VIDEO_ID, videoId)
            context.startActivity(starter)
//            context.overridePendingTransition(R.anim.anl_push_bottom_in, R.anim.anl_push_up_out)
        }
    }

    override fun initView() {

    }

    override fun initData() {
    }

    override fun initLayout(): Int = R.layout.activity_video
}