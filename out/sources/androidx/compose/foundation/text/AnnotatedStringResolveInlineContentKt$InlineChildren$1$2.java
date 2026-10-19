package androidx.compose.foundation.text;

import androidx.compose.ui.layout.Y;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: AnnotatedStringResolveInlineContent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotatedStringResolveInlineContentKt$InlineChildren$1$2 implements androidx.compose.ui.layout.E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AnnotatedStringResolveInlineContentKt$InlineChildren$1$2 f11062a = new AnnotatedStringResolveInlineContentKt$InlineChildren$1$2();

    @Override // androidx.compose.ui.layout.E
    public final androidx.compose.ui.layout.F g(androidx.compose.ui.layout.H h8, List<? extends androidx.compose.ui.layout.D> list, long j) {
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(list.get(i10).Q(j));
        }
        return h8.y1(p013b0.a.h(j), p013b0.a.g(j), kotlin.collections.y.p(), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt$InlineChildren$1$2.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Y.a aVar) {
                Y.a aVar2 = aVar;
                List<Y> list2 = arrayList;
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    Y.a.g(aVar2, list2.get(i11), 0, 0);
                }
                return p293xa.r.f47939a;
            }
        });
    }
}
