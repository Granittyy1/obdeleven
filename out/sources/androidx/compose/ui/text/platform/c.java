package androidx.compose.ui.text.platform;

import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;

/* JADX INFO: compiled from: EmojiCompatStatus.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public N0<Boolean> f15627a;

    /* JADX INFO: compiled from: EmojiCompatStatus.android.kt */
    public static final class a extends androidx.emoji2.text.c.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C1085f0 f15628b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f15629c;

        public a(C1085f0 c1085f0, c cVar) {
            this.f15628b = c1085f0;
            this.f15629c = cVar;
        }

        @Override // androidx.emoji2.text.c.e
        public final void a() {
            this.f15629c.f15627a = f.f15632a;
        }

        @Override // androidx.emoji2.text.c.e
        public final void b() {
            this.f15628b.setValue(Boolean.TRUE);
            this.f15629c.f15627a = new g(true);
        }
    }

    public final N0<Boolean> a() {
        androidx.emoji2.text.c cVarA = androidx.emoji2.text.c.a();
        if (cVarA.c() == 1) {
            return new g(true);
        }
        C1085f0 c1085f0F = J0.f(Boolean.FALSE);
        cVarA.h(new a(c1085f0F, this));
        return c1085f0F;
    }
}
