package p206q7;

import O.e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.util.d;
import com.google.firebase.perf.util.g;
import java.util.HashMap;
import java.util.WeakHashMap;
import p241t7.a;
import p253u7.b;
import p314z7.f;

/* JADX INFO: compiled from: FragmentStateMonitor.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends y.m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f46163f = a.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap<Fragment, Trace> f46164a = new WeakHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f46165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f46166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f46167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f46168e;

    public c(e eVar, f fVar, a aVar, d dVar) {
        this.f46165b = eVar;
        this.f46166c = fVar;
        this.f46167d = aVar;
        this.f46168e = dVar;
    }

    @Override // androidx.fragment.app.y.m
    public final void a(y yVar, Fragment fragment) {
        d dVar;
        Object[] objArr = {fragment.getClass().getSimpleName()};
        a aVar = f46163f;
        aVar.b("FragmentMonitor %s.onFragmentPaused ", objArr);
        WeakHashMap<Fragment, Trace> weakHashMap = this.f46164a;
        if (!weakHashMap.containsKey(fragment)) {
            aVar.g("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = weakHashMap.get(fragment);
        weakHashMap.remove(fragment);
        d dVar2 = this.f46168e;
        boolean z10 = dVar2.f46173d;
        a aVar2 = d.f46169e;
        if (z10) {
            HashMap map = dVar2.f46172c;
            if (map.containsKey(fragment)) {
                b bVar = (b) map.remove(fragment);
                d<b> dVarA = dVar2.a();
                if (dVarA.b()) {
                    b bVarA = dVarA.a();
                    bVarA.getClass();
                    dVar = new d(new b(bVarA.f47439a - bVar.f47439a, bVarA.f47440b - bVar.f47440b, bVarA.f47441c - bVar.f47441c));
                } else {
                    aVar2.b("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
                    dVar = new d();
                }
            } else {
                aVar2.b("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
                dVar = new d();
            }
        } else {
            aVar2.a();
            dVar = new d();
        }
        if (!dVar.b()) {
            aVar.g("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
        } else {
            g.a(trace, (b) dVar.a());
            trace.stop();
        }
    }

    @Override // androidx.fragment.app.y.m
    public final void b(y yVar, Fragment fragment) {
        f46163f.b("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace("_st_".concat(fragment.getClass().getSimpleName()), this.f46166c, this.f46165b, this.f46167d);
        trace.start();
        trace.putAttribute("Parent_fragment", fragment.getParentFragment() == null ? "No parent" : fragment.getParentFragment().getClass().getSimpleName());
        if (fragment.getActivity() != null) {
            trace.putAttribute("Hosting_activity", fragment.getActivity().getClass().getSimpleName());
        }
        this.f46164a.put(fragment, trace);
        d dVar = this.f46168e;
        boolean z10 = dVar.f46173d;
        a aVar = d.f46169e;
        if (!z10) {
            aVar.a();
            return;
        }
        HashMap map = dVar.f46172c;
        if (map.containsKey(fragment)) {
            aVar.b("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
            return;
        }
        d<b> dVarA = dVar.a();
        if (dVarA.b()) {
            map.put(fragment, dVarA.a());
        } else {
            aVar.b("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        }
    }
}
