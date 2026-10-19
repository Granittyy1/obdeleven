package p304y9;

import Ya.k;
import Za.a;
import kotlin.jvm.internal.i;
import kotlinx.serialization.UnknownFieldException;
import p011ab.e;
import p024bb.c;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p293xa.d;

/* JADX INFO: renamed from: y9.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AclDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class C2822a {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f48544a;

    /* JADX INFO: renamed from: y9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AclDTO.kt */
    @d
    public static final class C0559a implements D<C2822a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0559a f48545a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            C0559a c0559a = new C0559a();
            f48545a = c0559a;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.AclDTO", c0559a, 1);
            c1536l0.k("*", true);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            return new Ya.b[]{a.c(A.a.f48429a)};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            A a10 = null;
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
                    a10 = (A) aVarA.d(c1536l0, 0, A.a.f48429a, a10);
                    i10 = 1;
                }
            }
            aVarA.c(c1536l0);
            return new C2822a(i10, a10);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            C2822a value = (C2822a) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            b bVar = C2822a.Companion;
            boolean zV = bVarA.v(c1536l0);
            A a10 = value.f48544a;
            if (zV || a10 != null) {
                bVarA.q(c1536l0, 0, A.a.f48429a, a10);
            }
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: renamed from: y9.a$b */
    /* JADX INFO: compiled from: AclDTO.kt */
    public static final class b {
        public final Ya.b<C2822a> serializer() {
            return C0559a.f48545a;
        }
    }

    public C2822a() {
        this.f48544a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2822a) && i.a(this.f48544a, ((C2822a) obj).f48544a);
    }

    public final int hashCode() {
        A a10 = this.f48544a;
        if (a10 == null) {
            return 0;
        }
        return a10.hashCode();
    }

    public final String toString() {
        return "AclDTO(all=" + this.f48544a + ")";
    }

    @d
    public /* synthetic */ C2822a(int i10, A a10) {
        if ((i10 & 1) == 0) {
            this.f48544a = null;
        } else {
            this.f48544a = a10;
        }
    }
}
