package io.intercom.android.sdk.views;

import android.view.View;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.BackgroundUtils;
import p186p0.a;

/* JADX INFO: loaded from: classes.dex */
public class ActiveStatePresenter {
    private static final String ENGLISH_LOCALE = "en";

    public void presentStateDot(boolean z10, View view, AppConfig appConfig) {
        if (ENGLISH_LOCALE.equals(appConfig.getLocale())) {
            BackgroundUtils.setBackground(view, new ActiveStateDrawable(a.b.a(view.getContext(), z10 ? R.color.intercom_active_state : R.color.intercom_away_state), a.b.a(view.getContext(), R.color.intercom_white), view.getResources().getDisplayMetrics().density * 1.0f));
        } else {
            view.setBackgroundResource(0);
        }
    }
}
