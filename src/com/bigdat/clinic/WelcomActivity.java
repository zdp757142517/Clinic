package com.bigdat.clinic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.bigdat.clinic.config.AppConfig;

public class WelcomActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if(AppConfig.isFristEntry(this)){
			this.setContentView(R.layout.introduce_page);
			final ViewFlipper vf_intro=(ViewFlipper) findViewById(R.id.vf_intro);
			vf_intro.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					vf_intro.showNext();
				}
			});
			View start_view=findViewById(R.id.iv_start);
			start_view.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					startWelcomePage();
				}
			});
			AppConfig.setFristEntry(this, false);
		}else{
			startWelcomePage();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	private void startWelcomePage(){
		Animation animation=new AlphaAnimation(0.5f,1f);
		//∂˛√Î÷”
		animation.setDuration(2000);
		animation.setAnimationListener(new AnimationListener() {
			
			@Override
			public void onAnimationStart(Animation animation) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onAnimationRepeat(Animation animation) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onAnimationEnd(Animation animation) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(WelcomActivity.this,MainActivity.class);
				startActivity(intent);
				finish();
			}
		});
		ImageView iv=new ImageView(this);
		iv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT));
		iv.setBackgroundResource(R.drawable.welcome);
		setContentView(iv);
		iv.startAnimation(animation);
	}
}
