package p019b6;

import android.os.RemoteException;
import com.google.android.play.core.integrity.StandardIntegrityException;
import java.util.Objects;
import p191p5.h;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f20575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f20576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f20577g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, h hVar, int i10, long j, h hVar2) {
        super(oVar, hVar);
        this.f20574d = i10;
        this.f20575e = j;
        this.f20576f = hVar2;
        Objects.requireNonNull(oVar);
        this.f20577g = oVar;
    }

    @Override // com.google.android.play.integrity.internal.w
    public final void b() {
        h hVar = this.f20576f;
        long j = this.f20575e;
        o oVar = this.f20577g;
        if (o.d(oVar)) {
            a(new StandardIntegrityException(-2, false, null));
            return;
        }
        int i10 = this.f20574d;
        if (o.c(oVar, i10)) {
            a(new StandardIntegrityException(-14, false, null));
            return;
        }
        try {
            oVar.f20595e.f27746m.r(o.b(oVar, j, i10), new m(oVar, hVar));
        } catch (RemoteException e10) {
            oVar.f20591a.a(e10, "warmUpIntegrityToken(%s)", Long.valueOf(j));
            hVar.c(new StandardIntegrityException(-100, false, e10));
        }
    }
}
