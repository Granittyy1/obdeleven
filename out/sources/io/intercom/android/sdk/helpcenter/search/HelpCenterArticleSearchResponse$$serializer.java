package io.intercom.android.sdk.helpcenter.search;

import com.braze.Constants;
import kotlinx.serialization.UnknownFieldException;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.u0;
import p037cb.y0;

/* JADX INFO: compiled from: HelpCenterArticleSearchResponse.kt */
/* JADX INFO: loaded from: classes3.dex */
@p293xa.d
public /* synthetic */ class HelpCenterArticleSearchResponse$$serializer implements D<HelpCenterArticleSearchResponse> {
    public static final int $stable;
    public static final HelpCenterArticleSearchResponse$$serializer INSTANCE;
    private static final p011ab.e descriptor;

    static {
        HelpCenterArticleSearchResponse$$serializer helpCenterArticleSearchResponse$$serializer = new HelpCenterArticleSearchResponse$$serializer();
        INSTANCE = helpCenterArticleSearchResponse$$serializer;
        $stable = 8;
        C1536l0 c1536l0 = new C1536l0("io.intercom.android.sdk.helpcenter.search.HelpCenterArticleSearchResponse", helpCenterArticleSearchResponse$$serializer, 5);
        c1536l0.k("id", false);
        c1536l0.k("summary", true);
        c1536l0.k("title", true);
        c1536l0.k(Constants.BRAZE_WEBVIEW_URL_EXTRA, true);
        c1536l0.k("highlight", true);
        descriptor = c1536l0;
    }

    private HelpCenterArticleSearchResponse$$serializer() {
    }

    @Override // p037cb.D
    public final Ya.b<?>[] childSerializers() {
        y0 y0Var = y0.f22677a;
        return new Ya.b[]{y0Var, y0Var, y0Var, y0Var, HelpCenterArticleSearchResponse$Highlight$$serializer.INSTANCE};
    }

    @Override // Ya.a
    public final HelpCenterArticleSearchResponse deserialize(p024bb.c decoder) {
        kotlin.jvm.internal.i.e(decoder, "decoder");
        p011ab.e eVar = descriptor;
        p024bb.a aVarA = decoder.a(eVar);
        int i10 = 0;
        String strJ = null;
        String strJ2 = null;
        String strJ3 = null;
        String strJ4 = null;
        HelpCenterArticleSearchResponse.Highlight highlight = null;
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
                strJ4 = aVarA.j(eVar, 3);
                i10 |= 8;
            } else {
                if (iO != 4) {
                    throw new UnknownFieldException(iO);
                }
                highlight = (HelpCenterArticleSearchResponse.Highlight) aVarA.e(eVar, 4, HelpCenterArticleSearchResponse$Highlight$$serializer.INSTANCE, highlight);
                i10 |= 16;
            }
        }
        aVarA.c(eVar);
        return new HelpCenterArticleSearchResponse(i10, strJ, strJ2, strJ3, strJ4, highlight, (u0) null);
    }

    @Override // Ya.l, Ya.a
    public final p011ab.e getDescriptor() {
        return descriptor;
    }

    @Override // Ya.l
    public final void serialize(p024bb.d encoder, HelpCenterArticleSearchResponse value) {
        kotlin.jvm.internal.i.e(encoder, "encoder");
        kotlin.jvm.internal.i.e(value, "value");
        p011ab.e eVar = descriptor;
        p024bb.b bVarA = encoder.a(eVar);
        HelpCenterArticleSearchResponse.write$Self$intercom_sdk_base_release(value, bVarA, eVar);
        bVarA.c(eVar);
    }

    @Override // p037cb.D
    public Ya.b<?>[] typeParametersSerializers() {
        return C1538m0.f22638a;
    }
}
