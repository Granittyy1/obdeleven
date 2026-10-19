package io.intercom.android.sdk.helpcenter.sections;

import Ya.b;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlinx.serialization.UnknownFieldException;
import p011ab.e;
import p024bb.a;
import p024bb.c;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.u0;
import p037cb.y0;
import p293xa.d;

/* JADX INFO: compiled from: HelpCenterCollectionContent.kt */
/* JADX INFO: loaded from: classes3.dex */
@d
public /* synthetic */ class HelpCenterSection$$serializer implements D<HelpCenterSection> {
    public static final int $stable;
    public static final HelpCenterSection$$serializer INSTANCE;
    private static final e descriptor;

    static {
        HelpCenterSection$$serializer helpCenterSection$$serializer = new HelpCenterSection$$serializer();
        INSTANCE = helpCenterSection$$serializer;
        $stable = 8;
        C1536l0 c1536l0 = new C1536l0("io.intercom.android.sdk.helpcenter.sections.HelpCenterSection", helpCenterSection$$serializer, 2);
        c1536l0.k("articles", true);
        c1536l0.k("name", true);
        descriptor = c1536l0;
    }

    private HelpCenterSection$$serializer() {
    }

    @Override // p037cb.D
    public final b<?>[] childSerializers() {
        return new b[]{HelpCenterSection.$childSerializers[0], y0.f22677a};
    }

    @Override // Ya.a
    public final HelpCenterSection deserialize(c decoder) {
        i.e(decoder, "decoder");
        e eVar = descriptor;
        a aVarA = decoder.a(eVar);
        b[] bVarArr = HelpCenterSection.$childSerializers;
        boolean z10 = true;
        int i10 = 0;
        List list = null;
        String strJ = null;
        while (z10) {
            int iO = aVarA.o(eVar);
            if (iO == -1) {
                z10 = false;
            } else if (iO == 0) {
                list = (List) aVarA.e(eVar, 0, bVarArr[0], list);
                i10 |= 1;
            } else {
                if (iO != 1) {
                    throw new UnknownFieldException(iO);
                }
                strJ = aVarA.j(eVar, 1);
                i10 |= 2;
            }
        }
        aVarA.c(eVar);
        return new HelpCenterSection(i10, list, strJ, (u0) null);
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return descriptor;
    }

    @Override // Ya.l
    public final void serialize(p024bb.d encoder, HelpCenterSection value) {
        i.e(encoder, "encoder");
        i.e(value, "value");
        e eVar = descriptor;
        p024bb.b bVarA = encoder.a(eVar);
        HelpCenterSection.write$Self$intercom_sdk_base_release(value, bVarA, eVar);
        bVarA.c(eVar);
    }

    @Override // p037cb.D
    public b<?>[] typeParametersSerializers() {
        return C1538m0.f22638a;
    }
}
