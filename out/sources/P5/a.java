package P5;

import C.g;
import D3.l;
import android.graphics.Typeface;

/* JADX INFO: compiled from: CancelableFontCallback.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Typeface f4929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f4930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4931e;

    public a(l lVar, Typeface typeface) {
        this.f4929c = typeface;
        this.f4930d = lVar;
    }

    @Override // C.g
    public final void Z(int i10) {
        if (this.f4931e) {
            return;
        }
        com.google.android.material.internal.a aVar = (com.google.android.material.internal.a) this.f4930d.f2765c;
        if (aVar.j(this.f4929c)) {
            aVar.h(false);
        }
    }

    @Override // C.g
    public final void a0(Typeface typeface, boolean z10) {
        if (this.f4931e) {
            return;
        }
        com.google.android.material.internal.a aVar = (com.google.android.material.internal.a) this.f4930d.f2765c;
        if (aVar.j(typeface)) {
            aVar.h(false);
        }
    }
}
