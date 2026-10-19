package kotlin.sequences;

import A1.C0575j;
import androidx.compose.ui.platform.T0;
import com.google.android.gms.internal.measurement.M1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: _Sequences.kt */
/* JADX INFO: loaded from: classes2.dex */
public class SequencesKt___SequencesKt extends k {
    public static <T> int A(g<? extends T> gVar) {
        kotlin.jvm.internal.i.e(gVar, "<this>");
        Iterator<? extends T> it = gVar.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                kotlin.collections.l.w();
                throw null;
            }
        }
        return i10;
    }

    public static <T> T B(g<? extends T> gVar, final int i10) {
        kotlin.jvm.internal.i.e(gVar, "<this>");
        Ia.l<Integer, T> lVar = new Ia.l<Integer, T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$elementAt$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final Object invoke(Integer num) {
                num.intValue();
                throw new IndexOutOfBoundsException(C0575j.b(new StringBuilder("Sequence doesn't contain element at index "), i10, '.'));
            }
        };
        if (i10 < 0) {
            lVar.invoke(Integer.valueOf(i10));
            throw null;
        }
        int i11 = 0;
        for (T t8 : gVar) {
            int i12 = i11 + 1;
            if (i10 == i11) {
                return t8;
            }
            i11 = i12;
        }
        lVar.invoke(Integer.valueOf(i10));
        throw null;
    }

    public static e C(T0 t8, Ia.l lVar) {
        return new e(t8, true, lVar);
    }

    public static e D(n nVar) {
        SequencesKt___SequencesKt$filterNotNull$1 predicate = new Ia.l<Object, Boolean>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$filterNotNull$1
            @Override // Ia.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj == null);
            }
        };
        kotlin.jvm.internal.i.e(predicate, "predicate");
        return new e(nVar, false, predicate);
    }

    public static <T> T E(g<? extends T> gVar) {
        Iterator<? extends T> it = gVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static <T> List<T> F(g<? extends T> gVar) {
        Iterator<? extends T> it = gVar.iterator();
        if (!it.hasNext()) {
            return EmptyList.f42983b;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return M1.k(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
