package com.voltasit.obdeleven.ui.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.enums.SupportedFunction;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.parse.model.AdaptationType;
import com.voltasit.parse.model.CodingType;
import java.util.ArrayList;
import p220r9.C2785q;

/* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: BackupDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class C2147h extends AbstractC2155l implements DialogCallback {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public B0 f33966A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayAdapter<String> f33967y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C2785q f33968z;

    public final void D(int i10) {
        if (isAdded()) {
            this.f33987v = i10;
            if (i10 == 0) {
                z().U();
                B();
                s(true);
                this.f33984s.f2128x.setVisibility(0);
                this.f33984s.f2117H.setVisibility(8);
                this.f33984s.f2110A.setVisibility(0);
                this.f33984s.f2111B.setVisibility(0);
                this.f33984s.f2126v.f4488d.setVisibility(0);
                this.f33984s.f2122r.f4488d.setVisibility(0);
                this.f33984s.f2118I.f4488d.setVisibility(0);
                this.f33984s.f2123s.f4488d.setVisibility(0);
                this.f33984s.f2130z.f4488d.setVisibility(0);
                this.f33988w.getButton(-1).setText(R.string.common_start);
                this.f33988w.getButton(-2).setText(R.string.common_cancel);
                this.f33988w.getButton(-2).setVisibility(0);
                this.f33988w.getButton(-3).setText(R.string.dialog_backup_add_login);
                this.f33988w.getButton(-3).setVisibility(0);
                E();
                return;
            }
            if (i10 == 1) {
                z().T();
                s(false);
                this.f33988w.setOnKeyListener(new DialogInterfaceOnKeyListenerC2149i());
                this.f33984s.f2128x.setVisibility(8);
                this.f33984s.f2117H.setVisibility(0);
                this.f33984s.f2110A.setVisibility(8);
                this.f33984s.f2111B.setVisibility(8);
                this.f33984s.f2126v.f4488d.setVisibility(8);
                this.f33984s.f2122r.f4488d.setVisibility(8);
                this.f33984s.f2118I.f4488d.setVisibility(8);
                this.f33984s.f2123s.f4488d.setVisibility(8);
                this.f33984s.f2130z.f4488d.setVisibility(8);
                this.f33988w.getButton(-1).setText(R.string.common_cancel);
                this.f33988w.getButton(-2).setVisibility(8);
                this.f33988w.getButton(-3).setVisibility(8);
                D9.o.m(this.f33984s.f2128x.getEditText());
                return;
            }
            if (i10 == 2) {
                z().U();
                B();
                s(true);
                this.f33984s.f2115F.setText(R.string.common_complete);
                this.f33988w.getButton(-1).setText(R.string.common_ok);
                return;
            }
            if (i10 == 3) {
                this.f33984s.f2115F.setText(R.string.common_saving);
                return;
            }
            if (i10 != 4) {
                return;
            }
            z().U();
            B();
            s(true);
            this.f33984s.f2115F.setText(R.string.common_something_wrong);
            this.f33988w.getButton(-1).setText(R.string.common_ok);
        }
    }

    public final void E() {
        this.f33984s.f2126v.f1925t.setVisibility(8);
        this.f33984s.f2122r.f1925t.setVisibility(8);
        this.f33984s.f2118I.f1925t.setVisibility(8);
        this.f33984s.f2130z.f1925t.setVisibility(8);
        this.f33984s.f2123s.f1925t.setVisibility(8);
        ArrayList arrayListM = this.f33985t.M();
        if (arrayListM.contains(SupportedFunction.f29287h) || arrayListM.contains(SupportedFunction.f29286g)) {
            this.f33984s.f2126v.f1925t.setVisibility(0);
            this.f33984s.f2126v.f1923r.setChecked(true);
            this.f33984s.f2126v.f1924s.setVisibility(8);
            this.f33984s.f2126v.f1926u.setText(this.f33985t.f29320b.getCodingType() == CodingType.f34406f ? R.string.common_long_coding : R.string.common_coding);
            this.f33984s.f2126v.f1926u.setTextColor(getResources().getColor(R.color.black));
            this.f33984s.f2126v.f1923r.setClickable(true);
        }
        if (arrayListM.contains(SupportedFunction.j) || arrayListM.contains(SupportedFunction.f29288i)) {
            this.f33984s.f2122r.f1925t.setVisibility(0);
            this.f33984s.f2122r.f1923r.setChecked(true);
            this.f33984s.f2122r.f1924s.setVisibility(8);
            this.f33984s.f2122r.f1926u.setText(this.f33985t.f29320b.getAdaptationType() == AdaptationType.LONG_ADAPTATION ? R.string.common_long_adaptation : R.string.common_adaptation);
            this.f33984s.f2122r.f1926u.setTextColor(getResources().getColor(R.color.black));
            this.f33984s.f2122r.f1923r.setClickable(true);
        }
        if (arrayListM.contains(SupportedFunction.f29284e)) {
            this.f33984s.f2118I.f1925t.setVisibility(0);
            this.f33984s.f2118I.f1923r.setChecked(true);
            this.f33984s.f2118I.f1924s.setVisibility(8);
            this.f33984s.f2118I.f1926u.setText(R.string.common_subsystems);
            this.f33984s.f2118I.f1926u.setTextColor(getResources().getColor(R.color.black));
            this.f33984s.f2118I.f1923r.setClickable(true);
        }
        if (arrayListM.contains(SupportedFunction.f29285f)) {
            this.f33984s.f2130z.f1925t.setVisibility(0);
            this.f33984s.f2130z.f1923r.setChecked(true);
            this.f33984s.f2130z.f1924s.setVisibility(8);
            this.f33984s.f2130z.f1926u.setText(R.string.common_live_data);
            this.f33984s.f2130z.f1926u.setTextColor(getResources().getColor(R.color.black));
            this.f33984s.f2130z.f1923r.setClickable(true);
        }
        if (arrayListM.contains(SupportedFunction.f29283d)) {
            this.f33984s.f2123s.f1925t.setVisibility(0);
            this.f33984s.f2123s.f1923r.setChecked(true);
            this.f33984s.f2123s.f1924s.setVisibility(8);
            this.f33984s.f2123s.f1926u.setText(R.string.common_advanced_identification);
            this.f33984s.f2123s.f1926u.setTextColor(getResources().getColor(R.color.black));
            if (this.f33985t.f29327i == ApplicationProtocol.f29264d) {
                this.f33984s.f2123s.f1923r.setClickable(true);
            } else {
                this.f33984s.f2123s.f4488d.setVisibility(8);
            }
        }
    }

    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String str, DialogCallback.CallbackType callbackType, Bundle bundle) {
        if ("SecurityAccessDialogFragment".equals(str)) {
            if (callbackType == DialogCallback.CallbackType.f31102c) {
                this.f33985t.f29320b.getConfirmedSecurityAccessCodesAsync().continueWith(new V8.B(2, this), Task.UI_THREAD_EXECUTOR);
            }
            B0 b10 = this.f33966A;
            if (b10 != null) {
                b10.y();
                this.f33966A = null;
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        View view;
        int i10 = 0;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int i11 = B8.r.f2109M;
        this.f33984s = (B8.r) M0.e.a(layoutInflaterFrom, R.layout.dialog_backup, null, false, null);
        if (getActivity() == null) {
            y();
            view = this.f33984s.f4488d;
        } else {
            if (bundle == null) {
                bundle = getArguments();
            }
            if (bundle == null || !bundle.containsKey("key_title")) {
                P8.c.a(5, "BackupDialog", "Not all parameters provided for MultiBackupDialog", new Object[0]);
                y();
                view = this.f33984s.f4488d;
            } else {
                int i12 = bundle.getInt("key_title");
                this.f33986u = i12;
                this.f33984s.f2121L.setText(i12);
                if (this.f33985t.f29321c == null) {
                    w("BackupDialog", DialogCallback.CallbackType.f31104e, new Bundle());
                }
                if (this.f33985t == null) {
                    this.f33984s.f2111B.setVisibility(8);
                    this.f33984s.f2110A.setVisibility(8);
                    w("BackupDialog", DialogCallback.CallbackType.f31104e, new Bundle());
                    view = this.f33984s.f4488d;
                } else {
                    E();
                    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getActivity(), R.layout.list_textview, R.id.textView);
                    this.f33967y = arrayAdapter;
                    this.f33984s.f2111B.setAdapter((ListAdapter) arrayAdapter);
                    this.f33985t.f29320b.getConfirmedSecurityAccessCodesAsync().continueWith(new C2141e(i10, this), Task.UI_THREAD_EXECUTOR);
                    view = this.f33984s.f4488d;
                }
            }
        }
        AlertDialog alertDialogCreate = new AlertDialog.Builder(z()).setView(view).setNeutralButton(R.string.dialog_backup_add_login, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.common_start, (DialogInterface.OnClickListener) null).setNegativeButton(R.string.common_cancel, (DialogInterface.OnClickListener) null).create();
        this.f33988w = alertDialogCreate;
        alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.voltasit.obdeleven.ui.dialogs.d
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                C2147h c2147h = this.f33912b;
                AlertDialog alertDialog = (AlertDialog) c2147h.f17606m;
                alertDialog.getButton(-1).setOnClickListener(new ViewOnClickListenerC2143f(0, c2147h));
                alertDialog.getButton(-3).setOnClickListener(new com.facebook.login.d(c2147h, 3));
                alertDialog.getButton(-2).setOnClickListener(new com.voltasit.obdeleven.presentation.twofactorauth.verify.c(1, c2147h));
                c2147h.f33984s.f2124t.setColorFilter(822083583, PorterDuff.Mode.SRC_IN);
                c2147h.f33984s.f2124t.setTag(822083583);
                Window window = c2147h.f33988w.getWindow();
                if (window != null) {
                    window.setSoftInputMode(16);
                }
                c2147h.D(0);
            }
        });
        return this.f33988w;
    }

    @Override // com.voltasit.obdeleven.presentation.dialogs.e
    public final void y() {
        super.y();
        C2785q c2785q = this.f33968z;
        if (c2785q != null) {
            c2785q.r();
        }
    }
}
