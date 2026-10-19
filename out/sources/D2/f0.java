package D2;

import android.view.ViewGroup;

/* JADX INFO: compiled from: VisibilityPropagation.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f2639a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    public static int b(O o10, int i10) {
        int[] iArr;
        if (o10 == null || (iArr = (int[]) o10.f2553a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i10];
    }

    public abstract long a(ViewGroup viewGroup, F f10, O o10, O o11);
}
