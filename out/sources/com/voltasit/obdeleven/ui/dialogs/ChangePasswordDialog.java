package com.voltasit.obdeleven.ui.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.voltasit.obdeleven.R;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: compiled from: ChangePasswordDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ChangePasswordDialog extends M implements Jb.a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Bundle f33769x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f33770y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f33771z = kotlin.a.b(LazyThreadSafetyMode.f42971b, new Ia.a<com.voltasit.obdeleven.domain.usecases.user.E>(this) { // from class: com.voltasit.obdeleven.ui.dialogs.ChangePasswordDialog$special$$inlined$inject$default$1
        final /* synthetic */ Jb.a $this_inject;
        final /* synthetic */ Pb.a $qualifier = null;
        final /* synthetic */ Ia.a $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.$this_inject = this;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [com.voltasit.obdeleven.domain.usecases.user.E, java.lang.Object] */
        @Override // Ia.a
        public final com.voltasit.obdeleven.domain.usecases.user.E invoke() {
            Jb.a aVar = this.$this_inject;
            Pb.a aVar2 = this.$qualifier;
            return (aVar instanceof Jb.b ? ((Jb.b) aVar).b() : aVar.i().f3935a.f5143b).a(this.$parameters, aVar2, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.E.class));
        }
    });

    @Override // Jb.a
    public final Ib.a i() {
        return Jb.a.C0058a.a();
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.M, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        kotlin.jvm.internal.i.e(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.profile_fragment_password_dialog, viewGroup, false);
        Dialog dialog = this.f17606m;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.requestFeature(1);
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.password_dialog_input_title);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(R.id.change_password_dialog_layout);
        EditText editText = (EditText) viewInflate.findViewById(R.id.change_password_dialog_input);
        Button button = (Button) viewInflate.findViewById(R.id.item_button_positive);
        Button button2 = (Button) viewInflate.findViewById(R.id.item_button_negative);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.passwordDialog_passwordRequirements);
        String string = getString(R.string.common_character_length_password_requirement);
        kotlin.jvm.internal.i.d(string, "getString(...)");
        String string2 = getString(R.string.common_upper_lower_letter_password_requirement);
        kotlin.jvm.internal.i.d(string2, "getString(...)");
        String string3 = getString(R.string.common_numeric_character_password_requirement);
        kotlin.jvm.internal.i.d(string3, "getString(...)");
        String string4 = getString(R.string.common_special_character_password_requirement);
        kotlin.jvm.internal.i.d(string4, "getString(...)");
        textView2.setText(string + "\n" + string2 + "\n" + string3 + "\n" + string4);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f33769x = bundle;
        kotlin.jvm.internal.i.b(bundle);
        if (bundle.containsKey("key_title")) {
            Bundle bundle2 = this.f33769x;
            kotlin.jvm.internal.i.b(bundle2);
            textView.setText(bundle2.getInt("key_title"));
        }
        Bundle bundle3 = this.f33769x;
        kotlin.jvm.internal.i.b(bundle3);
        if (bundle3.containsKey("key_input_type")) {
            Bundle bundle4 = this.f33769x;
            kotlin.jvm.internal.i.b(bundle4);
            editText.setInputType(bundle4.getInt("key_input_type"));
        }
        Bundle bundle5 = this.f33769x;
        kotlin.jvm.internal.i.b(bundle5);
        if (bundle5.containsKey("key_input_hint_res")) {
            Bundle bundle6 = this.f33769x;
            kotlin.jvm.internal.i.b(bundle6);
            textInputLayout.setHint(getString(bundle6.getInt("key_input_hint_res")));
        }
        Bundle bundle7 = this.f33769x;
        kotlin.jvm.internal.i.b(bundle7);
        if (bundle7.containsKey("key_tag")) {
            Bundle bundle8 = this.f33769x;
            kotlin.jvm.internal.i.b(bundle8);
            this.f33770y = bundle8.getString("key_tag");
        }
        Bundle bundle9 = this.f33769x;
        kotlin.jvm.internal.i.b(bundle9);
        if (bundle9.containsKey("key_positive_text")) {
            Bundle bundle10 = this.f33769x;
            kotlin.jvm.internal.i.b(bundle10);
            button.setText(bundle10.getInt("key_positive_text"));
        }
        Bundle bundle11 = this.f33769x;
        kotlin.jvm.internal.i.b(bundle11);
        if (bundle11.containsKey("key_negative_text")) {
            Bundle bundle12 = this.f33769x;
            kotlin.jvm.internal.i.b(bundle12);
            button2.setText(bundle12.getInt("key_negative_text"));
        }
        button.setOnClickListener(new p035c9.b(editText, this, 1));
        button2.setOnClickListener(new com.voltasit.obdeleven.presentation.signIn.e(this, 1));
        return viewInflate;
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.M, androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.i.e(outState, "outState");
        super.onSaveInstanceState(outState);
        Bundle bundle = this.f33769x;
        if (bundle == null) {
            return;
        }
        kotlin.jvm.internal.i.b(bundle);
        outState.putInt("key_title", bundle.getInt("key_title"));
        Bundle bundle2 = this.f33769x;
        kotlin.jvm.internal.i.b(bundle2);
        outState.putInt("key_positive_text", bundle2.getInt("key_positive_text"));
        Bundle bundle3 = this.f33769x;
        kotlin.jvm.internal.i.b(bundle3);
        outState.putInt("key_negative_text", bundle3.getInt("key_negative_text"));
        Bundle bundle4 = this.f33769x;
        kotlin.jvm.internal.i.b(bundle4);
        outState.putInt("key_neutral_text", bundle4.getInt("key_neutral_text"));
        Bundle bundle5 = this.f33769x;
        kotlin.jvm.internal.i.b(bundle5);
        outState.putParcelable("key_user", bundle5.getParcelable("key_user"));
        Bundle bundle6 = this.f33769x;
        kotlin.jvm.internal.i.b(bundle6);
        outState.putString("key_message", bundle6.getString("key_message"));
        Bundle bundle7 = this.f33769x;
        kotlin.jvm.internal.i.b(bundle7);
        outState.putString("key_tag", bundle7.getString("key_tag"));
        Bundle bundle8 = this.f33769x;
        kotlin.jvm.internal.i.b(bundle8);
        outState.putBundle("key_bundle", bundle8.getBundle("key_bundle"));
        Bundle bundle9 = this.f33769x;
        kotlin.jvm.internal.i.b(bundle9);
        outState.putStringArray("item_array", bundle9.getStringArray("item_array"));
    }
}
