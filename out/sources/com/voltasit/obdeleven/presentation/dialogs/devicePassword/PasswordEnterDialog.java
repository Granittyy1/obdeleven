package com.voltasit.obdeleven.presentation.dialogs.devicePassword;

import Ia.l;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.lifecycle.Z;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.obdeleven.service.interfaces.IDevice;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import java.util.Arrays;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2680e;
import p293xa.r;

/* JADX INFO: compiled from: PasswordEnterDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class PasswordEnterDialog extends Dialog implements Jb.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextInputEditText f32240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextInputLayout f32241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Button f32242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ProgressBar f32243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IDevice f32244f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l<? super Boolean, r> f32245g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f32246h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PasswordEnterDialog(MainActivity context, IDevice device) {
        super(context);
        i.e(context, "context");
        i.e(device, "device");
        this.f32246h = (g) (this instanceof Jb.b ? ((Jb.b) this).b() : Jb.a.C0058a.a().f3935a.f5143b).a(null, null, kotlin.jvm.internal.l.a(g.class));
        this.f32244f = device;
        i.d(device.b(), "getSerialNumber(...)");
        i.d(device.i(), "getPassword(...)");
    }

    @Override // Jb.a
    public final Ib.a i() {
        return Jb.a.C0058a.a();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        Window window = getWindow();
        i.b(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        setContentView(R.layout.dialog_enter_password);
        ((LinearLayout) findViewById(R.id.passwordEnterDialog_rootPassword)).getLayoutParams().width = (int) (((double) getContext().getResources().getDisplayMetrics().widthPixels) * 0.9d);
        setCancelable(false);
        Button button = (Button) findViewById(R.id.passwordEnterDialog_ok);
        Button button2 = (Button) findViewById(R.id.passwordEnterDialog_cancel);
        this.f32240b = (TextInputEditText) findViewById(R.id.passwordEnterDialog_password);
        this.f32241c = (TextInputLayout) findViewById(R.id.passwordEnterDialog_inputLayout);
        this.f32242d = (Button) findViewById(R.id.passwordEnterDialog_forgot);
        TextInputEditText textInputEditText = this.f32240b;
        if (textInputEditText != null) {
            textInputEditText.setHint(R.string.common_password_length_hint);
        }
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.passwordEnterDialog_loader);
        this.f32243e = progressBar;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.dialogs.devicePassword.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                G8.l lVarE;
                final PasswordEnterDialog this$0 = this.f32257b;
                i.e(this$0, "this$0");
                TextInputEditText textInputEditText2 = this$0.f32240b;
                String strValueOf = String.valueOf(textInputEditText2 != null ? textInputEditText2.getText() : null);
                if (strValueOf.length() != 6) {
                    TextInputLayout textInputLayout = this$0.f32241c;
                    if (textInputLayout == null) {
                        return;
                    }
                    textInputLayout.setError(this$0.getContext().getString(R.string.device_pin_length));
                    return;
                }
                IDevice iDevice = this$0.f32244f;
                if (iDevice == null || (lVarE = iDevice.e()) == null || (str = lVarE.f3516a) == null) {
                    str = "";
                }
                String str2 = str;
                l<Boolean, r> lVar = new l<Boolean, r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.devicePassword.PasswordEnterDialog$onCreate$1$1
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(Boolean bool) {
                        if (bool.booleanValue()) {
                            l<? super Boolean, r> lVar2 = this$0.f32245g;
                            if (lVar2 != null) {
                                lVar2.invoke(Boolean.TRUE);
                            }
                            this$0.dismiss();
                        } else {
                            PasswordEnterDialog passwordEnterDialog = this$0;
                            TextInputLayout textInputLayout2 = passwordEnterDialog.f32241c;
                            if (textInputLayout2 != null) {
                                textInputLayout2.setError(passwordEnterDialog.getContext().getString(R.string.dialog_wrong_pin));
                            }
                        }
                        return r.f47939a;
                    }
                };
                g gVar = this$0.f32246h;
                gVar.getClass();
                C2680e.c(Z.a(gVar), null, null, new PasswordEnterViewModel$onOkClick$1(gVar, str2, strValueOf, lVar, null), 3);
            }
        });
        button2.setOnClickListener(new com.facebook.login.d(this, 2));
        Button button3 = this.f32242d;
        if (button3 != null) {
            button3.setOnClickListener(new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.dialogs.devicePassword.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    G8.l lVarE;
                    final PasswordEnterDialog this$0 = this.f32258b;
                    i.e(this$0, "this$0");
                    ProgressBar progressBar2 = this$0.f32243e;
                    if (progressBar2 != null) {
                        progressBar2.setVisibility(0);
                    }
                    IDevice iDevice = this$0.f32244f;
                    String str = (iDevice == null || (lVarE = iDevice.e()) == null) ? null : lVarE.f3516a;
                    if (str != null) {
                        l<C8.a<? extends String>, r> lVar = new l<C8.a<? extends String>, r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.devicePassword.PasswordEnterDialog$handleOnForgotPasswordClick$1$1
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(C8.a<? extends String> aVar) {
                                C8.a<? extends String> output = aVar;
                                i.e(output, "output");
                                if (output instanceof C8.a.b) {
                                    String string = this$0.getContext().getString(R.string.dialog_password_enter_check_your_email_formatted);
                                    i.d(string, "getString(...)");
                                    String str2 = String.format(string, Arrays.copyOf(new Object[]{((C8.a.b) output).f2463a}, 1));
                                    ProgressBar progressBar3 = this$0.f32243e;
                                    if (progressBar3 != null) {
                                        progressBar3.setVisibility(8);
                                    }
                                    TextInputLayout textInputLayout = this$0.f32241c;
                                    if (textInputLayout != null) {
                                        textInputLayout.setError(str2);
                                    }
                                } else if (output instanceof C8.a.C0024a) {
                                    ProgressBar progressBar4 = this$0.f32243e;
                                    if (progressBar4 != null) {
                                        progressBar4.setVisibility(8);
                                    }
                                    PasswordEnterDialog passwordEnterDialog = this$0;
                                    TextInputLayout textInputLayout2 = passwordEnterDialog.f32241c;
                                    if (textInputLayout2 != null) {
                                        textInputLayout2.setError(passwordEnterDialog.getContext().getString(R.string.dialog_password_enter_please_contact_support));
                                    }
                                }
                                return r.f47939a;
                            }
                        };
                        g gVar = this$0.f32246h;
                        gVar.getClass();
                        C2680e.c(Z.a(gVar), null, null, new PasswordEnterViewModel$remindDevicePassword$1(gVar, str, lVar, null), 3);
                    }
                }
            });
        }
        TextInputEditText textInputEditText2 = this.f32240b;
        if (textInputEditText2 != null) {
            textInputEditText2.requestFocus();
        }
    }
}
