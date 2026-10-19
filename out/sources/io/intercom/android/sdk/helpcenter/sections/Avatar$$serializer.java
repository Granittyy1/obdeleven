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
public /* synthetic */ class Avatar$$serializer implements D<Avatar> {
    public static final int $stable;
    public static final Avatar$$serializer INSTANCE;
    private static final e descriptor;

    static {
        Avatar$$serializer avatar$$serializer = new Avatar$$serializer();
        INSTANCE = avatar$$serializer;
        $stable = 8;
        C1536l0 c1536l0 = new C1536l0("io.intercom.android.sdk.helpcenter.sections.Avatar", avatar$$serializer, 2);
        c1536l0.k("initials", true);
        c1536l0.k("image_url", true);
        descriptor = c1536l0;
    }

    private Avatar$$serializer() {
    }

    @Override // p037cb.D
    public final b<?>[] childSerializers() {
        y0 y0Var = y0.f22677a;
        return new b[]{y0Var, y0Var};
    }

    @Override // Ya.a
    public final Avatar deserialize(c decoder) {
        i.e(decoder, "decoder");
        e eVar = descriptor;
        a aVarA = decoder.a(eVar);
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
        return new Avatar(i10, strJ, strJ2, (u0) null);
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return descriptor;
    }

    @Override // Ya.l
    public final void serialize(p024bb.d encoder, Avatar value) {
        i.e(encoder, "encoder");
        i.e(value, "value");
        e eVar = descriptor;
        p024bb.b bVarA = encoder.a(eVar);
        Avatar.write$Self$intercom_sdk_base_release(value, bVarA, eVar);
        bVarA.c(eVar);
    }

    @Override // p037cb.D
    public b<?>[] typeParametersSerializers() {
        return C1538m0.f22638a;
    }
}
