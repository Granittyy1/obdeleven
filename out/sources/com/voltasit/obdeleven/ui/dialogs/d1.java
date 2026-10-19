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
import android.widget.TextView;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: VagRedirectDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class d1 extends com.voltasit.obdeleven.presentation.dialogs.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Bundle f33914s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f33915t = "";

    public final void B(Bundle bundle, String str) {
        if (this.f33914s.containsKey(str)) {
            bundle.putInt(str, this.f33914s.getInt(str));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        View viewInflate = layoutInflater.inflate(R.layout.dialog_vag_redirect_alert, viewGroup, false);
        this.f17606m.getWindow().requestFeature(1);
        TextView textView = (TextView) viewInflate.findViewById(R.id.vag_redirect_title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.vag_redirect_content);
        Button button = (Button) viewInflate.findViewById(R.id.vag_redirect_learn_more_button);
        Button button2 = (Button) viewInflate.findViewById(R.id.vag_redirect_simple_button_positive);
        Button button3 = (Button) viewInflate.findViewById(R.id.vag_redirect_simple_button_negative);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f33914s = bundle;
        if (bundle.containsKey("key_title")) {
            textView.setText(this.f33914s.getInt("key_title"));
        } else {
            textView.setText(R.string.common_attention);
        }
        if (this.f33914s.containsKey("key_tag")) {
            this.f33915t = this.f33914s.getString("key_tag");
        }
        if (this.f33914s.containsKey("key_positive_text")) {
            button2.setText(this.f33914s.getInt("key_positive_text"));
        } else {
            button2.setText(R.string.common_ok);
        }
        if (this.f33914s.containsKey("key_negative_text")) {
            button3.setText(this.f33914s.getInt("key_negative_text"));
            button3.setOnClickListener(new X5.z(1, this));
        }
        if (this.f33914s.containsKey("key_message") && (i10 = this.f33914s.getInt("key_message")) != 0) {
            textView2.setText(i10);
        }
        if (this.f33914s.containsKey("key_learn_more_text")) {
            button.setText(this.f33914s.getInt("key_learn_more_text"));
            button.setOnClickListener(new com.braze.ui.inappmessage.factories.b(1, this));
        }
        if (this.f33914s.containsKey("key_message")) {
            textView2.setText(this.f33914s.getInt("key_message"));
        } else {
            String string = getString(R.string.dialog_warning_description_data_is_provided_by_others);
            Drawable drawableMutate = getResources().getDrawable(2131230989).mutate();
            drawableMutate.setBounds(0, 0, drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight());
            drawableMutate.setColorFilter(textView2.getTextColors().getDefaultColor(), PorterDuff.Mode.SRC_IN);
            SpannableString spannableString = new SpannableString(string);
            int iIndexOf = string.indexOf("@");
            spannableString.setSpan(new ImageSpan(drawableMutate, 0), iIndexOf, iIndexOf + 1, 17);
            textView2.setText(spannableString);
        }
        button2.setOnClickListener(new com.voltasit.obdeleven.presentation.signIn.e(this, 2));
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f33914s == null) {
            return;
        }
        B(bundle, "key_title");
        B(bundle, "key_positive_text");
        B(bundle, "key_negative_text");
        B(bundle, "key_learn_more_text");
        if (this.f33914s.containsKey("key_message")) {
            bundle.putString("key_message", this.f33914s.getString("key_message"));
        }
        if (this.f33914s.containsKey("key_tag")) {
            bundle.putString("key_tag", this.f33914s.getString("key_tag"));
        }
    }
}
