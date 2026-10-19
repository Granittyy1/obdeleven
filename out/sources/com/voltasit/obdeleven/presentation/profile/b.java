package com.voltasit.obdeleven.presentation.profile;

import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.parse.ParseException;
import com.parse.SaveCallback;
import com.voltasit.obdeleven.R;
import java.util.Locale;
import p220r9.J;
import p220r9.P;
import p255u9.z;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProfileFragment f32891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f32892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CheckBox f32893c;

    public /* synthetic */ b(ProfileFragment profileFragment, View view, CheckBox checkBox) {
        this.f32891a = profileFragment;
        this.f32892b = view;
        this.f32893c = checkBox;
    }

    public final void a(String str, boolean z10) {
        final ProfileFragment this$0 = this.f32891a;
        kotlin.jvm.internal.i.e(this$0, "this$0");
        final View snackbarView = this.f32892b;
        kotlin.jvm.internal.i.e(snackbarView, "$snackbarView");
        final CheckBox checkBox = this.f32893c;
        if (z10) {
            this$0.w();
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(this$0.requireContext());
            LayoutInflater layoutInflater = this$0.requireActivity().getLayoutInflater();
            kotlin.jvm.internal.i.d(layoutInflater, "getLayoutInflater(...)");
            View viewInflate = layoutInflater.inflate(R.layout.dialog_email_linking, (ViewGroup) null);
            View viewFindViewById = viewInflate.findViewById(R.id.emailLinkingDialog_emailInputLayout);
            kotlin.jvm.internal.i.d(viewFindViewById, "findViewById(...)");
            final TextInputLayout textInputLayout = (TextInputLayout) viewFindViewById;
            View viewFindViewById2 = viewInflate.findViewById(R.id.emailLinkingDialog_passInputLayout);
            kotlin.jvm.internal.i.d(viewFindViewById2, "findViewById(...)");
            final TextInputLayout textInputLayout2 = (TextInputLayout) viewFindViewById2;
            aVar.setTitle(R.string.view_profile_email_linking).setView(viewInflate);
            final EditText editText = (EditText) viewInflate.findViewById(R.id.emailLinkingDialog_emailInput);
            final EditText editText2 = (EditText) viewInflate.findViewById(R.id.emailLinkingDialog_passInput);
            if (str != null) {
                editText.setText(str);
            }
            aVar.setPositiveButton(R.string.common_done, new com.voltasit.obdeleven.presentation.controlUnit.sfd.lock.b());
            final androidx.appcompat.app.e eVarCreate = aVar.create();
            kotlin.jvm.internal.i.d(eVarCreate, "create(...)");
            eVarCreate.show();
            eVarCreate.f(-1).setOnClickListener(new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.profile.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final TextInputLayout textInputLayout3 = textInputLayout;
                    TextInputLayout textInputLayout4 = textInputLayout2;
                    final ProfileFragment this$1 = this$0;
                    kotlin.jvm.internal.i.e(this$1, "this$0");
                    final CheckBox checkBox2 = checkBox;
                    final View snackbarView2 = snackbarView;
                    kotlin.jvm.internal.i.e(snackbarView2, "$snackbarView");
                    final androidx.appcompat.app.e eVar = eVarCreate;
                    textInputLayout3.setError("");
                    textInputLayout4.setError("");
                    String string = editText.getText().toString();
                    String string2 = editText2.getText().toString();
                    if (!Patterns.EMAIL_ADDRESS.matcher(string).matches()) {
                        textInputLayout3.setError(this$1.getString(R.string.common_invalid_email));
                        checkBox2.setChecked(false);
                        return;
                    }
                    if (string2.length() == 0) {
                        textInputLayout4.setError(this$1.getString(R.string.common_please_enter_password));
                        return;
                    }
                    if (string2.length() < 6) {
                        textInputLayout4.setError(this$1.f32822w);
                        return;
                    }
                    z zVar = this$1.f32819t;
                    kotlin.jvm.internal.i.b(zVar);
                    Locale locale = Locale.ROOT;
                    String lowerCase = string.toLowerCase(locale);
                    kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                    zVar.setEmail(lowerCase);
                    z zVar2 = this$1.f32819t;
                    kotlin.jvm.internal.i.b(zVar2);
                    String lowerCase2 = string.toLowerCase(locale);
                    kotlin.jvm.internal.i.d(lowerCase2, "toLowerCase(...)");
                    zVar2.setUsername(lowerCase2);
                    z zVar3 = this$1.f32819t;
                    kotlin.jvm.internal.i.b(zVar3);
                    zVar3.setPassword(string2);
                    z zVar4 = this$1.f32819t;
                    kotlin.jvm.internal.i.b(zVar4);
                    zVar4.saveInBackground(new SaveCallback() { // from class: com.voltasit.obdeleven.presentation.profile.d
                        @Override // com.parse.ParseCallback1
                        public final void done(Throwable th) {
                            ParseException parseException = (ParseException) th;
                            View snackbarView3 = snackbarView2;
                            kotlin.jvm.internal.i.e(snackbarView3, "$snackbarView");
                            ProfileFragment this$2 = this$1;
                            kotlin.jvm.internal.i.e(this$2, "this$0");
                            CheckBox checkBox3 = checkBox2;
                            androidx.appcompat.app.e eVar2 = eVar;
                            TextInputLayout textInputLayout5 = textInputLayout3;
                            if (parseException == null) {
                                P.g(snackbarView3, this$2.requireActivity(), R.string.view_profile_email_linked);
                                checkBox3.setChecked(true);
                                eVar2.dismiss();
                            } else {
                                textInputLayout5.setError(J.g(this$2.requireActivity(), parseException));
                                checkBox3.setChecked(false);
                                z zVar5 = this$2.f32819t;
                                kotlin.jvm.internal.i.b(zVar5);
                                zVar5.revert();
                            }
                        }
                    });
                }
            });
        }
    }
}
