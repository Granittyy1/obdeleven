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
import p037cb.I;
import p037cb.u0;
import p037cb.y0;
import p293xa.d;

/* JADX INFO: compiled from: HelpCenterCollectionContent.kt */
/* JADX INFO: loaded from: classes3.dex */
@d
public /* synthetic */ class HelpCenterCollectionContent$$serializer implements D<HelpCenterCollectionContent> {
    public static final int $stable;
    public static final HelpCenterCollectionContent$$serializer INSTANCE;
    private static final e descriptor;

    static {
        HelpCenterCollectionContent$$serializer helpCenterCollectionContent$$serializer = new HelpCenterCollectionContent$$serializer();
        INSTANCE = helpCenterCollectionContent$$serializer;
        $stable = 8;
        C1536l0 c1536l0 = new C1536l0("io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent", helpCenterCollectionContent$$serializer, 8);
        c1536l0.k("id", false);
        c1536l0.k("name", true);
        c1536l0.k("description", true);
        c1536l0.k("articles", true);
        c1536l0.k("sections", true);
        c1536l0.k("collections", true);
        c1536l0.k("article_count", false);
        c1536l0.k("authors", true);
        descriptor = c1536l0;
    }

    private HelpCenterCollectionContent$$serializer() {
    }

    @Override // p037cb.D
    public final b<?>[] childSerializers() {
        b<?>[] bVarArr = HelpCenterCollectionContent.$childSerializers;
        b<?> bVar = bVarArr[3];
        b<?> bVar2 = bVarArr[4];
        b<?> bVar3 = bVarArr[5];
        b<?> bVar4 = bVarArr[7];
        y0 y0Var = y0.f22677a;
        return new b[]{y0Var, y0Var, y0Var, bVar, bVar2, bVar3, I.f22555a, bVar4};
    }

    @Override // Ya.a
    public final HelpCenterCollectionContent deserialize(c decoder) {
        i.e(decoder, "decoder");
        e eVar = descriptor;
        a aVarA = decoder.a(eVar);
        b[] bVarArr = HelpCenterCollectionContent.$childSerializers;
        String strJ = null;
        String strJ2 = null;
        String strJ3 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        int i10 = 0;
        int iH = 0;
        boolean z10 = true;
        while (z10) {
            int iO = aVarA.o(eVar);
            switch (iO) {
                case -1:
                    z10 = false;
                    break;
                case 0:
                    strJ = aVarA.j(eVar, 0);
                    i10 |= 1;
                    break;
                case 1:
                    strJ2 = aVarA.j(eVar, 1);
                    i10 |= 2;
                    break;
                case 2:
                    strJ3 = aVarA.j(eVar, 2);
                    i10 |= 4;
                    break;
                case 3:
                    list = (List) aVarA.e(eVar, 3, bVarArr[3], list);
                    i10 |= 8;
                    break;
                case 4:
                    list2 = (List) aVarA.e(eVar, 4, bVarArr[4], list2);
                    i10 |= 16;
                    break;
                case 5:
                    list3 = (List) aVarA.e(eVar, 5, bVarArr[5], list3);
                    i10 |= 32;
                    break;
                case 6:
                    iH = aVarA.h(eVar, 6);
                    i10 |= 64;
                    break;
                case 7:
                    list4 = (List) aVarA.e(eVar, 7, bVarArr[7], list4);
                    i10 |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iO);
            }
        }
        aVarA.c(eVar);
        return new HelpCenterCollectionContent(i10, strJ, strJ2, strJ3, list, list2, list3, iH, list4, (u0) null);
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return descriptor;
    }

    @Override // Ya.l
    public final void serialize(p024bb.d encoder, HelpCenterCollectionContent value) {
        i.e(encoder, "encoder");
        i.e(value, "value");
        e eVar = descriptor;
        p024bb.b bVarA = encoder.a(eVar);
        HelpCenterCollectionContent.write$Self$intercom_sdk_base_release(value, bVarA, eVar);
        bVarA.c(eVar);
    }

    @Override // p037cb.D
    public b<?>[] typeParametersSerializers() {
        return C1538m0.f22638a;
    }
}
