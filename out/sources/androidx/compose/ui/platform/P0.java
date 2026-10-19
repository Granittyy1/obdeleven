package androidx.compose.ui.platform;

/* JADX INFO: compiled from: TextToolbar.kt */
/* JADX INFO: loaded from: classes.dex */
public interface P0 {
    void b();

    TextToolbarStatus d();

    void e(I.f fVar, Ia.a<p293xa.r> aVar, Ia.a<p293xa.r> aVar2, Ia.a<p293xa.r> aVar3, Ia.a<p293xa.r> aVar4);

    default void f(I.f fVar, Ia.a<p293xa.r> aVar, Ia.a<p293xa.r> aVar2, Ia.a<p293xa.r> aVar3, Ia.a<p293xa.r> aVar4, Ia.a<p293xa.r> aVar5) {
        e(fVar, aVar, aVar2, aVar3, aVar4);
    }
}
