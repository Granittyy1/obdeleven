package androidx.compose.ui.text.font;

import android.graphics.Typeface;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.B;
import kotlinx.coroutines.B0;

/* JADX INFO: compiled from: FontFamilyResolver.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H3.c f15428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f15429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f15430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f15431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f15432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ia.l<u, Object> f15433f;

    public e(H3.c cVar, a aVar) {
        v vVar = f.f15434a;
        v vVar2 = f.f15434a;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f43032b;
        i iVar = new i();
        kotlin.coroutines.e eVarPlus = i.f15435a.plus(androidx.compose.ui.text.platform.d.f15630a).plus(emptyCoroutineContext);
        emptyCoroutineContext.getClass();
        B.a(eVarPlus.plus(new B0(null)));
        p pVar = new p();
        this.f15428a = cVar;
        this.f15429b = aVar;
        this.f15430c = vVar;
        this.f15431d = iVar;
        this.f15432e = pVar;
        new Ia.l<u, Object>() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$createDefaultTypeface$1
            {
                super(1);
            }

            @Override // Ia.l
            public final Object invoke(u uVar) {
                u uVar2 = uVar;
                return this.this$0.b(new u(null, uVar2.f15456b, uVar2.f15457c, uVar2.f15458d, uVar2.f15459e)).getValue();
            }
        };
    }

    @Override // androidx.compose.ui.text.font.d.a
    public final w a(d dVar, l lVar, int i10, int i11) {
        q qVar = this.f15429b;
        qVar.getClass();
        int i12 = q.f15452a;
        l lVarA = qVar.a(lVar);
        this.f15428a.getClass();
        return b(new u(dVar, lVarA, i10, i11, null));
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final w b(final u uVar) {
        w wVarC;
        final v vVar = this.f15430c;
        Ia.l<Ia.l<? super w, ? extends p293xa.r>, w> lVar = new Ia.l<Ia.l<? super w, ? extends p293xa.r>, w>() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$resolve$result$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:18:0x0047 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:19:0x0048  */
            @Override // Ia.l
            public final w invoke(Ia.l<? super w, ? extends p293xa.r> lVar2) {
                Typeface typefaceB;
                i iVar = this.this$0.f15431d;
                u uVar2 = uVar;
                iVar.getClass();
                d dVar = uVar2.f15455a;
                w.a aVar = null;
                if (dVar instanceof h) {
                    ((h) dVar).getClass();
                    throw null;
                }
                p pVar = this.this$0.f15432e;
                u uVar3 = uVar;
                pVar.getClass();
                d dVar2 = uVar3.f15455a;
                boolean z10 = dVar2 == null ? true : dVar2 instanceof b;
                r rVar = pVar.f15451a;
                int i10 = uVar3.f15457c;
                l lVar3 = uVar3.f15456b;
                if (!z10) {
                    if (dVar2 instanceof n) {
                        typefaceB = rVar.b((n) dVar2, lVar3, i10);
                    } else if (dVar2 instanceof o) {
                        ((o) dVar2).getClass();
                        kotlin.jvm.internal.i.c(null, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
                        throw null;
                    }
                    if (aVar != null) {
                        return aVar;
                    }
                    throw new IllegalStateException("Could not load font");
                }
                typefaceB = rVar.e(lVar3, i10);
                aVar = new w.a(typefaceB, true);
                if (aVar != null) {
                    return aVar;
                }
                throw new IllegalStateException("Could not load font");
            }
        };
        synchronized (vVar.f15460a) {
            wVarC = vVar.f15461b.c(uVar);
            if (wVarC == null) {
                try {
                    wVarC = (w) lVar.invoke(new Ia.l<w, p293xa.r>() { // from class: androidx.compose.ui.text.font.TypefaceRequestCache$runCached$currentTypefaceResult$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(w wVar) {
                            w wVar2 = wVar;
                            v vVar2 = vVar;
                            C.e eVar = vVar2.f15460a;
                            u uVar2 = uVar;
                            synchronized (eVar) {
                                try {
                                    if (wVar2.c()) {
                                        vVar2.f15461b.d(uVar2, wVar2);
                                    } else {
                                        vVar2.f15461b.e(uVar2);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            return p293xa.r.f47939a;
                        }
                    });
                    synchronized (vVar.f15460a) {
                        try {
                            if (vVar.f15461b.c(uVar) == null && wVarC.c()) {
                                vVar.f15461b.d(uVar, wVarC);
                            }
                            p293xa.r rVar = p293xa.r.f47939a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (Exception e10) {
                    throw new IllegalStateException("Could not load font", e10);
                }
            } else if (!wVarC.c()) {
                vVar.f15461b.e(uVar);
                wVarC = (w) lVar.invoke(new Ia.l<w, p293xa.r>() { // from class: androidx.compose.ui.text.font.TypefaceRequestCache$runCached$currentTypefaceResult$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(w wVar) {
                        w wVar2 = wVar;
                        v vVar2 = vVar;
                        C.e eVar = vVar2.f15460a;
                        u uVar2 = uVar;
                        synchronized (eVar) {
                            try {
                                if (wVar2.c()) {
                                    vVar2.f15461b.d(uVar2, wVar2);
                                } else {
                                    vVar2.f15461b.e(uVar2);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return p293xa.r.f47939a;
                    }
                });
                synchronized (vVar.f15460a) {
                    if (vVar.f15461b.c(uVar) == null) {
                        vVar.f15461b.d(uVar, wVarC);
                    }
                    p293xa.r rVar2 = p293xa.r.f47939a;
                }
            }
        }
        return wVarC;
    }
}
