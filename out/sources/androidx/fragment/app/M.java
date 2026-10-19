package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* JADX INFO: compiled from: FragmentTransitionCompat21.java */
/* JADX INFO: loaded from: classes.dex */
public final class M implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f17515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f17516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f17518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L f17519e;

    public M(L l10, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f17519e = l10;
        this.f17515a = obj;
        this.f17516b = arrayList;
        this.f17517c = obj2;
        this.f17518d = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        L l10 = this.f17519e;
        Object obj = this.f17515a;
        if (obj != null) {
            l10.u(obj, this.f17516b, null);
        }
        Object obj2 = this.f17517c;
        if (obj2 != null) {
            l10.u(obj2, this.f17518d, null);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }
}
