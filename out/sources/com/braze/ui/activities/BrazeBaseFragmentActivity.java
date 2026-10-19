package com.braze.ui.activities;

import androidx.fragment.app.ActivityC1347l;
import com.braze.Braze;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;

/* JADX INFO: compiled from: BrazeBaseFragmentActivity.kt */
/* JADX INFO: loaded from: classes.dex */
public class BrazeBaseFragmentActivity extends ActivityC1347l {
    @Override // androidx.fragment.app.ActivityC1347l, android.app.Activity
    public void onPause() {
        super.onPause();
        BrazeInAppMessageManager.Companion.getInstance().unregisterInAppMessageManager(this);
    }

    @Override // androidx.fragment.app.ActivityC1347l, android.app.Activity
    public void onResume() {
        super.onResume();
        BrazeInAppMessageManager.Companion.getInstance().registerInAppMessageManager(this);
    }

    @Override // androidx.fragment.app.ActivityC1347l, android.app.Activity
    public void onStart() {
        super.onStart();
        Braze.Companion.getInstance(this).openSession(this);
    }

    @Override // androidx.fragment.app.ActivityC1347l, android.app.Activity
    public void onStop() {
        super.onStop();
        Braze.Companion.getInstance(this).closeSession(this);
    }
}
