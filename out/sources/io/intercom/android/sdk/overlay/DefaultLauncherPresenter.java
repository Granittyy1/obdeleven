package io.intercom.android.sdk.overlay;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.CustomizationColorsModel;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.ThemeUtils;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultLauncherPresenter implements DefaultLauncher.Listener {
    private int bottomPadding;
    DefaultLauncher defaultLauncher;
    private final LayoutInflater inflater;
    private final MetricTracker metricTracker;
    private final LauncherOpenBehaviour openBehaviour;
    private int previousUnreadCount = 0;

    public DefaultLauncherPresenter(LayoutInflater layoutInflater, LauncherOpenBehaviour launcherOpenBehaviour, MetricTracker metricTracker) {
        this.bottomPadding = 0;
        this.inflater = layoutInflater;
        this.openBehaviour = launcherOpenBehaviour;
        this.metricTracker = metricTracker;
        this.bottomPadding = getDefaultPadding(layoutInflater.getContext().getResources());
    }

    private int getDefaultPadding(Resources resources) {
        return resources.getDimensionPixelSize(R.dimen.intercom_bottom_padding) + resources.getDimensionPixelSize(R.dimen.intercom_launcher_padding_bottom);
    }

    public void displayLauncherOnAttachedRoot(ViewGroup viewGroup, AppConfig appConfig) {
        DefaultLauncher defaultLauncher = this.defaultLauncher;
        if (defaultLauncher != null && !defaultLauncher.isAttachedToRoot(viewGroup)) {
            this.defaultLauncher.removeView();
            this.defaultLauncher = null;
        }
        if (this.defaultLauncher == null) {
            DefaultLauncher defaultLauncher2 = new DefaultLauncher(viewGroup, this.inflater, this, this.bottomPadding);
            this.defaultLauncher = defaultLauncher2;
            defaultLauncher2.fadeOnScreen();
        }
        setLauncherBackgroundColor(appConfig);
        setLauncherLogo(appConfig);
        setUnreadCount(this.previousUnreadCount);
    }

    public DefaultLauncher getAndUnsetLauncher() {
        DefaultLauncher defaultLauncher = this.defaultLauncher;
        this.defaultLauncher = null;
        return defaultLauncher;
    }

    public boolean isDisplaying() {
        return this.defaultLauncher != null;
    }

    @Override // io.intercom.android.sdk.overlay.DefaultLauncher.Listener
    public void onLauncherClicked(Context context) {
        this.openBehaviour.openMessenger(context);
    }

    public void removeLauncher() {
        DefaultLauncher defaultLauncher = this.defaultLauncher;
        if (defaultLauncher != null) {
            defaultLauncher.fadeOffScreen(null);
            this.defaultLauncher = null;
        }
    }

    public void setBottomPadding(int i10) {
        this.bottomPadding = getDefaultPadding(this.inflater.getContext().getResources()) + i10;
        if (isDisplaying()) {
            this.defaultLauncher.updateBottomPadding(this.bottomPadding);
        }
    }

    public void setLauncherBackgroundColor(int i10, int i11) {
        DefaultLauncher defaultLauncher = this.defaultLauncher;
        if (defaultLauncher != null) {
            defaultLauncher.setLauncherColor(i10, i11);
        }
    }

    public void setLauncherLogo(AppConfig appConfig) {
        boolean z10 = (TextUtils.isEmpty(appConfig.getLauncherLogoUrl()) && (appConfig.getConfigModules() == null || (TextUtils.isEmpty(appConfig.getConfigModules().getCustomization().getLauncherLogoUrl()) && TextUtils.isEmpty(appConfig.getConfigModules().getCustomization().getLauncherLogoDarkUrl())))) ? false : true;
        DefaultLauncher defaultLauncher = this.defaultLauncher;
        if (defaultLauncher != null && z10) {
            defaultLauncher.setLauncherLogo(appConfig);
        } else if (defaultLauncher != null) {
            defaultLauncher.setDefaultLogo();
        }
    }

    public void setUnreadCount(int i10) {
        if (isDisplaying()) {
            String strValueOf = String.valueOf(i10);
            if (i10 > this.previousUnreadCount) {
                this.metricTracker.receivedNotificationFromBadgeWhenMessengerClosed(strValueOf);
            }
            if (i10 > 0) {
                this.defaultLauncher.setBadgeCount(strValueOf);
            } else {
                this.defaultLauncher.hideBadgeCount();
            }
        }
        this.previousUnreadCount = i10;
    }

    public void setLauncherBackgroundColor(AppConfig appConfig) {
        ConfigModules configModules = appConfig.getConfigModules();
        if (configModules != null) {
            CustomizationColorsModel action = configModules.getCustomization().getAction();
            String strSelectColorForTheme = ThemeUtils.selectColorForTheme(this.inflater.getContext(), action.getBackgroundColor(), action.getBackgroundColorDark());
            String strSelectColorForTheme2 = ThemeUtils.selectColorForTheme(this.inflater.getContext(), action.getForegroundLowContrastColor(), action.getForegroundLowContrastColorDark());
            setLauncherBackgroundColor(ColorUtils.parseColor(strSelectColorForTheme2), ColorUtils.parseColor(strSelectColorForTheme));
        }
    }
}
