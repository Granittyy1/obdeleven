package androidx.compose.material3;

import androidx.compose.ui.layout.C1171q;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1 implements androidx.compose.ui.layout.E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1 f12399a = new TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1();

    @Override // androidx.compose.ui.layout.E
    public final androidx.compose.ui.layout.F g(androidx.compose.ui.layout.H h8, List<? extends androidx.compose.ui.layout.D> list, long j) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.ui.layout.D d10 = list.get(i10);
            if (kotlin.jvm.internal.i.a(C1171q.a(d10), "Spacer")) {
                final androidx.compose.ui.layout.Y yQ = d10.Q(p013b0.a.a(j, 0, h8.e1(B.y.f1393i), 0, 0, 12));
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    androidx.compose.ui.layout.D d11 = list.get(i11);
                    if (!kotlin.jvm.internal.i.a(C1171q.a(d11), "Spacer")) {
                        arrayList.add(d11);
                    }
                }
                final ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size3 = arrayList.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    arrayList2.add(((androidx.compose.ui.layout.D) arrayList.get(i12)).Q(p013b0.a.a(j, 0, p013b0.a.h(j) / 2, 0, 0, 12)));
                }
                return h8.y1(p013b0.a.h(j), p013b0.a.g(j), kotlin.collections.y.p(), new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar) {
                        androidx.compose.ui.layout.Y.a aVar2 = aVar;
                        aVar2.d(arrayList2.get(0), 0, 0, 0.0f);
                        aVar2.d(arrayList2.get(1), arrayList2.get(0).f14220b, 0, 0.0f);
                        aVar2.d(yQ, arrayList2.get(0).f14220b - (yQ.f14220b / 2), 0, 0.0f);
                        return p293xa.r.f47939a;
                    }
                });
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
