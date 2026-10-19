package androidx.compose.ui.draw;

import Ia.l;
import androidx.compose.ui.graphics.S;
import kotlin.jvm.internal.Lambda;
import p293xa.r;

/* JADX INFO: compiled from: DrawModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CacheDrawScope implements p013b0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f13369b = i.f13395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f13370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Ia.a<? extends S> f13371d;

    @Override // p013b0.c
    public final float P0() {
        return this.f13369b.getDensity().P0();
    }

    public final g c(final l<? super J.e, r> lVar) {
        return o(new l<J.c, r>() { // from class: androidx.compose.ui.draw.CacheDrawScope$onDrawBehind$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(J.c cVar) {
                J.c cVar2 = cVar;
                lVar.invoke(cVar2);
                cVar2.A1();
                return r.f47939a;
            }
        });
    }

    @Override // p013b0.c
    public final float getDensity() {
        return this.f13369b.getDensity().getDensity();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final g o(l<? super J.c, r> lVar) {
        g gVar = new g();
        gVar.f13393a = (Lambda) lVar;
        this.f13370c = gVar;
        return gVar;
    }
}
