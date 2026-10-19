package U6;

import android.app.Activity;
import androidx.fragment.app.ActivityC1347l;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks;
import com.parse.LogOutCallback;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.presentation.models.StartView;
import com.voltasit.obdeleven.presentation.signIn.i;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import java.util.List;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements FirebaseInAppMessagingDisplay, LogOutCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6518c;

    public /* synthetic */ a(Object obj, Object obj2) {
        this.f6517b = obj;
        this.f6518c = obj2;
    }

    @Override // com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay
    public void displayMessage(p083g7.h hVar, FirebaseInAppMessagingDisplayCallbacks firebaseInAppMessagingDisplayCallbacks) {
        b bVar = (b) this.f6517b;
        if (bVar.f6527k != null) {
            H3.c.j();
            return;
        }
        bVar.f6519b.getClass();
        bVar.f6527k = hVar;
        bVar.f6528l = firebaseInAppMessagingDisplayCallbacks;
        bVar.b((Activity) this.f6518c);
    }

    @Override // com.parse.ParseCallback1
    public void done(Throwable th) {
        List<String> list = com.voltasit.obdeleven.a.f29638c;
        ActivityC1347l activityC1347l = (ActivityC1347l) this.f6517b;
        com.voltasit.obdeleven.a.C0320a.a(activityC1347l).k(StartView.AUTO.a(), "start_view");
        com.voltasit.obdeleven.a.C0320a.a(activityC1347l).o("selected_car", "");
        Application.f29634b.b();
        C2134a0.a();
        ((i) this.f6518c).run();
    }
}
