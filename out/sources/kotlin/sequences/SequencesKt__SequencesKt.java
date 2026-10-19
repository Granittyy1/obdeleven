package kotlin.sequences;

import com.google.android.gms.internal.measurement.C1787c0;
import java.util.Iterator;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes2.dex */
public class SequencesKt__SequencesKt extends C1787c0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a<T> implements g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f43078a;

        public a(Iterator it) {
            this.f43078a = it;
        }

        @Override // kotlin.sequences.g
        public final Iterator<T> iterator() {
            return this.f43078a;
        }
    }

    public static <T> g<T> x(Iterator<? extends T> it) {
        kotlin.jvm.internal.i.e(it, "<this>");
        return new kotlin.sequences.a(new a(it));
    }

    public static <T> g<T> y(final Ia.a<? extends T> nextFunction) {
        kotlin.jvm.internal.i.e(nextFunction, "nextFunction");
        return new kotlin.sequences.a(new f(nextFunction, new Ia.l<T, T>() { // from class: kotlin.sequences.SequencesKt__SequencesKt$generateSequence$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // Ia.l
            public final T invoke(T it) {
                kotlin.jvm.internal.i.e(it, "it");
                return nextFunction.invoke();
            }
        }));
    }

    public static <T> g<T> z(final T t8, Ia.l<? super T, ? extends T> nextFunction) {
        kotlin.jvm.internal.i.e(nextFunction, "nextFunction");
        return t8 == null ? d.f43085a : new f(new Ia.a<T>() { // from class: kotlin.sequences.SequencesKt__SequencesKt$generateSequence$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final T invoke() {
                return t8;
            }
        }, nextFunction);
    }
}
