package com.voltasit.obdeleven.presentation.dialogs.backup;

import B8.r;
import D9.o;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.AbstractC2155l;
import com.voltasit.obdeleven.ui.dialogs.DialogInterfaceOnKeyListenerC2149i;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import p134k8.a2;
import p220r9.E;

/* JADX INFO: compiled from: MultiBackupDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class MultiBackupDialog extends AbstractC2155l {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public a2 f32171A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public E f32172B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public b f32173C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public a f32174D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Object f32175E;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final J8.a f32176y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public List<? extends ControlUnit> f32177z;

    /* JADX INFO: compiled from: MultiBackupDialog.kt */
    public interface a {
        void a();

        void onFailure();
    }

    /* JADX INFO: compiled from: MultiBackupDialog.kt */
    public static final class b implements W7.d {
        public b() {
        }

        @Override // W7.d
        public final String a() {
            return null;
        }

        @Override // W7.d
        public final void e(int i10) {
            if (i10 == 0) {
                P8.c.a(3, "MultiBackupDialog", "Cancelling backups", new Object[0]);
                E e10 = MultiBackupDialog.this.f32172B;
                if (e10 != null) {
                    i.b(e10);
                    e10.u();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.voltasit.obdeleven.presentation.dialogs.backup.MultiBackupDialog$special$$inlined$viewModel$default$1] */
    public MultiBackupDialog(J8.a aVar) {
        this.f32176y = aVar;
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.dialogs.backup.MultiBackupDialog$special$$inlined$viewModel$default$1
            final /* synthetic */ Fragment $this_viewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            @Override // Ia.a
            public final Fragment invoke() {
                return this.$this_viewModel;
            }
        };
        this.f32175E = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<h>(this) { // from class: com.voltasit.obdeleven.presentation.dialogs.backup.MultiBackupDialog$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.dialogs.backup.h] */
            @Override // Ia.a
            public final h invoke() {
                p014b1.a defaultViewModelCreationExtras;
                Fragment fragment = this.$this_viewModel;
                Pb.a aVar2 = this.$qualifier;
                Ia.a aVar3 = r10;
                Ia.a aVar4 = this.$extrasProducer;
                Ia.a aVar5 = this.$parameters;
                b0 viewModelStore = ((c0) aVar3.invoke()).getViewModelStore();
                if (aVar4 == null || (defaultViewModelCreationExtras = (p014b1.a) aVar4.invoke()) == null) {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    i.d(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
                }
                return Gb.a.a(l.a(h.class), viewModelStore, null, defaultViewModelCreationExtras, aVar2, Cb.a.i(fragment), aVar5);
            }
        });
    }

    public final void D(Exception exc) {
        Task.call(new c(exc, 0, this), Task.UI_THREAD_EXECUTOR);
    }

    public final void E(int i10) {
        this.f33987v = i10;
        if (i10 == 0) {
            MainActivity mainActivityZ = z();
            if (mainActivityZ != null) {
                mainActivityZ.U();
            }
            B();
            s(true);
            this.f33984s.f2128x.setVisibility(0);
            this.f33984s.f2117H.setVisibility(8);
            this.f33988w.getButton(-1).setText(R.string.common_start);
            this.f33988w.getButton(-2).setText(R.string.common_cancel);
            this.f33988w.getButton(-2).setVisibility(0);
            return;
        }
        if (i10 == 1) {
            MainActivity mainActivityZ2 = z();
            if (mainActivityZ2 != null) {
                mainActivityZ2.T();
            }
            this.f33988w.setOnKeyListener(new DialogInterfaceOnKeyListenerC2149i());
            s(false);
            this.f33984s.f2128x.setVisibility(8);
            this.f33984s.f2117H.setVisibility(0);
            this.f33988w.getButton(-1).setText(R.string.common_cancel);
            this.f33984s.f2120K.setVisibility(8);
            this.f33988w.getButton(-2).setVisibility(8);
            o.m(this.f33984s.f2128x.getEditText());
            return;
        }
        if (i10 == 2) {
            MainActivity mainActivityZ3 = z();
            if (mainActivityZ3 != null) {
                mainActivityZ3.U();
            }
            B();
            s(true);
            this.f33988w.getButton(-1).setText(R.string.common_ok);
            this.f33984s.f2115F.setText(R.string.common_complete);
            return;
        }
        if (i10 == 3) {
            this.f33984s.f2115F.setText(R.string.common_saving);
            return;
        }
        if (i10 != 4) {
            return;
        }
        MainActivity mainActivityZ4 = z();
        if (mainActivityZ4 != null) {
            mainActivityZ4.U();
        }
        B();
        s(true);
        this.f33988w.getButton(-1).setText(R.string.common_ok);
        this.f33984s.f2115F.setText(R.string.common_something_wrong);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        View view;
        int i10 = 0;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int i11 = r.f2109M;
        this.f33984s = (r) M0.e.a(layoutInflaterFrom, R.layout.dialog_backup, null, false, null);
        if (getActivity() == null) {
            y();
            view = this.f33984s.f4488d;
            i.d(view, "getRoot(...)");
        } else {
            if (bundle == null) {
                bundle = getArguments();
            }
            if (bundle == null || !bundle.containsKey("key_title")) {
                P8.c.a(5, "MultiBackupDialog", "Not all parameters provided for MultiBackupDialog", new Object[0]);
                y();
                view = this.f33984s.f4488d;
                i.d(view, "getRoot(...)");
            } else {
                this.f33986u = bundle.getInt("key_title");
                this.f33984s.f2124t.setColorFilter(822083583, PorterDuff.Mode.SRC_IN);
                this.f33984s.f2124t.setTag(822083583);
                this.f33984s.f2121L.setText(this.f33986u);
                this.f33984s.f2111B.setVisibility(8);
                this.f33984s.f2110A.setVisibility(8);
                this.f33984s.f2125u.setVisibility(8);
                this.f33984s.f2120K.setVisibility(0);
                a2 a2Var = W7.c.f7067e;
                this.f32171A = a2Var;
                if (a2Var == null) {
                    y();
                }
                view = this.f33984s.f4488d;
                i.d(view, "getRoot(...)");
            }
        }
        b bVar = new b();
        this.f32173C = bVar;
        W7.c.a(bVar);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(getActivity()).setView(view).setPositiveButton(R.string.common_start, (DialogInterface.OnClickListener) null).setNegativeButton(R.string.common_cancel, (DialogInterface.OnClickListener) null).create();
        this.f33988w = alertDialogCreate;
        alertDialogCreate.setOnShowListener(new com.voltasit.obdeleven.presentation.dialogs.backup.a(i10, this));
        this.f33988w.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.voltasit.obdeleven.presentation.dialogs.backup.b
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i12, KeyEvent keyEvent) {
                MultiBackupDialog this$0 = this.f32181b;
                i.e(this$0, "this$0");
                if (i12 != 4) {
                    return false;
                }
                this$0.f33988w.getButton(-2).callOnClick();
                return false;
            }
        });
        AlertDialog backupDialog = this.f33988w;
        i.d(backupDialog, "backupDialog");
        return backupDialog;
    }

    @Override // com.voltasit.obdeleven.presentation.dialogs.e
    public final void y() {
        super.y();
        b bVar = this.f32173C;
        if (bVar != null) {
            W7.c.f(bVar);
        }
        E e10 = this.f32172B;
        if (e10 != null) {
            e10.r();
        }
    }
}
