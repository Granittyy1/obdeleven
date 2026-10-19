package p131k5;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.e;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class V1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f42018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f42019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f42020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f42021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f42022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f42023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f42024h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f42025i;

    public V1(e eVar, String str, String str2, long j, Bundle bundle, boolean z10, boolean z11, boolean z12) {
        this.f42018b = str;
        this.f42019c = str2;
        this.f42020d = j;
        this.f42021e = bundle;
        this.f42022f = z10;
        this.f42023g = z11;
        this.f42024h = z12;
        this.f42025i = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42025i.K(this.f42018b, this.f42019c, this.f42020d, this.f42021e, this.f42022f, this.f42023g, this.f42024h);
    }
}
