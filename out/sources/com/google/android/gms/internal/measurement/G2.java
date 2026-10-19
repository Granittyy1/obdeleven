package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.I2;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class G2<T extends I2<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final G2 f25456d = new G2(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I3 f25457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f25458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25459c;

    public G2() {
        this.f25457a = new I3(16);
    }

    public static int a(I2<?> i10, Object obj) {
        i10.x();
        throw null;
    }

    public static int b(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        entry.getValue();
        key.y();
        throw null;
    }

    public static <T extends I2<T>> boolean d(Map.Entry<T, Object> entry) {
        entry.getKey().y();
        throw null;
    }

    public final void c(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        boolean z10 = entry.getValue() instanceof X2;
        key.z();
        throw null;
    }

    public final Object clone() throws CloneNotSupportedException {
        G2 g10 = new G2();
        I3 i10 = this.f25457a;
        if (i10.f25444c.size() > 0) {
            Map.Entry entryF = i10.f(0);
            I2 i11 = (I2) entryF.getKey();
            entryF.getValue();
            i11.z();
            throw null;
        }
        Iterator it = i10.e().iterator();
        if (!it.hasNext()) {
            g10.f25459c = this.f25459c;
            return g10;
        }
        Map.Entry entry = (Map.Entry) it.next();
        I2 i12 = (I2) entry.getKey();
        entry.getValue();
        i12.z();
        throw null;
    }

    public final Iterator<Map.Entry<T, Object>> e() {
        boolean z10 = this.f25459c;
        I3 i10 = this.f25457a;
        if (!z10) {
            return ((O3) i10.entrySet()).iterator();
        }
        Iterator it = ((O3) i10.entrySet()).iterator();
        Y2 y10 = new Y2();
        y10.f25645b = it;
        return y10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof G2) {
            return this.f25457a.equals(((G2) obj).f25457a);
        }
        return false;
    }

    public final void f() {
        if (this.f25458b) {
            return;
        }
        int i10 = 0;
        while (true) {
            I3 i11 = this.f25457a;
            if (i10 >= i11.f25444c.size()) {
                i11.j();
                this.f25458b = true;
                return;
            } else {
                Map.Entry entryF = i11.f(i10);
                if (entryF.getValue() instanceof N2) {
                    ((N2) entryF.getValue()).s();
                }
                i10++;
            }
        }
    }

    public final boolean g() {
        I3 i10 = this.f25457a;
        if (i10.f25444c.size() > 0) {
            d(i10.f(0));
            throw null;
        }
        Iterator it = i10.e().iterator();
        if (!it.hasNext()) {
            return true;
        }
        d((Map.Entry) it.next());
        throw null;
    }

    public final int hashCode() {
        return this.f25457a.hashCode();
    }

    public G2(Object obj) {
        int i10 = F3.f25442h;
        this.f25457a = new I3(0);
        f();
        f();
    }
}
