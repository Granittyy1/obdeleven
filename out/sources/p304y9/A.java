package p304y9;

import Ya.k;
import kotlin.jvm.internal.i;
import kotlinx.serialization.UnknownFieldException;
import p011ab.e;
import p024bb.c;
import p037cb.C1527h;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p293xa.d;

/* JADX INFO: compiled from: ReadWritePermissionDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class A {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f48427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f48428b;

    /* JADX INFO: compiled from: ReadWritePermissionDTO.kt */
    @d
    public static final class a implements D<A> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48429a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48429a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.ReadWritePermissionDTO", aVar, 2);
            c1536l0.k("read", true);
            c1536l0.k("write", true);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            C1527h c1527h = C1527h.f22612a;
            return new Ya.b[]{Za.a.c(c1527h), Za.a.c(c1527h)};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            Boolean bool = null;
            boolean z10 = true;
            Boolean bool2 = null;
            int i10 = 0;
            while (z10) {
                int iO = aVarA.o(c1536l0);
                if (iO == -1) {
                    z10 = false;
                } else if (iO == 0) {
                    bool = (Boolean) aVarA.d(c1536l0, 0, C1527h.f22612a, bool);
                    i10 |= 1;
                } else {
                    if (iO != 1) {
                        throw new UnknownFieldException(iO);
                    }
                    bool2 = (Boolean) aVarA.d(c1536l0, 1, C1527h.f22612a, bool2);
                    i10 |= 2;
                }
            }
            aVarA.c(c1536l0);
            return new A(i10, bool, bool2);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            A value = (A) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            b bVar = A.Companion;
            boolean zV = bVarA.v(c1536l0);
            Boolean bool = value.f48427a;
            if (zV || bool != null) {
                bVarA.q(c1536l0, 0, C1527h.f22612a, bool);
            }
            boolean zV2 = bVarA.v(c1536l0);
            Boolean bool2 = value.f48428b;
            if (zV2 || bool2 != null) {
                bVarA.q(c1536l0, 1, C1527h.f22612a, bool2);
            }
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: ReadWritePermissionDTO.kt */
    public static final class b {
        public final Ya.b<A> serializer() {
            return a.f48429a;
        }
    }

    public A() {
        this.f48427a = null;
        this.f48428b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        return i.a(this.f48427a, a10.f48427a) && i.a(this.f48428b, a10.f48428b);
    }

    public final int hashCode() {
        Boolean bool = this.f48427a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f48428b;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "ReadWritePermissionDTO(read=" + this.f48427a + ", write=" + this.f48428b + ")";
    }

    @d
    public /* synthetic */ A(int i10, Boolean bool, Boolean bool2) {
        if ((i10 & 1) == 0) {
            this.f48427a = null;
        } else {
            this.f48427a = bool;
        }
        if ((i10 & 2) == 0) {
            this.f48428b = null;
        } else {
            this.f48428b = bool2;
        }
    }
}
