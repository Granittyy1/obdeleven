package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.util.Pair;
import android.view.View;

/* JADX INFO: renamed from: androidx.core.app.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ActivityOptionsCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1278c {
    public static ActivityOptions a(Activity activity, View view, String str) {
        return ActivityOptions.makeSceneTransitionAnimation(activity, view, str);
    }

    @SafeVarargs
    public static ActivityOptions b(Activity activity, Pair<View, String>... pairArr) {
        return ActivityOptions.makeSceneTransitionAnimation(activity, pairArr);
    }

    public static ActivityOptions c() {
        return ActivityOptions.makeTaskLaunchBehind();
    }
}
