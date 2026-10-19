package p131k5;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f41776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f41777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f41778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f41779d;

    public static F0 b(C2588z c2588z) {
        String str = c2588z.f42542b;
        Bundle bundleK = c2588z.f42543c.k();
        F0 f10 = new F0();
        f10.f41776a = str;
        f10.f41777b = c2588z.f42544d;
        f10.f41779d = bundleK;
        f10.f41778c = c2588z.f42545e;
        return f10;
    }

    public final C2588z a() {
        return new C2588z(this.f41776a, new C2568u(new Bundle(this.f41779d)), this.f41777b, this.f41778c);
    }

    public final String toString() {
        return "origin=" + this.f41777b + ",name=" + this.f41776a + ",params=" + String.valueOf(this.f41779d);
    }
}
