package androidx.compose.foundation.text.selection;

import A1.C0575j;
import A1.C0576k;

/* JADX INFO: compiled from: SelectionAdjustment.kt */
/* JADX INFO: loaded from: classes.dex */
public interface j {

    /* JADX INFO: compiled from: SelectionAdjustment.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p005a4.p f11608a = new p005a4.p(2);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0575j f11609b = new C0575j(4);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0576k f11610c = new C0576k(5);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final H6.c f11611d = new H6.c(3);

        /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.j$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SelectionAdjustment.kt */
        public static final class C0140a implements androidx.compose.foundation.text.selection.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0140a f11612a = new C0140a();

            @Override // androidx.compose.foundation.text.selection.b
            public final long a(h hVar, int i10) {
                String str = hVar.f11601d.f15300a.f15276a.f15408c;
                return O.h.b(com.voltasit.obdeleven.domain.usecases.device.v.d(i10, str), com.voltasit.obdeleven.domain.usecases.device.v.c(i10, str));
            }
        }

        /* JADX INFO: compiled from: SelectionAdjustment.kt */
        public static final class b implements androidx.compose.foundation.text.selection.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f11613a = new b();

            @Override // androidx.compose.foundation.text.selection.b
            public final long a(h hVar, int i10) {
                return hVar.f11601d.j(i10);
            }
        }
    }

    i g(s sVar);
}
