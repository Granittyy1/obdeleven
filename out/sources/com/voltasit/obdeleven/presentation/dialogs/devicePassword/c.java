package com.voltasit.obdeleven.presentation.dialogs.devicePassword;

import Ia.l;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.lifecycle.Z;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.view.FloatingEditText;
import kotlin.jvm.internal.i;
import kotlin.text.m;
import kotlinx.coroutines.C2680e;
import p293xa.r;

/* JADX INFO: compiled from: PasswordCreateDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends Dialog implements Jb.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FloatingEditText f32250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FloatingEditText f32251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f32252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f32253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l<? super Boolean, r> f32254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f32255g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(MainActivity context) {
        super(context);
        i.e(context, "context");
        this.f32255g = (d) (this instanceof Jb.b ? ((Jb.b) this).b() : Jb.a.C0058a.a().f3935a.f5143b).a(null, null, kotlin.jvm.internal.l.a(d.class));
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
        setContentView(R.layout.dialog_create_password);
        ((LinearLayout) findViewById(R.id.passwordCreateDialog_rootPassword)).getLayoutParams().width = (int) (((double) getContext().getResources().getDisplayMetrics().widthPixels) * 0.9d);
        setCancelable(false);
        Button button = (Button) findViewById(R.id.passwordCreateDialog_ok);
        Button button2 = (Button) findViewById(R.id.passwordCreateDialog_cancel);
        this.f32250b = (FloatingEditText) findViewById(R.id.passwordCreateDialog_password);
        this.f32251c = (FloatingEditText) findViewById(R.id.passwordCreateDialog_passwordConfirm);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.dialogs.devicePassword.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final c this$0 = this.f32247b;
                i.e(this$0, "this$0");
                FloatingEditText floatingEditText = this$0.f32250b;
                this$0.f32252d = String.valueOf(floatingEditText != null ? floatingEditText.getText() : null);
                FloatingEditText floatingEditText2 = this$0.f32251c;
                this$0.f32253e = String.valueOf(floatingEditText2 != null ? floatingEditText2.getText() : null);
                String str = this$0.f32252d;
                i.b(str);
                if (str.length() != 6) {
                    Toast.makeText(this$0.getContext(), this$0.getContext().getString(R.string.device_pin_length), 1).show();
                    return;
                }
                if (!m.D(this$0.f32252d, this$0.f32253e, true)) {
                    Toast.makeText(this$0.getContext(), this$0.getContext().getString(R.string.device_pin_not_match), 1).show();
                    return;
                }
                String str2 = this$0.f32252d;
                i.b(str2);
                l<C8.a<? extends r>, r> lVar = new l<C8.a<? extends r>, r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.devicePassword.PasswordCreateDialog$setDevicePassword$1
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(C8.a<? extends r> aVar) {
                        C8.a<? extends r> it = aVar;
                        i.e(it, "it");
                        if (it instanceof C8.a.b) {
                            l<? super Boolean, r> lVar2 = this$0.f32254f;
                            if (lVar2 != null) {
                                lVar2.invoke(Boolean.TRUE);
                            }
                        } else if (it instanceof C8.a.C0024a) {
                            Toast.makeText(this$0.getContext(), R.string.dialog_password_status_connection_lost, 0).show();
                            O.e.m(((C8.a.C0024a) it).f2462a);
                        }
                        return r.f47939a;
                    }
                };
                d dVar = this$0.f32255g;
                dVar.getClass();
                C2680e.c(Z.a(dVar), null, null, new PasswordCreateViewModel$changePassword$1(dVar, str2, lVar, null), 3);
                this$0.dismiss();
            }
        });
        button2.setOnClickListener(new b(this, 0));
        FloatingEditText floatingEditText = this.f32250b;
        if (floatingEditText != null) {
            floatingEditText.requestFocus();
        }
    }
}
