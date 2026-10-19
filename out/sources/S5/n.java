package S5;

import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: compiled from: ShapeableDelegate.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f5668c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5666a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5667b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RectF f5669d = new RectF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f5670e = new Path();

    public abstract void a(NavigationView navigationView);

    public abstract boolean b();

    public final void c() {
        i iVar;
        RectF rectF = this.f5669d;
        if (rectF.left > rectF.right || rectF.top > rectF.bottom || (iVar = this.f5668c) == null) {
            return;
        }
        j.a.f5640a.a(iVar, 1.0f, rectF, null, this.f5670e);
    }
}
