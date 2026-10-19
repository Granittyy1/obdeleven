package io.intercom.android.sdk.helpcenter.search;

import kotlinx.serialization.UnknownFieldException;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.u0;
import p037cb.y0;

/* JADX INFO: compiled from: HelpCenterArticleSearchResponse.kt */
/* JADX INFO: loaded from: classes3.dex */
@p293xa.d
public /* synthetic */ class HelpCenterArticleSearchResponse$Highlight$$serializer implements D<HelpCenterArticleSearchResponse.Highlight> {
    public static final int $stable;
    public static final HelpCenterArticleSearchResponse$Highlight$$serializer INSTANCE;
    private static final p011ab.e descriptor;

    static {
        HelpCenterArticleSearchResponse$Highlight$$serializer helpCenterArticleSearchResponse$Highlight$$serializer = new HelpCenterArticleSearchResponse$Highlight$$serializer();
        INSTANCE = helpCenterArticleSearchResponse$Highlight$$serializer;
        $stable = 8;
        C1536l0 c1536l0 = new C1536l0("io.intercom.android.sdk.helpcenter.search.HelpCenterArticleSearchResponse.Highlight", helpCenterArticleSearchResponse$Highlight$$serializer, 2);
        c1536l0.k("title", true);
        c1536l0.k("summary", true);
        descriptor = c1536l0;
    }

    private HelpCenterArticleSearchResponse$Highlight$$serializer() {
    }

    @Override // p037cb.D
    public final Ya.b<?>[] childSerializers() {
        y0 y0Var = y0.f22677a;
        return new Ya.b[]{y0Var, y0Var};
    }

    @Override // Ya.a
    public final HelpCenterArticleSearchResponse.Highlight deserialize(p024bb.c decoder) {
        kotlin.jvm.internal.i.e(decoder, "decoder");
        p011ab.e eVar = descriptor;
        p024bb.a aVarA = decoder.a(eVar);
        boolean z10 = true;
        int i10 = 0;
        String strJ = null;
        String strJ2 = null;
        while (z10) {
            int iO = aVarA.o(eVar);
            if (iO == -1) {
                z10 = false;
            } else if (iO == 0) {
                strJ = aVarA.j(eVar, 0);
                i10 |= 1;
            } else {
                if (iO != 1) {
                    throw new UnknownFieldException(iO);
                }
                strJ2 = aVarA.j(eVar, 1);
                i10 |= 2;
            }
        }
        aVarA.c(eVar);
        return new HelpCenterArticleSearchResponse.Highlight(i10, strJ, strJ2, (u0) null);
    }

    @Override // Ya.l, Ya.a
    public final p011ab.e getDescriptor() {
        return descriptor;
    }

    @Override // Ya.l
    public final void serialize(p024bb.d encoder, HelpCenterArticleSearchResponse.Highlight value) {
        kotlin.jvm.internal.i.e(encoder, "encoder");
        kotlin.jvm.internal.i.e(value, "value");
        p011ab.e eVar = descriptor;
        p024bb.b bVarA = encoder.a(eVar);
        HelpCenterArticleSearchResponse.Highlight.write$Self$intercom_sdk_base_release(value, bVarA, eVar);
        bVarA.c(eVar);
    }

    @Override // p037cb.D
    public Ya.b<?>[] typeParametersSerializers() {
        return C1538m0.f22638a;
    }
}
