package p304y9;

import Ya.b;
import Ya.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlinx.serialization.UnknownFieldException;
import p011ab.e;
import p024bb.c;
import p037cb.C1521e;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.I;
import p293xa.d;

/* JADX INFO: renamed from: y9.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AgreementDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class C2823b {
    public static final C0560b Companion = new C0560b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b<Object>[] f48546b = {new C1521e(I.f22555a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Integer> f48547a;

    /* JADX INFO: renamed from: y9.b$a */
    /* JADX INFO: compiled from: AgreementDTO.kt */
    @d
    public static final class a implements D<C2823b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48548a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48548a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.AgreementDTO", aVar, 1);
            c1536l0.k("types", false);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final b<?>[] childSerializers() {
            return new b[]{C2823b.f48546b[0]};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            b<Object>[] bVarArr = C2823b.f48546b;
            List list = null;
            boolean z10 = true;
            int i10 = 0;
            while (z10) {
                int iO = aVarA.o(c1536l0);
                if (iO == -1) {
                    z10 = false;
                } else {
                    if (iO != 0) {
                        throw new UnknownFieldException(iO);
                    }
                    list = (List) aVarA.e(c1536l0, 0, bVarArr[0], list);
                    i10 = 1;
                }
            }
            aVarA.c(c1536l0);
            return new C2823b(i10, list);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            C2823b value = (C2823b) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.s(c1536l0, 0, C2823b.f48546b[0], value.f48547a);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: renamed from: y9.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AgreementDTO.kt */
    public static final class C0560b {
        public final b<C2823b> serializer() {
            return a.f48548a;
        }
    }

    @d
    public /* synthetic */ C2823b(int i10, List list) {
        if (1 == (i10 & 1)) {
            this.f48547a = list;
        } else {
            p241t7.b.w(i10, 1, a.f48548a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2823b) && i.a(this.f48547a, ((C2823b) obj).f48547a);
    }

    public final int hashCode() {
        return this.f48547a.hashCode();
    }

    public final String toString() {
        return "AgreementDTO(types=" + this.f48547a + ")";
    }

    public C2823b(ArrayList arrayList) {
        this.f48547a = arrayList;
    }
}
