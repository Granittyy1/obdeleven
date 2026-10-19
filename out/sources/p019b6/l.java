package p019b6;

import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import androidx.core.view.C1293h;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.integrity.internal.v;
import java.util.Objects;
import p191p5.h;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f20586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f20587f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, h hVar) {
        super(oVar, hVar);
        Objects.requireNonNull(oVar);
        this.f20587f = oVar;
        this.f20586e = new v("OnRequestIntegrityTokenCallback");
    }

    @Override // p019b6.k, com.google.android.play.integrity.internal.u
    public final void w(Bundle bundle) throws RemoteException {
        super.w(bundle);
        this.f20586e.b("onRequestExpressIntegrityToken", new Object[0]);
        StandardIntegrityException standardIntegrityExceptionK = this.f20587f.f20594d.k(bundle);
        h hVar = this.f20584c;
        if (standardIntegrityExceptionK != null) {
            hVar.c(standardIntegrityExceptionK);
            return;
        }
        bundle.getLong("request.token.sid");
        C1293h.h("UID: [", "]  PID: [", "] ", Process.myUid(), Process.myPid()).concat("IntegrityDialogWrapper");
        String string = bundle.getString("token");
        if (string == null) {
            throw new NullPointerException("Null token");
        }
        hVar.d(new r(string));
    }
}
