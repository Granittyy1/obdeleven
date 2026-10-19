package androidx.compose.runtime;

import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.compose.runtime.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1087g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f13031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f13034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.collection.B<F> f13035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p293xa.g f13036f;

    public C1087g0(int i10, ArrayList arrayList) {
        this.f13031a = arrayList;
        this.f13032b = i10;
        if (i10 < 0) {
            C1091i0.a("Invalid start index");
        }
        this.f13034d = new ArrayList();
        androidx.collection.B<F> b10 = new androidx.collection.B<>();
        int size = arrayList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            K k10 = (K) this.f13031a.get(i12);
            int i13 = k10.f12861c;
            int i14 = k10.f12862d;
            b10.h(i13, new F(i12, i11, i14));
            i11 += i14;
        }
        this.f13035e = b10;
        this.f13036f = kotlin.a.a(new Ia.a<androidx.compose.runtime.collection.b<Object, K>>() { // from class: androidx.compose.runtime.Pending$keyMap$2
            {
                super(0);
            }

            @Override // Ia.a
            public final androidx.compose.runtime.collection.b<Object, K> invoke() {
                androidx.collection.K k11 = new androidx.collection.K(this.this$0.f13031a.size());
                C1087g0 c1087g0 = this.this$0;
                int size2 = c1087g0.f13031a.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    K k12 = (K) c1087g0.f13031a.get(i15);
                    Object obj = k12.f12860b;
                    int i16 = k12.f12859a;
                    androidx.compose.runtime.collection.b.a(k11, obj != null ? new J(Integer.valueOf(i16), k12.f12860b) : Integer.valueOf(i16), k12);
                }
                return new androidx.compose.runtime.collection.b<>(k11);
            }
        });
    }

    public final boolean a(int i10, int i11) {
        int i12;
        androidx.collection.B<F> b10 = this.f13035e;
        F fB = b10.b(i10);
        if (fB == null) {
            return false;
        }
        int i13 = fB.f12835b;
        int i14 = i11 - fB.f12836c;
        fB.f12836c = i11;
        if (i14 == 0) {
            return true;
        }
        Object[] objArr = b10.f9188c;
        long[] jArr = b10.f9186a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i15 = 0;
        while (true) {
            long j = jArr[i15];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j) < 128) {
                        F f10 = (F) objArr[(i15 << 3) + i17];
                        if (f10.f12835b >= i13 && !f10.equals(fB) && (i12 = f10.f12835b + i14) >= 0) {
                            f10.f12835b = i12;
                        }
                    }
                    j >>= 8;
                }
                if (i16 != 8) {
                    return true;
                }
            }
            if (i15 == length) {
                return true;
            }
            i15++;
        }
    }
}
