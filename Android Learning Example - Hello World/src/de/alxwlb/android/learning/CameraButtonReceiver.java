package de.alxwlb.android.learning;

import android.content.*;

public class CameraButtonReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		System.out.println("Camera Button Pressed!!!!");
	}
}
