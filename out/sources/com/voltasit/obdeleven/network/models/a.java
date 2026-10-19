package com.voltasit.obdeleven.network.models;

import Ya.k;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.i;
import kotlinx.serialization.UnknownFieldException;
import p011ab.e;
import p024bb.c;
import p037cb.C1521e;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.y0;
import p293xa.d;

/* JADX INFO: compiled from: ErrorFieldDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class a {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f31196b;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.network.models.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ErrorFieldDTO.kt */
    @d
    public static final class C0325a implements D<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0325a f31197a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            C0325a c0325a = new C0325a();
            f31197a = c0325a;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.obdeleven.network.models.ErrorFieldDTO", c0325a, 2);
            c1536l0.k("name", false);
            c1536l0.k("errors", true);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            y0 y0Var = y0.f22677a;
            return new Ya.b[]{y0Var, new C1521e(y0Var)};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            String strJ = null;
            boolean z10 = true;
            Object objE = null;
            int i10 = 0;
            while (z10) {
                int iO = aVarA.o(c1536l0);
                if (iO == -1) {
                    z10 = false;
                } else if (iO == 0) {
                    strJ = aVarA.j(c1536l0, 0);
                    i10 |= 1;
                } else {
                    if (iO != 1) {
                        throw new UnknownFieldException(iO);
                    }
                    objE = aVarA.e(c1536l0, 1, new C1521e(y0.f22677a), objE);
                    i10 |= 2;
                }
            }
            aVarA.c(c1536l0);
            return new a(i10, strJ, (List) objE);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            a value = (a) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            b bVar = a.Companion;
            bVarA.p(c1536l0, 0, value.f31195a);
            boolean zV = bVarA.v(c1536l0);
            List<String> list = value.f31196b;
            if (zV || !i.a(list, EmptyList.f42983b)) {
                bVarA.s(c1536l0, 1, new C1521e(y0.f22677a), list);
            }
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: ErrorFieldDTO.kt */
    public static final class b {
        public final Ya.b<a> serializer() {
            return C0325a.f31197a;
        }
    }

    @d
    public a(int i10, String str, List list) {
        if (1 != (i10 & 1)) {
            p241t7.b.w(i10, 1, C0325a.f31197a.getDescriptor());
            throw null;
        }
        this.f31195a = str;
        if ((i10 & 2) == 0) {
            this.f31196b = EmptyList.f42983b;
        } else {
            this.f31196b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.f31195a, aVar.f31195a) && i.a(this.f31196b, aVar.f31196b);
    }

    public final int hashCode() {
        return this.f31196b.hashCode() + (this.f31195a.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorFieldDTO(name=" + this.f31195a + ", errors=" + this.f31196b + ")";
    }
}
