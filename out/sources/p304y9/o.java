package p304y9;

import Ya.k;
import kotlin.jvm.internal.i;
import kotlinx.serialization.UnknownFieldException;
import p011ab.e;
import p024bb.c;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.y0;
import p293xa.d;

/* JADX INFO: compiled from: HiddenTextIdDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class o {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48607a;

    /* JADX INFO: compiled from: HiddenTextIdDTO.kt */
    @d
    public static final class a implements D<o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48608a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48608a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.HiddenTextIdDTO", aVar, 1);
            c1536l0.k("textId", true);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            return new Ya.b[]{Za.a.c(y0.f22677a)};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            String str = null;
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
                    str = (String) aVarA.d(c1536l0, 0, y0.f22677a, str);
                    i10 = 1;
                }
            }
            aVarA.c(c1536l0);
            return new o(i10, str);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            o value = (o) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            b bVar = o.Companion;
            boolean zV = bVarA.v(c1536l0);
            String str = value.f48607a;
            if (zV || str != null) {
                bVarA.q(c1536l0, 0, y0.f22677a, str);
            }
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: HiddenTextIdDTO.kt */
    public static final class b {
        public final Ya.b<o> serializer() {
            return a.f48608a;
        }
    }

    public o() {
        this.f48607a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && i.a(this.f48607a, ((o) obj).f48607a);
    }

    public final int hashCode() {
        String str = this.f48607a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return Q8.d.a(new StringBuilder("HiddenTextIdDTO(textId="), this.f48607a, ")");
    }

    @d
    public /* synthetic */ o(int i10, String str) {
        if ((i10 & 1) == 0) {
            this.f48607a = null;
        } else {
            this.f48607a = str;
        }
    }
}
