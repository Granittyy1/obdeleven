package androidx.fragment.app;

import android.view.View;
import androidx.core.view.Z;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: FragmentTransitionImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class O implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f17522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f17523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f17524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f17525f;

    public O(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f17521b = i10;
        this.f17522c = arrayList;
        this.f17523d = arrayList2;
        this.f17524e = arrayList3;
        this.f17525f = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i10 = 0; i10 < this.f17521b; i10++) {
            View view = (View) this.f17522c.get(i10);
            String str = (String) this.f17523d.get(i10);
            WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
            androidx.core.view.O.d.v(view, str);
            androidx.core.view.O.d.v((View) this.f17524e.get(i10), (String) this.f17525f.get(i10));
        }
    }
}
