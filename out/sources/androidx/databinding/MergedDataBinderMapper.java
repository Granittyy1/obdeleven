package androidx.databinding;

import M0.c;
import M0.d;
import M0.h;
import android.util.Log;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class MergedDataBinderMapper extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f17030a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f17031b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f17032c = new CopyOnWriteArrayList();

    @Override // M0.c
    public final h b(d dVar, View view, int i10) {
        Iterator it = this.f17031b.iterator();
        while (it.hasNext()) {
            h hVarB = ((c) it.next()).b(dVar, view, i10);
            if (hVarB != null) {
                return hVarB;
            }
        }
        if (f()) {
            return b(dVar, view, i10);
        }
        return null;
    }

    @Override // M0.c
    public final h c(d dVar, View[] viewArr, int i10) {
        Iterator it = this.f17031b.iterator();
        while (it.hasNext()) {
            h hVarC = ((c) it.next()).c(dVar, viewArr, i10);
            if (hVarC != null) {
                return hVarC;
            }
        }
        if (f()) {
            return c(dVar, viewArr, i10);
        }
        return null;
    }

    @Override // M0.c
    public final int d(String str) {
        Iterator it = this.f17031b.iterator();
        while (it.hasNext()) {
            int iD = ((c) it.next()).d(str);
            if (iD != 0) {
                return iD;
            }
        }
        if (f()) {
            return d(str);
        }
        return 0;
    }

    public final void e(c cVar) {
        if (this.f17030a.add(cVar.getClass())) {
            this.f17031b.add(cVar);
            Iterator<c> it = cVar.a().iterator();
            while (it.hasNext()) {
                e(it.next());
            }
        }
    }

    public final boolean f() {
        CopyOnWriteArrayList<String> copyOnWriteArrayList = this.f17032c;
        boolean z10 = false;
        for (String str : copyOnWriteArrayList) {
            try {
                Class<?> cls = Class.forName(str);
                if (c.class.isAssignableFrom(cls)) {
                    e((c) cls.newInstance());
                    copyOnWriteArrayList.remove(str);
                    z10 = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e10) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e10);
            } catch (InstantiationException e11) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e11);
            }
        }
        return z10;
    }
}
