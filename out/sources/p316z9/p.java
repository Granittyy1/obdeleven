package p316z9;

import Ya.k;
import kotlin.jvm.internal.i;
import kotlinx.serialization.UnknownFieldException;
import p011ab.e;
import p024bb.c;
import p037cb.C1536l0;
import p037cb.D;
import p293xa.d;

/* JADX INFO: compiled from: UpdateAuthDataRequestDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class p<T> {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1536l0 f49008b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f49009a;

    /* JADX INFO: compiled from: UpdateAuthDataRequestDTO.kt */
    @d
    public static final class a<T> implements D<p<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ya.b<?> f49010a;
        private final /* synthetic */ C1536l0 descriptor;

        @d
        public a(Ya.b typeSerial0) {
            i.e(typeSerial0, "typeSerial0");
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.requests.UpdateAuthDataRequestDTO", this, 1);
            c1536l0.k("authData", false);
            this.descriptor = c1536l0;
            this.f49010a = typeSerial0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            return new Ya.b[]{this.f49010a};
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = this.descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            Object objE = null;
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
                    objE = aVarA.e(c1536l0, 0, this.f49010a, objE);
                    i10 = 1;
                }
            }
            aVarA.c(c1536l0);
            return new p(i10, objE);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return this.descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            p value = (p) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = this.descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            bVarA.s(c1536l0, 0, this.f49010a, value.f49009a);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return new Ya.b[]{this.f49010a};
        }
    }

    /* JADX INFO: compiled from: UpdateAuthDataRequestDTO.kt */
    public static final class b {
        public final <T0> Ya.b<p<T0>> serializer(Ya.b<T0> typeSerial0) {
            i.e(typeSerial0, "typeSerial0");
            return new a(typeSerial0);
        }
    }

    static {
        C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.requests.UpdateAuthDataRequestDTO", null, 1);
        c1536l0.k("authData", false);
        f49008b = c1536l0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d
    public /* synthetic */ p(int i10, Object obj) {
        if (1 == (i10 & 1)) {
            this.f49009a = obj;
        } else {
            p241t7.b.w(i10, 1, f49008b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && i.a(this.f49009a, ((p) obj).f49009a);
    }

    public final int hashCode() {
        T t8 = this.f49009a;
        if (t8 == null) {
            return 0;
        }
        return t8.hashCode();
    }

    public final String toString() {
        return "UpdateAuthDataRequestDTO(authData=" + this.f49009a + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(f fVar) {
        this.f49009a = fVar;
    }
}
