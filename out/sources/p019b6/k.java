package p019b6;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.integrity.internal.t;
import java.util.Objects;
import p191p5.h;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes3.dex */
public class k extends t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f20584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f20585d;

    public k(o oVar, h hVar) {
        Objects.requireNonNull(oVar);
        this.f20585d = oVar;
        attachInterface(this, "com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.f20584c = hVar;
    }

    @Override // com.google.android.play.integrity.internal.u
    public void H(Bundle bundle) throws RemoteException {
        this.f20585d.f20595e.c(this.f20584c);
    }

    @Override // com.google.android.play.integrity.internal.u
    public void w(Bundle bundle) throws RemoteException {
        this.f20585d.f20595e.c(this.f20584c);
    }
}
