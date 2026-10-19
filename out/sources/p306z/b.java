package p306z;

import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.m0;
import androidx.compose.ui.graphics.vector.c;
import androidx.compose.ui.graphics.vector.e;
import androidx.compose.ui.graphics.vector.i;
import java.util.ArrayList;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: ArrowDropDown.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c f48673a;

    public static final c a() {
        c cVar = f48673a;
        if (cVar != null) {
            return cVar;
        }
        c.a aVar = new c.a("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        EmptyList emptyList = i.f13970a;
        m0 m0Var = new m0(H.f13495b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new e.f(7.0f, 10.0f));
        arrayList.add(new e.m(5.0f, 5.0f));
        arrayList.add(new e.m(5.0f, -5.0f));
        arrayList.add(e.b.f13907c);
        c.a.a(aVar, arrayList, m0Var);
        c cVarB = aVar.b();
        f48673a = cVarB;
        return cVarB;
    }
}
