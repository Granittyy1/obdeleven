package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.O0;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.saveable.SaverKt;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: LazySaveableStateHolder.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LazySaveableStateHolderKt {
    public static final void a(final Ia.q<? super androidx.compose.runtime.saveable.c, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(674185128);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.k(qVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c1086gP.C(i11 & 1, (i11 & 3) != 2)) {
            O0 o10 = SaveableStateRegistryKt.f13132a;
            final androidx.compose.runtime.saveable.f fVar = (androidx.compose.runtime.saveable.f) c1086gP.x(o10);
            final SaveableStateHolderImpl saveableStateHolderImplA = androidx.compose.runtime.saveable.e.a(c1086gP);
            Object[] objArr = {fVar};
            Ia.l<Map<String, ? extends List<? extends Object>>, LazySaveableStateHolder> lVar = new Ia.l<Map<String, ? extends List<? extends Object>>, LazySaveableStateHolder>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$Companion$saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final LazySaveableStateHolder invoke(Map<String, ? extends List<? extends Object>> map) {
                    return new LazySaveableStateHolder(fVar, map, saveableStateHolderImplA);
                }
            };
            W.f fVar2 = SaverKt.f13134a;
            W.f fVar3 = new W.f(new Ia.p<androidx.compose.runtime.saveable.j, LazySaveableStateHolder, Map<String, ? extends List<? extends Object>>>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$Companion$saver$1
                @Override // Ia.p
                public final Map<String, ? extends List<? extends Object>> invoke(androidx.compose.runtime.saveable.j jVar, LazySaveableStateHolder lazySaveableStateHolder) {
                    Map<String, List<Object>> mapB = lazySaveableStateHolder.b();
                    if (mapB.isEmpty()) {
                        return null;
                    }
                    return mapB;
                }
            }, lVar);
            boolean zK = c1086gP.k(fVar) | c1086gP.k(saveableStateHolderImplA);
            Object objF = c1086gP.f();
            if (zK || objF == InterfaceC1084f.a.f12980a) {
                objF = new Ia.a<LazySaveableStateHolder>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt$LazySaveableStateHolderProvider$holder$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final LazySaveableStateHolder invoke() {
                        return new LazySaveableStateHolder(fVar, kotlin.collections.y.p(), saveableStateHolderImplA);
                    }
                };
                c1086gP.E(objF);
            }
            final LazySaveableStateHolder lazySaveableStateHolder = (LazySaveableStateHolder) androidx.compose.runtime.saveable.b.c(objArr, fVar3, null, (Ia.a) objF, c1086gP, 0, 4);
            CompositionLocalKt.a(o10.b(lazySaveableStateHolder), androidx.compose.runtime.internal.a.b(1863926504, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt$LazySaveableStateHolderProvider$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    int iIntValue = num.intValue();
                    if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                        qVar.invoke(lazySaveableStateHolder, interfaceC1084f3, 0);
                    } else {
                        interfaceC1084f3.w();
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, 56);
        } else {
            c1086gP.w();
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt$LazySaveableStateHolderProvider$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    LazySaveableStateHolderKt.a(qVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
