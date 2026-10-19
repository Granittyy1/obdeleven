package com.braze.ui.support;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.C1296k;
import androidx.core.view.n0;
import com.braze.enums.inappmessage.Orientation;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ViewUtils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ViewUtils {
    private static final int TABLET_SMALLEST_WIDTH_DP = 600;
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("ViewUtils");

    public static final double convertDpToPixels(Context context, double d10) {
        i.e(context, "context");
        return d10 * ((double) context.getResources().getDisplayMetrics().density);
    }

    public static final int getMaxSafeBottomInset(n0 windowInsets) {
        i.e(windowInsets, "windowInsets");
        n0.k kVar = windowInsets.f16948a;
        C1296k c1296kF = kVar.f();
        int iC = 0;
        if (c1296kF != null && Build.VERSION.SDK_INT >= 28) {
            iC = C1296k.a.c(c1296kF.f16941a);
        }
        return Math.max(iC, kVar.g(7).f46854d);
    }

    public static final int getMaxSafeLeftInset(n0 windowInsets) {
        i.e(windowInsets, "windowInsets");
        n0.k kVar = windowInsets.f16948a;
        C1296k c1296kF = kVar.f();
        int iD = 0;
        if (c1296kF != null && Build.VERSION.SDK_INT >= 28) {
            iD = C1296k.a.d(c1296kF.f16941a);
        }
        return Math.max(iD, kVar.g(7).f46851a);
    }

    public static final int getMaxSafeRightInset(n0 windowInsets) {
        i.e(windowInsets, "windowInsets");
        n0.k kVar = windowInsets.f16948a;
        C1296k c1296kF = kVar.f();
        int iE = 0;
        if (c1296kF != null && Build.VERSION.SDK_INT >= 28) {
            iE = C1296k.a.e(c1296kF.f16941a);
        }
        return Math.max(iE, kVar.g(7).f46853c);
    }

    public static final int getMaxSafeTopInset(n0 windowInsets) {
        i.e(windowInsets, "windowInsets");
        n0.k kVar = windowInsets.f16948a;
        C1296k c1296kF = kVar.f();
        int iF = 0;
        if (c1296kF != null && Build.VERSION.SDK_INT >= 28) {
            iF = C1296k.a.f(c1296kF.f16941a);
        }
        return Math.max(iF, kVar.g(7).f46852b);
    }

    public static final boolean isCurrentOrientationValid(final int i10, final Orientation preferredOrientation) {
        i.e(preferredOrientation, "preferredOrientation");
        if (i10 == 2 && preferredOrientation == Orientation.LANDSCAPE) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) null, (Ia.a) new Ia.a<String>() { // from class: com.braze.ui.support.ViewUtils.isCurrentOrientationValid.1
                @Override // Ia.a
                public final String invoke() {
                    return "Current and preferred orientation are landscape.";
                }
            }, 4, (Object) null);
            return true;
        }
        if (i10 == 1 && preferredOrientation == Orientation.PORTRAIT) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) null, (Ia.a) new Ia.a<String>() { // from class: com.braze.ui.support.ViewUtils.isCurrentOrientationValid.2
                @Override // Ia.a
                public final String invoke() {
                    return "Current and preferred orientation are portrait.";
                }
            }, 4, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) null, (Ia.a) new Ia.a<String>() { // from class: com.braze.ui.support.ViewUtils.isCurrentOrientationValid.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                return "Current orientation " + i10 + " and preferred orientation " + preferredOrientation + " don't match";
            }
        }, 4, (Object) null);
        return false;
    }

    public static final boolean isDeviceInNightMode(Context context) {
        i.e(context, "context");
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static final boolean isDeviceNotInTouchMode(View view) {
        i.e(view, "view");
        return !view.isInTouchMode();
    }

    public static final boolean isRunningOnTablet(Activity activity) {
        i.e(activity, "<this>");
        return activity.getResources().getConfiguration().smallestScreenWidthDp >= TABLET_SMALLEST_WIDTH_DP;
    }

    public static final void removeViewFromParent(final View view) {
        if (view == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) null, (Ia.a) new Ia.a<String>() { // from class: com.braze.ui.support.ViewUtils.removeViewFromParent.1
                @Override // Ia.a
                public final String invoke() {
                    return "View passed in is null. Not removing from parent.";
                }
            }, 4, (Object) null);
        }
        if ((view != null ? view.getParent() : null) instanceof ViewGroup) {
            ViewParent parent = view.getParent();
            i.c(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            final ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.removeView(view);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) null, (Ia.a) new Ia.a<String>() { // from class: com.braze.ui.support.ViewUtils.removeViewFromParent.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Removed view: " + view + "\nfrom parent: " + viewGroup;
                }
            }, 4, (Object) null);
        }
    }

    public static final void setActivityRequestedOrientation(final Activity activity, final int i10) {
        i.e(activity, "<this>");
        try {
            activity.setRequestedOrientation(i10);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e10, new Ia.a<String>() { // from class: com.braze.ui.support.ViewUtils.setActivityRequestedOrientation.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Failed to set requested orientation " + i10 + " for activity class: " + activity.getLocalClassName();
                }
            });
        }
    }

    public static final void setFocusableInTouchModeAndRequestFocus(View view) {
        i.e(view, "<this>");
        try {
            view.setFocusableInTouchMode(true);
            view.requestFocus();
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e10, (Ia.a<String>) new Ia.a<String>() { // from class: com.braze.ui.support.ViewUtils.setFocusableInTouchModeAndRequestFocus.1
                @Override // Ia.a
                public final String invoke() {
                    return "Caught exception while setting view to focusable in touch mode and requesting focus.";
                }
            });
        }
    }

    public static final void setHeightOnViewLayoutParams(View view, int i10) {
        i.e(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i10;
        view.setLayoutParams(layoutParams);
    }
}
