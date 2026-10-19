package A9;

import kotlinx.serialization.UnknownFieldException;
import p037cb.C1536l0;
import p037cb.D;
import p037cb.I;
import p037cb.y0;

/* JADX INFO: compiled from: ParseDataWrapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Ya.k
public final class k<T> {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1536l0 f1014d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f1015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1017c;

    /* JADX INFO: compiled from: ParseDataWrapper.kt */
    @p293xa.d
    public static final class a<T> implements D<k<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ya.b<?> f1018a;
        private final /* synthetic */ C1536l0 descriptor;

        @p293xa.d
        public a(Ya.b typeSerial0) {
            kotlin.jvm.internal.i.e(typeSerial0, "typeSerial0");
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.responses.ParseDataWrapper", this, 3);
            c1536l0.k("data", true);
            c1536l0.k("message", true);
            c1536l0.k("code", false);
            this.descriptor = c1536l0;
            this.f1018a = typeSerial0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            return new Ya.b[]{Za.a.c(this.f1018a), y0.f22677a, I.f22555a};
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ya.a
        public final Object deserialize(p024bb.c cVar) {
            C1536l0 c1536l0 = this.descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            Object objD = null;
            boolean z10 = true;
            String strJ = null;
            int i10 = 0;
            int iH = 0;
            while (z10) {
                int iO = aVarA.o(c1536l0);
                if (iO == -1) {
                    z10 = false;
                } else if (iO == 0) {
                    objD = aVarA.d(c1536l0, 0, this.f1018a, objD);
                    i10 |= 1;
                } else if (iO == 1) {
                    strJ = aVarA.j(c1536l0, 1);
                    i10 |= 2;
                } else {
                    if (iO != 2) {
                        throw new UnknownFieldException(iO);
                    }
                    iH = aVarA.h(c1536l0, 2);
                    i10 |= 4;
                }
            }
            aVarA.c(c1536l0);
            return new k(i10, iH, objD, strJ);
        }

        @Override // Ya.l, Ya.a
        public final p011ab.e getDescriptor() {
            return this.descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            k value = (k) obj;
            kotlin.jvm.internal.i.e(value, "value");
            C1536l0 c1536l0 = this.descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            b bVar = k.Companion;
            boolean zV = bVarA.v(c1536l0);
            T t8 = value.f1015a;
            if (zV || t8 != null) {
                bVarA.q(c1536l0, 0, this.f1018a, t8);
            }
            boolean zV2 = bVarA.v(c1536l0);
            String str = value.f1016b;
            if (zV2 || !kotlin.jvm.internal.i.a(str, "")) {
                bVarA.p(c1536l0, 1, str);
            }
            bVarA.g(2, value.f1017c, c1536l0);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return new Ya.b[]{this.f1018a};
        }
    }

    /* JADX INFO: compiled from: ParseDataWrapper.kt */
    public static final class b {
        public final <T0> Ya.b<k<T0>> serializer(Ya.b<T0> typeSerial0) {
            kotlin.jvm.internal.i.e(typeSerial0, "typeSerial0");
            return new a(typeSerial0);
        }
    }

    static {
        C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.responses.ParseDataWrapper", null, 3);
        c1536l0.k("data", true);
        c1536l0.k("message", true);
        c1536l0.k("code", false);
        f1014d = c1536l0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p293xa.d
    public /* synthetic */ k(int i10, int i11, Object obj, String str) {
        if (4 != (i10 & 4)) {
            p241t7.b.w(i10, 4, f1014d);
            throw null;
        }
        if ((i10 & 1) == 0) {
            this.f1015a = null;
        } else {
            this.f1015a = obj;
        }
        if ((i10 & 2) == 0) {
            this.f1016b = "";
        } else {
            this.f1016b = str;
        }
        this.f1017c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.i.a(this.f1015a, kVar.f1015a) && kotlin.jvm.internal.i.a(this.f1016b, kVar.f1016b) && this.f1017c == kVar.f1017c;
    }

    public final int hashCode() {
        T t8 = this.f1015a;
        return Integer.hashCode(this.f1017c) + B1.a.b(this.f1016b, (t8 == null ? 0 : t8.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParseDataWrapper(data=");
        sb2.append(this.f1015a);
        sb2.append(", message=");
        sb2.append(this.f1016b);
        sb2.append(", code=");
        return p005a4.q.c(sb2, this.f1017c, ")");
    }
}
