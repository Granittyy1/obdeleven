package androidx.compose.ui;

import Ia.l;
import Ia.p;
import Ia.q;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.platform.C1235n0;
import kotlin.jvm.internal.o;
import p293xa.r;

/* JADX INFO: compiled from: ComposedModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ComposedModifierKt {
    public static final h a(h hVar, l<? super C1235n0, r> lVar, q<? super h, ? super InterfaceC1084f, ? super Integer, ? extends h> qVar) {
        return hVar.i(new g(lVar, qVar));
    }

    public static final h b(final InterfaceC1084f interfaceC1084f, h hVar) {
        if (hVar.d(new l<h.b, Boolean>() { // from class: androidx.compose.ui.ComposedModifierKt$materializeImpl$1
            @Override // Ia.l
            public final Boolean invoke(h.b bVar) {
                return Boolean.valueOf(!(bVar instanceof g));
            }
        })) {
            return hVar;
        }
        interfaceC1084f.e(1219399079);
        h hVar2 = (h) hVar.b(h.a.f13984b, new p<h, h.b, h>() { // from class: androidx.compose.ui.ComposedModifierKt$materializeImpl$result$1
            {
                super(2);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [Ia.q, java.lang.Object, kotlin.jvm.internal.Lambda] */
            @Override // Ia.p
            public final h invoke(h hVar3, h.b bVar) {
                h hVar4 = hVar3;
                h.b bVarB = bVar;
                if (bVarB instanceof g) {
                    ?? r10 = ((g) bVarB).f13470d;
                    kotlin.jvm.internal.i.c(r10, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                    o.d(3, r10);
                    bVarB = ComposedModifierKt.b(interfaceC1084f, (h) r10.invoke(h.a.f13984b, interfaceC1084f, 0));
                }
                return hVar4.i(bVarB);
            }
        });
        interfaceC1084f.I();
        return hVar2;
    }

    public static final h c(InterfaceC1084f interfaceC1084f, h hVar) {
        interfaceC1084f.L(439770924);
        h hVarB = b(interfaceC1084f, hVar);
        interfaceC1084f.D();
        return hVarB;
    }
}
