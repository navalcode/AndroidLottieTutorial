package com.navalcode.lottietutorial

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.widget.ImageView

object CustomAnimation {
    fun animateScale(
        imageView: ImageView,
        startScale: Float,
        finishScale: Float,
        image: Int,
        duration: Long
    ) {
        imageView.animate()
            .scaleX(startScale)
            .scaleY(startScale)
            .setDuration(duration)
            .setListener(object : AnimatorListenerAdapter() {
                override fun onAnimationEnd(animator: Animator) {
                    imageView.setImageResource(image)
                    imageView.animate()
                        .scaleX(finishScale)
                        .scaleY(finishScale)
                        .setDuration(duration)
                        .setListener(null)
                }

            })

    }


}