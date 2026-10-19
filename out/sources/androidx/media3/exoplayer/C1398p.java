package androidx.media3.exoplayer;

import A1.C0577l;
import android.content.Context;

/* JADX INFO: renamed from: androidx.media3.exoplayer.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1398p implements com.google.common.base.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f18592b;

    public /* synthetic */ C1398p(Context context) {
        this.f18592b = context;
    }

    @Override // com.google.common.base.j
    public final Object get() {
        C0577l c0577l = new C0577l();
        c0577l.f534d = new X1.e();
        c0577l.f533c = true;
        return new androidx.media3.exoplayer.source.d(this.f18592b, c0577l);
    }
}
