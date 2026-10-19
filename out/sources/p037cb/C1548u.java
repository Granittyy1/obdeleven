package p037cb;

import Ya.b;
import com.google.android.gms.internal.measurement.C1787c0;
import kotlin.jvm.internal.i;
import kotlin.time.DurationUnit;
import p011ab.d;
import p011ab.e;
import p024bb.c;

/* JADX INFO: renamed from: cb.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: BuiltInSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C1548u implements b<Pa.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1548u f22658a = new C1548u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f22659b = new q0("kotlin.time.Duration", d.i.f8102a);

    @Override // Ya.a
    public final Object deserialize(c cVar) {
        int i10 = Pa.b.f4973e;
        String value = cVar.n();
        i.e(value, "value");
        try {
            return new Pa.b(C1787c0.b(value));
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(androidx.compose.foundation.gestures.d.b("Invalid ISO duration string format: '", value, "'."), e10);
        }
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return f22659b;
    }

    @Override // Ya.l
    public final void serialize(p024bb.d dVar, Object obj) {
        long j = ((Pa.b) obj).f4974b;
        int i10 = Pa.b.f4973e;
        StringBuilder sb2 = new StringBuilder();
        if (Pa.b.f(j)) {
            sb2.append('-');
        }
        sb2.append("PT");
        long jK = Pa.b.f(j) ? Pa.b.k(j) : j;
        long jI = Pa.b.i(jK, DurationUnit.HOURS);
        boolean z10 = false;
        int i11 = Pa.b.e(jK) ? 0 : (int) (Pa.b.i(jK, DurationUnit.MINUTES) % ((long) 60));
        int i12 = Pa.b.e(jK) ? 0 : (int) (Pa.b.i(jK, DurationUnit.SECONDS) % ((long) 60));
        int iD = Pa.b.d(jK);
        if (Pa.b.e(j)) {
            jI = 9999999999999L;
        }
        boolean z11 = jI != 0;
        boolean z12 = (i12 == 0 && iD == 0) ? false : true;
        if (i11 != 0 || (z12 && z11)) {
            z10 = true;
        }
        if (z11) {
            sb2.append(jI);
            sb2.append('H');
        }
        if (z10) {
            sb2.append(i11);
            sb2.append('M');
        }
        if (z12 || (!z11 && !z10)) {
            Pa.b.b(sb2, i12, iD, 9, "S", true);
        }
        String string = sb2.toString();
        i.d(string, "toString(...)");
        dVar.C(string);
    }
}
