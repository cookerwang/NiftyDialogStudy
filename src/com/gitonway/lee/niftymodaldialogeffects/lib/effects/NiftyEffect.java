package com.gitonway.lee.niftymodaldialogeffects.lib.effects;

import com.nineoldandroids.animation.ObjectAnimator;

import android.view.View;

public class NiftyEffect extends BaseEffects {

	@Override
	protected void setupAnimation(View view) {
		// TODO Auto-generated method stub
		getAnimatorSet().playTogether(
				ObjectAnimator.ofFloat(view, "scaleX", 0.0f, 0.8f, 1.0f).setDuration(mDuration),
				ObjectAnimator.ofFloat(view, "scaleY", 0.0f, 0.4f, 1.0f).setDuration(mDuration),
				ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f).setDuration(mDuration),
				ObjectAnimator.ofFloat(view, "ratation", 180.0f, 90.0f, 0.0f).setDuration(mDuration*3/2)
				);
	}

}
