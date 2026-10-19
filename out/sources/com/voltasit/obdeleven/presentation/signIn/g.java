package com.voltasit.obdeleven.presentation.signIn;

import androidx.compose.foundation.C0936h;
import com.parse.LogInCallback;
import com.parse.ParseUser;
import java.util.List;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements LogInCallback {
    @Override // com.parse.ParseCallback2
    public final void done(ParseUser parseUser, Throwable th) {
        ParseUser parseUser2 = parseUser;
        List<String> list = SigninFragment.f33197n;
        if (parseUser2 != null) {
            parseUser2.setEmail(parseUser2.getEmail());
        }
        if (parseUser2 != null) {
            parseUser2.saveInBackground(new C0936h(6));
        }
    }
}
