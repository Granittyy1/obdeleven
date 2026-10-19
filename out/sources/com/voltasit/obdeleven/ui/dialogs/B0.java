package com.voltasit.obdeleven.ui.dialogs;

import V8.C0831e;
import android.content.Context;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.util.Texttabe;
import com.parse.ControlUnitDB;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: compiled from: SecurityAccessDialogFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class B0 extends com.voltasit.obdeleven.presentation.dialogs.e implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Bundle f33747A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Object f33748B = KoinJavaComponent.b(J8.a.class, null, null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayAdapter<String> f33749s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Context f33750t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public B8.H f33751u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a f33752v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ControlUnit f33753w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Bundle f33754x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List<String> f33755y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f33756z;

    /* JADX INFO: compiled from: SecurityAccessDialogFragment.java */
    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f33757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final A0 f33758b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f33760d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f33761e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f33762f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f33763g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f33765i;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f33759c = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final LinkedList<Long> f33764h = new LinkedList<>();

        public a(String str, A0 a10) {
            this.f33757a = str;
            this.f33758b = a10;
        }

        public final void a() {
            B0.this.C(String.format(Locale.US, "%05d", Integer.valueOf(this.f33761e))).continueWithTask(new V8.m(3, this), Task.UI_THREAD_EXECUTOR);
        }
    }

    public final void B(int i10) {
        if (i10 == -1) {
            this.f33751u.f1694v.setError(this.f33750t.getString(R.string.common_something_went_wrong));
        } else {
            this.f33751u.f1694v.setError(String.format(Locale.US, "(%02X) %s", Integer.valueOf(i10), Texttabe.a(i10)));
        }
    }

    public final Task<Integer> C(String str) {
        return this.f33753w.D(false).continueWithTask(new V8.g(this, 3, str));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xa.g] */
    public final void D() {
        if (this.f33756z) {
            y();
            Bundle bundle = new Bundle();
            bundle.putBundle("key_bundle", this.f33747A);
            w("SecurityAccessDialogFragment", DialogCallback.CallbackType.f31101b, bundle);
            return;
        }
        ((J8.a) this.f33748B.getValue()).Z();
        if (!this.f33751u.f1687G.booleanValue()) {
            this.f33752v.f33765i = false;
            return;
        }
        String string = this.f33751u.f1693u.getText().toString();
        if (string.length() < 5) {
            this.f33751u.f1694v.setError(this.f33750t.getString(R.string.view_security_access_login_length));
            return;
        }
        if (!E(string)) {
            this.f33751u.f1694v.setError(this.f33750t.getString(R.string.dialog_security_access_must_know_login));
            return;
        }
        D9.o.m(this.f33751u.f1693u);
        this.f33751u.f1695w.setVisibility(0);
        F(false);
        C(string).continueWith(new C0831e(this, 1, string), Task.UI_THREAD_EXECUTOR);
    }

    public final boolean E(String str) {
        if (this.f33753w.f29327i == ApplicationProtocol.f29264d) {
            return true;
        }
        return (str.isEmpty() ? 0L : Long.parseLong(str)) <= 65535;
    }

    public final void F(boolean z10) {
        this.f33751u.f1692t.setEnabled(z10);
        this.f33751u.f1690r.setEnabled(z10);
        this.f33751u.f1691s.setEnabled(z10);
        this.f17606m.setCancelable(z10);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        B8.H h8 = (B8.H) M0.e.a(layoutInflater, R.layout.dialog_security, viewGroup, false, null);
        this.f33751u = h8;
        h8.w(this);
        this.f33751u.f1690r.setText(getString(R.string.common_cancel));
        this.f33751u.f1692t.setText(getString(R.string.common_ok));
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f33754x = bundle;
        if (bundle != null && bundle.containsKey("key_login_finder_enabled")) {
            this.f33751u.u(Boolean.valueOf(this.f33754x.getBoolean("key_login_finder_enabled")));
        }
        Bundle bundle2 = this.f33754x;
        if (bundle2 != null && bundle2.containsKey("key_is_offline")) {
            this.f33756z = this.f33754x.getBoolean("key_is_offline");
        }
        Bundle bundle3 = this.f33754x;
        if (bundle3 != null && bundle3.containsKey("key_bundle")) {
            this.f33747A = this.f33754x.getBundle("key_bundle");
        }
        if (this.f33756z) {
            this.f33751u.t(Boolean.FALSE);
        } else {
            this.f33751u.t(Boolean.TRUE);
        }
        Context context = getContext();
        this.f33750t = context;
        if (context != null) {
            this.f33749s = new ArrayAdapter<>(this.f33750t, R.layout.list_textview, R.id.textView);
        }
        this.f33751u.v(Boolean.TRUE);
        ListView listView = this.f33751u.f1697y;
        if (listView != null) {
            listView.setAdapter((ListAdapter) this.f33749s);
            this.f33751u.f1697y.setOnItemClickListener(this);
        }
        ControlUnit controlUnit = this.f33753w;
        if (controlUnit == null) {
            return this.f33751u.f4488d;
        }
        ControlUnitDB controlUnitDB = controlUnit.f29320b;
        F(false);
        controlUnitDB.getConfirmedSecurityAccessCodesAsync().continueWith(new p010a9.a(3, this), Task.UI_THREAD_EXECUTOR);
        this.f33751u.f1693u.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f33753w.f29327i == ApplicationProtocol.f29264d ? 10 : 5)});
        return this.f33751u.f4488d;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j) {
        String item = this.f33749s.getItem(i10);
        if (item == null) {
            return;
        }
        this.f33751u.f1693u.setText(item);
        this.f33751u.f1693u.setSelection(item.length());
    }
}
