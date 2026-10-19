package J;

import Ia.l;
import android.database.Cursor;
import android.view.KeyEvent;
import androidx.collection.C0873a;
import androidx.compose.foundation.text.InterfaceC0997f;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.n;
import androidx.compose.ui.graphics.C1144u;
import androidx.compose.ui.graphics.E;
import androidx.compose.ui.graphics.Y;
import com.google.android.gms.internal.measurement.R1;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p131k5.H0;

/* JADX INFO: compiled from: CanvasDrawScope.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC0997f, H0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3951b;

    public /* synthetic */ b(Object obj) {
        this.f3951b = obj;
    }

    @Override // p131k5.H0
    public void a(String str, int i10, IOException iOException, byte[] bArr, Map map) {
        ((com.google.android.gms.measurement.internal.h) this.f3951b).A(true, i10, iOException, bArr);
    }

    @Override // androidx.compose.foundation.text.InterfaceC0997f
    public KeyCommand b(KeyEvent keyEvent) {
        O.c cVar = new O.c(keyEvent);
        l lVar = (l) this.f3951b;
        if (((Boolean) lVar.invoke(cVar)).booleanValue() && keyEvent.isShiftPressed()) {
            long jA = O.h.a(keyEvent.getKeyCode());
            int i10 = n.f11516z;
            if (O.b.a(jA, n.f11498g)) {
                return KeyCommand.f11147V;
            }
            return null;
        }
        if (((Boolean) lVar.invoke(new O.c(keyEvent))).booleanValue()) {
            long jN = O.e.n(keyEvent);
            int i11 = n.f11516z;
            if (O.b.a(jN, n.f11493b) ? true : O.b.a(jN, n.f11507q)) {
                return KeyCommand.f11164r;
            }
            if (O.b.a(jN, n.f11495d)) {
                return KeyCommand.f11165s;
            }
            if (O.b.a(jN, n.f11497f)) {
                return KeyCommand.f11166t;
            }
            if (O.b.a(jN, n.f11492a)) {
                return KeyCommand.f11126A;
            }
            if (O.b.a(jN, n.f11496e)) {
                return KeyCommand.f11147V;
            }
            if (O.b.a(jN, n.f11498g)) {
                return KeyCommand.f11146U;
            }
            return null;
        }
        if (keyEvent.isCtrlPressed()) {
            return null;
        }
        if (keyEvent.isShiftPressed()) {
            long jA2 = O.h.a(keyEvent.getKeyCode());
            int i12 = n.f11516z;
            if (O.b.a(jA2, n.f11500i)) {
                return KeyCommand.f11127B;
            }
            if (O.b.a(jA2, n.j)) {
                return KeyCommand.f11128C;
            }
            if (O.b.a(jA2, n.f11501k)) {
                return KeyCommand.f11129D;
            }
            if (O.b.a(jA2, n.f11502l)) {
                return KeyCommand.f11130E;
            }
            if (O.b.a(jA2, n.f11503m)) {
                return KeyCommand.f11131F;
            }
            if (O.b.a(jA2, n.f11504n)) {
                return KeyCommand.f11132G;
            }
            if (O.b.a(jA2, n.f11505o)) {
                return KeyCommand.f11139N;
            }
            if (O.b.a(jA2, n.f11506p)) {
                return KeyCommand.f11140O;
            }
            if (O.b.a(jA2, n.f11507q)) {
                return KeyCommand.f11165s;
            }
            return null;
        }
        long jA3 = O.h.a(keyEvent.getKeyCode());
        int i13 = n.f11516z;
        if (O.b.a(jA3, n.f11500i)) {
            return KeyCommand.f11149b;
        }
        if (O.b.a(jA3, n.j)) {
            return KeyCommand.f11150c;
        }
        if (O.b.a(jA3, n.f11501k)) {
            return KeyCommand.f11158l;
        }
        if (O.b.a(jA3, n.f11502l)) {
            return KeyCommand.f11159m;
        }
        if (O.b.a(jA3, n.f11503m)) {
            return KeyCommand.f11160n;
        }
        if (O.b.a(jA3, n.f11504n)) {
            return KeyCommand.f11161o;
        }
        if (O.b.a(jA3, n.f11505o)) {
            return KeyCommand.f11155h;
        }
        if (O.b.a(jA3, n.f11506p)) {
            return KeyCommand.f11156i;
        }
        if (O.b.a(jA3, n.f11508r) ? true : O.b.a(jA3, n.f11509s)) {
            return KeyCommand.f11144S;
        }
        if (O.b.a(jA3, n.f11510t)) {
            return KeyCommand.f11167u;
        }
        if (O.b.a(jA3, n.f11511u)) {
            return KeyCommand.f11168v;
        }
        if (O.b.a(jA3, n.f11512v)) {
            return KeyCommand.f11165s;
        }
        if (O.b.a(jA3, n.f11513w)) {
            return KeyCommand.f11166t;
        }
        if (O.b.a(jA3, n.f11514x)) {
            return KeyCommand.f11164r;
        }
        if (O.b.a(jA3, n.f11515y)) {
            return KeyCommand.f11145T;
        }
        return null;
    }

    public void c(C1144u c1144u, int i10) {
        ((a.b) this.f3951b).a().l(c1144u, i10);
    }

    public void d(float f10, float f11, float f12, float f13, int i10) {
        ((a.b) this.f3951b).a().k(f10, f11, f12, f13, i10);
    }

    public void e(float f10, float f11, float f12, float f13) {
        a.b bVar = (a.b) this.f3951b;
        E eA = bVar.a();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.e() >> 32)) - (f12 + f10);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (bVar.e() & 4294967295L)) - (f13 + f11))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            Y.a("Width and height must be greater than or equal to zero");
        }
        bVar.j(jFloatToRawIntBits);
        eA.m(f10, f11);
    }

    public void f(float f10, float f11, long j) {
        E eA = ((a.b) this.f3951b).a();
        int i10 = (int) (j >> 32);
        int i11 = (int) (j & 4294967295L);
        eA.m(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
        eA.a(f10, f11);
        eA.m(-Float.intBitsToFloat(i10), -Float.intBitsToFloat(i11));
    }

    public void g(float f10, float f11) {
        ((a.b) this.f3951b).a().m(f10, f11);
    }

    public Object h() {
        R1 r10 = (R1) this.f3951b;
        Cursor cursorQuery = r10.f25573a.query(r10.f25574b, R1.f25572i, null, null, null);
        if (cursorQuery == null) {
            return Collections.emptyMap();
        }
        try {
            int count = cursorQuery.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map c0873a = count <= 256 ? new C0873a(count) : new HashMap(count, 1.0f);
            while (cursorQuery.moveToNext()) {
                c0873a.put(cursorQuery.getString(0), cursorQuery.getString(1));
            }
            return c0873a;
        } finally {
            cursorQuery.close();
        }
    }

    public b(com.google.android.gms.measurement.internal.h hVar, String str) {
        this.f3951b = hVar;
    }
}
