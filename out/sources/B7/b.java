package B7;

import J4.i;
import J4.q;
import android.database.sqlite.SQLiteDatabase;
import androidx.compose.runtime.C;
import androidx.compose.runtime.C1101n0;
import androidx.compose.ui.graphics.H;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.List;
import java.util.Set;
import p005a4.r;
import p114j1.j;
import p228s6.p;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements p228s6.d, q.a, FeatureManager.a, p183oa.a, j.a, p114j1.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1597b;

    public /* synthetic */ b(int i10) {
        this.f1597b = i10;
    }

    public static C1101n0 b(long j, C c10) {
        return c10.b(new H(j));
    }

    public static String c(String str, String str2) {
        return str + str2;
    }

    public static String d(StringBuilder sb2, float f10, char c10) {
        sb2.append(f10);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String g(StringBuilder sb2, String str, char c10) {
        sb2.append(str);
        sb2.append(c10);
        return sb2.toString();
    }

    public static void h(int i10, U7.a aVar) {
        aVar.j(new Integer(i10));
    }

    @Override // p114j1.f
    public void a(Object obj) {
        ((t1.q.b) obj).f47085b.a();
    }

    @Override // J4.q.a
    public Object apply(Object obj) {
        return (List) q.B(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new i(0));
    }

    @Override // com.facebook.internal.FeatureManager.a
    public void e(boolean z10) {
        if (z10) {
            FetchedAppSettingsManager.f25010e.add(new r());
            FetchedAppSettingsManager.c();
        }
    }

    @Override // p228s6.d
    public Object f(p228s6.q qVar) {
        Set setE = qVar.e(p.a(e.class));
        d dVar = d.f1600b;
        if (dVar == null) {
            synchronized (d.class) {
                try {
                    dVar = d.f1600b;
                    if (dVar == null) {
                        dVar = new d();
                        d.f1600b = dVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return new c(setE, dVar);
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        p162n1.b bVar = (p162n1.b) obj;
        switch (this.f1597b) {
            case 9:
                bVar.getClass();
                break;
            default:
                bVar.getClass();
                break;
        }
    }

    @Override // p183oa.a
    public void run() {
        Q3.d.B();
    }
}
