package androidx.compose.animation;

import androidx.compose.ui.layout.H;
import androidx.compose.ui.layout.InterfaceC1166l;
import androidx.compose.ui.layout.InterfaceC1167m;
import androidx.compose.ui.layout.Y;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;

/* JADX INFO: compiled from: AnimatedContent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AnimatedContentMeasurePolicy implements androidx.compose.ui.layout.E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnimatedContentTransitionScopeImpl<?> f9236a;

    public AnimatedContentMeasurePolicy(AnimatedContentTransitionScopeImpl<?> animatedContentTransitionScopeImpl) {
        this.f9236a = animatedContentTransitionScopeImpl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.layout.E
    public final androidx.compose.ui.layout.F g(H h8, List<? extends androidx.compose.ui.layout.D> list, long j) {
        Y y10;
        final int i10;
        int i11;
        Y y11;
        final int i12;
        int size = list.size();
        final Y[] yArr = new Y[size];
        List<? extends androidx.compose.ui.layout.D> list2 = list;
        int size2 = list2.size();
        long j10 = 0;
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                break;
            }
            androidx.compose.ui.layout.D d10 = list.get(i13);
            Object objQ = d10.q();
            AnimatedContentTransitionScopeImpl.a aVar = objQ instanceof AnimatedContentTransitionScopeImpl.a ? (AnimatedContentTransitionScopeImpl.a) objQ : null;
            if (aVar != null && ((Boolean) aVar.f9252b.getValue()).booleanValue()) {
                Y yQ = d10.Q(j);
                long j11 = (((long) yQ.f14221c) & 4294967295L) | (((long) yQ.f14220b) << 32);
                p293xa.r rVar = p293xa.r.f47939a;
                yArr[i13] = yQ;
                j10 = j11;
            }
            i13++;
        }
        int size3 = list2.size();
        for (int i14 = 0; i14 < size3; i14++) {
            androidx.compose.ui.layout.D d11 = list.get(i14);
            if (yArr[i14] == null) {
                yArr[i14] = d11.Q(j);
            }
        }
        if (h8.S0()) {
            i10 = (int) (j10 >> 32);
        } else {
            if (size == 0) {
                y10 = null;
            } else {
                y10 = yArr[0];
                int i15 = size - 1;
                if (i15 != 0) {
                    int i16 = y10 != null ? y10.f14220b : 0;
                    Na.h it = new Na.i(1, i15, 1).iterator();
                    while (it.f4692d) {
                        Y y12 = yArr[it.a()];
                        int i17 = y12 != null ? y12.f14220b : 0;
                        if (i16 < i17) {
                            y10 = y12;
                            i16 = i17;
                        }
                    }
                }
            }
            i10 = y10 != null ? y10.f14220b : 0;
        }
        if (h8.S0()) {
            i12 = (int) (j10 & 4294967295L);
        } else {
            if (size == 0) {
                y11 = null;
                i11 = 0;
            } else {
                i11 = 0;
                y11 = yArr[0];
                int i18 = size - 1;
                if (i18 != 0) {
                    int i19 = y11 != null ? y11.f14221c : 0;
                    Na.h it2 = new Na.i(1, i18, 1).iterator();
                    Y y13 = y11;
                    while (it2.f4692d) {
                        Y y14 = yArr[it2.a()];
                        int i20 = y14 != null ? y14.f14221c : 0;
                        if (i19 < i20) {
                            y13 = y14;
                            i19 = i20;
                        }
                    }
                    y11 = y13;
                }
            }
            i12 = y11 != null ? y11.f14221c : i11;
        }
        if (!h8.S0()) {
            this.f9236a.f9242d.setValue(new p013b0.l((((long) i10) << 32) | (((long) i12) & 4294967295L)));
        }
        return h8.y1(i10, i12, kotlin.collections.y.p(), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Y.a aVar2) {
                Y.a aVar3 = aVar2;
                Y[] yArr2 = yArr;
                AnimatedContentMeasurePolicy animatedContentMeasurePolicy = this;
                int i21 = i10;
                int i22 = i12;
                for (Y y15 : yArr2) {
                    if (y15 != null) {
                        long jA = animatedContentMeasurePolicy.f9236a.f9240b.a((((long) y15.f14220b) << 32) | (((long) y15.f14221c) & 4294967295L), (((long) i21) << 32) | (((long) i22) & 4294967295L), LayoutDirection.f15717b);
                        aVar3.d(y15, (int) (jA >> 32), (int) (jA & 4294967295L), 0.0f);
                    }
                }
                return p293xa.r.f47939a;
            }
        });
    }

    @Override // androidx.compose.ui.layout.E
    public final int h(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).J(i10));
            int iR = kotlin.collections.l.r(list);
            int i11 = 1;
            if (1 <= iR) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i11).J(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iR) {
                        break;
                    }
                    i11++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.E
    public final int i(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).k0(i10));
            int iR = kotlin.collections.l.r(list);
            int i11 = 1;
            if (1 <= iR) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i11).k0(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iR) {
                        break;
                    }
                    i11++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.E
    public final int j(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).I(i10));
            int iR = kotlin.collections.l.r(list);
            int i11 = 1;
            if (1 <= iR) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i11).I(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iR) {
                        break;
                    }
                    i11++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.E
    public final int m(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).s(i10));
            int iR = kotlin.collections.l.r(list);
            int i11 = 1;
            if (1 <= iR) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i11).s(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iR) {
                        break;
                    }
                    i11++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
