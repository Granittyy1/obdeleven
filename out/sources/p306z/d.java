package p306z;

import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.m0;
import androidx.compose.ui.graphics.vector.c;
import androidx.compose.ui.graphics.vector.i;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: Close.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c f48675a;

    public static final c a() {
        c cVar = f48675a;
        if (cVar != null) {
            return cVar;
        }
        c.a aVar = new c.a("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        EmptyList emptyList = i.f13970a;
        m0 m0Var = new m0(H.f13495b);
        androidx.compose.ui.graphics.vector.d dVar = new androidx.compose.ui.graphics.vector.d();
        dVar.h(19.0f, 6.41f);
        dVar.f(17.59f, 5.0f);
        dVar.f(12.0f, 10.59f);
        dVar.f(6.41f, 5.0f);
        dVar.f(5.0f, 6.41f);
        dVar.f(10.59f, 12.0f);
        dVar.f(5.0f, 17.59f);
        dVar.f(6.41f, 19.0f);
        dVar.f(12.0f, 13.41f);
        dVar.f(17.59f, 19.0f);
        dVar.f(19.0f, 17.59f);
        dVar.f(13.41f, 12.0f);
        dVar.a();
        c.a.a(aVar, dVar.f13897a, m0Var);
        c cVarB = aVar.b();
        f48675a = cVarB;
        return cVarB;
    }
}
