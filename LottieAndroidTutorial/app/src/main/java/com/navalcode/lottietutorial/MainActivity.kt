package com.navalcode.lottietutorial

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.lottie.LottieAnimationView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var like = false
    var like2 = false
    var like3 = false
    var like4 = false
    var like5 = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    fun setListeners() {
        likeImageView.setOnClickListener {
            like = likeAnimation(likeImageView, R.raw.bandai_dokkan, like, R.drawable.twitter_like)
        }

        like2ImageView.setOnClickListener {
            like2 =
                likeAnimation(like2ImageView, R.raw.apple_event, like2, R.drawable.chocolate_cookie)
        }

        like3ImageView.setOnClickListener {
            like3 = likeAnimation(like3ImageView, R.raw.black_joy, like3, R.drawable.fruit_limon)
        }

        like4ImageView.setOnClickListener {
            like4 =
                likeAnimation(like4ImageView, R.raw.always_proud, like4, R.drawable.twitter_like)
        }

        like5ImageView.setOnClickListener {
            like5 = likeAnimation(like5ImageView, R.raw.hmm, like5, R.drawable.twitter_like)
        }
    }

    private fun likeAnimation(
        imageView: LottieAnimationView,
        animation: Int,
        like: Boolean,
        endDrawable: Int
    ): Boolean {
        return likeAnimationScale(imageView, animation, like, endDrawable)
        //return likeAnimationAlpha(imageView, animation, like, endDrawable)
    }

    private fun likeAnimationScale(
        imageView: LottieAnimationView,
        animation: Int,
        like: Boolean,
        endDrawable: Int
    ): Boolean {

        if (!like) {
            imageView.setAnimation(animation)
            //imageView.repeatCount = LottieDrawable.INFINITE
            imageView.playAnimation()
        } else {
            imageView.animate()
                .scaleX(0f)
                .scaleY(0f)
                .setDuration(200)
                .setListener(object : AnimatorListenerAdapter() {
                    override fun onAnimationEnd(animator: Animator) {
                        imageView.setImageResource(endDrawable)
                        imageView.animate()
                            .scaleX(1f)
                            .scaleY(1f)
                            .setDuration(200)
                            .setListener(null)
                    }

                })

        }

        return !like
    }

    private fun likeAnimationAlpha(
        imageView: LottieAnimationView,
        animation: Int,
        like: Boolean,
        endDrawable: Int
    ): Boolean {

        if (!like) {
            imageView.setAnimation(animation)
            //imageView.repeatCount = LottieDrawable.INFINITE
            imageView.playAnimation()
        } else {
            imageView.animate()
                .alpha(0f)
                .setDuration(100)
                .setListener(object : AnimatorListenerAdapter() {
                    override fun onAnimationEnd(animator: Animator) {
                        imageView.setImageResource(endDrawable)
                        imageView.animate()
                            .alpha(1f)
                            .setDuration(100)
                            .setListener(null)
                    }

                })

        }

        return !like
    }

}