package D2;

import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: D2.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: GhostViewPlatform.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0692t implements r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f2691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f2692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f2693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f2694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Method f2695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f2696h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f2697b;

    public C0692t(int i10) {
        this.f2697b = new ArrayList(i10);
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z10 = obj instanceof Object[];
        ArrayList arrayList = (ArrayList) this.f2697b;
        if (z10) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            if (!(obj instanceof Iterator)) {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
    }

    @Override // D2.r
    public void setVisibility(int i10) {
        ((View) this.f2697b).setVisibility(i10);
    }

    @Override // D2.r
    public void a(View view, ViewGroup viewGroup) {
    }
}
