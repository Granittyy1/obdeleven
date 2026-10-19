package p131k5;

import U4.C0804l;
import androidx.collection.C0873a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class V implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f42012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f42013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2481a f42014d;

    public V(C2481a c2481a, String str, long j) {
        this.f42012b = str;
        this.f42013c = j;
        this.f42014d = c2481a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        C2481a c2481a = this.f42014d;
        c2481a.p();
        String str = this.f42012b;
        C0804l.e(str);
        C0873a c0873a = c2481a.f42072c;
        boolean zIsEmpty = c0873a.isEmpty();
        long j = this.f42013c;
        if (zIsEmpty) {
            c2481a.f42073d = j;
        }
        Integer num = (Integer) c0873a.get(str);
        if (num != null) {
            c0873a.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (c0873a.f9139d >= 100) {
            c2481a.d().f41715i.c("Too many ads visible");
        } else {
            c0873a.put(str, 1);
            c2481a.f42071b.put(str, Long.valueOf(j));
        }
    }
}
