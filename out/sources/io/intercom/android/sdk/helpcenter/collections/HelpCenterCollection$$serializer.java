package io.intercom.android.sdk.helpcenter.collections;

import Ya.b;
import kotlin.jvm.internal.i;
import kotlinx.serialization.UnknownFieldException;
import p011ab.e;
import p024bb.a;
import p024bb.c;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.I;
import p037cb.u0;
import p037cb.y0;
import p293xa.d;

/* JADX INFO: compiled from: HelpCenterCollection.kt */
/* JADX INFO: loaded from: classes3.dex */
@d
public /* synthetic */ class HelpCenterCollection$$serializer implements D<HelpCenterCollection> {
    public static final int $stable;
    public static final HelpCenterCollection$$serializer INSTANCE;
    private static final e descriptor;

    static {
        HelpCenterCollection$$serializer helpCenterCollection$$serializer = new HelpCenterCollection$$serializer();
        INSTANCE = helpCenterCollection$$serializer;
        $stable = 8;
        C1536l0 c1536l0 = new C1536l0("io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection", helpCenterCollection$$serializer, 5);
        c1536l0.k("description", true);
        c1536l0.k("id", false);
        c1536l0.k("name", true);
        c1536l0.k("article_count", true);
        c1536l0.k("collection_count", true);
        descriptor = c1536l0;
    }

    private HelpCenterCollection$$serializer() {
    }

    @Override // p037cb.D
    public final b<?>[] childSerializers() {
        y0 y0Var = y0.f22677a;
        I i10 = I.f22555a;
        return new b[]{y0Var, y0Var, y0Var, i10, i10};
    }

    @Override // Ya.a
    public final HelpCenterCollection deserialize(c decoder) {
        i.e(decoder, "decoder");
        e eVar = descriptor;
        a aVarA = decoder.a(eVar);
        int i10 = 0;
        int iH = 0;
        int iH2 = 0;
        String strJ = null;
        String strJ2 = null;
        String strJ3 = null;
        boolean z10 = true;
        while (z10) {
            int iO = aVarA.o(eVar);
            if (iO == -1) {
                z10 = false;
            } else if (iO == 0) {
                strJ = aVarA.j(eVar, 0);
                i10 |= 1;
            } else if (iO == 1) {
                strJ2 = aVarA.j(eVar, 1);
                i10 |= 2;
            } else if (iO == 2) {
                strJ3 = aVarA.j(eVar, 2);
                i10 |= 4;
            } else if (iO == 3) {
                iH = aVarA.h(eVar, 3);
                i10 |= 8;
            } else {
                if (iO != 4) {
                    throw new UnknownFieldException(iO);
                }
                iH2 = aVarA.h(eVar, 4);
                i10 |= 16;
            }
        }
        aVarA.c(eVar);
        return new HelpCenterCollection(i10, strJ, strJ2, strJ3, iH, iH2, (u0) null);
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return descriptor;
    }

    @Override // Ya.l
    public final void serialize(p024bb.d encoder, HelpCenterCollection value) {
        i.e(encoder, "encoder");
        i.e(value, "value");
        e eVar = descriptor;
        p024bb.b bVarA = encoder.a(eVar);
        HelpCenterCollection.write$Self$intercom_sdk_base_release(value, bVarA, eVar);
        bVarA.c(eVar);
    }

    @Override // p037cb.D
    public b<?>[] typeParametersSerializers() {
        return C1538m0.f22638a;
    }
}
