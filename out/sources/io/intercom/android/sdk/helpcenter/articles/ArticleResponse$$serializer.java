package io.intercom.android.sdk.helpcenter.articles;

import kotlinx.serialization.UnknownFieldException;
import p037cb.C1536l0;
import p037cb.C1538m0;
import p037cb.D;

/* JADX INFO: compiled from: Article.kt */
/* JADX INFO: loaded from: classes3.dex */
@p293xa.d
public /* synthetic */ class ArticleResponse$$serializer implements D<ArticleResponse> {
    public static final int $stable;
    public static final ArticleResponse$$serializer INSTANCE;
    private static final p011ab.e descriptor;

    static {
        ArticleResponse$$serializer articleResponse$$serializer = new ArticleResponse$$serializer();
        INSTANCE = articleResponse$$serializer;
        $stable = 8;
        C1536l0 c1536l0 = new C1536l0("io.intercom.android.sdk.helpcenter.articles.ArticleResponse", articleResponse$$serializer, 1);
        c1536l0.k("article", false);
        descriptor = c1536l0;
    }

    private ArticleResponse$$serializer() {
    }

    @Override // p037cb.D
    public final Ya.b<?>[] childSerializers() {
        return new Ya.b[]{Article$$serializer.INSTANCE};
    }

    @Override // Ya.a
    public final ArticleResponse deserialize(p024bb.c decoder) {
        kotlin.jvm.internal.i.e(decoder, "decoder");
        p011ab.e eVar = descriptor;
        p024bb.a aVarA = decoder.a(eVar);
        boolean z10 = true;
        int i10 = 0;
        Article article = null;
        while (z10) {
            int iO = aVarA.o(eVar);
            if (iO == -1) {
                z10 = false;
            } else {
                if (iO != 0) {
                    throw new UnknownFieldException(iO);
                }
                article = (Article) aVarA.e(eVar, 0, Article$$serializer.INSTANCE, article);
                i10 = 1;
            }
        }
        aVarA.c(eVar);
        return new ArticleResponse(i10, article, null);
    }

    @Override // Ya.l, Ya.a
    public final p011ab.e getDescriptor() {
        return descriptor;
    }

    @Override // Ya.l
    public final void serialize(p024bb.d encoder, ArticleResponse value) {
        kotlin.jvm.internal.i.e(encoder, "encoder");
        kotlin.jvm.internal.i.e(value, "value");
        p011ab.e eVar = descriptor;
        p024bb.b bVarA = encoder.a(eVar);
        bVarA.s(eVar, 0, Article$$serializer.INSTANCE, value.article);
        bVarA.c(eVar);
    }

    @Override // p037cb.D
    public Ya.b<?>[] typeParametersSerializers() {
        return C1538m0.f22638a;
    }
}
