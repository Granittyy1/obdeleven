package p131k5;

import com.google.android.gms.measurement.internal.e;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class X1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f42042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f42043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f42044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f42045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f42046f;

    public X1(e eVar, String str, String str2, Object obj, long j) {
        this.f42042b = str;
        this.f42043c = str2;
        this.f42044d = obj;
        this.f42045e = j;
        this.f42046f = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f42044d;
        this.f42046f.y(this.f42045e, obj, this.f42042b, this.f42043c);
    }
}
