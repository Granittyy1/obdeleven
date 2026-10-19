package com.voltasit.obdeleven.ui.dialogs.user;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1377u;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import com.google.android.material.datepicker.p;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.dialogs.e;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

/* JADX INFO: compiled from: ForceChangePasswordDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ForceChangePasswordDialog extends e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f34031s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public EditText f34032t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f34033u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ProgressBar f34034v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LinearLayout f34035w;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.voltasit.obdeleven.ui.dialogs.user.ForceChangePasswordDialog$special$$inlined$viewModel$default$1] */
    public ForceChangePasswordDialog() {
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.ui.dialogs.user.ForceChangePasswordDialog$special$$inlined$viewModel$default$1
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
        this.f34031s = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<b>(this) { // from class: com.voltasit.obdeleven.ui.dialogs.user.ForceChangePasswordDialog$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.ui.dialogs.user.b] */
            @Override // Ia.a
            public final b invoke() {
                p014b1.a defaultViewModelCreationExtras;
                Fragment fragment = this.$this_viewModel;
                Pb.a aVar = this.$qualifier;
                Ia.a aVar2 = r10;
                Ia.a aVar3 = this.$extrasProducer;
                Ia.a aVar4 = this.$parameters;
                b0 viewModelStore = ((c0) aVar2.invoke()).getViewModelStore();
                if (aVar3 == null || (defaultViewModelCreationExtras = (p014b1.a) aVar3.invoke()) == null) {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    i.d(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
                }
                return Gb.a.a(l.a(b.class), viewModelStore, null, defaultViewModelCreationExtras, aVar, Cb.a.i(fragment), aVar4);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final b B() {
        return (b) this.f34031s.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        i.e(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.profile_fragment_password_dialog, viewGroup, false);
        Dialog dialog = this.f17606m;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.requestFeature(1);
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.password_dialog_input_title);
        View viewFindViewById = viewInflate.findViewById(R.id.change_password_dialog_input);
        i.d(viewFindViewById, "findViewById(...)");
        this.f34032t = (EditText) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.error_text);
        i.d(viewFindViewById2, "findViewById(...)");
        this.f34033u = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.dialog_loader);
        i.d(viewFindViewById3, "findViewById(...)");
        this.f34034v = (ProgressBar) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R.id.dialog_inputLayout);
        i.d(viewFindViewById4, "findViewById(...)");
        this.f34035w = (LinearLayout) viewFindViewById4;
        ((FrameLayout) viewInflate.findViewById(R.id.dialog_layout)).setMeasureAllChildren(true);
        Button button = (Button) viewInflate.findViewById(R.id.item_button_positive);
        Button button2 = (Button) viewInflate.findViewById(R.id.item_button_negative);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.passwordDialog_passwordRequirements);
        String string = getString(R.string.common_character_length_password_requirement);
        i.d(string, "getString(...)");
        String string2 = getString(R.string.common_upper_lower_letter_password_requirement);
        i.d(string2, "getString(...)");
        String string3 = getString(R.string.common_numeric_character_password_requirement);
        i.d(string3, "getString(...)");
        String string4 = getString(R.string.common_special_character_password_requirement);
        i.d(string4, "getString(...)");
        textView2.setText(string + "\n" + string2 + "\n" + string3 + "\n" + string4);
        textView.setText(R.string.common_change_password);
        button.setText(R.string.common_save);
        button2.setText(R.string.common_skip);
        s(B().f34039c);
        if (B().f34039c) {
            button2.setVisibility(0);
        } else {
            button2.setVisibility(8);
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.voltasit.obdeleven.ui.dialogs.user.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ForceChangePasswordDialog this$0 = this.f34036b;
                i.e(this$0, "this$0");
                b bVarB = this$0.B();
                EditText editText = this$0.f34032t;
                if (editText == null) {
                    i.m(MetricTracker.Object.INPUT);
                    throw null;
                }
                String password = editText.getText().toString();
                bVarB.getClass();
                i.e(password, "password");
                C2680e.c(Z.a(bVarB), null, null, new ForceChangePasswordViewModel$changePassword$1(bVarB, password, null), 3);
            }
        });
        button2.setOnClickListener(new p(this, 5));
        C2688e.l(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new ForceChangePasswordDialog$setupObservers$1(this, null), B().f34041e), C1377u.a(this));
        C2688e.l(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new ForceChangePasswordDialog$setupObservers$2(this, null), B().f34043g), C1377u.a(this));
        C2688e.l(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new ForceChangePasswordDialog$setupObservers$3(this, null), B().f34045i), C1377u.a(this));
        C2688e.l(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new ForceChangePasswordDialog$setupObservers$4(this, null), B().f34046k), C1377u.a(this));
        return viewInflate;
    }
}
