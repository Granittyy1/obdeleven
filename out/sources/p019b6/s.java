package p019b6;

import com.google.android.play.integrity.internal.d;
import com.google.android.play.integrity.internal.z;
import java.util.Objects;
import p191p5.B;
import p191p5.h;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f20600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f20601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f20603d;

    public s(t tVar, long j, long j10, int i10) {
        this.f20600a = j;
        this.f20601b = j10;
        this.f20602c = i10;
        Objects.requireNonNull(tVar);
        this.f20603d = tVar;
    }

    @Override // b6.a.c
    public final B a(a.d dVar) {
        o oVar = this.f20603d.f20604a;
        long j = this.f20601b;
        oVar.f20591a.b("requestExpressIntegrityToken(%s)", Long.valueOf(j));
        h hVar = new h();
        j jVar = new j(oVar, hVar, this.f20602c, dVar, this.f20600a, j, hVar);
        d dVar2 = oVar.f20595e;
        dVar2.getClass();
        dVar2.a().post(new z(dVar2, hVar, hVar, jVar));
        return hVar.f45811a;
    }
}
