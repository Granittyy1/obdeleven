package androidx.compose.ui.window;

import androidx.compose.ui.layout.D;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.layout.F;
import androidx.compose.ui.layout.H;
import androidx.compose.ui.layout.Y;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.y;
import p293xa.r;

/* JADX INFO: compiled from: AndroidPopup.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidPopup_androidKt$SimpleStack$1 implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AndroidPopup_androidKt$SimpleStack$1 f15791a = new AndroidPopup_androidKt$SimpleStack$1();

    @Override // androidx.compose.ui.layout.E
    public final F g(H h8, List<? extends D> list, long j) {
        int size = list.size();
        if (size == 0) {
            return h8.y1(0, 0, y.p(), new Ia.l<Y.a, r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1.1
                @Override // Ia.l
                public final /* bridge */ /* synthetic */ r invoke(Y.a aVar) {
                    return r.f47939a;
                }
            });
        }
        if (size == 1) {
            final Y yQ = list.get(0).Q(j);
            return h8.y1(yQ.f14220b, yQ.f14221c, y.p(), new Ia.l<Y.a, r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1.2
                {
                    super(1);
                }

                @Override // Ia.l
                public final r invoke(Y.a aVar) {
                    Y.a.g(aVar, yQ, 0, 0);
                    return r.f47939a;
                }
            });
        }
        final ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < size2; i10++) {
            Y yQ2 = list.get(i10).Q(j);
            iMax = Math.max(iMax, yQ2.f14220b);
            iMax2 = Math.max(iMax2, yQ2.f14221c);
            arrayList.add(yQ2);
        }
        return h8.y1(iMax, iMax2, y.p(), new Ia.l<Y.a, r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Y.a aVar) {
                Y.a aVar2 = aVar;
                int iR = kotlin.collections.l.r(arrayList);
                if (iR >= 0) {
                    int i11 = 0;
                    while (true) {
                        Y.a.g(aVar2, arrayList.get(i11), 0, 0);
                        if (i11 == iR) {
                            break;
                        }
                        i11++;
                    }
                }
                return r.f47939a;
            }
        });
    }
}
