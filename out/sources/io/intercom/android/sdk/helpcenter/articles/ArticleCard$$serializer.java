package io.intercom.android.sdk.helpcenter.articles;

import kotlinx.serialization.UnknownFieldException;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.y0;

/* JADX INFO: compiled from: Article.kt */
/* JADX INFO: loaded from: classes3.dex */
@p293xa.d
public /* synthetic */ class ArticleCard$$serializer implements D<ArticleCard> {
    public static final int $stable;
    public static final ArticleCard$$serializer INSTANCE;
    private static final p011ab.e descriptor;

    static {
        ArticleCard$$serializer articleCard$$serializer = new ArticleCard$$serializer();
        INSTANCE = articleCard$$serializer;
        $stable = 8;
        C1536l0 c1536l0 = new C1536l0("io.intercom.android.sdk.helpcenter.articles.ArticleCard", articleCard$$serializer, 2);
        c1536l0.k("articleId", false);
        c1536l0.k("title", false);
        descriptor = c1536l0;
    }

    private ArticleCard$$serializer() {
    }

    @Override // p037cb.D
    public final Ya.b<?>[] childSerializers() {
        y0 y0Var = y0.f22677a;
        return new Ya.b[]{y0Var, y0Var};
    }

    @Override // Ya.a
    public final ArticleCard deserialize(p024bb.c decoder) {
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
        return new ArticleCard(i10, strJ, strJ2, null);
    }

    @Override // Ya.l, Ya.a
    public final p011ab.e getDescriptor() {
        return descriptor;
    }

    @Override // Ya.l
    public final void serialize(p024bb.d encoder, ArticleCard value) {
        kotlin.jvm.internal.i.e(encoder, "encoder");
        kotlin.jvm.internal.i.e(value, "value");
        p011ab.e eVar = descriptor;
        p024bb.b bVarA = encoder.a(eVar);
        ArticleCard.write$Self$intercom_sdk_base_release(value, bVarA, eVar);
        bVarA.c(eVar);
    }

    @Override // p037cb.D
    public Ya.b<?>[] typeParametersSerializers() {
        return C1538m0.f22638a;
    }
}
