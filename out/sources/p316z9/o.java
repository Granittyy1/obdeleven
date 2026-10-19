package p316z9;

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

/* JADX INFO: compiled from: SubscriptionTypeDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class o {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49006a;

    /* JADX INFO: compiled from: SubscriptionTypeDTO.kt */
    @d
    public static final class a implements D<o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f49007a;
        private static final /* synthetic */ C1536l0 descriptor;

        static {
            a aVar = new a();
            f49007a = aVar;
            C1536l0 c1536l0 = new C1536l0("com.voltasit.sharednetwork.data.models.requests.SubscriptionTypeDTO", aVar, 1);
            c1536l0.k("subscriptionType", false);
            descriptor = c1536l0;
        }

        @Override // p037cb.D
        public final Ya.b<?>[] childSerializers() {
            return new Ya.b[]{y0.f22677a};
        }

        @Override // Ya.a
        public final Object deserialize(c cVar) {
            C1536l0 c1536l0 = descriptor;
            p024bb.a aVarA = cVar.a(c1536l0);
            String strJ = null;
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
                    strJ = aVarA.j(c1536l0, 0);
                    i10 = 1;
                }
            }
            aVarA.c(c1536l0);
            return new o(i10, strJ);
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
            bVarA.p(c1536l0, 0, value.f49006a);
            bVarA.c(c1536l0);
        }

        @Override // p037cb.D
        public final Ya.b<?>[] typeParametersSerializers() {
            return C1538m0.f22638a;
        }
    }

    /* JADX INFO: compiled from: SubscriptionTypeDTO.kt */
    public static final class b {
        public final Ya.b<o> serializer() {
            return a.f49007a;
        }
    }

    @d
    public /* synthetic */ o(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f49006a = str;
        } else {
            p241t7.b.w(i10, 1, a.f49007a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && i.a(this.f49006a, ((o) obj).f49006a);
    }

    public final int hashCode() {
        return this.f49006a.hashCode();
    }

    public final String toString() {
        return Q8.d.a(new StringBuilder("SubscriptionTypeDTO(subscriptionType="), this.f49006a, ")");
    }

    public o(String subscriptionType) {
        i.e(subscriptionType, "subscriptionType");
        this.f49006a = subscriptionType;
    }
}
