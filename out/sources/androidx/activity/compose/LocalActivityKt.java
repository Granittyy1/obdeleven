package androidx.activity.compose;

import Ia.l;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.runtime.ComputedProvidableCompositionLocal;
import androidx.compose.runtime.InterfaceC1106q;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: compiled from: LocalActivity.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LocalActivityKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ComputedProvidableCompositionLocal f8205a = new ComputedProvidableCompositionLocal(new l<InterfaceC1106q, Activity>() { // from class: androidx.activity.compose.LocalActivityKt$LocalActivity$1
        @Override // Ia.l
        public final Activity invoke(InterfaceC1106q interfaceC1106q) {
            Context baseContext = (Context) interfaceC1106q.d(AndroidCompositionLocals_androidKt.f14793b);
            while (baseContext instanceof ContextWrapper) {
                if (baseContext instanceof Activity) {
                    return (Activity) baseContext;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            baseContext = null;
            return (Activity) baseContext;
        }
    });
}
