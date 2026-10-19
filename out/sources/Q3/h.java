package Q3;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: RequestManagerFragment.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class h extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q3.a f5069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f5070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f5071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.bumptech.glide.e f5072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f5073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Fragment f5074g;

    /* JADX INFO: compiled from: RequestManagerFragment.java */
    public class a implements j {
        public a() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + h.this + "}";
        }
    }

    public h() {
        Q3.a aVar = new Q3.a();
        this.f5070c = new a();
        this.f5071d = new HashSet();
        this.f5069b = aVar;
    }

    public final void a(Activity activity) {
        h hVar = this.f5073f;
        if (hVar != null) {
            hVar.f5071d.remove(this);
            this.f5073f = null;
        }
        i iVar = com.bumptech.glide.b.b(activity).f24475g;
        iVar.getClass();
        h hVarH = iVar.h(activity.getFragmentManager(), null, i.j(activity));
        this.f5073f = hVarH;
        if (equals(hVarH)) {
            return;
        }
        this.f5073f.f5071d.add(this);
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException unused) {
            Log.isLoggable("RMFragment", 5);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Q3.a aVar = this.f5069b;
        aVar.f5062d = true;
        Iterator it = X3.j.d(aVar.f5060b).iterator();
        while (it.hasNext()) {
            ((f) it.next()).e();
        }
        h hVar = this.f5073f;
        if (hVar != null) {
            hVar.f5071d.remove(this);
            this.f5073f = null;
        }
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        h hVar = this.f5073f;
        if (hVar != null) {
            hVar.f5071d.remove(this);
            this.f5073f = null;
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f5069b.a();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        Q3.a aVar = this.f5069b;
        aVar.f5061c = false;
        Iterator it = X3.j.d(aVar.f5060b).iterator();
        while (it.hasNext()) {
            ((f) it.next()).a();
        }
    }

    @Override // android.app.Fragment
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f5074g;
        }
        sb2.append(parentFragment);
        sb2.append("}");
        return sb2.toString();
    }
}
