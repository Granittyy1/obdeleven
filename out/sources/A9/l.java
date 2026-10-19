package A9;

import kotlinx.serialization.UnknownFieldException;
import p037cb.C1536l0;
import p037cb.D;

/* JADX INFO: compiled from: ParseResultWrapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Ya.k
public final class l<T> {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1536l0 f1019b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k<T> f1020a;

    /* JADX INFO: compiled from: ParseResultWrapper.kt */
    @p293xa.d
    public static final class a<T> implements D<l<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ya.b<?> f1021a;
        private final /* synthetic */ C1536l0 descriptor;

        @p293xa.d
        public a(Ya.b typeSerial0) {
            kotlin.jvm.internal.i.e(typeSerial0, "typeSerial0");
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.responses.ParseResultWrapper", this, 1);
            c1536l0.k("result", false);
            this.descriptor = c1536l0;
            this.f1021a = typeSerial0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            return new Ya.b[]{k.Companion.serializer(this.f1021a)};
        }

        @Override // Ya.a
        public final Object deserialize(p024bb.c cVar) {
            C1536l0 c1536l0 = this.descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            k kVar = null;
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
                    kVar = (k) aVarA.e(c1536l0, 0, k.Companion.serializer(this.f1021a), kVar);
                    i10 = 1;
                }
            }
            aVarA.c(c1536l0);
            return new l(i10, kVar);
        }

        @Override // Ya.l, Ya.a
        public final p011ab.e getDescriptor() {
            return this.descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            l value = (l) obj;
            kotlin.jvm.internal.i.e(value, "value");
            C1536l0 c1536l0 = this.descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            b bVar = l.Companion;
            bVarA.s(c1536l0, 0, k.Companion.serializer(this.f1021a), value.f1020a);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return new Ya.b[]{this.f1021a};
        }
    }

    /* JADX INFO: compiled from: ParseResultWrapper.kt */
    public static final class b {
        public final <T0> Ya.b<l<T0>> serializer(Ya.b<T0> typeSerial0) {
            kotlin.jvm.internal.i.e(typeSerial0, "typeSerial0");
            return new a(typeSerial0);
        }
    }

    static {
        C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.responses.ParseResultWrapper", null, 1);
        c1536l0.k("result", false);
        f1019b = c1536l0;
    }

    @p293xa.d
    public /* synthetic */ l(int i10, k kVar) {
        if (1 == (i10 & 1)) {
            this.f1020a = kVar;
        } else {
            p241t7.b.w(i10, 1, f1019b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && kotlin.jvm.internal.i.a(this.f1020a, ((l) obj).f1020a);
    }

    public final int hashCode() {
        return this.f1020a.hashCode();
    }

    public final String toString() {
        return "ParseResultWrapper(result=" + this.f1020a + ")";
    }
}
