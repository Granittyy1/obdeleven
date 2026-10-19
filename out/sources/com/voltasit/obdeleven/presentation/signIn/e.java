package com.voltasit.obdeleven.presentation.signIn;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.ui.dialogs.ChangePasswordDialog;
import com.voltasit.obdeleven.ui.dialogs.d1;
import java.util.List;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fragment f33253c;

    public /* synthetic */ e(Fragment fragment, int i10) {
        this.f33252b = i10;
        this.f33253c = fragment;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00c4 A[SYNTHETIC] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        int length;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        Fragment fragment = this.f33253c;
        switch (this.f33252b) {
            case 0:
                List<String> list = SigninFragment.f33197n;
                SigninFragment this$0 = (SigninFragment) fragment;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                EditText editText = this$0.f33200d;
                kotlin.jvm.internal.i.b(editText);
                String string2 = editText.getText().toString();
                int length2 = string2.length() - 1;
                int i12 = 0;
                boolean z12 = false;
                while (i12 <= length2) {
                    boolean z13 = kotlin.jvm.internal.i.g(string2.charAt(!z12 ? i12 : length2), 32) <= 0;
                    if (z12) {
                        if (!z13) {
                            String string3 = string2.subSequence(i12, length2 + 1).toString();
                            EditText editText2 = this$0.f33202f;
                            kotlin.jvm.internal.i.b(editText2);
                            string = editText2.getText().toString();
                            length = string.length() - 1;
                            i10 = 0;
                            z10 = false;
                            while (i10 <= length) {
                                if (z10) {
                                    i11 = length;
                                } else {
                                    i11 = i10;
                                }
                                if (kotlin.jvm.internal.i.g(string.charAt(i11), 32) <= 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (!z10) {
                                    if (!z11) {
                                        String string4 = string.subSequence(i10, length + 1).toString();
                                        SigninFragment.a aVar = this$0.f33207l;
                                        kotlin.jvm.internal.i.b(aVar);
                                        aVar.k(string3, string4);
                                    } else {
                                        length--;
                                    }
                                    break;
                                } else if (z11) {
                                    i10++;
                                } else {
                                    z10 = true;
                                }
                            }
                            String string5 = string.subSequence(i10, length + 1).toString();
                            SigninFragment.a aVar2 = this$0.f33207l;
                            kotlin.jvm.internal.i.b(aVar2);
                            aVar2.k(string3, string5);
                        } else {
                            length2--;
                        }
                        break;
                    } else if (z13) {
                        i12++;
                    } else {
                        z12 = true;
                    }
                }
                String string6 = string2.subSequence(i12, length2 + 1).toString();
                EditText editText3 = this$0.f33202f;
                kotlin.jvm.internal.i.b(editText3);
                string = editText3.getText().toString();
                length = string.length() - 1;
                i10 = 0;
                z10 = false;
                while (i10 <= length) {
                    if (z10) {
                        i11 = i10;
                    } else {
                        i11 = length;
                    }
                    if (kotlin.jvm.internal.i.g(string.charAt(i11), 32) <= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z10) {
                        if (!z11) {
                            String string7 = string.subSequence(i10, length + 1).toString();
                            SigninFragment.a aVar3 = this$0.f33207l;
                            kotlin.jvm.internal.i.b(aVar3);
                            aVar3.k(string6, string7);
                        } else {
                            length--;
                        }
                        break;
                    } else if (z11) {
                        z10 = true;
                    } else {
                        i10++;
                    }
                }
                String string8 = string.subSequence(i10, length + 1).toString();
                SigninFragment.a aVar4 = this$0.f33207l;
                kotlin.jvm.internal.i.b(aVar4);
                aVar4.k(string6, string8);
                break;
            case 1:
                ChangePasswordDialog this$1 = (ChangePasswordDialog) fragment;
                kotlin.jvm.internal.i.e(this$1, "this$0");
                String str = this$1.f33770y;
                kotlin.jvm.internal.i.b(str);
                this$1.w(str.length() == 0 ? "InputDialog" : this$1.f33770y, DialogCallback.CallbackType.f31101b, new Bundle());
                break;
            default:
                d1 d1Var = (d1) fragment;
                d1Var.getClass();
                d1Var.w(d1Var.f33915t.isEmpty() ? "VagRedirectDialog" : d1Var.f33915t, DialogCallback.CallbackType.f31102c, new Bundle());
                d1Var.y();
                break;
        }
    }
}
