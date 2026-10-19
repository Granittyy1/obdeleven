package p131k5;

import com.google.android.gms.measurement.internal.h;

/* JADX INFO: renamed from: k5.o1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2547o1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f42317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f42318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f42319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f42320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BinderC2535l1 f42321f;

    public RunnableC2547o1(BinderC2535l1 binderC2535l1, String str, String str2, String str3, long j) {
        this.f42317b = str;
        this.f42318c = str2;
        this.f42319d = str3;
        this.f42320e = j;
        this.f42321f = binderC2535l1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f42318c;
        BinderC2535l1 binderC2535l1 = this.f42321f;
        String str2 = this.f42317b;
        if (str2 == null) {
            h hVar = binderC2535l1.f42293c;
            hVar.i().p();
            String str3 = hVar.f26597F;
            if (str3 == null || str3.equals(str)) {
                hVar.f26597F = str;
                hVar.f26596E = null;
                return;
            }
            return;
        }
        C2559r2 c2559r2 = new C2559r2(this.f42319d, str2, this.f42320e);
        h hVar2 = binderC2535l1.f42293c;
        hVar2.i().p();
        String str4 = hVar2.f26597F;
        if (str4 != null) {
            str4.equals(str);
        }
        hVar2.f26597F = str;
        hVar2.f26596E = c2559r2;
    }
}
