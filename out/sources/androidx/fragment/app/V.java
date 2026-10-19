package androidx.fragment.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class V implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17568d;

    public /* synthetic */ V(Object obj, int i10, Object obj2) {
        this.f17566b = i10;
        this.f17567c = obj;
        this.f17568d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f17568d;
        Object obj2 = this.f17567c;
        switch (this.f17566b) {
            case 0:
                SpecialEffectsController this$0 = (SpecialEffectsController) obj2;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                SpecialEffectsController.b bVar = (SpecialEffectsController.b) obj;
                this$0.f17535b.remove(bVar);
                this$0.f17536c.remove(bVar);
                break;
            case 1:
                SharedPreferences sharedPreferences = ((Context) obj2).getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                String str = (String) obj;
                String strK = kotlin.jvm.internal.i.k("pingForOnDevice", str);
                if (sharedPreferences.getLong(strK, 0L) == 0) {
                    RemoteServiceWrapper remoteServiceWrapper = RemoteServiceWrapper.f24959a;
                    RemoteServiceWrapper.EventType eventType = RemoteServiceWrapper.EventType.MOBILE_APP_INSTALL;
                    EmptyList emptyList = EmptyList.f42983b;
                    RemoteServiceWrapper.f24959a.getClass();
                    RemoteServiceWrapper.b(eventType, str, emptyList);
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putLong(strK, System.currentTimeMillis());
                    editorEdit.apply();
                }
                break;
            default:
                p175o1.j jVar = (p175o1.j) obj2;
                jVar.getClass();
                int i10 = p114j1.A.f40996a;
                androidx.media3.exoplayer.K.this.f18039s.u((String) obj);
                break;
        }
    }
}
