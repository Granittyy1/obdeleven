package W7;

import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.utils.bluetooth.g;
import com.voltasit.obdeleven.utils.bluetooth.n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.koin.java.KoinJavaComponent;
import p134k8.a2;

/* JADX INFO: compiled from: OBDeleven.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f7063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f7064b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static g f7065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static n f7066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static a2 f7067e;

    public static void a(d dVar) {
        O.e.j("OBDeleven", "addOnStateChangeListener(" + dVar.getClass().getName() + ")");
        f7064b.put(dVar.a(), dVar);
    }

    public static void b() {
        O.e.j("OBDeleven", "disconnectEngine()");
        g gVar = f7065c;
        if (gVar != null) {
            gVar.stop();
        }
        ((p109i8.g) KoinJavaComponent.b(p109i8.g.class, null, null).getValue()).b();
        f7067e = null;
        f7066d = null;
    }

    public static synchronized int c() {
        O.e.j("OBDeleven", "getState(" + f7063a + ")");
        return f7063a;
    }

    public static boolean d() {
        return f7066d != null;
    }

    public static boolean e() {
        return f7067e != null;
    }

    public static void f(d dVar) {
        if (dVar == null) {
            O.e.D("OBDeleven", "removeOnStateChangeListener(null)");
            return;
        }
        O.e.j("OBDeleven", "removeOnStateChangeListener(" + dVar.getClass().getName() + ")");
        f7064b.remove(dVar.a());
    }

    public static synchronized void g(final int i10) {
        O.e.j("OBDeleven", "setState(" + i10 + ")");
        f7063a = i10;
        Task.call(new Callable() { // from class: W7.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Iterator it = c.f7064b.values().iterator();
                while (it.hasNext()) {
                    ((d) it.next()).e(i10);
                }
                return null;
            }
        }, Task.UI_THREAD_EXECUTOR);
    }

    public static void h(a2 a2Var) {
        if (a2Var == null) {
            a2 a2Var2 = f7067e;
            if (a2Var2 != null) {
                a2Var2.a();
            }
            O.e.j("OBDeleven", "setVehicle(null)");
        } else {
            O.e.j("OBDeleven", "setVehicle(" + a2Var.f42726c.e() + ")");
        }
        f7067e = a2Var;
    }
}
