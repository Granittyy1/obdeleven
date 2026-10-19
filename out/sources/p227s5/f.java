package p227s5;

import android.view.View;
import androidx.core.view.O;
import androidx.core.view.Z;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: ViewOffsetHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f46925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46928d;

    public f(View view) {
        this.f46925a = view;
    }

    public final void a() {
        int i10 = this.f46928d;
        View view = this.f46925a;
        int top = i10 - (view.getTop() - this.f46926b);
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f46927c));
    }
}
