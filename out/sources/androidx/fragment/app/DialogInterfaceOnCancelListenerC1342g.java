package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.y.r;
import androidx.lifecycle.InterfaceC1376t;
import com.voltasit.obdeleven.R;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.fragment.app.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DialogFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC1342g extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f17596b;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f17604k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Dialog f17606m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f17607n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f17608o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f17609p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f17597c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f17598d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f17599e = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17600f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17601g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17602h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f17603i = true;
    public int j = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f17605l = new d();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f17610q = false;

    /* JADX INFO: renamed from: androidx.fragment.app.g$a */
    /* JADX INFO: compiled from: DialogFragment.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            DialogInterfaceOnCancelListenerC1342g dialogInterfaceOnCancelListenerC1342g = DialogInterfaceOnCancelListenerC1342g.this;
            dialogInterfaceOnCancelListenerC1342g.f17599e.onDismiss(dialogInterfaceOnCancelListenerC1342g.f17606m);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.g$b */
    /* JADX INFO: compiled from: DialogFragment.java */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            DialogInterfaceOnCancelListenerC1342g dialogInterfaceOnCancelListenerC1342g = DialogInterfaceOnCancelListenerC1342g.this;
            Dialog dialog = dialogInterfaceOnCancelListenerC1342g.f17606m;
            if (dialog != null) {
                dialogInterfaceOnCancelListenerC1342g.onCancel(dialog);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.g$c */
    /* JADX INFO: compiled from: DialogFragment.java */
    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            DialogInterfaceOnCancelListenerC1342g dialogInterfaceOnCancelListenerC1342g = DialogInterfaceOnCancelListenerC1342g.this;
            Dialog dialog = dialogInterfaceOnCancelListenerC1342g.f17606m;
            if (dialog != null) {
                dialogInterfaceOnCancelListenerC1342g.onDismiss(dialog);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.g$d */
    /* JADX INFO: compiled from: DialogFragment.java */
    public class d implements androidx.lifecycle.D<InterfaceC1376t> {
        public d() {
        }

        @Override // androidx.lifecycle.D
        public final void d(InterfaceC1376t interfaceC1376t) {
            if (interfaceC1376t != null) {
                DialogInterfaceOnCancelListenerC1342g dialogInterfaceOnCancelListenerC1342g = DialogInterfaceOnCancelListenerC1342g.this;
                if (dialogInterfaceOnCancelListenerC1342g.f17603i) {
                    View viewRequireView = dialogInterfaceOnCancelListenerC1342g.requireView();
                    if (viewRequireView.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (dialogInterfaceOnCancelListenerC1342g.f17606m != null) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Objects.toString(dialogInterfaceOnCancelListenerC1342g.f17606m);
                        }
                        dialogInterfaceOnCancelListenerC1342g.f17606m.setContentView(viewRequireView);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.g$e */
    /* JADX INFO: compiled from: DialogFragment.java */
    public class e extends AbstractC1349n {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC1349n f17615b;

        public e(AbstractC1349n abstractC1349n) {
            this.f17615b = abstractC1349n;
        }

        @Override // androidx.fragment.app.AbstractC1349n
        public final View b(int i10) {
            AbstractC1349n abstractC1349n = this.f17615b;
            if (abstractC1349n.c()) {
                return abstractC1349n.b(i10);
            }
            Dialog dialog = DialogInterfaceOnCancelListenerC1342g.this.f17606m;
            if (dialog != null) {
                return dialog.findViewById(i10);
            }
            return null;
        }

        @Override // androidx.fragment.app.AbstractC1349n
        public final boolean c() {
            return this.f17615b.c() || DialogInterfaceOnCancelListenerC1342g.this.f17610q;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final AbstractC1349n createFragmentContainer() {
        return new e(super.createFragmentContainer());
    }

    public final void o() {
        p(true, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().f(this.f17605l);
        if (this.f17609p) {
            return;
        }
        this.f17608o = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f17596b = new Handler();
        this.f17603i = this.mContainerId == 0;
        if (bundle != null) {
            this.f17600f = bundle.getInt("android:style", 0);
            this.f17601g = bundle.getInt("android:theme", 0);
            this.f17602h = bundle.getBoolean("android:cancelable", true);
            this.f17603i = bundle.getBoolean("android:showsDialog", this.f17603i);
            this.j = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f17606m;
        if (dialog != null) {
            this.f17607n = true;
            dialog.setOnDismissListener(null);
            this.f17606m.dismiss();
            if (!this.f17608o) {
                onDismiss(this.f17606m);
            }
            this.f17606m = null;
            this.f17610q = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        if (!this.f17609p && !this.f17608o) {
            this.f17608o = true;
        }
        getViewLifecycleOwnerLiveData().i(this.f17605l);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f17607n) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            toString();
        }
        p(true, true);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        boolean z10 = this.f17603i;
        if (!z10 || this.f17604k) {
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
            }
            return layoutInflaterOnGetLayoutInflater;
        }
        if (z10 && !this.f17610q) {
            try {
                this.f17604k = true;
                Dialog dialogR = r(bundle);
                this.f17606m = dialogR;
                if (this.f17603i) {
                    u(dialogR, this.f17600f);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.f17606m.setOwnerActivity((Activity) context);
                    }
                    this.f17606m.setCancelable(this.f17602h);
                    this.f17606m.setOnCancelListener(this.f17598d);
                    this.f17606m.setOnDismissListener(this.f17599e);
                    this.f17610q = true;
                } else {
                    this.f17606m = null;
                }
                this.f17604k = false;
            } catch (Throwable th) {
                this.f17604k = false;
                throw th;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
        }
        Dialog dialog = this.f17606m;
        return dialog != null ? layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext()) : layoutInflaterOnGetLayoutInflater;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.f17606m;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i10 = this.f17600f;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f17601g;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f17602h;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f17603i;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.j;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = this.f17606m;
        if (dialog != null) {
            this.f17607n = false;
            dialog.show();
            View decorView = this.f17606m.getWindow().getDecorView();
            P3.d.u(decorView, this);
            kotlin.jvm.internal.h.h(decorView, this);
            I2.e.p(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.f17606m;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.f17606m == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f17606m.onRestoreInstanceState(bundle2);
    }

    public final void p(boolean z10, boolean z11) {
        if (this.f17608o) {
            return;
        }
        this.f17608o = true;
        this.f17609p = false;
        Dialog dialog = this.f17606m;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f17606m.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.f17596b.getLooper()) {
                    onDismiss(this.f17606m);
                } else {
                    this.f17596b.post(this.f17597c);
                }
            }
        }
        this.f17607n = true;
        if (this.j >= 0) {
            y parentFragmentManager = getParentFragmentManager();
            int i10 = this.j;
            parentFragmentManager.getClass();
            if (i10 < 0) {
                throw new IllegalArgumentException(J4.i.b(i10, "Bad id: "));
            }
            parentFragmentManager.x(parentFragmentManager.new r(null, i10, 1), z10);
            this.j = -1;
            return;
        }
        y parentFragmentManager2 = getParentFragmentManager();
        parentFragmentManager2.getClass();
        C1336a c1336a = new C1336a(parentFragmentManager2);
        c1336a.f17498p = true;
        y yVar = this.mFragmentManager;
        if (yVar != null && yVar != c1336a.f17569r) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        c1336a.b(new I.a(this, 3));
        if (z10) {
            c1336a.j(true, true);
        } else {
            c1336a.i();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.f17606m == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f17606m.onRestoreInstanceState(bundle2);
    }

    public int q() {
        return this.f17601g;
    }

    public Dialog r(Bundle bundle) {
        if (Log.isLoggable("FragmentManager", 3)) {
            toString();
        }
        return new androidx.activity.q(requireContext(), q());
    }

    public final void s(boolean z10) {
        this.f17602h = z10;
        Dialog dialog = this.f17606m;
        if (dialog != null) {
            dialog.setCancelable(z10);
        }
    }

    public final void t() {
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
        }
        this.f17600f = 0;
        this.f17601g = R.style.AppTheme_FullScreenDialog;
    }

    public void u(Dialog dialog, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void v(y yVar, String str) {
        this.f17608o = false;
        this.f17609p = true;
        yVar.getClass();
        C1336a c1336a = new C1336a(yVar);
        c1336a.f17498p = true;
        c1336a.d(0, this, str, 1);
        c1336a.i();
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
