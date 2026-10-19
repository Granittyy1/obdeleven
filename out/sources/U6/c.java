package U6;

import android.app.Activity;
import android.view.View;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks;
import p033c7.C1506t;

/* JADX INFO: compiled from: FirebaseInAppMessagingDisplay.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f6534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f6535c;

    public c(b bVar, Activity activity) {
        this.f6535c = bVar;
        this.f6534b = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b bVar = this.f6535c;
        FirebaseInAppMessagingDisplayCallbacks firebaseInAppMessagingDisplayCallbacks = bVar.f6528l;
        if (firebaseInAppMessagingDisplayCallbacks != null) {
            ((C1506t) firebaseInAppMessagingDisplayCallbacks).f(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType.f28155d);
        }
        H3.c.j();
        bVar.a(this.f6534b);
        bVar.f6527k = null;
        bVar.f6528l = null;
    }
}
