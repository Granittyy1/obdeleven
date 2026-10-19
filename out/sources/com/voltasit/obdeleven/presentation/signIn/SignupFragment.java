package com.voltasit.obdeleven.presentation.signIn;

import B8.AbstractC0646p0;
import J4.n;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.ui.graphics.colorspace.r;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.Fragment;
import com.google.android.material.textfield.TextInputLayout;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.usecases.user.E;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import p255u9.z;

/* JADX INFO: compiled from: SignupFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SignupFragment extends Fragment implements View.OnClickListener, Jb.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f33210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f33211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextInputLayout f33212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EditText f33213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextInputLayout f33214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EditText f33215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextInputLayout f33216h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EditText f33217i;

    public SignupFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f42971b;
        this.f33210b = kotlin.a.b(lazyThreadSafetyMode, new Ia.a<E>(this) { // from class: com.voltasit.obdeleven.presentation.signIn.SignupFragment$special$$inlined$inject$default$1
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
            public final E invoke() {
                Jb.a aVar = this.$this_inject;
                Pb.a aVar2 = this.$qualifier;
                return (aVar instanceof Jb.b ? ((Jb.b) aVar).b() : aVar.i().f3935a.f5143b).a(this.$parameters, aVar2, kotlin.jvm.internal.l.a(E.class));
            }
        });
        this.f33211c = kotlin.a.b(lazyThreadSafetyMode, new Ia.a<J8.a>(this) { // from class: com.voltasit.obdeleven.presentation.signIn.SignupFragment$special$$inlined$inject$default$2
            final /* synthetic */ Jb.a $this_inject;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_inject = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [J8.a, java.lang.Object] */
            @Override // Ia.a
            public final J8.a invoke() {
                Jb.a aVar = this.$this_inject;
                Pb.a aVar2 = this.$qualifier;
                return (aVar instanceof Jb.b ? ((Jb.b) aVar).b() : aVar.i().f3935a.f5143b).a(this.$parameters, aVar2, kotlin.jvm.internal.l.a(J8.a.class));
            }
        });
    }

    @Override // Jb.a
    public final Ib.a i() {
        return Jb.a.C0058a.a();
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, xa.g] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View v10) {
        kotlin.jvm.internal.i.e(v10, "v");
        EditText editText = this.f33213e;
        kotlin.jvm.internal.i.b(editText);
        String string = editText.getText().toString();
        int length = string.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = kotlin.jvm.internal.i.g(string.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                } else {
                    length--;
                }
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        String string2 = string.subSequence(i10, length + 1).toString();
        EditText editText2 = this.f33215g;
        kotlin.jvm.internal.i.b(editText2);
        String string3 = editText2.getText().toString();
        EditText editText3 = this.f33217i;
        kotlin.jvm.internal.i.b(editText3);
        String string4 = editText3.getText().toString();
        int length2 = string4.length() - 1;
        int i11 = 0;
        boolean z12 = false;
        while (i11 <= length2) {
            boolean z13 = kotlin.jvm.internal.i.g(string4.charAt(!z12 ? i11 : length2), 32) <= 0;
            if (z12) {
                if (!z13) {
                    break;
                } else {
                    length2--;
                }
            } else if (z13) {
                i11++;
            } else {
                z12 = true;
            }
        }
        String string5 = string4.subSequence(i11, length2 + 1).toString();
        TextInputLayout textInputLayout = this.f33212d;
        kotlin.jvm.internal.i.b(textInputLayout);
        textInputLayout.setError("");
        TextInputLayout textInputLayout2 = this.f33214f;
        kotlin.jvm.internal.i.b(textInputLayout2);
        textInputLayout2.setError("");
        TextInputLayout textInputLayout3 = this.f33216h;
        kotlin.jvm.internal.i.b(textInputLayout3);
        textInputLayout3.setError("");
        ((E) this.f33210b.getValue()).getClass();
        C8.a aVarA = E.a(string3);
        if (string2.length() == 0) {
            TextInputLayout textInputLayout4 = this.f33212d;
            kotlin.jvm.internal.i.b(textInputLayout4);
            textInputLayout4.setError(getString(R.string.common_please_enter_email));
            return;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(string2).matches()) {
            TextInputLayout textInputLayout5 = this.f33212d;
            kotlin.jvm.internal.i.b(textInputLayout5);
            textInputLayout5.setError(getString(R.string.common_email_invalid));
            return;
        }
        if (aVarA instanceof C8.a.C0024a) {
            TextInputLayout textInputLayout6 = this.f33214f;
            kotlin.jvm.internal.i.b(textInputLayout6);
            textInputLayout6.setError(getString(R.string.common_password_doesnt_meet_requirements));
            return;
        }
        if (string5.length() == 0) {
            TextInputLayout textInputLayout7 = this.f33216h;
            kotlin.jvm.internal.i.b(textInputLayout7);
            textInputLayout7.setError(getString(R.string.view_signup_enter_your_name));
            return;
        }
        z zVar = new z();
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.i.d(locale, "getDefault(...)");
        String lowerCase = string2.toLowerCase(locale);
        kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
        zVar.setUsername(lowerCase);
        zVar.setPassword(string3);
        Locale locale2 = Locale.getDefault();
        zVar.setEmail(n.d(locale2, "getDefault(...)", string2, locale2, "toLowerCase(...)"));
        zVar.put("userEmail", string2);
        zVar.put("name", string5);
        C2134a0.b(getContext(), R.string.common_loading);
        zVar.signUpInBackground(new r(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.e(inflater, "inflater");
        int i10 = AbstractC0646p0.f2098s;
        DataBinderMapperImpl dataBinderMapperImpl = M0.e.f4480a;
        View view = ((AbstractC0646p0) M0.h.h(inflater, R.layout.fragment_signup, null, false, null)).f4488d;
        kotlin.jvm.internal.i.d(view, "getRoot(...)");
        this.f33212d = (TextInputLayout) view.findViewById(R.id.signupFragment_emailInputLayout);
        this.f33213e = (EditText) view.findViewById(R.id.signupFragment_emailInput);
        this.f33214f = (TextInputLayout) view.findViewById(R.id.signupFragment_passwordInputLayout);
        this.f33215g = (EditText) view.findViewById(R.id.signupFragment_passwordInput);
        this.f33216h = (TextInputLayout) view.findViewById(R.id.signupFragment_usernameInputLayout);
        this.f33217i = (EditText) view.findViewById(R.id.signupFragment_usernameInput);
        TextView textView = (TextView) view.findViewById(R.id.signupFragment_passwordRequirements);
        String string = getString(R.string.common_character_length_password_requirement);
        kotlin.jvm.internal.i.d(string, "getString(...)");
        String string2 = getString(R.string.common_upper_lower_letter_password_requirement);
        kotlin.jvm.internal.i.d(string2, "getString(...)");
        String string3 = getString(R.string.common_numeric_character_password_requirement);
        kotlin.jvm.internal.i.d(string3, "getString(...)");
        String string4 = getString(R.string.common_special_character_password_requirement);
        kotlin.jvm.internal.i.d(string4, "getString(...)");
        textView.setText(string + "\n" + string2 + "\n" + string3 + "\n" + string4);
        Button button = (Button) view.findViewById(R.id.signupFragment_signup);
        TextView textView2 = (TextView) view.findViewById(R.id.agreementText);
        Bundle arguments = getArguments();
        String string5 = arguments != null ? arguments.getString("com.voltasit.obdeleven.login.EMAIL") : "";
        String string6 = arguments != null ? arguments.getString("com.voltasit.obdeleven.login.PASSWORD") : "";
        EditText editText = this.f33213e;
        if (editText != null) {
            editText.setText(string5);
        }
        EditText editText2 = this.f33215g;
        if (editText2 != null) {
            editText2.setText(string6);
        }
        EditText editText3 = this.f33215g;
        kotlin.jvm.internal.i.b(editText3);
        Drawable[] compoundDrawablesRelative = editText3.getCompoundDrawablesRelative();
        kotlin.jvm.internal.i.d(compoundDrawablesRelative, "getCompoundDrawablesRelative(...)");
        EditText editText4 = this.f33215g;
        kotlin.jvm.internal.i.b(editText4);
        editText4.setCompoundDrawablesRelativeWithIntrinsicBounds(getResources().getDrawable(2131231439), compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
        button.setOnClickListener(this);
        textView2.setMovementMethod(new LinkMovementMethod());
        return view;
    }
}
