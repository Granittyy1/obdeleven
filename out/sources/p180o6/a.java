package p180o6;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.BinderC1815g0;
import com.google.android.gms.internal.measurement.C1912u0;
import com.google.android.gms.internal.measurement.C1919v0;
import com.google.android.gms.internal.measurement.C1939y0;
import com.google.android.gms.internal.measurement.D0;
import com.google.android.gms.internal.measurement.E0;
import com.google.android.gms.internal.measurement.F0;
import com.google.android.gms.internal.measurement.G0;
import com.google.android.gms.internal.measurement.H0;
import com.google.android.gms.internal.measurement.I0;
import com.google.android.gms.internal.measurement.K0;
import com.google.android.gms.internal.measurement.O0;
import java.util.List;
import java.util.Map;
import java.util.Random;
import p131k5.InterfaceC2544n2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements InterfaceC2544n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1912u0 f45232a;

    public a(C1912u0 c1912u0) {
        this.f45232a = c1912u0;
    }

    @Override // p131k5.InterfaceC2544n2
    public final long A() {
        C1912u0 c1912u0 = this.f45232a;
        BinderC1815g0 binderC1815g0 = new BinderC1815g0();
        c1912u0.e(new I0(c1912u0, binderC1815g0));
        Long l10 = (Long) BinderC1815g0.b0(binderC1815g0.g(500L), Long.class);
        if (l10 != null) {
            return l10.longValue();
        }
        long jNanoTime = System.nanoTime();
        c1912u0.f25855b.getClass();
        long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
        int i10 = c1912u0.f25859f + 1;
        c1912u0.f25859f = i10;
        return jNextLong + ((long) i10);
    }

    @Override // p131k5.InterfaceC2544n2
    public final String B() {
        C1912u0 c1912u0 = this.f45232a;
        BinderC1815g0 binderC1815g0 = new BinderC1815g0();
        c1912u0.e(new K0(c1912u0, binderC1815g0));
        return (String) BinderC1815g0.b0(binderC1815g0.g(500L), String.class);
    }

    @Override // p131k5.InterfaceC2544n2
    public final void a(Bundle bundle, String str, String str2) {
        C1912u0 c1912u0 = this.f45232a;
        c1912u0.e(new C1939y0(c1912u0, str, str2, bundle));
    }

    @Override // p131k5.InterfaceC2544n2
    public final void b(String str) {
        C1912u0 c1912u0 = this.f45232a;
        c1912u0.e(new E0(c1912u0, str));
    }

    @Override // p131k5.InterfaceC2544n2
    public final String c() {
        C1912u0 c1912u0 = this.f45232a;
        BinderC1815g0 binderC1815g0 = new BinderC1815g0();
        c1912u0.e(new F0(c1912u0, binderC1815g0));
        return (String) BinderC1815g0.b0(binderC1815g0.g(50L), String.class);
    }

    @Override // p131k5.InterfaceC2544n2
    public final String d() {
        C1912u0 c1912u0 = this.f45232a;
        BinderC1815g0 binderC1815g0 = new BinderC1815g0();
        c1912u0.e(new G0(c1912u0, binderC1815g0));
        return (String) BinderC1815g0.b0(binderC1815g0.g(500L), String.class);
    }

    @Override // p131k5.InterfaceC2544n2
    public final int e(String str) {
        return this.f45232a.a(str);
    }

    @Override // p131k5.InterfaceC2544n2
    public final void f(Bundle bundle) {
        C1912u0 c1912u0 = this.f45232a;
        c1912u0.e(new C1919v0(c1912u0, bundle));
    }

    @Override // p131k5.InterfaceC2544n2
    public final void g(String str) {
        C1912u0 c1912u0 = this.f45232a;
        c1912u0.e(new D0(c1912u0, str));
    }

    @Override // p131k5.InterfaceC2544n2
    public final String h() {
        C1912u0 c1912u0 = this.f45232a;
        BinderC1815g0 binderC1815g0 = new BinderC1815g0();
        c1912u0.e(new H0(c1912u0, binderC1815g0));
        return (String) BinderC1815g0.b0(binderC1815g0.g(500L), String.class);
    }

    @Override // p131k5.InterfaceC2544n2
    public final List<Bundle> i(String str, String str2) {
        return this.f45232a.c(str, str2);
    }

    @Override // p131k5.InterfaceC2544n2
    public final Map<String, Object> j(String str, String str2, boolean z10) {
        return this.f45232a.d(str, str2, z10);
    }

    @Override // p131k5.InterfaceC2544n2
    public final void k(Bundle bundle, String str, String str2) {
        C1912u0 c1912u0 = this.f45232a;
        c1912u0.e(new O0(c1912u0, str, str2, bundle, true));
    }
}
