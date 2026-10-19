package p019b6;

import android.os.RemoteException;
import com.google.android.play.core.integrity.StandardIntegrityException;
import java.util.Objects;
import p191p5.h;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a.d f20579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f20580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f20581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h f20582h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o f20583i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o oVar, h hVar, int i10, a.d dVar, long j, long j10, h hVar2) {
        super(oVar, hVar);
        this.f20578d = i10;
        this.f20579e = dVar;
        this.f20580f = j;
        this.f20581g = j10;
        this.f20582h = hVar2;
        Objects.requireNonNull(oVar);
        this.f20583i = oVar;
    }

    @Override // com.google.android.play.integrity.internal.w
    public final void b() {
        h hVar = this.f20582h;
        o oVar = this.f20583i;
        if (o.d(oVar)) {
            a(new StandardIntegrityException(-2, false, null));
            return;
        }
        int i10 = this.f20578d;
        if (o.c(oVar, i10)) {
            a(new StandardIntegrityException(-14, false, null));
            return;
        }
        try {
            oVar.f20595e.f27746m.Z(o.a(oVar, this.f20579e, this.f20580f, this.f20581g, i10), new l(oVar, hVar));
        } catch (RemoteException e10) {
            a.d dVar = this.f20579e;
            oVar.f20591a.a(e10, "requestExpressIntegrityToken(%s, %s, %s)", dVar.a(), dVar.b(), Long.valueOf(this.f20580f));
            hVar.c(new StandardIntegrityException(-100, false, e10));
        }
    }
}
