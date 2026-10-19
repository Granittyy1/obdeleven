package X8;

import android.view.MenuItem;
import android.widget.ListView;
import com.braze.events.FeedUpdatedEvent;
import com.braze.ui.BrazeXamarinFormsFeedFragment;
import com.obdeleven.service.util.Texttabe;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.SfdViewModel;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import java.util.Locale;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7381e;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i10) {
        this.f7378b = i10;
        this.f7379c = obj;
        this.f7380d = obj2;
        this.f7381e = obj3;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, xa.g] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, xa.g] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7378b) {
            case 0:
                s sVar = (s) this.f7379c;
                sVar.getClass();
                Task task = (Task) this.f7380d;
                int iIntValue = task.getResult() == null ? -1 : ((Integer) task.getResult()).intValue();
                if (iIntValue == -1) {
                    sVar.E(R.string.common_something_went_wrong);
                    sVar.w();
                } else if (iIntValue == 0) {
                    sVar.G(R.string.common_coding_accepted);
                    sVar.P();
                    UserTrackingUtils.c(UserTrackingUtils.Key.f34276u, 1);
                    sVar.W(true);
                } else if (iIntValue == 51) {
                    MenuItem menuItem = sVar.f7424y;
                    if (menuItem != null) {
                        menuItem.setEnabled(true);
                    }
                    ?? r10 = sVar.f7410C;
                    ((t) r10.getValue()).f7428q = 1;
                    t tVar = (t) r10.getValue();
                    tVar.getClass();
                    String str = (String) this.f7381e;
                    kotlin.jvm.internal.i.e(str, "<set-?>");
                    tVar.f7429r = str;
                    ((SfdViewModel) sVar.f7411D.getValue()).b(sVar.f7416q.f29320b.getControlUnitBase().getObjectId(), sVar.f7416q.n().shortValue());
                } else {
                    sVar.F(String.format(Locale.US, "(%02X) %s", Integer.valueOf(iIntValue), Texttabe.a(iIntValue)));
                    sVar.w();
                }
                break;
            default:
                ((BrazeXamarinFormsFeedFragment) this.f7379c).lambda$onActivityCreated$2((FeedUpdatedEvent) this.f7380d, (ListView) this.f7381e);
                break;
        }
    }
}
