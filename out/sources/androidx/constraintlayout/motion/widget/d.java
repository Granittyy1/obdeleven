package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import p139l0.e;

/* JADX INFO: compiled from: ViewTransitionController.java */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MotionLayout f16356a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashSet<View> f16358c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<c.a> f16360e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<c> f16357b = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16359d = "ViewTransitionController";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList<c.a> f16361f = new ArrayList<>();

    public d(MotionLayout motionLayout) {
        this.f16356a = motionLayout;
    }

    public static void a(c cVar) {
        e sharedValues = ConstraintLayout.getSharedValues();
        int i10 = cVar.f16343u;
        C.e eVar = new C.e();
        HashMap<Integer, HashSet<WeakReference<Object>>> map = sharedValues.f44147a;
        HashSet<WeakReference<Object>> hashSet = map.get(Integer.valueOf(i10));
        if (hashSet == null) {
            hashSet = new HashSet<>();
            map.put(Integer.valueOf(i10), hashSet);
        }
        hashSet.add(new WeakReference<>(eVar));
    }
}
