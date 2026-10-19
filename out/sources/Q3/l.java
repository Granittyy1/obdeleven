package Q3;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: SupportRequestManagerFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class l extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q3.a f5088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f5089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f5090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l f5091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.bumptech.glide.e f5092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Fragment f5093g;

    /* JADX INFO: compiled from: SupportRequestManagerFragment.java */
    public class a implements j {
        public a() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + l.this + "}";
        }
    }

    public l() {
        Q3.a aVar = new Q3.a();
        this.f5089c = new a();
        this.f5090d = new HashSet();
        this.f5088b = aVar;
    }

    public final void o(Context context, y yVar) {
        l lVar = this.f5091e;
        if (lVar != null) {
            lVar.f5090d.remove(this);
            this.f5091e = null;
        }
        i iVar = com.bumptech.glide.b.b(context).f24475g;
        iVar.getClass();
        l lVarI = iVar.i(yVar, null, i.j(context));
        this.f5091e = lVarI;
        if (equals(lVarI)) {
            return;
        }
        this.f5091e.f5090d.add(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Fragment parentFragment = this;
        while (parentFragment.getParentFragment() != null) {
            parentFragment = parentFragment.getParentFragment();
        }
        y fragmentManager = parentFragment.getFragmentManager();
        if (fragmentManager == null) {
            Log.isLoggable("SupportRMFragment", 5);
            return;
        }
        try {
            o(getContext(), fragmentManager);
        } catch (IllegalStateException unused) {
            Log.isLoggable("SupportRMFragment", 5);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Q3.a aVar = this.f5088b;
        aVar.f5062d = true;
        Iterator it = X3.j.d(aVar.f5060b).iterator();
        while (it.hasNext()) {
            ((f) it.next()).e();
        }
        l lVar = this.f5091e;
        if (lVar != null) {
            lVar.f5090d.remove(this);
            this.f5091e = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f5093g = null;
        l lVar = this.f5091e;
        if (lVar != null) {
            lVar.f5090d.remove(this);
            this.f5091e = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f5088b.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        Q3.a aVar = this.f5088b;
        aVar.f5061c = false;
        Iterator it = X3.j.d(aVar.f5060b).iterator();
        while (it.hasNext()) {
            ((f) it.next()).a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f5093g;
        }
        sb2.append(parentFragment);
        sb2.append("}");
        return sb2.toString();
    }
}
