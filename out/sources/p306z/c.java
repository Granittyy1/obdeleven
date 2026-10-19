package p306z;

import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.m0;
import androidx.compose.ui.graphics.vector.e;
import androidx.compose.ui.graphics.vector.i;
import java.util.ArrayList;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: Check.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static androidx.compose.ui.graphics.vector.c f48674a;

    public static final androidx.compose.ui.graphics.vector.c a() {
        androidx.compose.ui.graphics.vector.c cVar = f48674a;
        if (cVar != null) {
            return cVar;
        }
        androidx.compose.ui.graphics.vector.c.a aVar = new androidx.compose.ui.graphics.vector.c.a("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        EmptyList emptyList = i.f13970a;
        m0 m0Var = new m0(H.f13495b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new e.f(9.0f, 16.17f));
        arrayList.add(new e.C0157e(4.83f, 12.0f));
        arrayList.add(new e.m(-1.42f, 1.41f));
        arrayList.add(new e.C0157e(9.0f, 19.0f));
        arrayList.add(new e.C0157e(21.0f, 7.0f));
        arrayList.add(new e.m(-1.41f, -1.41f));
        arrayList.add(e.b.f13907c);
        androidx.compose.ui.graphics.vector.c.a.a(aVar, arrayList, m0Var);
        androidx.compose.ui.graphics.vector.c cVarB = aVar.b();
        f48674a = cVarB;
        return cVarB;
    }
}
