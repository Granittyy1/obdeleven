package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;

/* JADX INFO: compiled from: WindowRecomposer.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j1 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f15055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Recomposer f15056c;

    public j1(View view, Recomposer recomposer) {
        this.f15055b = view;
        this.f15056c = recomposer;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f15055b.removeOnAttachStateChangeListener(this);
        this.f15056c.v();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
