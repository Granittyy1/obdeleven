package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.A;
import androidx.compose.ui.graphics.C1149z;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.I;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: Vector.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EmptyList f13970a = EmptyList.f42983b;

    static {
        int i10 = H.f13505m;
    }

    public static final boolean a(I i10) {
        if (i10 instanceof A) {
            A a10 = (A) i10;
            if (C1149z.a(a10.f13472c, 5) || C1149z.a(a10.f13472c, 3)) {
                return true;
            }
        } else if (i10 == null) {
            return true;
        }
        return false;
    }
}
