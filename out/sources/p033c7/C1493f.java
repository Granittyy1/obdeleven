package p033c7;

import N7.e;
import androidx.fragment.app.ActivityC1347l;
import com.parse.SaveCallback;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.history.HistoryAdapter;
import p183oa.a;
import p220r9.P;

/* JADX INFO: renamed from: c7.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1493f implements a, SaveCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22444c;

    public /* synthetic */ C1493f(Object obj, Object obj2) {
        this.f22443b = obj;
        this.f22444c = obj2;
    }

    @Override // com.parse.ParseCallback1
    public void done(Throwable th) {
        HistoryAdapter historyAdapter = (HistoryAdapter) this.f22443b;
        historyAdapter.getClass();
        HistoryAdapter.c cVar = (HistoryAdapter.c) this.f22444c;
        cVar.f32413e.setVisibility(0);
        cVar.f32414f.setVisibility(8);
        ActivityC1347l activityC1347l = historyAdapter.f32395i;
        P.e(activityC1347l, activityC1347l.getString(R.string.snackbar_history_unarchived));
    }

    @Override // p183oa.a
    public void run() {
        ((C1494g) this.f22443b).f22450d = (e) this.f22444c;
    }
}
