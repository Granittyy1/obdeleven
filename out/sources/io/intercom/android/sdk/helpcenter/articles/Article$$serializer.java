package io.intercom.android.sdk.helpcenter.articles;

import kotlinx.serialization.UnknownFieldException;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;
import p037cb.u0;
import p037cb.y0;

/* JADX INFO: compiled from: Article.kt */
/* JADX INFO: loaded from: classes3.dex */
@p293xa.d
public /* synthetic */ class Article$$serializer implements D<Article> {
    public static final int $stable;
    public static final Article$$serializer INSTANCE;
    private static final p011ab.e descriptor;

    static {
        Article$$serializer article$$serializer = new Article$$serializer();
        INSTANCE = article$$serializer;
        $stable = 8;
        C1536l0 c1536l0 = new C1536l0("io.intercom.android.sdk.helpcenter.articles.Article", article$$serializer, 2);
        c1536l0.k("related_conversation_id", true);
        c1536l0.k("card", false);
        descriptor = c1536l0;
    }

    private Article$$serializer() {
    }

    @Override // p037cb.D
    public final Ya.b<?>[] childSerializers() {
        return new Ya.b[]{Za.a.c(y0.f22677a), ArticleCard$$serializer.INSTANCE};
    }

    @Override // Ya.a
    public final Article deserialize(p024bb.c decoder) {
        kotlin.jvm.internal.i.e(decoder, "decoder");
        p011ab.e eVar = descriptor;
        p024bb.a aVarA = decoder.a(eVar);
        boolean z10 = true;
        int i10 = 0;
        String str = null;
        ArticleCard articleCard = null;
        while (z10) {
            int iO = aVarA.o(eVar);
            if (iO == -1) {
                z10 = false;
            } else if (iO == 0) {
                str = (String) aVarA.d(eVar, 0, y0.f22677a, str);
                i10 |= 1;
            } else {
                if (iO != 1) {
                    throw new UnknownFieldException(iO);
                }
                articleCard = (ArticleCard) aVarA.e(eVar, 1, ArticleCard$$serializer.INSTANCE, articleCard);
                i10 |= 2;
            }
        }
        aVarA.c(eVar);
        return new Article(i10, str, articleCard, (u0) null);
    }

    @Override // Ya.l, Ya.a
    public final p011ab.e getDescriptor() {
        return descriptor;
    }

    @Override // Ya.l
    public final void serialize(p024bb.d encoder, Article value) {
        kotlin.jvm.internal.i.e(encoder, "encoder");
        kotlin.jvm.internal.i.e(value, "value");
        p011ab.e eVar = descriptor;
        p024bb.b bVarA = encoder.a(eVar);
        Article.write$Self$intercom_sdk_base_release(value, bVarA, eVar);
        bVarA.c(eVar);
    }

    @Override // p037cb.D
    public Ya.b<?>[] typeParametersSerializers() {
        return C1538m0.f22638a;
    }
}
