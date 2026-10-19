package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: compiled from: MaterialTextInputPicker.java */
/* JADX INFO: loaded from: classes3.dex */
public final class t<S> extends z<S> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC2030d<S> f27112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C2027a f27113e;

    /* JADX INFO: compiled from: MaterialTextInputPicker.java */
    public class a extends y<S> {
        public a() {
        }

        @Override // com.google.android.material.datepicker.y
        public final void a(S s10) {
            Iterator<y<S>> it = t.this.f27139b.iterator();
            while (it.hasNext()) {
                it.next().a(s10);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f27111c = bundle.getInt("THEME_RES_ID_KEY");
        this.f27112d = (InterfaceC2030d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f27113e = (C2027a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f27111c));
        InterfaceC2030d<S> interfaceC2030d = this.f27112d;
        new a();
        return interfaceC2030d.N();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f27111c);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f27112d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f27113e);
    }
}
