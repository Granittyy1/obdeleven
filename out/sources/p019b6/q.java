package p019b6;

import O3.d;
import android.content.Context;
import com.google.android.play.integrity.internal.i;
import com.google.android.play.integrity.internal.j;
import com.google.android.play.integrity.internal.k;
import com.google.android.play.integrity.internal.v;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class q implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f20597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f20598c;

    public q(k kVar, i iVar, c cVar) {
        this.f20597b = kVar;
        this.f20598c = iVar;
    }

    @Override // com.google.android.play.integrity.internal.m
    public final Object a() {
        return new o((Context) this.f20597b.f27754b, (v) this.f20598c.a(), new d());
    }
}
