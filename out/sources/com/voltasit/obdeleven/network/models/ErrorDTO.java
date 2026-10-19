package com.voltasit.obdeleven.network.models;

import Ia.l;
import Ya.k;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.i;
import kotlinx.serialization.UnknownFieldException;
import p005a4.q;
import p011ab.e;
import p024bb.c;
import p037cb.C1521e;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.I;
import p037cb.y0;
import p293xa.d;

/* JADX INFO: compiled from: ErrorDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class ErrorDTO {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f31191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<com.voltasit.obdeleven.network.models.a> f31192e;

    /* JADX INFO: compiled from: ErrorDTO.kt */
    @d
    public static final class a implements D<ErrorDTO> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31193a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f31193a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.obdeleven.network.models.ErrorDTO", aVar, 5);
            c1536l0.k("message", false);
            c1536l0.k("path", false);
            c1536l0.k("statusCode", false);
            c1536l0.k("timeStamp", false);
            c1536l0.k("fields", true);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            C1521e c1521e = new C1521e(com.voltasit.obdeleven.network.models.a.C0325a.f31197a);
            y0 y0Var = y0.f22677a;
            return new Ya.b[]{y0Var, y0Var, I.f22555a, y0Var, c1521e};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            Object objE = null;
            boolean z10 = true;
            String strJ = null;
            String strJ2 = null;
            String strJ3 = null;
            int i10 = 0;
            int iH = 0;
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
                    iH = aVarA.h(c1536l0, 2);
                    i10 |= 4;
                } else if (iO == 3) {
                    strJ3 = aVarA.j(c1536l0, 3);
                    i10 |= 8;
                } else {
                    if (iO != 4) {
                        throw new UnknownFieldException(iO);
                    }
                    objE = aVarA.e(c1536l0, 4, new C1521e(com.voltasit.obdeleven.network.models.a.C0325a.f31197a), objE);
                    i10 |= 16;
                }
            }
            aVarA.c(c1536l0);
            return new ErrorDTO(i10, strJ, strJ2, iH, strJ3, (List) objE);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            ErrorDTO value = (ErrorDTO) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            b bVar = ErrorDTO.Companion;
            bVarA.p(c1536l0, 0, value.f31188a);
            bVarA.p(c1536l0, 1, value.f31189b);
            bVarA.g(2, value.f31190c, c1536l0);
            bVarA.p(c1536l0, 3, value.f31191d);
            boolean zV = bVarA.v(c1536l0);
            List<com.voltasit.obdeleven.network.models.a> list = value.f31192e;
            if (zV || !i.a(list, EmptyList.f42983b)) {
                bVarA.s(c1536l0, 4, new C1521e(com.voltasit.obdeleven.network.models.a.C0325a.f31197a), list);
            }
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: ErrorDTO.kt */
    public static final class b {
        public final Ya.b<ErrorDTO> serializer() {
            return a.f31193a;
        }
    }

    @d
    public ErrorDTO(int i10, String str, String str2, int i11, String str3, List list) {
        if (15 != (i10 & 15)) {
            p241t7.b.w(i10, 15, a.f31193a.getDescriptor());
            throw null;
        }
        this.f31188a = str;
        this.f31189b = str2;
        this.f31190c = i11;
        this.f31191d = str3;
        if ((i10 & 16) == 0) {
            this.f31192e = EmptyList.f42983b;
        } else {
            this.f31192e = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorDTO)) {
            return false;
        }
        ErrorDTO errorDTO = (ErrorDTO) obj;
        return i.a(this.f31188a, errorDTO.f31188a) && i.a(this.f31189b, errorDTO.f31189b) && this.f31190c == errorDTO.f31190c && i.a(this.f31191d, errorDTO.f31191d) && i.a(this.f31192e, errorDTO.f31192e);
    }

    public final int hashCode() {
        return this.f31192e.hashCode() + B1.a.b(this.f31191d, q.b(this.f31190c, B1.a.b(this.f31189b, this.f31188a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return this.f31188a + ". " + kotlin.collections.q.U(this.f31192e, ". ", null, null, new l<com.voltasit.obdeleven.network.models.a, CharSequence>() { // from class: com.voltasit.obdeleven.network.models.ErrorDTO$toString$errors$1
            @Override // Ia.l
            public final CharSequence invoke(a aVar) {
                a it = aVar;
                i.e(it, "it");
                return kotlin.collections.q.U(it.f31196b, ", ", null, null, null, 62);
            }
        }, 30);
    }
}
