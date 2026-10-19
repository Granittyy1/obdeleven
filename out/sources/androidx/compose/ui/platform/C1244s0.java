package androidx.compose.ui.platform;

import android.view.MotionEvent;
import com.braze.support.BrazeLogger;

/* JADX INFO: renamed from: androidx.compose.ui.platform.s0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1244s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1244s0 f15092a = new C1244s0();

    public final boolean a(MotionEvent motionEvent, int i10) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i10)) & BrazeLogger.SUPPRESS) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i10)) & BrazeLogger.SUPPRESS) < 2139095040;
    }
}
