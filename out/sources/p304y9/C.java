package p304y9;

import Ya.k;
import kotlin.jvm.internal.i;
import kotlinx.serialization.UnknownFieldException;
import p011ab.e;
import p024bb.c;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.I;
import p037cb.y0;
import p293xa.d;

/* JADX INFO: compiled from: SettingsDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class C {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48434b;

    /* JADX INFO: compiled from: SettingsDTO.kt */
    @d
    public static final class a implements D<C> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48435a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f48435a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.SettingsDTO", aVar, 2);
            c1536l0.k("selected_car", true);
            c1536l0.k("rate_us", true);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            return new Ya.b[]{Za.a.c(y0.f22677a), I.f22555a};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            String str = null;
            boolean z10 = true;
            int i10 = 0;
            int iH = 0;
            while (z10) {
                int iO = aVarA.o(c1536l0);
                if (iO == -1) {
                    z10 = false;
                } else if (iO == 0) {
                    str = (String) aVarA.d(c1536l0, 0, y0.f22677a, str);
                    i10 |= 1;
                } else {
                    if (iO != 1) {
                        throw new UnknownFieldException(iO);
                    }
                    iH = aVarA.h(c1536l0, 1);
                    i10 |= 2;
                }
            }
            aVarA.c(c1536l0);
            return new C(str, i10, iH);
        }

        @Override // Ya.l, Ya.a
        public final e getDescriptor() {
            return descriptor;
        }

        @Override // Ya.l
        public final void serialize(p024bb.d dVar, Object obj) {
            C value = (C) obj;
            i.e(value, "value");
            C1536l0 c1536l0 = descriptor;
            p024bb.b bVarA = dVar.a(c1536l0);
            b bVar = C.Companion;
            boolean zV = bVarA.v(c1536l0);
            String str = value.f48433a;
            if (zV || str != null) {
                bVarA.q(c1536l0, 0, y0.f22677a, str);
            }
            boolean zV2 = bVarA.v(c1536l0);
            int i10 = value.f48434b;
            if (zV2 || i10 != 0) {
                bVarA.g(1, i10, c1536l0);
            }
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: SettingsDTO.kt */
    public static final class b {
        public final Ya.b<C> serializer() {
            return a.f48435a;
        }
    }

    public C() {
        this.f48433a = null;
        this.f48434b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return i.a(this.f48433a, c10.f48433a) && this.f48434b == c10.f48434b;
    }

    public final int hashCode() {
        String str = this.f48433a;
        return Integer.hashCode(this.f48434b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "SettingsDTO(selectedCar=" + this.f48433a + ", rateUs=" + this.f48434b + ")";
    }

    @d
    public /* synthetic */ C(String str, int i10, int i11) {
        this.f48433a = (i10 & 1) == 0 ? null : str;
        if ((i10 & 2) == 0) {
            this.f48434b = 0;
        } else {
            this.f48434b = i11;
        }
    }
}
