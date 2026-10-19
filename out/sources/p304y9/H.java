package p304y9;

import Ya.k;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlinx.serialization.UnknownFieldException;
import p005a4.p;
import p011ab.e;
import p024bb.c;
import p037cb.C1521e;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.y0;
import p293xa.d;

/* JADX INFO: compiled from: SubscriptionProductDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class H {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Ya.b<Object>[] f48482f = {null, null, new C1521e(y0.f22677a), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<String> f48485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f48487e;

    /* JADX INFO: compiled from: SubscriptionProductDTO.kt */
    @d
    public static final class a implements D<H> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48488a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48488a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.TranslationsDTO", aVar, 5);
            c1536l0.k("title", false);
            c1536l0.k("subtitle", false);
            c1536l0.k("bulletPoints", false);
            c1536l0.k("subscriptionDuration", false);
            c1536l0.k("action", false);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            Ya.b<?> bVar = H.f48482f[2];
            y0 y0Var = y0.f22677a;
            return new Ya.b[]{y0Var, y0Var, bVar, y0Var, y0Var};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            Ya.b<Object>[] bVarArr = H.f48482f;
            int i10 = 0;
            String strJ = null;
            String strJ2 = null;
            List list = null;
            String strJ3 = null;
            String strJ4 = null;
            boolean z10 = true;
            while (z10) {
                int iO = aVarA.o(c1536l0);
                if (iO == -1) {
                    z10 = false;
                } else if (iO == 0) {
                    strJ = aVarA.j(c1536l0, 0);
                    i10 |= 1;
                } else if (iO == 1) {
                    strJ2 = aVarA.j(c1536l0, 1);
                    i10 |= 2;
                } else if (iO == 2) {
                    list = (List) aVarA.e(c1536l0, 2, bVarArr[2], list);
                    i10 |= 4;
                } else if (iO == 3) {
                    strJ3 = aVarA.j(c1536l0, 3);
                    i10 |= 8;
                } else {
                    if (iO != 4) {
                        throw new UnknownFieldException(iO);
                    }
                    strJ4 = aVarA.j(c1536l0, 4);
                    i10 |= 16;
                }
            }
            aVarA.c(c1536l0);
            return new H(i10, strJ, strJ2, list, strJ3, strJ4);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            H value = (H) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.p(c1536l0, 0, value.f48483a);
            bVarA.p(c1536l0, 1, value.f48484b);
            bVarA.s(c1536l0, 2, H.f48482f[2], value.f48485c);
            bVarA.p(c1536l0, 3, value.f48486d);
            bVarA.p(c1536l0, 4, value.f48487e);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: SubscriptionProductDTO.kt */
    public static final class b {
        public final Ya.b<H> serializer() {
            return a.f48488a;
        }
    }

    @d
    public /* synthetic */ H(int i10, String str, String str2, List list, String str3, String str4) {
        if (31 != (i10 & 31)) {
            p241t7.b.w(i10, 31, a.f48488a.getDescriptor());
            throw null;
        }
        this.f48483a = str;
        this.f48484b = str2;
        this.f48485c = list;
        this.f48486d = str3;
        this.f48487e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h8 = (H) obj;
        return i.a(this.f48483a, h8.f48483a) && i.a(this.f48484b, h8.f48484b) && i.a(this.f48485c, h8.f48485c) && i.a(this.f48486d, h8.f48486d) && i.a(this.f48487e, h8.f48487e);
    }

    public final int hashCode() {
        return this.f48487e.hashCode() + B1.a.b(this.f48486d, p.d(B1.a.b(this.f48484b, this.f48483a.hashCode() * 31, 31), 31, this.f48485c), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TranslationsDTO(title=");
        sb2.append(this.f48483a);
        sb2.append(", subtitle=");
        sb2.append(this.f48484b);
        sb2.append(", bulletPoints=");
        sb2.append(this.f48485c);
        sb2.append(", subscriptionDuration=");
        sb2.append(this.f48486d);
        sb2.append(", action=");
        return Q8.d.a(sb2, this.f48487e, ")");
    }
}
