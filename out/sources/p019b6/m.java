package p019b6;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.integrity.internal.v;
import java.util.Objects;
import p191p5.h;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f20588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f20589f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, h hVar) {
        super(oVar, hVar);
        Objects.requireNonNull(oVar);
        this.f20589f = oVar;
        this.f20588e = new v("OnWarmUpIntegrityTokenCallback");
    }

    @Override // p019b6.k, com.google.android.play.integrity.internal.u
    public final void H(Bundle bundle) throws RemoteException {
        super.H(bundle);
        this.f20588e.b("onWarmUpExpressIntegrityToken", new Object[0]);
        StandardIntegrityException standardIntegrityExceptionK = this.f20589f.f20594d.k(bundle);
        h hVar = this.f20584c;
        if (standardIntegrityExceptionK != null) {
            hVar.c(standardIntegrityExceptionK);
        } else {
            hVar.d(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
