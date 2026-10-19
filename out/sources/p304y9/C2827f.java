package p304y9;

import Ya.k;
import kotlin.jvm.internal.i;
import kotlinx.serialization.UnknownFieldException;
import p011ab.e;
import p024bb.c;
import p037cb.C1536l0;
import p037cb.D;
import p037cb.I;
import p037cb.y0;
import p293xa.d;

/* JADX INFO: renamed from: y9.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ClassRequestResultDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class C2827f<T> {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1536l0 f48556d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f48557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f48559c;

    /* JADX INFO: renamed from: y9.f$a */
    /* JADX INFO: compiled from: ClassRequestResultDTO.kt */
    @d
    public static final class a<T> implements D<C2827f<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ya.b<?> f48560a;
        private final /* synthetic */ C1536l0 descriptor;

        @d
        public a(Ya.b typeSerial0) {
            i.e(typeSerial0, "typeSerial0");
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.ClassRequestResultDTO", this, 3);
            c1536l0.k("code", true);
            c1536l0.k("error", true);
            c1536l0.k("results", false);
            this.descriptor = c1536l0;
            this.f48560a = typeSerial0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            return new Ya.b[]{Za.a.c(I.f22555a), Za.a.c(y0.f22677a), this.f48560a};
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = this.descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            Integer num = null;
            boolean z10 = true;
            String str = null;
            Object objE = null;
            int i10 = 0;
            while (z10) {
                int iO = aVarA.o(c1536l0);
                if (iO == -1) {
                    z10 = false;
                } else if (iO == 0) {
                    num = (Integer) aVarA.d(c1536l0, 0, I.f22555a, num);
                    i10 |= 1;
                } else if (iO == 1) {
                    str = (String) aVarA.d(c1536l0, 1, y0.f22677a, str);
                    i10 |= 2;
                } else {
                    if (iO != 2) {
                        throw new UnknownFieldException(iO);
                    }
                    objE = aVarA.e(c1536l0, 2, this.f48560a, objE);
                    i10 |= 4;
                }
            }
            aVarA.c(c1536l0);
            return new C2827f(i10, num, str, objE);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return this.descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            C2827f value = (C2827f) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = this.descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            b bVar = C2827f.Companion;
            boolean zV = bVarA.v(c1536l0);
            Integer num = value.f48557a;
            if (zV || num != null) {
                bVarA.q(c1536l0, 0, I.f22555a, num);
            }
            boolean zV2 = bVarA.v(c1536l0);
            String str = value.f48558b;
            if (zV2 || str != null) {
                bVarA.q(c1536l0, 1, y0.f22677a, str);
            }
            bVarA.s(c1536l0, 2, this.f48560a, value.f48559c);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return new Ya.b[]{this.f48560a};
        }
    }

    /* JADX INFO: renamed from: y9.f$b */
    /* JADX INFO: compiled from: ClassRequestResultDTO.kt */
    public static final class b {
        public final <T0> Ya.b<C2827f<T0>> serializer(Ya.b<T0> typeSerial0) {
            i.e(typeSerial0, "typeSerial0");
            return new a(typeSerial0);
        }
    }

    static {
        C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.ClassRequestResultDTO", null, 3);
        c1536l0.k("code", true);
        c1536l0.k("error", true);
        c1536l0.k("results", false);
        f48556d = c1536l0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d
    public /* synthetic */ C2827f(int i10, Integer num, String str, Object obj) {
        if (4 != (i10 & 4)) {
            p241t7.b.w(i10, 4, f48556d);
            throw null;
        }
        if ((i10 & 1) == 0) {
            this.f48557a = null;
        } else {
            this.f48557a = num;
        }
        if ((i10 & 2) == 0) {
            this.f48558b = null;
        } else {
            this.f48558b = str;
        }
        this.f48559c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2827f)) {
            return false;
        }
        C2827f c2827f = (C2827f) obj;
        return i.a(this.f48557a, c2827f.f48557a) && i.a(this.f48558b, c2827f.f48558b) && i.a(this.f48559c, c2827f.f48559c);
    }

    public final int hashCode() {
        Integer num = this.f48557a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f48558b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        T t8 = this.f48559c;
        return iHashCode2 + (t8 != null ? t8.hashCode() : 0);
    }

    public final String toString() {
        return "ClassRequestResultDTO(code=" + this.f48557a + ", error=" + this.f48558b + ", results=" + this.f48559c + ")";
    }
}
