package androidx.compose.ui.autofill;

import C4.v;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: AndroidAutofill.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f13285d;

    public a(p154m3.a aVar, p154m3.a aVar2, p154m3.b bVar, p154m3.b bVar2) {
        this.f13282a = aVar;
        this.f13283b = aVar2;
        this.f13284c = bVar;
        this.f13285d = bVar2;
    }

    public a(AndroidComposeView androidComposeView, k kVar) {
        this.f13282a = androidComposeView;
        this.f13283b = kVar;
        AutofillManager autofillManager = (AutofillManager) androidComposeView.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.f13284c = autofillManager;
            androidComposeView.setImportantForAutofill(1);
            AutofillId autofillId = androidComposeView.getAutofillId();
            if (autofillId != null) {
                this.f13285d = autofillId;
                return;
            }
            throw v.g("Required value was null.");
        }
        throw new IllegalStateException("Autofill service could not be located.");
    }
}
