package androidx.compose.foundation.text;

import androidx.compose.ui.layout.Y;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: compiled from: BasicText.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TextMeasurePolicy implements androidx.compose.ui.layout.E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ia.a<Boolean> f11241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.a<List<I.f>> f11242b;

    /* JADX WARN: Multi-variable type inference failed */
    public TextMeasurePolicy(Ia.a<Boolean> aVar, Ia.a<? extends List<I.f>> aVar2) {
        this.f11241a = aVar;
        this.f11242b = aVar2;
    }

    @Override // androidx.compose.ui.layout.E
    public final androidx.compose.ui.layout.F g(androidx.compose.ui.layout.H h8, List<? extends androidx.compose.ui.layout.D> list, long j) {
        final ArrayList arrayList;
        Pair pair;
        ArrayList arrayList2 = new ArrayList(list.size());
        List<? extends androidx.compose.ui.layout.D> list2 = list;
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.ui.layout.D d10 = list.get(i10);
            if (!(d10.q() instanceof F)) {
                arrayList2.add(d10);
            }
        }
        List<I.f> listInvoke = this.f11242b.invoke();
        if (listInvoke != null) {
            ArrayList arrayList3 = new ArrayList(listInvoke.size());
            int size2 = listInvoke.size();
            for (int i11 = 0; i11 < size2; i11++) {
                I.f fVar = listInvoke.get(i11);
                if (fVar != null) {
                    androidx.compose.ui.layout.D d11 = (androidx.compose.ui.layout.D) arrayList2.get(i11);
                    float f10 = fVar.f3759c;
                    float f11 = fVar.f3757a;
                    int iFloor = (int) Math.floor(f10 - f11);
                    float f12 = fVar.f3760d;
                    float f13 = fVar.f3758b;
                    pair = new Pair(d11.Q(p013b0.b.b(iFloor, (int) Math.floor(f12 - f13), 5)), new p013b0.j((((long) Math.round(f13)) & 4294967295L) | (((long) Math.round(f11)) << 32)));
                } else {
                    pair = null;
                }
                if (pair != null) {
                    arrayList3.add(pair);
                }
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        int size3 = list2.size();
        for (int i12 = 0; i12 < size3; i12++) {
            androidx.compose.ui.layout.D d12 = list.get(i12);
            if (d12.q() instanceof F) {
                arrayList4.add(d12);
            }
        }
        final ArrayList arrayListF = BasicTextKt.f(arrayList4, this.f11241a);
        return h8.y1(p013b0.a.h(j), p013b0.a.g(j), kotlin.collections.y.p(), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.text.TextMeasurePolicy$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Y.a aVar) {
                Y.a aVar2 = aVar;
                List<Pair<Y, p013b0.j>> list3 = arrayList;
                if (list3 != null) {
                    int size4 = list3.size();
                    for (int i13 = 0; i13 < size4; i13++) {
                        Pair<Y, p013b0.j> pair2 = list3.get(i13);
                        Y.a.f(aVar2, pair2.a(), pair2.b().f20484a);
                    }
                }
                List<Pair<Y, Ia.a<p013b0.j>>> list4 = arrayListF;
                if (list4 != null) {
                    int size5 = list4.size();
                    for (int i14 = 0; i14 < size5; i14++) {
                        Pair<Y, Ia.a<p013b0.j>> pair3 = list4.get(i14);
                        Y yA = pair3.a();
                        Ia.a<p013b0.j> aVarB = pair3.b();
                        Y.a.f(aVar2, yA, aVarB != null ? aVarB.invoke().f20484a : 0L);
                    }
                }
                return p293xa.r.f47939a;
            }
        });
    }
}
