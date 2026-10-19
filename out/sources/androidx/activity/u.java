package androidx.activity;

import android.view.Window;

/* JADX INFO: compiled from: EdgeToEdge.kt */
/* JADX INFO: loaded from: classes.dex */
public class u extends s {
    @Override // androidx.activity.s
    public void a(Window window) {
        kotlin.jvm.internal.i.e(window, "window");
        window.getAttributes().layoutInDisplayCutoutMode = 1;
    }
}
