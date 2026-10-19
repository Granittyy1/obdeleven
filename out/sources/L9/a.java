package L9;

import D2.V;
import Z3.q;
import Z3.r;
import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.FacebookException;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.voltasit.obdeleven.presentation.controlUnit.faults.FaultsFragment;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import io.intercom.android.sdk.helpcenter.webview.HelpCenterWebViewInterface;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import kotlin.jvm.internal.i;
import org.json.JSONException;
import org.json.JSONObject;
import p030c4.f;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4472d;

    public /* synthetic */ a(Object obj, int i10, Object obj2) {
        this.f4470b = i10;
        this.f4471c = obj;
        this.f4472d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f4472d;
        Object obj2 = this.f4471c;
        switch (this.f4470b) {
            case 0:
                ((HelpCenterWebViewInterface) obj2).lambda$handleAction$0((Map) obj);
                return;
            case 1:
                Context context = (Context) obj2;
                String str = (String) obj;
                q.f7852a.getClass();
                try {
                    p165n4.a aVarA = p165n4.a.C0509a.a(context);
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                    String strK = i.k("ping", str);
                    long j = sharedPreferences.getLong(strK, 0L);
                    try {
                        HashMap map = AppEventsLoggerUtility.f24941a;
                        JSONObject jSONObjectA = AppEventsLoggerUtility.a(AppEventsLoggerUtility.GraphAPIActivityType.f24942b, aVarA, V.k(context), q.f(context), context);
                        String str2 = String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1));
                        q.f7869s.getClass();
                        String str3 = r.j;
                        r rVarI = r.c.i(null, str2, jSONObjectA, null);
                        if (j == 0 && rVarI.c().f7905c == null) {
                            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                            editorEdit.putLong(strK, System.currentTimeMillis());
                            editorEdit.apply();
                            return;
                        }
                        return;
                    } catch (JSONException e10) {
                        throw new FacebookException("An error occurred while publishing install.", e10);
                    }
                } catch (Exception unused) {
                    return;
                }
            case 2:
                f this$0 = (f) obj2;
                i.e(this$0, "this$0");
                f.b bVar = (f.b) obj;
                try {
                    Timer timer = this$0.f22328c;
                    if (timer != null) {
                        timer.cancel();
                    }
                    this$0.f22329d = null;
                    Timer timer2 = new Timer();
                    timer2.scheduleAtFixedRate(bVar, 0L, 1000L);
                    this$0.f22328c = timer2;
                    return;
                } catch (Exception e11) {
                    Log.e(f.f22325e, "Error scheduling indexing job", e11);
                    return;
                }
            default:
                FaultsFragment this$1 = (FaultsFragment) obj2;
                i.e(this$1, "this$0");
                p122j9.a aVar = this$1.f31590m;
                i.b(aVar);
                aVar.f41157a.clear();
                aVar.f41158b.clear();
                aVar.notifyDataSetChanged();
                p122j9.a aVar2 = this$1.f31590m;
                i.b(aVar2);
                boolean z10 = this$1.R().f31597A;
                aVar2.f41158b.addAll((List) obj);
                aVar2.f41162f = z10;
                aVar2.notifyDataSetChanged();
                this$1.Q().f1928s.n();
                p122j9.a aVar3 = this$1.f31590m;
                i.b(aVar3);
                if (aVar3.f41158b.size() == 0) {
                    this$1.Q().f1932w.setVisibility(8);
                    this$1.Q().f1927r.setVisibility(0);
                    this$1.Q().f1928s.setImageResource(R.drawable.stat_notify_sync_noanim);
                    this$1.Q().f1928s.setBackgroundTintList(this$1.getResources().getColorStateList(com.voltasit.obdeleven.R.color.fab_green));
                } else {
                    this$1.Q().f1932w.setVisibility(0);
                    this$1.Q().f1927r.setVisibility(8);
                    this$1.Q().f1928s.setImageResource(2131231703);
                    this$1.Q().f1928s.setBackgroundTintList(this$1.getResources().getColorStateList(com.voltasit.obdeleven.R.color.fab_red));
                }
                this$1.Q().f1928s.setEnabled(true);
                this$1.Q().f1934y.setRefreshing(false);
                this$1.X();
                UserTrackingUtils.c(UserTrackingUtils.Key.f34253N, 1);
                return;
        }
    }
}
