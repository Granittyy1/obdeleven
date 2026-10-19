package C;

import androidx.compose.runtime.D0;
import androidx.compose.runtime.InterfaceC1078c;
import java.util.Arrays;

/* JADX INFO: compiled from: Operations.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2271d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2273f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2275h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d[] f2270c = new d[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f2272e = new int[16];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object[] f2274g = new Object[16];

    /* JADX INFO: compiled from: Operations.kt */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2278c;

        public a() {
        }

        public final int a(int i10) {
            return f.this.f2272e[this.f2277b + i10];
        }

        public final <T> T b(int i10) {
            return (T) f.this.f2274g[this.f2278c + i10];
        }
    }

    /* JADX INFO: compiled from: Operations.kt */
    @Ha.a
    public static final class b {
        public static final <T> void a(f fVar, int i10, T t8) {
            fVar.f2274g[(fVar.f2275h - fVar.f2270c[fVar.f2271d - 1].f2234b) + i10] = t8;
        }

        public static final <T, U> void b(f fVar, int i10, T t8, int i11, U u10) {
            int i12 = fVar.f2275h - fVar.f2270c[fVar.f2271d - 1].f2234b;
            Object[] objArr = fVar.f2274g;
            objArr[i10 + i12] = t8;
            objArr[i12 + i11] = u10;
        }

        public static final void c(f fVar, Object obj, Object obj2, Object obj3) {
            int i10 = fVar.f2275h - fVar.f2270c[fVar.f2271d - 1].f2234b;
            Object[] objArr = fVar.f2274g;
            objArr[i10] = obj;
            objArr[i10 + 1] = obj2;
            objArr[i10 + 2] = obj3;
        }
    }

    public final void i0() {
        this.f2271d = 0;
        this.f2273f = 0;
        Arrays.fill(this.f2274g, 0, this.f2275h, (Object) null);
        this.f2275h = 0;
    }

    public final void j0(InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
        int i10;
        int i11;
        if (l0()) {
            a aVar = new a();
            do {
                f fVar = f.this;
                fVar.f2270c[aVar.f2276a].a(aVar, interfaceC1078c, d10, eVar);
                int i12 = aVar.f2276a;
                i10 = fVar.f2271d;
                if (i12 >= i10) {
                    break;
                }
                d dVar = fVar.f2270c[i12];
                aVar.f2277b += dVar.f2233a;
                aVar.f2278c += dVar.f2234b;
                i11 = i12 + 1;
                aVar.f2276a = i11;
            } while (i11 < i10);
        }
        i0();
    }

    public final boolean k0() {
        return this.f2271d == 0;
    }

    public final boolean l0() {
        return this.f2271d != 0;
    }

    public final void m0(d dVar) {
        int i10 = this.f2271d;
        d[] dVarArr = this.f2270c;
        if (i10 == dVarArr.length) {
            d[] dVarArr2 = new d[(i10 > 1024 ? 1024 : i10) + i10];
            System.arraycopy(dVarArr, 0, dVarArr2, 0, i10);
            this.f2270c = dVarArr2;
        }
        int i11 = this.f2273f + dVar.f2233a;
        int[] iArr = this.f2272e;
        int length = iArr.length;
        if (i11 > length) {
            int i12 = (length > 1024 ? 1024 : length) + length;
            if (i12 >= i11) {
                i11 = i12;
            }
            int[] iArr2 = new int[i11];
            Q3.d.m(0, 0, length, iArr, iArr2);
            this.f2272e = iArr2;
        }
        int i13 = this.f2275h;
        int i14 = dVar.f2234b;
        int i15 = i13 + i14;
        Object[] objArr = this.f2274g;
        int length2 = objArr.length;
        if (i15 > length2) {
            int i16 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i16 >= i15) {
                i15 = i16;
            }
            Object[] objArr2 = new Object[i15];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.f2274g = objArr2;
        }
        d[] dVarArr3 = this.f2270c;
        int i17 = this.f2271d;
        this.f2271d = i17 + 1;
        dVarArr3[i17] = dVar;
        this.f2273f += dVar.f2233a;
        this.f2275h += i14;
    }
}
