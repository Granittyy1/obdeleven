package io.intercom.android.sdk.helpcenter.sections;

import Ya.b;
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
public /* synthetic */ class Author$$serializer implements D<Author> {
    public static final int $stable;
    public static final Author$$serializer INSTANCE;
    private static final e descriptor;

    static {
        Author$$serializer author$$serializer = new Author$$serializer();
        INSTANCE = author$$serializer;
        $stable = 8;
        C1536l0 c1536l0 = new C1536l0("io.intercom.android.sdk.helpcenter.sections.Author", author$$serializer, 3);
        c1536l0.k("id", false);
        c1536l0.k("display_name", true);
        c1536l0.k("avatar", true);
        descriptor = c1536l0;
    }

    private Author$$serializer() {
    }

    @Override // p037cb.D
    public final b<?>[] childSerializers() {
        y0 y0Var = y0.f22677a;
        return new b[]{y0Var, y0Var, Avatar$$serializer.INSTANCE};
    }

    @Override // Ya.a
    public final Author deserialize(c decoder) {
        i.e(decoder, "decoder");
        e eVar = descriptor;
        a aVarA = decoder.a(eVar);
        int i10 = 0;
        String strJ = null;
        String strJ2 = null;
        Avatar avatar = null;
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
            } else {
                if (iO != 2) {
                    throw new UnknownFieldException(iO);
                }
                avatar = (Avatar) aVarA.e(eVar, 2, Avatar$$serializer.INSTANCE, avatar);
                i10 |= 4;
            }
        }
        aVarA.c(eVar);
        return new Author(i10, strJ, strJ2, avatar, (u0) null);
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return descriptor;
    }

    @Override // Ya.l
    public final void serialize(p024bb.d encoder, Author value) {
        i.e(encoder, "encoder");
        i.e(value, "value");
        e eVar = descriptor;
        p024bb.b bVarA = encoder.a(eVar);
        Author.write$Self$intercom_sdk_base_release(value, bVarA, eVar);
        bVarA.c(eVar);
    }

    @Override // p037cb.D
    public b<?>[] typeParametersSerializers() {
        return C1538m0.f22638a;
    }
}
