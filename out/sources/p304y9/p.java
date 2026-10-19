package p304y9;

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

/* JADX INFO: compiled from: InfoDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class p {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Ya.b<Object>[] f48609b = {new C1521e(y0.f22677a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f48610a;

    /* JADX INFO: compiled from: InfoDTO.kt */
    @d
    public static final class a implements D<p> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48611a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48611a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.InfoDTO", aVar, 1);
            c1536l0.k("platform", true);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            return new Ya.b[]{p.f48609b[0]};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            Ya.b<Object>[] bVarArr = p.f48609b;
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
            return new p(i10, list);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            p value = (p) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            b bVar = p.Companion;
            boolean zV = bVarA.v(c1536l0);
            List<String> list = value.f48610a;
            if (zV || !i.a(list, EmptyList.f42983b)) {
                bVarA.s(c1536l0, 0, p.f48609b[0], list);
            }
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: InfoDTO.kt */
    public static final class b {
        public final Ya.b<p> serializer() {
            return a.f48611a;
        }
    }

    @d
    public p(int i10, List list) {
        if ((i10 & 1) == 0) {
            this.f48610a = EmptyList.f42983b;
        } else {
            this.f48610a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && i.a(this.f48610a, ((p) obj).f48610a);
    }

    public final int hashCode() {
        return this.f48610a.hashCode();
    }

    public final String toString() {
        return "InfoDTO(platform=" + this.f48610a + ")";
    }

    public p() {
        EmptyList platform = EmptyList.f42983b;
        i.e(platform, "platform");
        this.f48610a = platform;
    }
}
