package p306z;

import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.m0;
import androidx.compose.ui.graphics.vector.c;
import androidx.compose.ui.graphics.vector.d;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: Search.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c f48680a;

    public static final c a() {
        c cVar = f48680a;
        if (cVar != null) {
            return cVar;
        }
        c.a aVar = new c.a("Filled.Search", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        EmptyList emptyList = androidx.compose.ui.graphics.vector.i.f13970a;
        m0 m0Var = new m0(H.f13495b);
        d dVar = new d();
        dVar.h(15.5f, 14.0f);
        dVar.e(-0.79f);
        dVar.g(-0.28f, -0.27f);
        dVar.b(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
        dVar.b(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
        dVar.i(3.0f, 5.91f, 3.0f, 9.5f);
        dVar.i(5.91f, 16.0f, 9.5f, 16.0f);
        dVar.c(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
        dVar.g(0.27f, 0.28f);
        dVar.l(0.79f);
        dVar.g(5.0f, 4.99f);
        dVar.f(20.49f, 19.0f);
        dVar.g(-4.99f, -5.0f);
        dVar.a();
        dVar.h(9.5f, 14.0f);
        dVar.b(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
        dVar.i(7.01f, 5.0f, 9.5f, 5.0f);
        dVar.i(14.0f, 7.01f, 14.0f, 9.5f);
        dVar.i(11.99f, 14.0f, 9.5f, 14.0f);
        dVar.a();
        c.a.a(aVar, dVar.f13897a, m0Var);
        c cVarB = aVar.b();
        f48680a = cVarB;
        return cVarB;
    }
}
