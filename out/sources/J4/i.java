package J4;

import android.database.Cursor;
import android.util.Base64;
import android.util.Log;
import androidx.compose.runtime.C1086g;
import com.facebook.internal.FeatureManager;
import com.google.android.datatransport.Priority;
import com.google.firebase.perf.FirebasePerfRegistrar;
import java.util.ArrayList;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements q.a, FeatureManager.a, androidx.compose.ui.graphics.colorspace.j, p183oa.b, j1.j.a, p228s6.d, com.google.common.base.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3981b;

    public /* synthetic */ i(int i10) {
        this.f3981b = i10;
    }

    public static String b(int i10, String str) {
        return str + i10;
    }

    public static String c(int i10, String str, String str2) {
        return str + i10 + str2;
    }

    public static void d(int i10, C1086g c1086g, int i11, Ia.p pVar) {
        c1086g.E(Integer.valueOf(i10));
        c1086g.t(Integer.valueOf(i11), pVar);
    }

    @Override // p183oa.b
    public void a(Object obj) {
        switch (this.f3981b) {
            case 5:
                Log.e("FIAM.Headless", "Rate limiter client write failure");
                break;
            default:
                Q3.d.B();
                break;
        }
    }

    @Override // J4.q.a
    public Object apply(Object obj) {
        switch (this.f3981b) {
            case 0:
                Cursor cursor = (Cursor) obj;
                ArrayList arrayList = new ArrayList();
                while (cursor.moveToNext()) {
                    String string = cursor.getString(1);
                    if (string == null) {
                        throw new NullPointerException("Null backendName");
                    }
                    Priority priorityB = M4.a.b(cursor.getInt(2));
                    String string2 = cursor.getString(3);
                    arrayList.add(new C4.l(string, string2 == null ? null : Base64.decode(string2, 0), priorityB));
                }
                return arrayList;
            default:
                return Integer.valueOf(((p078g1.y) obj).f35493c);
        }
    }

    @Override // com.facebook.internal.FeatureManager.a
    public void e(boolean z10) {
        if (z10) {
            Z3.q.f7863m = true;
        }
    }

    @Override // p228s6.d
    public Object f(p228s6.q qVar) {
        return FirebasePerfRegistrar.providesFirebasePerformance(qVar);
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        ((p162n1.b) obj).getClass();
    }

    @Override // androidx.compose.ui.graphics.colorspace.j
    public double g(double d10) {
        return d10;
    }
}
