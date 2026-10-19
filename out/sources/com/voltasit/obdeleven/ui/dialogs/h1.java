package com.voltasit.obdeleven.ui.dialogs;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;

/* JADX INFO: compiled from: WarningDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class h1 extends com.voltasit.obdeleven.presentation.dialogs.e {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f33970u = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Bundle f33971s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f33972t = "";

    public final void B(Bundle bundle, String str) {
        if (this.f33971s.containsKey(str)) {
            bundle.putInt(str, this.f33971s.getInt(str));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        View viewInflate = layoutInflater.inflate(R.layout.dialog_device_alert, viewGroup, false);
        this.f17606m.getWindow().requestFeature(1);
        TextView textView = (TextView) viewInflate.findViewById(R.id.content);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.device_alert_title);
        final Button button = (Button) viewInflate.findViewById(R.id.simple_button_positive);
        Button button2 = (Button) viewInflate.findViewById(R.id.simple_button_negative);
        final CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.checkbox);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f33971s = bundle;
        if (bundle.containsKey("key_title")) {
            textView2.setText(this.f33971s.getInt("key_title"));
        } else {
            textView2.setText(R.string.common_attention);
        }
        if (this.f33971s.containsKey("key_tag")) {
            this.f33972t = this.f33971s.getString("key_tag");
        }
        if (this.f33971s.containsKey("key_positive_text")) {
            button.setText(this.f33971s.getInt("key_positive_text"));
        } else {
            button.setText(R.string.common_ok);
        }
        if (this.f33971s.containsKey("key_negative_text")) {
            button2.setText(this.f33971s.getInt("key_negative_text"));
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.voltasit.obdeleven.ui.dialogs.e1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h1 h1Var = this.f33933b;
                    h1Var.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("key_checkbox_bool", checkBox.isChecked());
                    h1Var.w(h1Var.f33972t.isEmpty() ? "WarningDialog" : h1Var.f33972t, DialogCallback.CallbackType.f31101b, bundle2);
                }
            });
        }
        if (this.f33971s.containsKey("key_message") && (i10 = this.f33971s.getInt("key_message")) != 0) {
            textView.setText(i10);
        }
        if (this.f33971s.containsKey("key_checkbox_text")) {
            checkBox.setText(this.f33971s.getInt("key_checkbox_text"));
        } else {
            checkBox.setText(R.string.common_do_not_show_again);
        }
        if (this.f33971s.containsKey("key_checkbox_required") && this.f33971s.getBoolean("key_checkbox_required")) {
            button.setEnabled(checkBox.isChecked());
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.voltasit.obdeleven.ui.dialogs.f1
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    button.setEnabled(compoundButton.isChecked());
                }
            });
        }
        if (this.f33971s.containsKey("key_message")) {
            textView.setText(this.f33971s.getInt("key_message"));
        } else {
            String string = getString(R.string.dialog_warning_description_data_is_provided_by_others);
            Drawable drawableMutate = getResources().getDrawable(2131230989).mutate();
            drawableMutate.setBounds(0, 0, drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight());
            drawableMutate.setColorFilter(textView.getTextColors().getDefaultColor(), PorterDuff.Mode.SRC_IN);
            SpannableString spannableString = new SpannableString(string);
            int iIndexOf = string.indexOf("@");
            spannableString.setSpan(new ImageSpan(drawableMutate, 0), iIndexOf, iIndexOf + 1, 17);
            textView.setText(spannableString);
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.voltasit.obdeleven.ui.dialogs.g1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h1 h1Var = this.f33964b;
                h1Var.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("key_checkbox_bool", checkBox.isChecked());
                h1Var.w(h1Var.f33972t.isEmpty() ? "WarningDialog" : h1Var.f33972t, DialogCallback.CallbackType.f31102c, bundle2);
                h1Var.y();
            }
        });
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f33971s == null) {
            return;
        }
        B(bundle, "key_title");
        B(bundle, "key_positive_text");
        B(bundle, "key_negative_text");
        if (this.f33971s.containsKey("key_message")) {
            bundle.putString("key_message", this.f33971s.getString("key_message"));
        }
        if (this.f33971s.containsKey("key_tag")) {
            bundle.putString("key_tag", this.f33971s.getString("key_tag"));
        }
    }
}
