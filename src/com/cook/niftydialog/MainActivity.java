package com.cook.niftydialog;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.gitonway.lee.niftymodaldialogeffects.lib.Effectstype;
import com.gitonway.lee.niftymodaldialogeffects.lib.NiftyDialogBuilder;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void onClickButton(View view) {
		NiftyDialogBuilder db = new NiftyDialogBuilder(this, R.style.dialog_tran);
		Effectstype effect = Effectstype.NiftyEffect;
	    db.withTitle("Modal Dialog")                                  //.withTitle(null)  no title
	    .withTitleColor("#FFFFFF")                                  //def
	    .withDividerColor("#11000000")                              //def
	    .withMessage("This is a modal Dialog.")                     //.withMessage(null)  no Msg
	    .withMessageColor("#FFFFFF")                                //def
	    .withIcon(getResources().getDrawable(R.drawable.ic_launcher))
	    .withDuration(700)                                          //def
	    .withEffect(effect)                                         //def Effectstype.Slidetop
	    .withButton1Text("OK")                                      //def gone
	    .withButton2Text("Cancel")                                  //def gone
	    .isCancelableOnTouchOutside(true)                           //def    | isCancelable(true)
	    .setCustomView(R.layout.custom_view, this)         //.setCustomView(View or ResId,context)
	    .setButton1Click(new View.OnClickListener() {
	        @Override
	        public void onClick(View v) {
	            Toast.makeText(v.getContext(), "i'm btn1", Toast.LENGTH_SHORT).show();
	                    }
	    })
	    .setButton2Click(new View.OnClickListener() {
	        @Override
	        public void onClick(View v) {
	            Toast.makeText(v.getContext(),"i'm btn2",Toast.LENGTH_SHORT).show();
	        }
	    }).show();
	}
}
