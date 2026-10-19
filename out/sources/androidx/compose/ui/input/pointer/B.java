package androidx.compose.ui.input.pointer;

import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f14012a = new j(EmptyList.f42983b, null);

    /* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
    public static final class a implements PointerInputEventHandler, kotlin.jvm.internal.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ia.p f14013b;

        public a(Ia.p pVar) {
            this.f14013b = pVar;
        }

        @Override // kotlin.jvm.internal.f
        public final p293xa.e<?> b() {
            return this.f14013b;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof PointerInputEventHandler) || !(obj instanceof kotlin.jvm.internal.f)) {
                return false;
            }
            return kotlin.jvm.internal.i.a(this.f14013b, ((kotlin.jvm.internal.f) obj).b());
        }

        public final int hashCode() {
            return this.f14013b.hashCode();
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final /* synthetic */ Object invoke(w wVar, kotlin.coroutines.c cVar) {
            return this.f14013b.invoke(wVar, cVar);
        }
    }

    public static final androidx.compose.ui.h b(androidx.compose.ui.h hVar, Object obj, PointerInputEventHandler pointerInputEventHandler) {
        return hVar.i(new SuspendPointerInputElement(obj, null, pointerInputEventHandler, 6));
    }
}
