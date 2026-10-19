package p131k5;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.e;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class N1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ e f41914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Bundle f41915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ long f41916d;

    @Override // java.lang.Runnable
    public final void run() {
        e eVar = this.f41914b;
        if (TextUtils.isEmpty(((C2523i1) eVar.f3968a).o().y())) {
            eVar.A(this.f41915c, 0, this.f41916d);
        } else {
            eVar.d().f41716k.c("Using developer consent only; google app id found");
        }
    }
}
